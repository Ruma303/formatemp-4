

public class Operatori {

    public static void main(String[] args) {
    	
    	// --- Precedenza operatori
    	System.out.println("Precedenza operatori");
    	
    	// L'operatore * (moltiplicazione) ha la precedenza
    	// Verrà effettuato prima 5 x 2 = 10, 
    	// Poi si somma 10.
    	System.out.println(10 + 5 * 2); // 20
    	
    	// Circondare un'espressione in parentesi fa in modo che 
    	// le operazioni interne abbiano la precedenza, e vengano eseguite prima.
    	// Verrà fatta prima la somma (10 + 5 = 15), 
    	// e poi la moltiplicazione 15 x 2 = 30 
    	System.out.println((10 + 5) * 2); // 30
    	
    	System.out.println("\n");
    	
    	

        // --- Operatori unari
    	System.out.println("Operatori unari");
    	

        // -- Incremento e decremento (pre e post)
        int x = 1; 
        System.out.println(x); // 1
        System.out.println(++x); // 2
        System.out.println(x++); // 2
        System.out.println(x); // 3
        System.out.println(--x); // 2
        System.out.println(x--); // 2
        System.out.println(x); // 1


        // -- Positivo unario
        int positive = +5; System.out.println(positive); // 5

        // -- Negativo unario
        int negative = -5; System.out.println(negative); // -5

        // -- Not
        boolean a1 = false; 
        System.out.println(!a1);
        
        // -- Completamento a uno
        int bin = 5;
        System.out.println(~bin); // Output: -6 (in binario: 5 = 00000101, ~5 = 11111010)
        
        System.out.println("\n");

        
        
        // --- Operatori aritmetici
        System.out.println("Operatori aritmetici");
        System.out.println(5 + 3); // 8
        System.out.println(5 - 3); // 2
        System.out.println(5 * 3); // 15
        System.out.println(15.0 / 3); // 5.0
        System.out.println(10 % 4); // 2

        System.out.println("\n");
        
        
        
        // --- Operatori shift
        System.out.println("Operatori shift");
        
        int e = 2;
        System.out.println(e << 1); // 4, in binario: 100

        int f = 4;
        System.out.println(f << 1); // Output: 8

        int g = -4;
        System.out.println(g >>> 1); //

        System.out.println("\n");
        
        
        
        // --- Operatori di confronto
        System.out.println("Operatori di confronto");
        System.out.println(5 < 10); // true
        System.out.println(5 > 3); // false
        System.out.println(5 <= 3); // true
        System.out.println(5 >= 10); // false
        System.out.println(5 == 5); // true
        System.out.println(5 != 10); // true

        System.out.println("\n");
        
        
        
        // --- Operatori logici
        System.out.println("Operatori logici");
        
        // Seguono la logica booleana
        System.out.println(true && false); // false
        System.out.println(true || false); // true
        System.out.println(!true); // false

        System.out.println("\n");
        

        // --- Short-circuit evaluation
        System.out.println("Short cicuit evaluation");
        System.out.println(0 !=0 && 10 / 0 > 1); // false

        System.out.println("\n");
        
        
        
        // --- Operatori di assegnamento
        System.out.println("Operatori di assegnamento");
        
        // -- Operatori aritmetici e assegnamento
        int a = 5; // Assegnamento canonico
        System.out.println(a += 5); // 10
        System.out.println(a -= 5); // 5
        System.out.println(a *= 5); // 25
        System.out.println(a /= 5); // 5
        System.out.println(a %= 5); // 1

        System.out.println("\n");
        
        
        
        // --- Operatori bitwise logici
        System.out.println("Operatori bitwise");
        System.out.println(5 & 3); // 1
        System.out.println(5 | 3); // 7
        System.out.println(5 ^ 3); // 6
        System.out.println(~5); // -6
        
        int x1 = 5; // 0101 in binario
        x1 &= 3;    // 0011 in binario
        System.out.println(x1); // Output: 1 (0101 & 0011 = 0001)

        System.out.println("\n");
        
        

        // -- Operatori di assegnamento shift
        System.out.println("Operatori di assegnamento shift");
        int b = 5;
        System.out.println(b &= 5); // 0
        System.out.println(b |= 5); // 5
        System.out.println(b <<= 5); // 160
        System.out.println(b >>= 5); // 5
        System.out.println(b >>>= 5); // 0
        
        System.out.println("\n");
        
        
        
        // --- Operatori ternari
        System.out.println("Operatori ternari");
        
        int numero = 10;
        String risultato = (numero > 5) ? "Maggiore di 5" : "Minore o uguale a 5";
        System.out.println(risultato); // Output: Maggiore di 5
        
        System.out.println("\n");
    }
}