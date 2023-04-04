
package ac1.exercicio2;
    


public class Aluno {
    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }
    public float CalcularMedia(){
        return (float) ((ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45) );
    }
    public String VerificaAprovacao(){
         if(CalcularMedia() >= 4){
            return "Aprovado!";
        }else{
             return "Reprovado";
         }
    }
    
    public String imprimir(){
        return "RA: "+ra +
                "\nNome: "+nome +
                "\nAc1: "+ac1 +
                "\nAc2: "+ac2 +
                 "\nAg: "+ag+
                 "\nAF: "+af+
                 "\nMedia: "+CalcularMedia()+
                  "\nSituação: "+VerificaAprovacao();



    }
    
    
    

    
}
