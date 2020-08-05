package m1ex;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.Test;

public class S2Es3Test {
	@Test
	void engineCapacityPlain() {
		double actual = S2Es3.engineCapacity(74, 75, 4);

		assertThat(actual, closeTo(1290.252, 0.001));
	}

}
