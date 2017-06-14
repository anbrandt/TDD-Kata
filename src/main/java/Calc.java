/**
 * Created by andrzej on 13.06.17.
 */
public class Calc {

	public int add(String numbers) {

		int c;
		String[] splitedString = numbers.split(",");
		int result = 0;
		String numbersClean = null;

		if (numbers == "") {
			return 0;
		} else if (splitedString.length == 1) {
			c = Integer.parseInt(splitedString[0]);
			return c;
		} else {
//			if (numbers.contains("\n")) {
//				numbers.replace('\n', ',');
//			}
			String cleanNumbers = numbers.replace("\n",",");

			String[] splitedString2 = cleanNumbers.split(",");
			for (String number: splitedString2) {
				int intNumber;
				intNumber = Integer.valueOf(number);
				result += intNumber;
			}

		}
		return result;
	}
}


