import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       Vara vara1 = new Vara("Mask", 235.50, 14);
        Vara vara2 = new Vara("Plastic knife", 45.50, 1);
        RabatteradVara vara3 = new RabatteradVara("Fake blood", 89.10, 44, 0.3);


        Kund kund = new Kund(0, 0);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. " + vara1.getName() + " " + vara1.getPrice() + " SEK " + vara1.getSaldoVara() +  " left");
            System.out.println("2. " + vara2.getName() + " " +vara2.getPrice() + " SEK " +vara2.getSaldoVara()+ " left");
            System.out.println("3. " + vara3.getName() + " " + vara3.getRabatteratPris() + " SEK " + vara3.getSaldoVara() + " left");
            System.out.println("4. Quit");
            System.out.print("Choose your option: ");

            int kop = scanner.nextInt();

            if (kop == 1) {
                if (vara1.getSaldoVara() > 0) {
                    kund.totalKop(vara1.getPrice());
                    vara1.saldoVaror(1);

                } else {
                    System.out.println("Mask is out of stock.\n");
                }

            } else if (kop == 2) {
                if (vara2.getSaldoVara() > 0) {
                    kund.totalKop(vara2.getPrice());
                    vara2.saldoVaror(1);

                } else {
                    System.out.println("Plastic knife is out of stock.\n");
                }

            } else if (kop == 3) {
                if (vara3.getSaldoVara() > 0) {
                    kund.totalKop(vara3.getRabatteratPris());
                    vara3.saldoVaror(1);

                } else {
                    System.out.println("Fake blood is out of stock.\n");
                }

            } else if (kop == 4) {
                System.out.println("Du har lagt till: " + kund.getAntalVaror() + " varor. " +  "Din kostnad blir: " + kund.getSumKop());
                break;
            }
        }
    }
}