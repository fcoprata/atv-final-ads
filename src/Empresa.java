import java.util.ArrayList;
import java.util.List;

public class Empresa {
    
    private String nome;
    private List<Funcionarios> funcionarios;
    
    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }
    
    public void adicionarFuncionario(Funcionarios funcionario) {
        funcionarios.add(funcionario);
    }
}