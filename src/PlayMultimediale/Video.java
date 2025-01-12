package PlayMultimediale;

public class Video extends ElementoMultimediale {
    private  int bright;

/*Se non avessi dato volume e durata come attributi alla classe base li avrei dovuti dare qui*/

    public Video(String title, int volume, int duration) {
        super(title,volume,duration);
        this.bright = 5; //gli do un valore fisso per far si che ogni video
                         //parta con quello e poi verrà modificato a seconda della preferenza
    }
    //prima di poter cambiare luminosità richiamo e do la possibilità di modificare bright
    public int getBright() {
        return bright;

    }
    public void setBright(int bright) {
        if (bright >= 0 && bright <= 10) {this.bright = bright;}

    }

    //creo i metodi per la luminosità in modo analogo al volume
    public void alzaLuminosità() {
        if(bright<10){ //uso direttamente l'attributo perchè è unico della classe, e non è richiamato
            bright++;
        }else{
            System.out.println("Luminosità al massimo");
        }}
    public void abbassaLuminosità() {
        if(bright>0){ //uso direttamente l'attributo perchè è unico della classe, e non è richiamato
            bright--;
        }else{
            System.out.println("Luminosità al minimo");
        }}
    //copio e incollo i metodi del volume creati precedentemente nell'audio
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
    //@Override
    public void play() {
        System.out.println("Riproduzione video: " + getTitle() + "!".repeat(getTitle()) + " con durata di " + getDuration() + " secondi.");
    }
    /*@Override
     * public void show(){
     *  System.out.println("Immagine non riproducibile.");
     * oppure
     * throw new  UnsupportedOperationException()}*/
}




