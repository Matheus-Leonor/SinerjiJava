package br.com.SinerjiJava.Funcionario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Vendedor extends Funcionario{
    private List<Venda> vendas;

    private double  valorVendidoMensal;

    public Vendedor(String nome, Cargo cargo, LocalDate dataContratacao, double valorVendidoMensal) {
        super(nome, Cargo.VENDEDOR, dataContratacao);
        this.valorVendidoMensal = valorVendidoMensal;
        this.vendas = new ArrayList<>();
    }

    public List<Venda> getVendas() {
        return  vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas =  vendas;
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        double salarioBase = 12000.00;
        double bonusAnual = valorVendidoMensal * 0.18;
        return salarioBase + (bonusAnual / 12);
    }

    @Override
    public double calcularBeneficio(int mes, int ano) {
        double salarioMes = calcularSalario(mes, ano);
        return salarioMes * 0.30;
    }

    public double getValorVendidoMensal(int mes, int ano) {
        return valorVendidoMensal;
    }

    public void setValorVendidoMensal(double valorVendidoMensal) {
        this.valorVendidoMensal = valorVendidoMensal;
    }


}
