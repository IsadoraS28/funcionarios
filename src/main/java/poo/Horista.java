package poo;

public class Horista extends MensalFixo {

    private double porHora;
    private double horas;

    public void setPorHora(double ph){
        porHora = ph;
    }

    public void setHoras(double ho){
        horas = ho;
    }

    public double calcularSalario(){

        double pagamento = (salario*porHora)/100.00;
        pagamento = pagamento*horas + salario;
        return pagamento;

    }

}
