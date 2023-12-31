package br.senac.loja.entidades;

import jakarta.persistence.*;

@Entity
public class Produto {
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false)
    private double preco;
    @Column(nullable = false)
    private String descricao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
