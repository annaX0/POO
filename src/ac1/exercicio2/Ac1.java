
package ac1.exercicio2;

import ac1.*;
import java.util.Scanner;

public class Ac1 {
    
    public static void main(String[] args) {
        int opc = 0;
        Aluno aluno = new Aluno();
        
        Scanner opcao = new Scanner(System.in);
        
        while (opc != 3){
            System.out.println("1 = Criar aluno");            
            System.out.println("2 = Mostar aluno");            
            System.out.println("3 = Sair");

            opc = Integer.parseInt(opcao.nextLine());
            
            if(opc == 1){
                System.out.print("Ra: ");
                aluno.setRa(opcao.nextLine());
                
                System.out.print("Nome: ");
                aluno.setNome(opcao.nextLine());
                
                System.out.print("ac1: ");
                aluno.setAc1(Float.parseFloat(opcao.nextLine()));
 
                System.out.print("ac2: ");
                aluno.setAc2(Float.parseFloat(opcao.nextLine()));
 
                System.out.print("ag: ");
                aluno.setAg(Float.parseFloat(opcao.nextLine()));
 
                System.out.print("af: ");
                aluno.setAf(Float.parseFloat(opcao.nextLine()));
 
            }
            if(opc == 2){
                System.out.println(aluno.imprimir());
                
            }
            if(opc == 3){
                break;
            }
           
        }
    }
    
}
