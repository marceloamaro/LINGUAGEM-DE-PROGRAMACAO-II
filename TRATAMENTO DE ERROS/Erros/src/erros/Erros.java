
package erros;

import java.util.Scanner;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class Erros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
       
        try{
            System.out.println("Infome um numero!");
            double num1 = en.nextDouble();
        
            System.out.println("Infome outro numero!");
            double num2 = en.nextDouble();
        
            double result = calcular(num1, num2);
            System.out.println(result);
        
        }catch(Exception e){
            System.out.println("Ops! Informe valores válidos"); 
        }
    }
    public static double calcular(double num1, double num2){
        return num1/num2;
    }
}
