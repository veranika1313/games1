import  java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Попробуйте угадать число загаданное компьютером от 1 до 100!");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = rand.nextInt(101);
        boolean play = true;

        while (play){
            System.out.println("Введите ваше число: ");
            int number = scan.nextInt();

            if (number == n) {
                System.out.println("Поздравляем, вы угадали число!");
                play = false;
            } else if (number < n) {
                System.out.println("Ваше число менньше загаданного, попробуйте еще раз!");
            } else {
                System.out.println("Ваше число больше загадонного, попробуйте еще раз!");
            }
        }
    }
}



