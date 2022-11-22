import java.util.Scanner;

public class Aluno extends Pessoa {

    
    // Atributos
    
    private int _aExtra;
    private int qAulas;
    
    // Métodos construtores
    
    public Aluno(){
        
    }

    public Aluno(String nome, String email, String cpf, String endereco, 
    String cnh, String telefone, int idade, String obs, int _aExtra, int qAulas) {
        super(nome, email, cpf, endereco, cnh, telefone, idade, obs);
        this._aExtra = _aExtra;
        this.qAulas = qAulas;
    }
    
    // Scanner

    Scanner leia = new Scanner(System.in);

    // Métodos de acesso

    public int getqAulas() {
        return qAulas;
    }

    public void setqAulas(int qAulas) {
        this.qAulas = qAulas;
    }

    public int get_aExtra() {
        return _aExtra;
    }

    public void set_aExtra(int _aExtra) {
        this._aExtra = _aExtra;
    }

    // Metodos herdados

    @Override
    public void imprimi() {

        System.out.println("Nome:  " + getNome());
        System.out.println("E-mail:  " + getEmail());
        System.out.println("Cpf:  " + getCpf());
        System.out.println("Endereço:  " + getEndereco());
        System.out.println("Telefone:  " + getTelefone());
        System.out.println("Idade: " + getIdade());
        System.out.println("Aulas: " + getqAulas());
        System.out.println("Obseravção:  " + getObs());
        System.out.println("CNH: " +getCnh() + "\n");
    }

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
        System.out.print("Digite sua idade: ");
        setIdade(leia.nextInt());
        System.out.println("Observação: ");
        setObs(leia.next());

        int opcaoAluno1; 
        int opcaoAluno2;

        System.out.println("Escolha uma das opções");
        System.out.println("\t\t============================\n" +
                           "\t\t|  1 - 1ª habilitação      |\n" +
                           "\t\t|  2 - Adcionar categoria  |\n" +
                           "\t\t============================");
        opcaoAluno1 = leia.nextInt();
        switch (opcaoAluno1) {
            case 1:
                System.out.println("\t\t==============\n" +
                        "\t\t|  1 - B      |\n" +
                        "\t\t|  2 - A e B  |\n" +
                        "\t\t===============");
                opcaoAluno2 = leia.nextInt();
                switch (opcaoAluno2) {

                    case 1:
                        qAulas = 20;
                        System.out.println("Voçê devera fazer 20 aulas de carro");
                        break;
                    case 2:
                        qAulas = 40;
                        System.out.println("Voçê devera fazer 20 aulas de carro, e 20 de moto");
                        break;
                }
            break;

            case 2:

                System.out.println("Qual categoria voçê deseja adicionar?");
                setCnh(leia.next());
                System.out.println("Voçê devera fazer 20 aulas na categoria " + getCnh().toUpperCase() );
                qAulas = 20;

                break;

            default:
                System.out.println("\t\t---------OPÇÂO INVALIDA!!----------");
                System.out.println("\t\t----------TENTE NOVAMENTE----------");
                break;
        }

    }

}