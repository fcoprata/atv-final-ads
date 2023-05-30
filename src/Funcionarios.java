public class Funcionarios {
    private String nome;
    private int idade;
    private double salario;

    public void definirFuncionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void exibirFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Base: R$" + salario);
    }
}
