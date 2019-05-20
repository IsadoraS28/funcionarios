package poo;

public class ComiEfetivo extends Comissionado{

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + salario;
    }
}
