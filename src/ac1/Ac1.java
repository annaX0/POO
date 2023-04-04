
package ac1;

import java.util.Scanner;

public class Ac1 {
    
    public static void main(String[] args) {
        int opc = 0;
        Pessoa pessoa = new Pessoa();
        
        Scanner opcao = new Scanner(System.in);
        
        while (opc != 3){
            System.out.println("1 = Criar pessoa");            
            System.out.println("2 = Mostar pessoa");            
            System.out.println("3 = Sair");

            opc = Integer.parseInt(opcao.nextLine());
            
            if(opc == 1){
                System.out.print("CPF: ");
                pessoa.setCpf(opcao.nextLine());
                
                System.out.print("Nome: ");
                pessoa.setNome(opcao.nextLine());
                
                System.out.print("Sexo: ");
                pessoa.setSexo(opcao.nextLine().charAt(0));
                
                System.out.print("Idade: ");
                pessoa.setIdade(Integer.parseInt(opcao.nextLine()));
                 
            }
            if(opc == 2){
                System.out.println(pessoa.imprime());
                
            }
            if(opc == 3){
                break;
            }
           
        }
    }
    
}
