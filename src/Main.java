import java.util.Scanner;

public class Main {

    /*private static final String CASHOFF = 1;
    private static final String CASHIN = 2;*/
    private static final double FEE = 0.05;


    public static void main(String[] args) {

        System.out.println("Bon dia, tens 1000,00 euros al teu compte. ");
        System.out.println("Si vols treure diners pitja 1");
        System.out.println("Si vols ingressar diners pitja 2");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        if (option.equals("1")) {
            makeARetire(option);
        }
        if (option.equals("2")) {
            makeAnIncome(option, FEE);
        }


    }

    private static int makeAnIncome(String option, double FEE) {

        System.out.println("Fer un ingrés comporta una comissió del 5%");
        System.out.println("Quants diners vols ingressar?");
        Scanner scan1 = new Scanner(System.in);
        double amountin = scan1.nextInt();
        if (amountin > 2000) {
            System.out.println("no pots ingressar més del doble del teu saldo");
        } else {
            double feeamount = amountin * FEE;
            double result2 = amountin - feeamount;
            System.out.println("has indicat " + amountin + " euros. La comissió per ingrés es de " + feeamount + " euros");
            System.out.println("hem ingressat al teu compte " + result2);
            System.out.println("el teu saldo es " + (1000 + result2));

        }
        return 0;

    }

    private static int makeARetire(String option) {
        System.out.println("Quants diners vols treure? ");
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        int result = 0;
        System.out.println("has indicat " + amount + " euros");
        if (amount > 1000) {
            System.out.println("No tens prou saldo. No pots fer l'operació");
        } else {
            result = 1000 - amount;
            System.out.println("operació realitzada. Et queden " + result + " euros al compte");

        }
        return result;
    }
}
