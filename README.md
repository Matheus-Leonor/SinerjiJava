# SinerjiJava
## Modelando as classes:
Apliquei o conceito de orientação a objetos criando uma classe para cada objeto. A primeira classe foi a classe Funcionário, uma classe abstrata pois a ideia não é ser instanciada diretamente,
mas apenas possuir os atributos comuns de todos os funcionários, assim como os metodos que serão sobreescritos por outras classes derivadas. exemplo: metodo  calcularSalario e calcularBeneficio. 

Classe Secretário, Gerente e Vendedor são clases herdam atributos da classe funcionário, e sobrescrevem seus metódos e adicionam atributos individuais. 

## Abordagem:
Seguindo a abordagem proposta, o projeto foi modelado de forma que pudesse utilizar listas, como lista de funcionários, lista de vendedores e quantidades de vendas. Porém outra forma de fazer, talvez mais interessante seria utilizando Banco de dados ao invés de listas. Usando **Annotations JPA para Mapeamento de Relacionamentos entre Entidades** No contexto do Java Persistence API (JPA), as annotations **@OneToOne, @OneToMany, @ManyToOne e @ManyToMany** são utilizadas para mapear relacionamentos entre entidades. Voltando ao contexto do desafio,  poderiamos usar de exemplo a classe Vendedor e a classe Vendas. Podemos dizer que todo vendedor tem uma venda, assim como toda venda tem um vendedor. Dessa forma a classe Vendedor teria a annotatin OneToMany e a classe vendas ManyToOne. 

Outro detalhe é que seria bem mais recomendado criar entidades e tabelas no banco de dados, principalmente no contexto de uma empresa real com diversos funcionários e vendas. Fazer isso apenas com listas tornaria dificil gerenciar. 

## Metodos:

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
