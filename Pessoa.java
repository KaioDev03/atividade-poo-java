public class Pessoa {
    String nome;
    int idade;
    String cidade;

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "João";
        pessoa.idade = 25;
        pessoa.cidade = "Caruaru";

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Cidade: " + pessoa.cidade);
    }
}