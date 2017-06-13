/**
 * Created by andrzej on 13.06.17.
 */
public class Calc {

	public int add(String numbers) {

		int c;
		String[] splitedString = numbers.split(",");
		int result = 0;

		if (numbers == "") {
			return 0;
		} else if (splitedString.length == 1) {
			c = Integer.parseInt(splitedString[0]);
			return c;
		} else {
			String[] splitedString2 = numbers.split(",");
			for (String number: splitedString2) {
				int intNumber;
				intNumber = Integer.valueOf(number);
				result += intNumber;
			}

		}
		return result;
	}
}


