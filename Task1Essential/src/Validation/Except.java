package Validation; /**
 * Created by sodobescu on 3/27/2017.
 */

import java.io.IOException;

public class Except extends Exception {

	int amount = 22;
	Object error;

	Except(Object x) {
		error = x;
	}

	Except(int x) {

		this.amount = x;
	}


	void prelucrare() {
		if (amount < 1 || amount > 500) {
			System.out.println("Sorry, but your amount have to be between 1 and 500, try again!");
		}

		if (error instanceof IOException) {
			System.out.println("An integer is required!");
		}
		if (error instanceof NumberFormatException) {
			System.out.println("An integer is required!");
		}
	}

}
