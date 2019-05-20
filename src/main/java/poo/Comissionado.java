package poo;

public class Comissionado extends MensalFixo {

    private double comissao;
    private double vendas;

    public void setComissao(double com){
        comissao = com;
    }

    public void setVendas(double ve){
        vendas = ve;
    }

    public double calcularSalario(){

        return (comissao*vendas)/100.00;

    }

}
