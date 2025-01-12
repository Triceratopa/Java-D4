package PlayMultimediale;

/*Definisco gli attributi della classe base che saranno poi ereditati alle sottoclassi*/
/*All'inizio mi son resa conto di non aver capito bene le classi astratte
* quindi l'ho svilupato "normalmente", ma ho riguardato quindi mi permetto di scrivere
* a commento le differenze*/
//public abstract class
public  class ElementoMultimediale {
    //avrei anche potuto mettere solo title che è il vero attributo comune a tutte le classi
    private String title;
    private int volume;
    private int durata;

    //inizializzo gli attributi tramite costruttore
    public ElementoMultimediale(String title, int volume, int duration) {
        this.title = title;
        this.volume = volume;
        this.durata = durata;
    }
    //con GET richiamo gli attributi per generare un'azione
    public int getTitle() {
        return title;
    }
    public void setTitle(String title) {
            this.title = title;   //con SET ho la possibilità di cambiarlo
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getDuration() {
        return durata;
    }

// public abstract void play()
    public void play() {

    }
    //public abstract void show//
    public void show(){

    }

}
