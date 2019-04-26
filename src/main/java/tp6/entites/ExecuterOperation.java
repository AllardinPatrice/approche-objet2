package tp6.entites;

/**
 * Exécute une opération
 * 
 * @author Patrice
 *
 */
public class ExecuterOperation {
	/**
	 * Exécution de l'opération entre les 2 paramètres avec retour
	 */
	public int execute(IOperation iop, int a, int b) {
		return iop.calcul(a, b);
	}
}
