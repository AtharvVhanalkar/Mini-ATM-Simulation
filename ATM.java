import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int money = 5000;

        System.out.println("===== ATM =====");
        System.out.println("Welcome to Mini ATM");

        System.out.println("Please enter your name");
        String name = scanner.nextLine();

        System.out.println("Welcome " + name);
        System.out.println("=====================");

        while (money >= 0) {


// Please


            System.out.println();
            System.out.println("To check balance press 1");
            System.out.println("To Deposit money press 2");
            System.out.println("To withdraw money press 3");
            System.out.println("To Go back press any number");

            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Your balance is: " + money);

            } else if (input == 2) {
                System.out.println("Please enter your deposit amount:");
                int deposit = scanner.nextInt();
                money = money + deposit;
                System.out.println("Your current balance is: " + money);

            } else if (input == 3) {
                System.out.println("Please enter Your withdraw amount");
                int withdraw = scanner.nextInt();


                if (withdraw > money) {
                    System.out.println("Insufficient amount");

                } else {
                    money = money - withdraw;
                    System.out.println("Your current balance is: " + money);
                }

            }else{
                System.out.println("We are Happy to have You");
            }
        }
    }
}