import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    public static String promptString(String message) {
        String userInput = "";

        while (true){
            System.out.println(message);
            userInput = input.nextLine();
            try {
                Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                try {
                    Double.parseDouble(userInput);
                } catch (NumberFormatException r) {
                    break;
                }
            }
            System.out.println("Not a string, please try again");
        }
        return userInput;
    }

    public static int promptInt(String message) {
        int userInput = 0;
        boolean test = true;
        while (test) {
            System.out.println(message);

            try {
                userInput = input.nextInt();
                input.nextLine();
                test = false;
            } catch (Exception e) {
                input.next();
                System.out.println("Not an int! Please input an int");
            }
        }
        return userInput;
    }

    public static double promptDouble(String message) {
        double userInput = 0;
        boolean test = true;

        while (test) {
            System.out.println(message);

            try {
                userInput = input.nextDouble();
                input.nextLine();
                test = false;
            } catch (Exception e) {
                input.next();
                System.out.println("Not a double, please input a double instead!");
            }
        }
        return userInput;
    }



    public static void main(String[] args) {
        System.out.println(promptString("Hello! Please input a string of any sort!"));
        System.out.println(promptInt("Now input an int please!"));
        System.out.println(promptDouble("Now please input a double :3"));
    }
}