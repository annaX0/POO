
package ac1.exercicio1Calculadora;

public class Calculadora {
    private int num1;
    private int num2;

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public double Soma(){
        return (double) (num1 + num2);
    }
    public double Subtracao(){
        return (double) num1 - num2;
    }
    public double Multiplicacao(){
        return (double) num1 * num2;
    }
    public double Divisao(){
        return (double) num1 / num2;
    }
  
}
