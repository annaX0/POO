package ac1.exercicio3;

public class Funcionario {
    private int cracha;
    private String nome;
    private char TipoVeiculo;
    private float valorHora;
    private float qtdHora;
    private float salario;
    private float valorDesconto;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVeiculo() {
        return TipoVeiculo;
    }

    public void setTipoVeiculo(char TipoVeiculo) {
        this.TipoVeiculo = TipoVeiculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(float qtdHora) {
        this.qtdHora = qtdHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public float calcularValorSalario(){
        if(TipoVeiculo == 'h'){
            return ((valorHora*qtdHora)-valorDesconto);
        } else{
            return (salario-valorDesconto);
        }
    }
     public String imprime(){
        return "cracha: "+cracha +
                "\nNome: "+nome +
                "\nVeiculo: "+TipoVeiculo +
                "\nSalario: "+salario +
                "\nDesconto: " + valorDesconto +
                "\nReceber: " + calcularValorSalario();
    }
    
    
    
}
