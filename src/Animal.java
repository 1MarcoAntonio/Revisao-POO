public abstract class Animal implements comportamentos {
    private String nome;
    private int idade;
    private String peso;

    public Animal(String nome, int idade, String peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
