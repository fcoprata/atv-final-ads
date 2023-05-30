public class Main {
    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios();
        funcionario1.definirFuncionario("João", 30);
        funcionario1.exibirFuncionario();

        Funcionarios funcionario2 = new Funcionarios();
        funcionario2.definirFuncionario("Maria", 25);
        funcionario2.exibirFuncionario();
    }
}