package en.arvato.fleamarket;

import java.util.Set;

import com.google.common.collect.Sets;

/**
 * Makes calculations about the Fleas for sale.
 * 
 * @author Lucía Caorsi
 */
public class OptimalFleaCalculator {

	/**
	 * Calculates the maximum total rating that can be bought with the specified
	 * amount of money, from the provided list of fleas.
	 * 
	 * @param money
	 *            the amount of money to spend
	 * @param fleas
	 *            the list of fleas to select
	 * @return the sum of the maximum total rating for the specified amount
	 */
	public static int getOptimalValue(float money, Set<Flea> fleas) {
		int res = 0;

		for (int i = 1; i <= fleas.size(); i++) {

			Set<Set<Flea>> combinations = Sets.combinations(fleas, i);

			for (Set<Flea> combination : combinations) {

				float totalPrice = 0f;
				int totalRating = 0;

				for (Flea flea : combination) {

					totalPrice += flea.getPrice();
					totalRating += flea.getRating();
				}

				if (totalPrice <= money && totalRating > res) {
					res = totalRating;
				}
			}
		}
		return res;
	}
}