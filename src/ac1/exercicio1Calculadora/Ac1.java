
package ac1.exercicio1Calculadora;

import ac1.*;
import java.util.Scanner;

public class Ac1 {
    
    public static void main(String[] args) {
        int opc = 0;
        Calculadora calculadora = new Calculadora();
        
        Scanner opcao = new Scanner(System.in);
        
        while (opc != 5){
            System.out.println("1 = Somar");            
            System.out.println("2 = Subtrair");            
            System.out.println("3 = Multiplicar");
            System.out.println("4 = Dividir");
            System.out.println("5 = Sair");


            opc = Integer.parseInt(opcao.nextLine());
            
            if(opc == 1){
                System.out.println("num1: ");
                calculadora.setNum1(Integer.parseInt(opcao.nextLine()));
                
                System.out.println("num2: ");
                calculadora.setNum2(Integer.parseInt(opcao.nextLine()));
            
                System.out.println(calculadora.Soma());
            }
            if(opc == 2){
               System.out.println("num1: ");
                calculadora.setNum1(Integer.parseInt(opcao.nextLine()));
                
                System.out.println("num2: ");
                calculadora.setNum2(Integer.parseInt(opcao.nextLine()));
            
                System.out.println(calculadora.Subtracao());
                
            }
            if(opc == 3){
                System.out.println("num1: ");
                calculadora.setNum1(Integer.parseInt(opcao.nextLine()));
                
                System.out.println("num2: ");
                calculadora.setNum2(Integer.parseInt(opcao.nextLine()));
            
                System.out.println(calculadora.Multiplicacao());
            }
            if(opc == 4){
                 System.out.println("num1: ");
                calculadora.setNum1(Integer.parseInt(opcao.nextLine()));
                
                System.out.println("num2: ");
                calculadora.setNum2(Integer.parseInt(opcao.nextLine()));
            
                System.out.println(calculadora.Divisao());
            }
            else{
                break;
            }
           
        }
    }
    
}
