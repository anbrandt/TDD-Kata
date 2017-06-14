/**
 * Created by andrzej on 13.06.17.
 */
public class Calc {

	public int add(String numbers) {

		int tempIntFromString;
		String[] splitedString = numbers.split(",");
		int result = 0;

		if (numbers.equals(null) || numbers.equals("")) {
			return 0;
		} else if (splitedString.length == 1) {
			tempIntFromString = Integer.valueOf(splitedString[0]);
			return tempIntFromString;
		} else {
			//clean numbers string is a temporary string that holds a string without \n
			String cleanNumbers = numbers.replace("\n", ",");
			splitedString = cleanNumbers.split(",");
			for (String number : splitedString) {
				int intNumber;
				intNumber = Integer.valueOf(number);
				result += intNumber;
			}

		}
		return result;
	}
}


