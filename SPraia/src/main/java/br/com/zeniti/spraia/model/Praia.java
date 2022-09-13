package br.com.zeniti.spraia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_PRAIA")
public class Praia {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nm_praia",nullable = false)
    private String nome;
    @Column(name = "ds_praia",nullable = false)
    private String descricao;
    @Column(name = "av_praia",nullable = false)
    private int avaliacao;
    @Column(name = "ql_praia",nullable = false)
    private String qualidade;

    public Praia() {
    }

    public Praia(String nome, String descricao, int avaliacao, String qualidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
        this.qualidade = qualidade;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public String getQualidade() {
        return qualidade;
    }
    public void setQualidade(String qualidade) {
        this.qualidade = qualidade;
    }

    
    
}
