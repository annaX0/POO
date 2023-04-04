
package ac1.exercicio3;

import ac1.*;
import java.util.Scanner;

public class Ac1 {
    
    public static void main(String[] args) {
        int opc = 0;
        Funcionario funcionario = new Funcionario();
        
        Scanner opcao = new Scanner(System.in);
        
        while (opc != 3){
            System.out.println("1 = Criar funcionario");            
            System.out.println("2 = Mostar folha");
            System.out.println("3 = Alterar remuneracao");            
            System.out.println("4 = Sair");

            opc = Integer.parseInt(opcao.nextLine());
            
            if(opc == 1){
                System.out.print("cracha: ");
                funcionario.setCracha(Integer.parseInt(opcao.nextLine()));
                
                System.out.print("Nome: ");
                funcionario.setNome(opcao.nextLine());
                
                System.out.print("Desconto: ");
                funcionario.setValorDesconto(Float.parseFloat(opcao.nextLine()));
                 
                
                System.out.print("veiculo: ");
                funcionario.setTipoVeiculo(opcao.nextLine().charAt(0));
                
                if(funcionario.getTipoVeiculo() == 'h'){
                
                 System.out.print("valor Hora: ");
                funcionario.setValorHora(Float.parseFloat(opcao.nextLine()));
                
                    
                 System.out.print("Horas trabalhadas: ");
                funcionario.setQtdHora(Float.parseFloat(opcao.nextLine()));
                
                } else{
                     System.out.print("Salario: ");
                funcionario.setSalario(Float.parseFloat(opcao.nextLine()));
                
                
                }

      
               
                
                
            }
            if(opc == 2){
                System.out.println(funcionario.imprime());
                
            }
             if(opc == 3){
                   System.out.print("veiculo: ");
                funcionario.setTipoVeiculo(opcao.nextLine().charAt(0));
                
                System.out.print("Desconto: ");
                funcionario.setValorDesconto(Float.parseFloat(opcao.nextLine()));
                 
                
                if(funcionario.getTipoVeiculo() == 'h'){
                
                 System.out.print("valor Hora: ");
                funcionario.setValorHora(Float.parseFloat(opcao.nextLine()));
                
                    
                 System.out.print("Horas trabalhadas: ");
                funcionario.setQtdHora(Float.parseFloat(opcao.nextLine()));
                
                } else{
                     System.out.print("Salario: ");
                funcionario.setSalario(Float.parseFloat(opcao.nextLine()));
                
                
                }


            }
            if(opc == 4){
                break;
            }
           
        }
    }
    
}
