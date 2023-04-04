
package exercicio3Vendedor;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentual;
   



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    
   public static double calcularPagamentoComissao2(double valorVenda, double percentuaComissao){
        return (valorVenda * percentuaComissao)/100;
    }
   public double calculaVenda(double valorVenda, double desconto){
         return  calcularPagamentoComissao2(valorVenda, percentual);

   }
   
    
    
  public double imprime(double valorVenda, double desconto){
       return calculaVenda(valorVenda, desconto);
    }
    
}
