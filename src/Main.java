public class Main {
    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("UNIFOR");
        Funcionarios funcionario1 = new Funcionarios();
        funcionario1.definirFuncionario("João", 30, 2500.0);
        funcionario1.exibirFuncionario();

        double salarioFinal = funcionario1.calcularSalario(10);
        System.out.println("Salário Final: R$" + salarioFinal);
        funcionario1.exibirFuncionario();

        minhaEmpresa.adicionarFuncionario(funcionario1);
        minhaEmpresa.exibirFuncionarios();
    }
}