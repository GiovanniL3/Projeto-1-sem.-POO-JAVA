import java.util.Scanner;
public class Instrutor extends Pessoa{

Scanner leia = new Scanner(System.in);

    //Atributos

    private int salario;
    private String turno;

    // Métodos contrutores

    public Instrutor(int salario, String turno) {
        this.salario = salario;
        this.turno = turno;
    }
    public Instrutor(String nome, String email, String cpf, String obs, String endereco, String cnh, String telefone,
    int idade, int salario, String turno) {
        super(nome, email, cpf, obs, endereco, cnh, telefone, idade);
        this.salario = salario;
        this.turno = turno;
    }

    // Métodos de acesso
    
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    // Métodos
    
    @Override
    public void cadastro() {
        
    }
    @Override
    public void imprimi() {
        
    }

}
    

