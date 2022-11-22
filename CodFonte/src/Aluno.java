import java.util.Scanner;
public abstract class Aluno extends Pessoa {
    
Scanner leia = new Scanner(System.in);

    //Atributos

    private int _aExtra;
    private int qAulas = 20;

    // Métodos construtores

    public Aluno(){

    }
    public Aluno(String nome, String email, String cpf, String obs, String endereco, String cnh, String telefone,
    int idade, int _aExtra, int qAulas) {
        super(nome, email, cpf, obs, endereco, cnh, telefone, idade);
        this._aExtra = _aExtra;
        this.qAulas = qAulas;
    }

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

    //Métodos propios

    public void addAula(){
         qAulas = qAulas + _aExtra;
    }
//--------------------------------------------//
    public String verificar18(){

        String v = " ";

        if (getIdade() >= 18){
            v = " Valido ";
        }

        return v;
    }

    public String verificar21(){

        String v = " ";

        if (getIdade() >= 21){
            v = " Valido ";
        }

        return v;
    }
//--------------------------------------------//
    //Metodos herdados 

    @Override
    public void imprimi() {
        
    }
    @Override
    public void cadastro() {
        
    } 
}
