package PlayMultimediale;

public class RegistrazioneAudio extends ElementoMultimediale {
    // ho 'importante' i metodi e gli attributi della classe base
    // creo il costrutto della sottoclasse usando super per richiamarli
    public RegistrazioneAudio(String title, int volume, int duration) {
        super(title, volume, duration);

    }
  public void play() {
        for(int i=0;getDuration()>i;i++)
        if (){
            System.out.println("Riproduzione in corso " + getTitle() + ": " + getDuration());
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

