import Utility.IO;

public class BuonaEducazione {
	
	// Costruttore: viene utilizzato quando si istanzia questa classe
	// creando un oggetto che ha per tipo la classe stessa 
	// Il costruttore è il primo metodo che viene eseguito automaticamente
    // quando si crea un oggetto da questa classe.
	
	public BuonaEducazione() {
        System.out.println("Costruttore della classe " + IO.getClassName(this) + " attivato\n");
    }
	
	// In realtà, in Java ogni classe ha un costruttore di default.
	// Possiamo quindi istanziare in altre classi un oggetto di tipo BuonaEducazione
	// e verrà creato un oggetto con tutti i membri (variabili e metodi) inizializzati come descritto sopra.
	// Effettivamente, il costruttore che abbiamo scritto è un override del costruttore di default.
	// ma non è necessario annotarlo con @Override
	
	
	// ----------------------------------------------------------------
	
	
	// Variabili di istanza
	
	// Per usarli bisogna istanziare un oggetto di questa classe
	// In questo esempio, assegneremo i valori di
	// queste variabili dopo aver istanziato la classe nel Main
	
	public Double a;
	public Double b;
	
	
	// ----------------------------------------------------------------
	
	
	// Overload del costruttore
	
	// Java consente la creazione di più costruttori con lo stesso nome ma parametri differenti (Overloading).
	// Questo permette di avere costruttori con dei comportamenti differenti.
	// Esempio: quando questo un costruttore verrà invocato, verranno eseguite queste operazioni.
	
    public BuonaEducazione(String programmatore) {
	    this.name= programmatore;
	    System.out.println("\tSecondo costruttore attivato (Overloading)");
        System.out.println("\tStampo il nome del programmatore che arriva dalla classe OperazioniBase: " + name);
    }

	
	// ----------------------------------------------------------------
	
    
	// Variabile di classe
	// Si possono utilizzare senza istanziare un oggetto
    
	public static String c = "Valore condiviso in ogni istanza";
	public static String name = "Nome programmatore: " + OperazioniBase.getNomeProgrammatore();

	
	// ----------------------------------------------------------------
	
	
	// Metodi "di istanza".
	// Richiedono l'istanziamento di questa classe
	// per poter utilizzare i metodi
	
	public void saluta(){
		System.out.println("\tCiao!");	
	}
	
	public void ringrazia(){
		System.out.println("\tGrazie!");	
	}
	
	
	// ----------------------------------------------------------------
	
	
	// Il this.var viene utilizzato per accedere alle variabili di istanza: a, b
	// Le variabili statiche sono accessibili senza l'uso di this.
	public Double sommaNonStatica(Double a, Double b) {
		return this.a + this.b;
	}
}
