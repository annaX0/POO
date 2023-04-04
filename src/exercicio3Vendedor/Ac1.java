
package exercicio3Vendedor;

import exercicio2Apolice.*;
import ac1.exercicio3.*;
import ac1.*;
import java.util.Scanner;

public class Ac1 {
    
    public static void main(String[] args) {
        int opc = 0;
        Vendedor vendedor = new Vendedor();
        
        Scanner opcao = new Scanner(System.in);
        
        while (opc != 3){
            System.out.println("1 = Criar vendedor");            
            System.out.println("2 = calcular comissao");           
            System.out.println("3 = Sair");

            opc = Integer.parseInt(opcao.nextLine());
            
            if(opc == 1){
                System.out.print("codigo: ");
                vendedor.setCodigo(Integer.parseInt(opcao.nextLine()));
                
                System.out.print("nome: ");
                vendedor.setNome(opcao.nextLine());
                
                System.out.print("comissoa %: ");
                vendedor.setPercentual(Integer.parseInt(opcao.nextLine()));
                
               
            }
            if(opc == 2){
                System.out.println("Informe o valor da venda: ");
                   System.out.println("Informe o valor do desconto");
             
                System.out.println("valor: " + vendedor.imprime(Double.parseDouble(opcao.nextLine()), Double.parseDouble(opcao.nextLine())));
                
            }
         
            if(opc == 3){
                break;
            }
           
        }
    }
    
}
