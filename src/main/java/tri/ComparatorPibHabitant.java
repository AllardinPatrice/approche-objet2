package tri;

import java.util.Comparator;

/**
 * Classe de comparateur de PIB par habitant
 * 
 * @author Patrice
 *
 */
public class ComparatorPibHabitant implements Comparator<Pays> {

	public int compare(Pays o1, Pays o2) {
		/**
		 * Tri sur le PIB par habitant
		 */
		if (o1.getPibHabitant() > o2.getPibHabitant()) {
			return 1;
		} else if (o1.getPibHabitant() == o2.getPibHabitant()) {
			return 0;
		}
		return -1;
	}
}
