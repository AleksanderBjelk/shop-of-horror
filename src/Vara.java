public class Vara {
    private  String name;
   private double price;
    private int saldoVara;

    public Vara(String name, double price, int saldoVara){
        this.name = name;
        this.price = price;
        this.saldoVara= saldoVara;
    }
     String getName() {
        return name;
    }

     double getPrice() {
        return price;
    }

     int getSaldoVara() {
        return saldoVara;
    }
public int saldoVaror(int antal){
        if (saldoVara>= antal){
            saldoVara -= antal;
        }
        return saldoVara;
}


}
