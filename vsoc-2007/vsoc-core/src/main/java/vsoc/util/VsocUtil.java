package vsoc.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Properties;
import java.util.SortedSet;
import java.util.TreeSet;

public class VsocUtil {

    private static VsocUtil current = null;

    private NumberFormat format = createFormat();

    private VsocUtil() {
        super();
    }

    public static VsocUtil current() {
        if (current == null) {
            current = new VsocUtil();
        }
        return current;
    }

    public String format(double val) {
        return this.format.format(val);
    }

    public String format(int val) {
        return "" + val;
    }

    private NumberFormat createFormat() {
        NumberFormat format = NumberFormat.getInstance();
        format.setGroupingUsed(false);
        format.setMaximumFractionDigits(3);
        format.setMinimumFractionDigits(3);
        return format;
    }

    public String propsToString(Properties properties) throws IOException {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        SortedSet<Object> keys = keysSorted(properties);
        Iterator<Object> iter = keys.iterator();
        while (iter.hasNext()) {
            String key  =(String) iter.next();
            pw.print(key);
            pw.print("=");
            pw.print(properties.getProperty(key));
            pw.println();
        }
        sw.close();
        return sw.getBuffer().toString();
    }

    private SortedSet<Object> keysSorted(Properties properties) {
        SortedSet<Object> keys = new TreeSet<>();
        Iterator<Object> iter = properties.keySet().iterator();
        while (iter.hasNext()) {
            keys.add(iter.next());
        }
        return keys;
    }


    
}
