import Jarmű.Auto;
import Jarmű.F1auto;

public class Verseny {
    public static void main(String[] args) {
        F1auto[] cars = getCars(args);

        F1auto[] carsSorted = rendezési(cars);
        writeCars(carsSorted);
    }

    public static void writeCars(F1auto[] auto) {
        for (int i = 0; i<auto.length;i++){
            System.out.println(auto[i].toString());
        }
    }

    public static F1auto[] getCars(String[] args) {
        F1auto[] hadada = new F1auto[args.length / 5];
        int counter = 0;
        for (int i = 0; i < args.length; i += 5) {
                F1auto asd = new F1auto(args[i], args[i + 1], Double.parseDouble(args[i + 2]), Double.parseDouble(args[i + 3]), Double.parseDouble(args[i + 4]));
                hadada[counter] = asd;
                counter++;
        }
        return hadada;
    }

    public static F1auto[] rendezési(F1auto[] auto){
        F1auto[] sorted = new F1auto[auto.length];
        for (int i = 0; i<auto.length;i++){
            sorted[i] = auto[i];
        }
        int max = 0; // a maximum index értékéáre mutato szám
        for (int i = 0; i < sorted.length;i++){
            max = i; // a maximum indexe felveszi az éppen aktuális i indexét, azért hogy a maradékot is betudjuk rendezni
            for (int j = i + 1; j < sorted.length; j++) { // az első összehasonlitáshoz kell a i+1 edik elemtől a maradék elem
                if (sorted[j].versenyképesség() > sorted[max].versenyképesség()) {
                    max = j; //  a maximálisra mutato iundexet állitja át az éppen vizsgált iundexre ha nagyobb
                }
            }
            if (max != i) { //36. sorban max = i-vel ezért az ideiglenes értéke egyenlő lenne a max értékével ami meg egyenlő az i értékével
                F1auto temp = sorted[i];
                sorted[i] = sorted[max];
                sorted[max] = temp;
            }
        }
        return sorted;
    }
}
/*let arr = [13, 246, 675, 123, 643, 8, 12, 63];
let max = 0;
for (let i = 0; i < arr.length; i++) {
  max = i;
  for (let j = i + 1; j < arr.length; j++) {
    if (arr[j] > arr[max]) {
      max = j;
    }
  }
  if (max !== i) {
    let temp = arr[i];
    arr[i] = arr[max];
    arr[max] = temp;
  }
}
console.log(arr);


4. Készíts futtatható osztályt Verseny néven, ami a jarmu csomagon kívül van.
 Az osztályban legyen egy statikus autoKiir nevű metódus, amely egy Auto típusú
 paramétert vár, és kiírja azt a konzolra. A parancssori paraméterek alapján hozz
 létre Forma-1-es autókat. Egy Forma1-es autót 5 paraméter ír le: típus, pilóta neve,
 teljesítmény, maximális sebesség, beállítás. (Feltételezhető, hogy a pilóta neve egy
 szóból áll.) Az autók versenyképessége alapján határozd meg az első, második és
 harmadik helyezett versenyautót, és írd ki őket sorrendben a konzolra az autoKiir
 metódus felhasználásával. (Nem szükséges az összes autót versenyképesség szerinti
 rendezni.)
Példa:
> java Verseny Ferrari Alonso 900 330 0.85 RedBull Vettel 820 325 0.9 Lotus Kimi 905 335 0.95 McLaren Button 915 335 0.7
1. F1Auto(Lotus, Kimi, 905, 335, 0.95)
2. F1Auto(Ferrari, Alonso, 900, 330, 0.85)
3. F1Auto(RedBull, Vettel, 820, 325, 0.9)*/
