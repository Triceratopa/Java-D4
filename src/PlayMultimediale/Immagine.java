package PlayMultimediale;

public class Immagine extends ElementoMultimediale {
    private int bright;

    public Immagine(String title, int volume, int durata ) {
        super(title, volume, durata);
        this.bright = 5;
    }
    public int getBright() {
        return bright;
    }
    public void setBright(int bright) {
        if (bright >= 0 && bright <= 10) {
            this.bright = bright;
        }
    }
    //@Override public show()
    public void show(){
       String asterisks = "*".repeat( bright);
       System.out.println( getTitle()+ asterisks );
    }
    /*@Override
    * public void play(){
    *  System.out.println("Immagine non riproducibile.");
    * oppure
    * throw new  UnsupportedOperationException()}*/
}
