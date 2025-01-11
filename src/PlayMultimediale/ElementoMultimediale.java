package PlayMultimediale;

/*Definisco gli attributi della classe base che saranno poi ereditati alle sottoclassi*/

public  class ElementoMultimediale {
    private String title;
    private int volume;
    private int duration;

    //inizializzo gli attributi tramite costruttore
    public ElementoMultimediale(String title, int volume, int duration) {
        this.title = title;
        this.volume = volume;
        this.duration = duration;
    }
    //con GET richiamo gli attributi per generare un'azione
    public String getTitle() {
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
    public boolean getDuration() {
        return duration;
    }

    // inserisco metodi astratti dato che non sono obbligatori in ogni classe
    public void play() {

    }

}
