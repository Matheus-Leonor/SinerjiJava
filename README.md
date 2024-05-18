# SinerjiJava
## Modelando as classes:
Apliquei o conceito de orientação a objetos criando uma classe para cada objeto. A primeira classe foi a classe Funcionário, uma classe abstrata pois a ideia não é ser instanciada diretamente,
mas apenas possuir os atributos comuns de todos os funcionários, assim como os metodos que serão sobreescritos por outras classes derivadas. exemplo: metodo  calcularSalario e calcularBeneficio. 

Classe Secretário, Gerente e Vendedor são clases herdam atributos da classe funcionário, e sobrescrevem seus metódos e adicionam atributos individuais. 

## Abordagem:
Seguindo a abordagem proposta, o projeto foi modelado de forma que pudesse utilizar listas, como lista de funcionários, lista de vendedores e quantidades de vendas. Porém outra forma de fazer, talvez mais interessante seria utilizando Banco de dados ao invés de listas. Usando **Annotations JPA para Mapeamento de Relacionamentos entre Entidades** No contexto do Java Persistence API (JPA), as annotations **@OneToOne, @OneToMany, @ManyToOne e @ManyToMany** são utilizadas para mapear relacionamentos entre entidades. Voltando ao contexto do desafio,  poderiamos usar de exemplo a classe Vendedor e a classe Vendas. Podemos dizer que todo vendedor tem uma venda, assim como toda venda tem um vendedor. Dessa forma a classe Vendedor teria a annotatin OneToMany e a classe vendas ManyToOne. 

Outro detalhe é que seria bem mais recomendado criar entidades e tabelas no banco de dados, principalmente no contexto de uma empresa real com diversos funcionários e vendas. Fazer isso apenas com listas tornaria dificil gerenciar. 

## Metodos:

public static double calcularTotalFolhaPagamento(List<Funcionario> funcionarios, int mes, int ano) {
        double totalFolha = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularSalario(mes, ano);
            double beneficio = funcionario.calcularBeneficio(mes, ano);
            totalFolha += salario + beneficio;
        }

        return totalFolha;
    }
