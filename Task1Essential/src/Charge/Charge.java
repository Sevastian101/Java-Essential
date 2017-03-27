package Charge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sodobescu on 3/27/2017.
 */
public class Charge {

	private int amount;
	private String number;


	private boolean isValid;

	public Charge() {
		setAmount();
		if (amount != -1) {
			setNumber();
			if (number.equals("a")) isValid = false;
			else isValid = true;
		} else {

			isValid = false;
		}
		if (isValid()) {
			System.out.println("Your charge succeed");
		} else {

			System.out.println("Your charge failed");
		}
	}

	public boolean isValid() {
		return isValid;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount() {
		Validation.Amount V = new Validation.Amount();
		this.amount = V.amountValidation();
	}

	public String getNumber() {
		return number;
	}

	public void setNumber() {
		Validation.Number V = new Validation.Number();
		this.number = V.NumberValidation();
	}


}
