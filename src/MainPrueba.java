
import java.util.Scanner;


public class MainPrueba {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Camping miCamping = new Camping ();
        for (int i = 0; i < miCamping.ArrayParcelas.size(); i++) {
            System.out.println(((Parcela)miCamping.ArrayParcelas.get(i)).tipo);
        }
    }
}
