package Validation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by sodobescu on 3/27/2017.
 */
public class Amount {

	public Amount() {
	}

	public int amountValidation() {

		InputStreamReader istream = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(istream);

		boolean check;
		int amount = -1;
		int tries=3;
		do {
			try {
				try {
					check = false;
					System.out.println("Type your amount:");
					amount = Integer.parseInt(br.readLine());
					if (amount < 1 || amount > 500)
						throw new Except(amount);
				} catch (NumberFormatException | IOException x) {
					throw new Except(x);
				}
			} catch (Except x) {
				check = true;
				x.prelucrare();
			}
			tries--;
			if(tries==0) return -1;
		} while (check);


		return amount;
	}

}



