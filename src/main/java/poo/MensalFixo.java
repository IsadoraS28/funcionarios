package poo;

public class MensalFixo {
    protected String nome;
    protected double salario;

    public void getMensalFixo(String no, double sal){

        nome = no;
        salario = sal;

    }

    public double calculaSalario(){
        return salario;
    }

    public void aumentarSalario(double aumento){

        salario += (salario*aumento)/100.00;

    }

    public String toString(){

        return nome + " - R$" + Double.toString(calculaSalario());

    }
}
