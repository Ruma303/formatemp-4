
public class Main {

	public static void main(String[] args) {
		
		// Creazione di un oggetto della classe BuonaEducazione
		BuonaEducazione be = new BuonaEducazione();	
		
		// Metodi di istanza: richiedono l'istanza di un oggetto
		be.saluta();
		be.ringrazia();
		
		System.out.println("Metodi di istanza");
		System.out.println("Il nome del programmatore è " + be.getNomeProgrammatore());
        
        
        // Metodi statici: non richiedono l'istanza di un oggetto
        Double sum = BuonaEducazione.somma(5.0, 3.0);
        Double diff = BuonaEducazione.differenza(15.0, -3.0);
        Double mul = BuonaEducazione.moltiplicazione(2.0, 3.0);
        Double div = BuonaEducazione.divisione(15.0, 3.0);
        Double mod = BuonaEducazione.divisioneIntera(10.0, 4.0);
        
        System.out.println("\n Metodi di classe");
        System.out.println("La somma di 5.0 e 3.0 è " + sum);	
        System.out.println("La differenza tra 15.0 e -3.0 è " + diff);	
        System.out.println("Il prodotto di 2.0 e 3.0 è " + mul);
        System.out.println("La divisione tra 15.0 e 3.0 è " + div);
        System.out.println("Il resto della divisione intera tra 10.0 e 4.0 è " + mod);
	}

}
