
package eu.scape_project.pw;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SimulatorStandaloneSetup extends SimulatorStandaloneSetupGenerated{

	public static void doSetup() {
		new SimulatorStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

