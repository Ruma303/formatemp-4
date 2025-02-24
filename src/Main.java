import java.util.Scanner;

import Utility.IO;

public class Main {

	public static void main(String[] args) {
		
		// Creazione di un oggetto della classe BuonaEducazione
		BuonaEducazione be = new BuonaEducazione();	
		BuonaEducazione be2 = new BuonaEducazione();			
		
		// Se abbiamo creato un costruttore personalizzato, verrà attivato quello al posto
		// del costruttore di default
		
		
		// Metodi di istanza: richiedono l'istanza di un oggetto
		System.out.println("Metodi di istanza:");
		
		be.saluta();
		be.ringrazia();

		
		IO.sepL(); // Separatore di linea della classe Utility
		 
		// Assegnamo le variabili di istanza all'oggetto be 
		be.a = 10.0;
		be.b = 20.0;
		
		IO.pl("Valori assegnati alle variabili dell'oggetto be:");
		IO.pl("\ta = " + be.a + ", b = " + be.b);
		
		// L'oggetto be2 non ha le stesse variabili di istanza
		// Si chiamano variabili di istanza in quanto il loro valore
		// è specifico per ogni oggetto, lo stato non è condiviso
		// tra oggetti.
		
		IO.pl("Valori assegnati alle variabili dell'oggetto be2:");
		IO.pl("\ta = " + be2.a + ", b = " + be2.b);
		
		// Viceversa, le variabili di classe (con la parola static)
		// sono condivise e accessibili da tutti gli oggetti della classe
        IO.pl("\nVariabile di classe:");
        IO.pl("\tOggetto be, valore c = " + be.c);
        IO.pl("\tOggetto be2, valore c = " + be.c);
        
        // Anche le variabili di classe possono essere modificate
        IO.pl("\nAggiorniamo il valore della variabile di classe c usando l'oggetto be.c");
        be.c = "\"Nuovo valore condiviso\"";
        IO.pl("\t" + be.c);
        
        IO.pl("\nVariabile di classe dopo la modifica:");
        
        // Essendo una variabile CONDIVISA in ogni istanza, tutte le istanze di BuonaEducazione
        // cambieranno il valore della variabile statica c
        IO.pl("\tNuovo valore be2.c = " +be2.c);
        
        IO.pl("\nEssendo c una variabile di classe, possiamo modificarla richiamandola direttamente dalla classe:");
        BuonaEducazione.c = "\"Ancora un altro valore della variabile c\"";
        IO.pl("\tNuovo valore BuonaEducazione.c = " + BuonaEducazione.c);
        
        // Il nuovo valore di BuonaEducazione.c sarà condiviso con tutti gli oggetti da questa classe.
        
        
        
        IO.sepL();

		// In questo esempio prendiamo i numeri da tastiera
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("\nInserisci un numero, anche decimale:");
        Double n1 = scanner.nextDouble();
        
        System.out.println("\nInserisci un secondo numero, anche decimale:");
        Double n2 = scanner.nextDouble();
        
        scanner.close();

        
        
        // Metodi statici: non richiedono l'istanza di un oggetto
        IO.pl("\tIl nome del programmatore è " + OperazioniBase.getNomeProgrammatore());
		
        Double sum = OperazioniBase.somma(n1, n2);
        Double diff = OperazioniBase.differenza(n1, n2);
        Double mul = OperazioniBase.moltiplicazione(n1, n2);
        Double div = OperazioniBase.divisione(n1, n2);
        Double mod = OperazioniBase.divisioneIntera(n1, n2);
          
        
        // Utilizziamo il metodo statico IO.pl() della classe d'utility
        IO.pt("\nMetodi di classe:");
        IO.pt("La somma di " + n1 + " e " + n2 + " è " + sum);    
        IO.pt("La differenza di " + n1 + " e " + n2 + " è " + diff);
        IO.pt("Il prodotto di " + n1 + " e " + n2 + " è " + mul);
        IO.pt("La divisione di " + n1 + " e " + n2 + " è " + div);
        IO.pt("Il resto della divisione intera di " + n1 + " e " + n2 + " è " + mod);
        
	}
}
