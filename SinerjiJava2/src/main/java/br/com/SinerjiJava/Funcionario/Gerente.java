package br.com.SinerjiJava.Funcionario;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    public Gerente(String nome, Cargo cargo, LocalDate dataContratacao) {
        super(nome, cargo, dataContratacao);
    }

    @Override
    public double calcularSalario(int mes, int ano) {
        double salarioBase = 20000.00;
        double bonusAnual = 3000.00;
        return salarioBase + (bonusAnual / 12);
    }

    @Override
    public double calcularBeneficio(int mes, int ano) {
        return 0.0; // Gerentes não possuem benefícios
    }
}
