
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
	
	
	
	// Metodi statici "di classe"
	// Con la parola chiave static, 
	// possono essere utilizzati senza istanziare la classe
	// ma possono essere invocati direttamente dalla classe
	public static String getNomeProgrammatore() {
		return "Marco";
	}
	
	// I parametri di questi metodi statici arrivano
	// dai valori passati alla chiamata del metodo
	// nella classe Main, utilizzando Scanner
	// Non sono le variabili di istanza di questa classe 
	// definiti all'inizio.
	public static Double somma(Double a, Double b) {
		return a + b;
	}
	
	public static Double differenza(Double a, Double b) {	
		return a - b;
	}
	
	public static Double moltiplicazione(Double a, Double b) {	
		return a * b;
	}
	
	public static Double divisione(Double a, Double b) {	
		return a / b;
	}
	
	public static Double divisioneIntera(Double a, Double b) {	
		return a % b;
	}

}
