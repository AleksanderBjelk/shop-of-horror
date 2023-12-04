
public class Kund {
   private int antalVaror;
   private double sumKop;


    public Kund (int antalVaror, int sumKop) {
        this.antalVaror = antalVaror;
        this.sumKop = sumKop;

    }
    public int getAntalVaror() {
        return antalVaror;
    }

    public double getSumKop() {
        return sumKop;
    }


    double totalKop (double totalKop){
        sumKop += totalKop ;
        antalVaror++;
        return totalKop;
    }


}
