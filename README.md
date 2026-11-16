# Projeto: Princípios SOLID na Prática com Java

* *Aluno:* Nathan Gramond Moriane
* *Disciplina:* Arquitetura e Projeto de Software
* *Professor:* Henrique Santiago
* *Versão do Java:* Java 17+
* *Ferramenta de Build:* Maven

## Descrição dos 5 Princípios SOLID Implementados

Este repositório contém a resolução prática e teórica dos princípios SOLID aplicados à arquitetura de software:

1. *S - Single Responsibility Principle (Princípio da Responsabilidade Única):*
   * Conceito: Uma classe deve ter apenas um motivo para mudar, ou seja, deve ter uma única responsabilidade.
   * Aplicação: Separação entre a entidade Funcionario (dados) e a classe CalculadoraSalario (regras de cálculo).

2. *O - Open/Closed Principle (Princípio Aberto/Fechado):*
   * Conceito: Entidades de software devem ser abertas para extensão, mas fechadas para modificação.
   * Aplicação: Uso de interfaces de desconto (RegraDesconto) onde novos tipos podem ser adicionados sem alterar o código existente.

3. *L - Liskov Substitution Principle (Princípio da Substituição de Liskov):*
   * Conceito: Objetos em um programa devem ser substituíveis por instâncias de seus subtipos sem alterar a correção do programa.
   * Aplicação: Garantir que as subclasses implementem contratos das interfaces corretamente sem quebrar o comportamento esperado.

4. *I - Interface Segregation Principle (Princípio da Segregação de Interfaces):*
   * Conceito: Uma classe não deve ser forçada a depender de métodos que não utiliza.
   * Aplicação: Criação de interfaces específicas e enxutas em vez de uma única interface genérica e pesada.

5. *D - Dependency Inversion Principle (Princípio da Inversão de Dependência):*
   * Conceito: Dependa de abstrações, não de implementações concretas.
   * Aplicação: Injeção de dependências via construtor (ProcessadorPedido recebe RegraDesconto via abstração).
