package models;


public abstract class Pessoa {

    // #region Atributos
    private String nome;

    private String cpf;

    private String celular;

    private Endereco endereco;
    // #endregion  Atributos

 
    // #endregion Contructores
   
    // #region Getters e Setters
    public String getNome() {
        return nome;
    }

  
public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    // #endregion Getters e Setters

}
