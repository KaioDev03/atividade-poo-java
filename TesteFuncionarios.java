class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.10;
    }
}

class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}

public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", 3000);
        Funcionario gerente = new Gerente("Mariana", 5000);

        System.out.println(
            "Bônus do funcionário: R$ " + funcionario.calcularBonus()
        );

        System.out.println(
            "Bônus do gerente: R$ " + gerente.calcularBonus()
        );
    }
}