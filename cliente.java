public class cliente {
    private String nome;
    private String email;


    public cliente(String nome, String email) {
        this.nome = nome;
                this.email = email;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return "Cliente: " + nome + " - Email: " + email;
    }
}
