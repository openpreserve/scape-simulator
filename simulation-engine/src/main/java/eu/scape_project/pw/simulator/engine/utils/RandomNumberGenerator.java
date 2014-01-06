package eu.scape_project.pw.simulator.engine.utils;

import java.util.Random;

public class RandomNumberGenerator {

	public static double uniform(double a, double b) {
		Random r = new Random(System.currentTimeMillis());
		return a + (b-a) * r.nextDouble();
	}
	
	public static double normal(double mean, double std) {
		Random r = new Random(System.currentTimeMillis());
		return r.nextGaussian()*std + mean;
	}
}
