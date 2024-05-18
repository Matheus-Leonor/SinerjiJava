package br.com.SinerjiJava;

import br.com.SinerjiJava.Funcionario.Funcionario;
import br.com.SinerjiJava.Funcionario.Vendedor;
import java.util.ArrayList;
import java.util.List;

public class FolhaPagamentoApp {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = FuncionarioUtil.criarListaFuncionarios();
        List<Vendedor> vendedores = new ArrayList<>();

        System.out.println("Total da Folha de Pagamento (Dez/2021): " + calcularTotalFolhaPagamento(funcionarios, 12, 2021));
        System.out.println("Total Pago em Salários (Dez/2021): " + calcularTotalSalario(funcionarios, 12, 2021));
        System.out.println("Cálculo do Total Pago em Benefícios: (Dez/2021): " + calcularTotalBeneficio(funcionarios, 12, 2021));
        System.out.println("Funcionário com Maior Receita (Salário + Benefício): (Dez/2021): " + funcionarioComMaiorReceita(funcionarios, 12, 2021));
        System.out.println("Funcionário com Maior Beneficio (Salário + Benefício): (Dez/2021): " + funcionarioComMaiorBeneficio(funcionarios, 12, 2021));
        System.out.println("Vendedor com Maior Valor Vendido:(Dez/2021): " + vendedorComMaiorVenda(vendedores, 12, 2021));


    }

    //1. Cálculo do Total Pago (Salário + Benefício):
    public static double calcularTotalFolhaPagamento(List<Funcionario> funcionarios, int mes, int ano) {
        double totalFolha = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularSalario(mes, ano);
            double beneficio = funcionario.calcularBeneficio(mes, ano);
            totalFolha += salario + beneficio;
        }

        return totalFolha;
    }

    //2. Cálculo do Total Pago em Salários:
    public static double calcularTotalSalario(List<Funcionario> funcionarios, int mes, int ano) {
        double totalSalario = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularSalario(mes, ano);
            totalSalario += salario;
        }

        return totalSalario;
    }

    //3. Cálculo do Total Pago em Benefícios:
    public static double calcularTotalBeneficio(List<Funcionario> funcionariosComBeneficio, int mes, int ano) {
        double totalBeneficio = 0.0;

        for (Funcionario funcionario : funcionariosComBeneficio) {
            double beneficio = funcionario.calcularBeneficio(mes, ano);
            totalBeneficio += beneficio;
        }

        return totalBeneficio;
    }

    //4. Funcionário com Maior Receita (Salário + Benefício):
    public static Funcionario funcionarioComMaiorReceita(List<Funcionario> funcionarios, int mes, int ano) {
        Funcionario funcionarioMaiorReceita = null;
        double maiorReceita = Double.MIN_VALUE;

        for (Funcionario funcionario : funcionarios) {
            double receitaTotal = funcionario.calcularSalario(mes, ano) + funcionario.calcularBeneficio(mes, ano);
            if (receitaTotal > maiorReceita) {
                maiorReceita = receitaTotal;
                funcionarioMaiorReceita = funcionario;
            }
        }

        return funcionarioMaiorReceita;
    }

    //5. Funcionário com Maior Benefício:
    public static Funcionario funcionarioComMaiorBeneficio(List<Funcionario> funcionariosComBeneficio, int mes, int ano) {
        Funcionario funcionarioMaiorBeneficio = null;
        double maiorBeneficio = Double.MIN_VALUE;

        for (Funcionario funcionario : funcionariosComBeneficio) {
            double beneficio = funcionario.calcularBeneficio(mes, ano);
            if (beneficio > maiorBeneficio) {
                maiorBeneficio = beneficio;
                funcionarioMaiorBeneficio = funcionario;
            }
        }

        return funcionarioMaiorBeneficio;
    }

    //6. Vendedor com Maior Valor Vendido:
    public static Vendedor vendedorComMaiorVenda(List<Vendedor> vendedores, int mes, int ano) {
        Vendedor vendedorMaiorVenda = null;
        double maiorVenda = Double.MIN_VALUE;

        for (Vendedor vendedor : vendedores) {
            double valorVendidoMes = vendedor.getValorVendidoMensal(mes, ano);
            if (valorVendidoMes > maiorVenda) {
                maiorVenda = valorVendidoMes;
                vendedorMaiorVenda = vendedor;
            }
        }

        return vendedorMaiorVenda;
    }

}