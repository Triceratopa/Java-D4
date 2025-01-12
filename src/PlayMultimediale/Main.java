package PlayMultimediale;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to PlayMultimediale");

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        /*Bisognava popolare l'array  con oggetti*/
        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Inserisci un elemento multimediale");
            int elemento = in.nextInt();
            in.nextLine();

            System.out.println("Inserisci titolo: ");
            String titolo = in.nextLine();

            System.out.println("Inserisci volume: ");
            int volume = in.nextInt();

            System.out.println("Inserisci durata: ");
            int durata = in.nextInt();
            in.nextLine();

            switch (elemento) {
                case 1:
                    // Creo un oggetto Immagine
                    elementi[i] = new Immagine(titolo, volume, durata);
                    break;
                case 2:
                    // Creo un oggetto Video
                    elementi[i] = new Video(titolo, volume, durata);
                    break;
                case 3:
                    // Creo un oggetto Audio
                    elementi[i] = new RegistrazioneAudio(titolo, volume, durata);
                    break;
                default:
                    System.out.println("Tipo non valido, usa 1 per Immagine, 2 per Video, 3 per Audio");
                    i--;
                    break;
            }
        }
        int scelta;
        do {
            System.out.println("Scegli un elemento: ");
            scelta = in.nextInt();

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale media = elementi[scelta - 1];
                if (media instanceof Immagine) {
                    ((Immagine) media).show();  // Eseguire il metodo show() se è un'immagine
                } else {
                    media.play();  // Eseguire play() per video o audio
                }
            } else if (scelta == 0) {
                System.out.println("Termine del programma");
            } else {
                System.out.println("Scelta non valida");
            }

        } while (scelta != 0);

        in.close();
    }

    }
