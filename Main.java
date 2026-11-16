// ==========================================
// TRABALHO PRÁTICO: PRINCÍPIOS SOLID EM JAVA
// Aluno: Nathan Gramond Moriane
// ==========================================

// 1. SRP (Single Responsibility Principle)
class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() { return nome; }
    public double getSalarioBase() { return salarioBase; }
}

class CalculadoraSalario {
    public double calcular(Funcionario funcionario) {
        // Regra de cálculo de salário isolada da entidade
        return funcionario.getSalarioBase() * 1.1; 
    }
}

// 2. OCP & DIP (Open/Closed & Dependency Inversion)
interface RegraDesconto {
    double aplicarDesconto(double valor);
}

class DescontoVip implements RegraDesconto {
    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.85; // 15% de desconto
    }
}

class ProcessadorPedido {
    private RegraDesconto regraDesconto;

    // Injeção de dependência (DIP)
    public ProcessadorPedido(RegraDesconto regraDesconto) {
        this.regraDesconto = regraDesconto;
    }

    public double processar(double valorBruto) {
        return regraDesconto.aplicarDesconto(valorBruto);
    }
}

// Classe Principal para testes
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Executando Testes SOLID ===");
        
        Funcionario func = new Funcionario("Carlos", 3000.0);
        CalculadoraSalario calc = new CalculadoraSalario();
        System.out.println("Salário Calculado: " + calc.calcular(func));

        ProcessadorPedido pedido = new ProcessadorPedido(new DescontoVip());
        System.out.println("Pedido com Desconto VIP: " + pedido.processar(200.0));
    }
}
