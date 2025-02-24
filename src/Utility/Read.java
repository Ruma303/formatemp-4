package Utility;

import java.util.Scanner;

public class Read {
    
    // Scanner statico per evitare chiusure premature di System.in
    private static final Scanner scanner = new Scanner(System.in);

    public static String readStr() {
        return scanner.nextLine(); // Legge una linea intera
    }

    public static Integer readInt() {
        while (!scanner.hasNextInt()) {
            System.out.println("Errore: Inserisci un numero intero valido.");
            scanner.next(); // Consuma l'input errato
        }
        Integer num = scanner.nextInt();
        scanner.nextLine(); // Consumare il newline rimasto nel buffer
        return num;
    }

    public static Double readDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Errore: Inserisci un numero decimale valido.");
            scanner.next(); // Consuma l'input errato
        }
        Double num = scanner.nextDouble();
        scanner.nextLine(); // Consumare il newline rimasto nel buffer
        return num;
    }

    public static Boolean readBoolean() {
        while (!scanner.hasNextBoolean()) {
            System.out.println("Errore: Inserisci 'true' o 'false'.");
            scanner.next(); // Consuma l'input errato
        }
        Boolean bool = scanner.nextBoolean();
        scanner.nextLine(); // Consumare il newline rimasto nel buffer
        return bool;
    }

    public static Character readChar() {
        String input = scanner.next();
        return input.charAt(0);
    }

    // Metodo per chiudere lo scanner manualmente alla fine del programma
    public static void closeScanner() {
        scanner.close();
    }
}