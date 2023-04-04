
package exercicio2Apolice;

import ac1.exercicio3.*;
import ac1.*;
import java.util.Scanner;

public class Ac1 {
    
    public static void main(String[] args) {
        int opc = 0;
        Apolice apolice = new Apolice();
        
        Scanner opcao = new Scanner(System.in);
        
        while (opc != 3){
            System.out.println("1 = Criar apolice");            
            System.out.println("2 = ver dados");           
            System.out.println("3 = Sair");

            opc = Integer.parseInt(opcao.nextLine());
            
            if(opc == 1){
                System.out.print("numero: ");
                apolice.setNumero(Integer.parseInt(opcao.nextLine()));
                
                System.out.print("nome: ");
                apolice.setNome(opcao.nextLine());
                
                System.out.print("idade: ");
                apolice.setIdade(Integer.parseInt(opcao.nextLine()));
                
                System.out.print("sexo: ");
                apolice.setSexo(opcao.nextLine().charAt(0));
                
                
                System.out.print("valor automovel: ");
                apolice.setValorAutomovel(Float.parseFloat(opcao.nextLine()));

                 System.out.print("valor apolice: " + apolice.CalcularValor());
             
            }
            if(opc == 2){
                System.out.println(apolice.Imprimir());
                
            }
         
            if(opc == 3){
                break;
            }
           
        }
    }
    
}
