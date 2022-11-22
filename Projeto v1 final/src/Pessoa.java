public abstract class Pessoa {

    // Atributos

    private String nome, telefone, email, cpf, cnh, obs, endereco;
    private int idade;

    // Métodosa construtores

    public Pessoa() {

    }

    public Pessoa(String nome, String email, String cpf, String endereco,
            String cnh, String telefone, int idade, String obs) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cnh = cnh;
        this.telefone = telefone;
        this.idade = idade;
        this.obs = obs;
    }

    // Metodos de acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Metodos

    public abstract void cadastro();

    public abstract void imprimi();

}
