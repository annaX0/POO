package exercicio2Apolice;

public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    private double valorAutomovel;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }
    
    public double CalcularValor(){
       if(sexo == 'm' && idade <= 25){
           return ((valorAutomovel * 100)/10) ;
       } else if(sexo == 'm' && idade >25){
           return ((valorAutomovel*5)/100);
       } else{
           return ((valorAutomovel*2)/100);
       }
    }
    public String Imprimir(){
        return "numero: "+numero +
                "\nNome: "+nome +
                "\nIdade: "+idade +
                "\nsexo: "+sexo +
                "\nAutomovel: "+valorAutomovel +
                "\nApólice: "+CalcularValor();


    
    }
  }
