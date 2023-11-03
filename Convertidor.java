package convertidor;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author zSamuel002
 */
public class Convertidor {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a, b, c, d;
        a = 0;
        b = 1;
        
        System.out.println("Conversor decimal a binario");
        System.out.print("Ingrese un numero: ");
        c = x.nextInt();
        
        while (c>0) {            
        d = c % 2;
        a = a + d * b;
        c = Math.abs(c/2);
        b = b * 10;
        }
        System.out.println("El numero en binario es: " + a);
        
    }
    
}
