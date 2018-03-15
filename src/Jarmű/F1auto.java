package Jarmű;

public final class F1auto extends Auto{
    public F1auto(String tipus, String pilota, double teljesitmeny, double sebesség, double beallitasok) {
        super(tipus, teljesitmeny, sebesség);
        this.pilota = pilota;
        this.beallitasok = beallitasok;
    }

    private String pilota;
    private double beallitasok;

    public String getPilota() {
        return pilota;
    }

    public void setPilota(String pilota) {
        this.pilota = pilota;
    }

    public double getBeallitasok() {
        return beallitasok;
    }

    public void setBeallitasok(double beallitasok) {
        this.beallitasok = beallitasok;
    }

    @Override
    public double versenyképesség() {
        return (getSebesség() + getTeljesítmény()) * getBeallitasok();
    }

    @Override
    public String toString(){
        return "tipus: " + tipus +
                " pilota: "+ pilota +
                " teljesitmeny: "+ teljesítmény + " LE "+
                " max.seb: "+ sebesség + " km/h "+
                " versenyképesség: "+ versenyképesség();
    }
}
/*3. Írj egy F1Auto nevű osztályt Forma-1-es
  versenyautók reprezentálása. Az osztály az Auto
  osztályból származzon, és ne lehessen belőle további
  gyerekosztályokat létrehozni. Az osztálynak legyen
  egy pilota adattagja, ami a versenyautót vezető
  pilóta nevét tárolja, továbbá legyen egy beallitasok
  adattag is, amely egy 0 és 1 közötti szám, azt fejezi
  ki, hogy a versenyautót a szerelők milyen sikeresen
  állították be az adott pályára, az adott időjárási és
  egyéb körülményhez. Ezen attribútumok láthatósága
  privát. Készíts metódusokat ezen mezők módosítására és
  lekérésére is. Írj konstruktort, amely az ős osztálytól
  örökölt adattagokat és a hozzáadottakat is
  inicializálja a paraméterei felhasználásával.
  Az Auto osztály versenykepesseg metódusát definiáld
  felül úgy, hogy az a teljesítmény és a maximális
  sebesség összegének a beallitasok adattaggal való
  szorzatát adja eredményül. Definiáld felül a toString
  metódust is, és helyezd el az osztályt a jarmu csomagban.*/