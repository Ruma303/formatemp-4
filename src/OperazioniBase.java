
public class OperazioniBase {

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
