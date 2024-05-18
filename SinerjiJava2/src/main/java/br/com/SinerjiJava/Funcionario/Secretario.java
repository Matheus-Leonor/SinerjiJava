package br.com.SinerjiJava.Funcionario;

import java.time.LocalDate;

public class Secretario extends Funcionario {
    private int anoExperiencia;

    public Secretario(String nome, Cargo cargo, LocalDate dataContratacao, int anoExperiencia) {
        super(nome, Cargo.SECRETARIO, dataContratacao);
        this.anoExperiencia = anoExperiencia;
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        double salarioBase = 7000.00;
        double bonusAnual = anoExperiencia * 1000.00;
        return salarioBase + (bonusAnual / 12);
    }

    @Override
    public double calcularBeneficio(int mes, int ano) {
        double salarioMes = calcularSalario(mes, ano);
        return salarioMes * 0.20;
    }
}
