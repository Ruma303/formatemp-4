package Utility;

import java.io.*;
import java.nio.file.*;

/**
 * Questa è una classe di utilità per ridefinire i metodi principali di Java e
 * creare nuovi metodi personalizzati
 */
public class IO {
	
	// Costante per riferirsi alla classe stessa
	public static final Class<?> SELF = IO.class;
	
	// Crea solo una nuova linea (Print line)
	public static void pl() {
		System.out.println("\n");
	}
	
	// Ridefiniamo il metodo in modo che prenda un oggetto come parametro
	// e lo stampi a video formattandolo come vogliamo.
	public static void pl(Object p) {
		System.out.println((String) p + "\n");
	}
	
	// Stampa con tabulazione e nuova linea
	public static void pt(Object p) {
		System.out.println("\t" + (String) p);
	}

	public static void saluta(Object p) {
		System.out.println("Ciao " + (String) p + "!\n");
	}
	
	// Separatore di linea
	public static void sepL() {
		System.out.println("\n=================================================\n");
	}
	
	// Ritorna il nome della classe di un oggetto
	public static String getClassName(Object o) {
		return o.getClass().getName();
	}
	
	// Ritorna la classe di un oggetto
	public static Object getClass(Object o) {
		return o.getClass();
	}
	
	// Esempio, ritorniamo esattamente il nome di questa classe
//	public static String getClassName() {
//        return IO.class.getName();
//    }
	
	/**
	 * @param path = Percorso relativo
	 */
	public static void readF(String path) {
        Path filePath = Paths.get(path);

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (NoSuchFileException e) {
            System.out.println("Errore: Il file '" + filePath.toAbsolutePath() + "' non esiste.");
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
    }
		
}
