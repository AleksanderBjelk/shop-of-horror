public class RabatteradVara extends Vara {
    private double rabatt;

    public RabatteradVara(String name, double price, int saldoVara, double rabatt) {
        super(name, price, saldoVara);
        this.rabatt = rabatt;
    }

    public double getRabatteratPris() {
        double rabatteratPris = getPrice() * (1 - rabatt);
        return rabatteratPris;
    }
}
