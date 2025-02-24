
public class BuonaEducazione {
	
	// Variabili di istanza
	// Per usarli bisogna istanziare un oggetto di questa classe
	// In questo esempio, assegneremo i valori di
	// queste variabili dopo aver istanziato la classe nel Main
	public Double a;
	public Double b;
	
	// Variabile di classe
	// Si possono utilizzare senza istanziare un oggetto
	public static String c = "Valore condiviso in ogni istanza";

	// Metodi "di istanza".
	// Richiedono l'istanziamento di questa classe
	// per poter utilizzare i metodi
	public void saluta(){
		System.out.println("\tBuona educazione!");	
	}
	
	public void ringrazia(){
		System.out.println("\tGrazie!");	
	}
	
	public Double sommaNonStatica(Double a, Double b) {
		// Il this.a viene utilizzato per accedere alle
		//  variabili di istanza: a, b
		return this.a + this.b;
	}
}
