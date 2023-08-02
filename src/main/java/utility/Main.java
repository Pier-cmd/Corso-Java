package utility;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();

        int i ;
        // Avvio il timer prima di eseguire il codice che voglio tracciare
        timer.start();

        // Esegui qui il pezzo di codice che vuoi tracciare
        for ( i = 1; i <= 200; i++) {
            System.out.print(i + " ");
        }
        // Fermo il timer dopo aver eseguito il codice
        timer.stop();

        // Ottengo il tempo di esecuzione in millisecondi o secondi
        long elapsedTimeInMillis = timer.getElapsedTimeInMillis();
        double elapsedTimeInSeconds = timer.getElapsedTimeInSeconds();

        System.out.println("Tempo di esecuzione in millisecondi: " + elapsedTimeInMillis);
        System.out.println("Tempo di esecuzione in secondi: " + elapsedTimeInSeconds);
    }
}
