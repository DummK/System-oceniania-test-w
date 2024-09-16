import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz liczbe punktow");
        int points = scan.nextInt();

        if(points < 50) {
            System.out.println("Musisz się jescze dużo nauczyc.");
        }
        else if(points >= 50 && points <= 70) {
            System.out.println("Średni wynik, ale jesteś na dobrej drodze.");
        }
        else if(points > 70) {
            System.out.println("Świetnie! Dobrze Ci poszło.");
        }
    }
}