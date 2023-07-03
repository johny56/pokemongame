//2import java.util.ArrayList;
import java.util.Scanner;
public class Pokemongame{
    public static void main(String[] args){
        System.out.println("----------------Welcome to Pokemon game-------------------");
        System.out.println("      Choose your first Pokémon         ");
        System.out.printf("(1) first pokeball \n(2) second pokeball \n(3) third pokeball \n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Trainner t1= new Trainner(choice);
        System.out.println("  Choose Success");
        t1.play();
        sc.close();
    }
}

