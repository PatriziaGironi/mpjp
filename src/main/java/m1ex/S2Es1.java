package m1ex;

public class S2Es1 {
	public static double speed(double distance, double time) {
		if (time < 0.0 || distance < 0.0) {
			return -1.0;
		}
		return distance / time;
	}
}
