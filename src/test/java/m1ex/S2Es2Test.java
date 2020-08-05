package m1ex;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class S2Es2Test {
	@Test
	void distanceSquareTwo() {
		double actual = S2Es2.distance(1, 10, 2, 9);

		assertThat(actual, closeTo(Math.sqrt(2), 0.000_001));
	}

	@Test
	void distanceZero() {
		double actual = S2Es2.distance(27, 42, 27, 42);

		assertThat(actual, is(0.0));
	}

}
