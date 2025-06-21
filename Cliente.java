public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    private int idCliente;


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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(String nome, String telefone, String email, String endereco, int idCliente) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.idCliente = idCliente;
    }

    public Cliente() {
        this.nome = "sem nome";
        this.telefone = "sem telefone";
        this.email = "sem email";
        this.endereco = "sem endereco";
        this.idCliente = 0;
    }
}

