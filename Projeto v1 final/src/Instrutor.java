import java.util.Scanner;

public class Instrutor extends Pessoa{

    //Atributos

    private Double salario;
    private String turno;

    // Métodos contrutores
    
    public Instrutor(String nome, String email, String cpf, 
    String endereco, String cnh, String telefone, int idade,
            String obs) {
        super(nome, email, cpf, endereco, cnh, telefone, idade, obs);
        this.salario = salario;
        this.turno = turno;
    }


    // Scanner

    Scanner leia = new Scanner(System.in);

    // Métodos de acesso

    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
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

        System.out.print("Digite seu nome: ");
        setNome(leia.nextLine());
        System.out.print("Digite seu e-mail: ");
        setEmail(leia.nextLine());
        System.out.print("Digite seu cpf: ");
        setCpf(leia.nextLine());
        System.out.print("Digite seu endereço: ");
        setEndereco(leia.nextLine());
        System.out.print("Digite seu telefone: ");
        setTelefone(leia.nextLine());
        System.out.print("Observação: ");
        setObs(leia.nextLine());
        System.out.print("Digite os turno(s) de trabalho: ");
        setTurno(leia.next());
        System.out.print("Digite sua idade: ");
        setIdade(leia.nextInt());
        System.out.print("Digite o salario: ");
        setSalario(leia.nextDouble());

    }
    
    @Override
    public void imprimi() {

        System.out.println("Nome:  " + getNome());
        System.out.println("E-mail:  " + getEmail());
        System.out.println("Cpf:  " + getCpf());
        System.out.println("Endereço:  " + getEndereco());
        System.out.println("Telefone:  " + getTelefone());
        System.out.println("Idade: " + getIdade());
        System.out.println("Obseravção:  " + getObs());
        System.out.println("Turno:  " + getTurno());
        System.out.println("Salario:  " + getSalario());

    }


}