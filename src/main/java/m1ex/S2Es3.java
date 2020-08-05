package m1ex;

import java.lang.Math;

public class S2Es3 {
	public static double engineCapacity(double bore, double stroke, int nr) {
		return (Math.PI * Math.pow(bore / 2, 2) * stroke * nr) / 1000;
	}
}
