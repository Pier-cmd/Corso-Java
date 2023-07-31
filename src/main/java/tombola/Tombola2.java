package tombola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Tombola2 {
   // ------------------INIZIO MAIN ---------------------------------
    public static void main(String[] args) {
       // INIZIALIZZO ARRAY
        ArrayList<Integer> numeriCasuali = new ArrayList<>();
        Random random = new Random();
        int dimensioneArray = 10;


        //CICLO PER POPOLARE ARRAY
        for (int i = 0; i <= dimensioneArray; i++) {
            numeriCasuali.add(i);
        }

       // MISCHIA NUMERI POPOLATI NELL ARRAY
        Collections.shuffle(numeriCasuali);

        System.out.println("Numeri Casuali: " + numeriCasuali);

        //ASSEGNO AD UN INTERO L'INDICE DA RIMUOVERE DALL'ARRAY

        int indiceDaRimuovere = random.nextInt(dimensioneArray);

        System.out.println("Posizione da rimuovere: " + indiceDaRimuovere);

        //RIMOZIONE DEL NUMERO INTERO (INDICE) GENRATO IN PRECEDENZA

        int numeroRimosso = numeriCasuali.remove(indiceDaRimuovere);

        System.out.println("Numero Rimosso: " + numeroRimosso);

        System.out.println("Numeri Casuali dopo la rimozione: " + numeriCasuali);
    }
}