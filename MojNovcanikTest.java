package MojNovcanik;

import java.util.Scanner;

public class MojNovcanikTest {
    public static void main(String[] args) {

        System.out.println("Dobrodosli!");
        System.out.println("Izaberite jednu od opcija:");
        System.out.println("1 - Sign Up");
        System.out.println("2 - Log In");
        System.out.println("3 - Nazad u prethodni meni");
        System.out.println("0 - Izlaz");

        Scanner sc = new Scanner(System.in);
        int kontrola = sc.nextInt();
        if (kontrola == 1){
            System.out.println("Sign Up");
        }
        else if (kontrola == 2){
            System.out.println("Log In");
        }
        else if (kontrola == 3){
            System.out.println("Nazad u prethodni meni");
        }
        else if (kontrola == 0){
            System.out.println("Izlaz");
        }
        else {
            System.out.println("Greska! Izaberite jednu od ponudjenih opcija");
        }



        //SignUp korisnik1 = new SignUp("ivan", "milosevic");
    }
}
