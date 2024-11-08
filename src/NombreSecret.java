import java.util.Scanner;

public class NombreSecret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NOMBRE_SECRET = 30;
        int nombreUsuari;

        System.out.print("Introdueix el nombre que trobes que és: ");
        nombreUsuari = sc.nextInt();

        if (nombreUsuari == NOMBRE_SECRET) {
            System.out.println("Has endevinat el nombre secret");

        }else {
            System.out.println("No Has endevinat el nombre secret");
        }

        System.out.println("Fin del programa");
    }
}
