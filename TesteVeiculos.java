class Veiculo {
    public void mover() {
        System.out.println("O veículo está se movendo.");
    }
}

class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo rapidamente");
    }
}

class Bicicleta extends Veiculo {
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo lentamente");
    }
}

public class TesteVeiculos {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        carro.mover();
        bicicleta.mover();
    }
}