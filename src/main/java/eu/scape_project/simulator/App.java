package eu.scape_project.simulator;

import eu.scape_project.simulator.core.EventProcesor;
import eu.scape_project.simulator.core.Network;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Starting simulation");
        
        EventProcesor eProcesor = new EventProcesor();
        Network network = new Network(eProcesor);
        eProcesor.setNetwork(network);
        network.init();
        eProcesor.simulate();
    }
}
