package test;

import javax.enterprise.inject.Instance;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeldContainer weld = new Weld().initialize();
		Instance<UserFacet> pers = weld.instance().select(UserFacet.class);
		UserFacet p = pers.get();
		p.save();
		p.test();		
	}

}
