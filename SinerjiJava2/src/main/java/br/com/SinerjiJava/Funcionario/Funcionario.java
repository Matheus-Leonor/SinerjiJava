package br.com.SinerjiJava.Funcionario;

import java.time.LocalDate;

public abstract class Funcionario {
    private String nome;
    private Cargo cargo;
    private LocalDate dataContratacao;

    public Funcionario(String nome, Cargo cargo, LocalDate dataContratacao) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataContratacao = dataContratacao;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public abstract double calcularSalario(int mes, int ano);

    public abstract double calcularBeneficio(int mes, int ano);

    public double calcularPagamentoTotal(int mes, int ano) {
        return calcularSalario(mes, ano) + calcularBeneficio(mes, ano);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo=" + cargo +
                ", dataContratacao=" + dataContratacao +
                '}';
    }
}
