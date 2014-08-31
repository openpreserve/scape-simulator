package eu.scape_project.pw.simulator.engine.utils;

import java.util.Random;

public class RandomNumberGenerator {

	public static double uniform(double a, double b) {
		Random r = new Random(System.currentTimeMillis());
		double temp = a + (b-a) * r.nextDouble();
		return temp;
	}
	
	public static double normal(double mean, double std) {
		Random r = new Random(System.currentTimeMillis());
		double temp = r.nextGaussian()*std + mean;
		return temp;
	}
}
