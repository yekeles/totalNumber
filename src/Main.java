import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Rakamları toplamını istediğiniz sayıyı giriniz : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numberIcon, numberTotal = 0;
        while (number!= 0) {
            numberIcon = number % 10;
            number = number / 10;
            numberTotal += numberIcon;
        }
        System.out.print("Girmiş olduğunuz sayının rakamları toplamı : " + numberTotal);
    }
}
