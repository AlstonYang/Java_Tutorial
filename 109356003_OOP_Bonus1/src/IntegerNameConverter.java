import java.util.Scanner;

public class IntegerNameConverter {

	int num;
	
	public IntegerNameConverter(int num) {
		this.num = num;
	}

	
	public String intName() {

		int part = num;
		String name = "";

		if (part > 100) {
			name = digitName(part / 100) + " " + "hundred";
			part = part % 100;
		}

		if (part >= 20) {
			name += " " + tensName(part / 10);
			part = part % 10;

		} else if (part >= 10) {
			name += " " + teenName(part);
			part = 0;
		}

		if (part > 0) {
			name += " " + digitName(part);
		}

		return name;

	}

	public String digitName(int num) {

		switch (num) {
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		}
		return "";
	}

	public String tensName(int num) {

		switch (num) {
		case 2:
			return "twenty";
		case 3:
			return "thirty";
		case 4:
			return "fourty";
		case 5:
			return "fifty";
		case 6:
			return "sixty";
		case 7:
			return "seventy";
		case 8:
			return "eighty";
		case 9:
			return "ninety";
		}
		return "";
	}

	public String teenName(int num) {

		switch (num) {
		case 10:
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "fifteen";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case 18:
			return "eighteen";
		case 19:
			return "nineteen";
		}
		return "";
	}

}
