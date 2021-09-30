public class Pessoa {

    private int id;
    private String nome;
    private String telefone;
    private int idade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + "\nNome: "
                + this.nome + "\nTelefone: "
                + this.telefone + "\nIdade: "
                + this.idade + "\nValidação Idade: "
                + this.verificaMaiorIdade();
    }

    private String verificaMaiorIdade(){
        if (this.idade >= 18) return "Maior de Idade";
        return "Menor de Idade";
    }
}
