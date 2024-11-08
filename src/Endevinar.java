import java.util.Scanner;
public class Endevinar {
    public static void main (String[] args) {
        Scanner lector = new Scanner(System.in);
        final int VALOR_SECRET = 4;
        int intentos = 5;
        int valorUsuari = 0;
        System.out.println("Comencem el joc.");
        System.out.println("Endevina el valor enter, entre 0 i 10.");
        boolean haEncertat = false;
        while (haEncertat == false && intentos > 0) {
            System.out.print("Quin valor creus que és? ");
            if(lector.hasNextInt()){
                intentos--;
                valorUsuari = lector.nextInt();
                lector.nextLine();
            }else {
                System.out.println("Valor incorrecte.");
                break;
            }
                if (VALOR_SECRET != valorUsuari) {
                    System.out.print("Has fallat! Torna a intentar-ho...\n");
                }else if (valorUsuari == VALOR_SECRET){
                haEncertat = true;
                System.out.println("Enhorabona. Per fi l'has encertat!");
                }
        }
        System.out.println("Has perdut");
    }
}
