package vsoc.camps.neuroevolution.goalgetter;

import org.apache.log4j.Logger;
import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vsoc.camps.*;
import vsoc.server.gui.FieldFrame;
import vsoc.util.Serializer;
import vsoc.util.VsocUtil;

public class GGGuiRunner {

	private static final Logger log = Logger.getLogger(AbstractCamp.class);

	private static final String PREFIX = "GGCAMP";

	private GGGuiRunner() {
		super();
	}

	public static void main(String[] args) {
		try {
			GGCamp camp = loadCamp();
			Serializer.current().startScheduledSerialization(PREFIX, 600, camp);
			VsocUtil u = VsocUtil.current();
			String campProperties = u.propsToString(camp.getProperties());
			log.info("\n" + campProperties);
			FieldFrame.open(camp, "Goal Getter Camp");
		} catch (Exception e) {
			log.error("Could not run 'GGGuiRunner'. " + e.getMessage(), e);
		}
	}

	private static GGCamp loadCamp() {
		GGCamp camp = (GGCamp) Serializer.current().deserializeFromScheduled(PREFIX);
		if (camp == null) {
			try (ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ggcamp.xml")) {
				camp = ctx.getBean("camp1", GGCamp.class);
			}
		}
		return camp;
	}

}
