public class Funcionarios {
    private String nome;
    private int idade;

    public void definirFuncionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
