package Jarmű;


public class Auto {

   double sebesség;
   double teljesítmény;
   String tipus;

    public Auto(String tipus, double teljesitmeny, double sebesség) {
        this.sebesség = sebesség;
        this.teljesítmény = teljesitmeny;
        this.tipus = tipus;
    }

    public double getSebesség() {

        return sebesség;
    }

    public void setSebesség(double sebesség) {
        this.sebesség = sebesség;
    }

    public double getTeljesítmény() {
        return teljesítmény;
    }

    public void setTeljesítmény(double teljesítmény) {
        this.teljesítmény = teljesítmény;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public double versenyképesség(){
        return sebesség+teljesítmény;
    }
    @Override
    public String toString(){
        return "tipus: " + tipus +
                " teljesitmeny: "+ teljesítmény + " LE "+
                " max.seb: "+ sebesség + " km/h "+
                " versenyképesség: "+ versenyképesség();
    }
}
/* Készíts osztályt Auto néven, amit a jarmu csomagba
 helyezz el. Egy autó esetén a teljesítmény (szám, LE),
 maximális sebesség (szám, km/h) és típus (szöveg)
 adatokat tároljuk. Az adattagok láthatósága olyan
 legyen, hogy azok az esetleges gyerekosztályokból
 is elérhetőek legyenek, de a láthatóság a szükségesnél
 ne legyen bővebb. Készíts az osztálynak konstruktort,
 ami a paramétereivel inicializálja az adattagokat
 (attribútumokat). Az osztály rendelkezzen publikus
 getter és setter metódusokkal az adattagok
 lekéréséhez, módosításához. Az osztálynak készítsünk
 egy versenykepesseg nevű metódust is, amely a
 teljesítmény és a maximális sebesség összegével
 tér vissza. Definiáld felül a toString metódust,
 amely szöveges reprezentációt biztosít egy Auto
 osztályú objektumnak. Például lehet
 „Auto(típus: …, telj.: …, max.seb.: …, versenyk.: …)" formájú.
 */