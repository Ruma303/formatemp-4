import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Creazione di un oggetto della classe BuonaEducazione
		BuonaEducazione be = new BuonaEducazione();	
		BuonaEducazione be2 = new BuonaEducazione();			
		
		// Metodi di istanza: richiedono l'istanza di un oggetto
		System.out.println("Metodi di istanza:");
		
		be.saluta();
		be.ringrazia();

		System.out.println("\r\n================================\n");
		
		// Assegnamo le variabili di istanza all'oggetto be 
		be.a = 10.0;
		be.b = 20.0;
		
		System.out.println("Valori assegnati alle variabili dell'oggetto be:");
		System.out.println("\ta = " + be.a + ", b = " + be.b);
		
		// L'oggetto be2 non ha le stesse variabili di istanza
		// Si chiamano variabili di istanza in quanto il loro valore
		// è specifico per ogni oggetto, lo stato non è condiviso
		// tra oggetti.
		
		System.out.println("Valori assegnati alle variabili dell'oggetto be2:");
		System.out.println("\ta = " + be2.a + ", b = " + be2.b);
		
		// Viceversa, le variabili di classe (con la parola static)
		// sono condivise e accessibili da tutti gli oggetti della classe
        System.out.println("\nVariabile di classe:");
        System.out.println("\tOggetto be, valore c = " + be.c);
        System.out.println("\tOggetto be2, valore c = " + be.c);
        
        // Anche le variabili di classe possono essere modificate
        System.out.println("\nAggiorniamo il valore della variabile di classe c usando l'oggetto be.c");
        be.c = "\"Nuovo valore condiviso\"";
        System.out.println("\t" + be.c);
        
        System.out.println("\nVariabile di classe dopo la modifica:");
        
        // Essendo una variabile CONDIVISA in ogni istanza, tutte le istanze di BuonaEducazione
        // cambieranno il valore della variabile statica c
        System.out.println("\tNuovo valore be2.c = " +be2.c);
        
        System.out.println("\nEssendo c una variabile di classe, possiamo modificarla richiamandola direttamente dalla classe:");
        BuonaEducazione.c = "\"Ancora un altro valore della variabile c\"";
        System.out.println("\tNuovo valore BuonaEducazione.c = " + BuonaEducazione.c);
        
        // Il nuovo valore di BuonaEducazione.c sarà condiviso con tutti gli oggetti da questa classe.
        
        
        System.out.println("\r\n================================");

		// In questo esempio prendiamo i numeri da tastiera
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("\nInserisci un numero, anche decimale:");
        Double n1 = scanner.nextDouble();
        
        System.out.println("\nInserisci un secondo numero, anche decimale:");
        Double n2 = scanner.nextDouble();
        
        scanner.close();
        
        
        
        
        // Metodi statici: non richiedono l'istanza di un oggetto
        System.out.println("\tIl nome del programmatore è " + OperazioniBase.getNomeProgrammatore());
		
        
        Double sum = OperazioniBase.somma(n1, n2);
        Double diff = OperazioniBase.differenza(n1, n2);
        Double mul = OperazioniBase.moltiplicazione(n1, n2);
        Double div = OperazioniBase.divisione(n1, n2);
        Double mod = OperazioniBase.divisioneIntera(n1, n2);
        
        System.out.println("\nMetodi di classe:");
        System.out.println("\tLa somma di " + n1 + " e " + n2 + " è " + sum);    
        System.out.println("\tLa differenza di " + n1 + " e " + n2 + " è " + diff);    
        System.out.println("\tIl prodotto di " + n1 + " e " + n2 + " è " + mul);
        System.out.println("\tLa divisione di " + n1 + " e " + n2 + " è " + div);
        System.out.println("\tIl resto della divisione intera di " + n1 + " e " + n2 + " è " + mod);
	}

}
