import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);


                int balance = getUserInput("dollar amount", scan);
                int hundreds = getUserInput("number of available $100 bills", scan);
                int fifties = getUserInput("number of available $50 bills", scan);

                Calculate_bills bills = new Calculate_bills(balance, hundreds, fifties);

                printRes("\nMinimum number of $100 bills: " + bills.getHundreds());
                printRes("Minimum number of $50 bills: " + bills.getFifties());
                printRes("Minimum number of $20 bills: " + bills.getTwenties());
                printRes("Minimum number of $10 bills: " + bills.getTens());
                printRes("Minimum number of $5 bills: " + bills.getFives());
                printRes("Minimum number of $1 bills: " + bills.getOnes());
            }
            public static int getUserInput(String message, Scanner scan) {
                System.out.print("Enter the " + message + ": ");
                return scan.nextInt();
            }
            public static void printRes(String message) {
                System.out.println(message);
            }


        }
