package br.com.SinerjiJava.Funcionario;

public class Venda {
    private double valor;
    private int mes;
    private int ano;

    public Venda(double valor, int mes, int ano) {
        this.valor = valor;
        this.mes = mes;
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
