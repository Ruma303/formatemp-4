
public class BuonaEducazione {

	// Metodi "di istanza".
	// Richiedono l'istanziamento di questa classe
	// per poter utilizzare i metodi
	public void saluta(){
		System.out.println("Buona educazione!");	
	}
	
	public void ringrazia(){
		System.out.println("Grazie!");	
	}
	
	// Metodi statici "di classe"
	// Con la parola chiave static, 
	// possono essere utilizzati senza istanziare la classe
	// ma possono essere invocati direttamente dalla classe
	public static String getNomeProgrammatore() {
		return "Marco";
	}
	
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
