package PlayMultimediale;

public class RegistrazioneAudio extends ElementoMultimediale {
    // ho 'importante' i metodi e gli attributi della classe base
    // creo il costrutto della sottoclasse usando super per richiamarli
    public RegistrazioneAudio(String title, int volume, int duration) {
        super(title, volume, duration);

    }
  public void play() {
        for(int i=1;i<=getDuration();i++)
            System.out.println("Riproduzione in corso " + getTitle() + "! ".repeat(getVolume()) + i);
        try {
            Thread.sleep(1000); //ChatGpt mi ha fatto conoscere questo metodo per rendere una riproduzione più fluida
        } catch (InterruptedException e){ //La sintassi usa InterruptedException che genera un'eccezione al thread
            System.out.println("Errore durante la riproduzione");
        }

  }

public void abbassaVolume(){
        if (getVolume()>0){
            setVolume(getVolume()-1);
            System.out.println("Volume abbassato: " + getVolume());
        }

    }
    public void alzaVolume(){
        if (getVolume()<20){
            setVolume(getVolume()+1);
            System.out.println("Volume alzato: " + getVolume());
        }
    }
}

