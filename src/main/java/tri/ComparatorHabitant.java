package tri;

import java.util.Comparator;

/**
 * Classe de comparateur de nombre d'habitant
 * 
 * @author Patrice
 *
 */
public class ComparatorHabitant implements Comparator<Pays> {

	public int compare(Pays o1, Pays o2) {
		/**
		 * Tri sur le nombre d'habitants
		 */
		if (o1.getNbHabitants() > o2.getNbHabitants()) {
			return 1;
		} else if (o1.getNbHabitants() == o2.getNbHabitants()) {
			return 0;
		}
		return -1;
	}

}
