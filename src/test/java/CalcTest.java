import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.converters.Param;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by andrzej on 13.06.17.
 */
@RunWith(JUnitParamsRunner.class)
public class CalcTest {

	Calc testCalc;

	@Before
	public void setUp() {
		//przed każdym testem będziemy mieli nowy obiekt tworzony
		testCalc = new Calc();
	}

	@Test
	public void add() throws Exception {

	}

	@Test
	public void shouldReturnZeroWhenEmptyString() {

		int result = testCalc.add("");

		assertThat(result).isEqualTo(0);

	}

	private Object[][] dataForTestingOutput() {
		return new Object[][] {
				{"",0},
				{"1",1},
				{"2,2",4},
				{"3,22",25},
				{"4,3",7},
				{"2",2},
				{"222",222},
				{"3,4,4",11},
				{"4,5,10,122,13",154}

		};
	}

	@Parameters(method = "dataForTestingOutput")
	@Test
	public void shouldReturnProperOutputFroomTestParams(String input, int expectedResult) {
		int result = testCalc.add(input);

		assertThat(result).isEqualTo(expectedResult);
	}

}