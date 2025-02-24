import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creazione di un oggetto della classe BuonaEducazione
		BuonaEducazione be = new BuonaEducazione();	
		
		// Metodi di istanza: richiedono l'istanza di un oggetto
		be.saluta();
		be.ringrazia();
		
		System.out.println("Metodi di istanza");
		System.out.println("Il nome del programmatore è " + be.getNomeProgrammatore());
        

		// In questo esempio prendiamo i numeri da tastiera
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("\nInserisci un numero, anche decimale:");
        Double n1 = scanner.nextDouble();
        
        System.out.println("\nInserisci un secondo numero, anche decimale:");
        Double n2 = scanner.nextDouble();
		
        // Metodi statici: non richiedono l'istanza di un oggetto
		
        Double sum = BuonaEducazione.somma(n1, n2);
        Double diff = BuonaEducazione.differenza(n1, n2);
        Double mul = BuonaEducazione.moltiplicazione(n1, n2);
        Double div = BuonaEducazione.divisione(n1, n2);
        Double mod = BuonaEducazione.divisioneIntera(n1, n2);
        
        System.out.println("\nMetodi di classe");
        System.out.println("La somma di " + n1 + " e " + n2 + " è " + sum);    
        System.out.println("La differenza di " + n1 + " e " + n2 + " è " + diff);    
        System.out.println("Il prodotto di " + n1 + " e " + n2 + " è " + mul);
        System.out.println("La divisione di " + n1 + " e " + n2 + " è " + div);
        System.out.println("Il resto della divisione intera di " + n1 + " e " + n2 + " è " + mod);
	}

}
