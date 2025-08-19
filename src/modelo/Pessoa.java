package modelo;

import java.util.Objects;

public class Pessoa {
    private String cpf;
    private String nome;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "cpf=" + cpf + ", nome=" + nome;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        } else {
            Pessoa pessoa = (Pessoa) o;
            return Objects.equals(cpf, pessoa.cpf) && Objects.equals(nome, pessoa.nome);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome);
    }
}
