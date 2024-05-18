package br.com.SinerjiJava;

import br.com.SinerjiJava.Funcionario.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioUtil {

    public static List<Funcionario> criarListaFuncionarios (){

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Secretario("Jorge Carvalho", Cargo.SECRETARIO, LocalDate.of(2018, 1, 1),5));
        funcionarios.add(new Secretario("Maria Souza", Cargo.SECRETARIO, LocalDate.of(2015, 12, 1),10));
        funcionarios.add(new Vendedor("Ana Silva", Cargo.VENDEDOR, LocalDate.of(2021, 12, 1), 0.15));
        funcionarios.add(new Vendedor("João Mendes", Cargo.VENDEDOR, LocalDate.of(2021, 12, 1), 0.20));
        funcionarios.add(new Gerente("Juliana Alves", Cargo.GERENTE, LocalDate.of(2017, 7, 1)));
        funcionarios.add(new Gerente("Bento Albino", Cargo.GERENTE, LocalDate.of(2014, 3, 1)));

        return funcionarios;
    }


}
