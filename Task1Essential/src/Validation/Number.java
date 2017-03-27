package Validation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sodobescu on 3/27/2017.
 */
public class Number {
	public Number() {
	}

	public String NumberValidation() {

		boolean check;
		int tries = 3;
		do {
			check = false;
			InputStreamReader istream = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(istream);

			String number = null;
			System.out.println("Type your number:");
			try {
				number = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("Number.NumberValidation: checking your number:starting");

			Pattern pattern1 = Pattern.compile("^(\\+373) 60 [0-9]{6}$");
			Pattern pattern2 = Pattern.compile("^\\+\\(373\\)-79-([0-9]{2})-([0-9]{2})-([0-9]{2})$");
			Pattern pattern3 = Pattern.compile("^(\\+373) 79 [0-9]{3}-[0-9]{3}$");
			Matcher matcher1 = pattern1.matcher(number);
			Matcher matcher2 = pattern2.matcher(number);
			Matcher matcher3 = pattern3.matcher(number);


			if (matcher1.matches() || matcher2.matches() || matcher3.matches()) {
				System.out.println("Number.NumberValidation: checking your number:succeed");
				return number; //valid number}
			} else {
				check = true;
				System.out.println("Wrong number format try again!");
			}
			tries--;
			if (tries == 0) return "a";
		} while (check);


		return "a";
	}
}

