package LCG;

public class ExampleUsage {
	private LinearCongruenceGenerator random = new LinearCongruenceGenerator((long) Math.pow(2,32), 1664525, 1013904223, 0);
}

//See https://en.wikipedia.org/wiki/Linear_congruential_generator for good parameters
