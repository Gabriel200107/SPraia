package br.com.zeniti.spraia.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_DENUNCIA")
public class Denuncia {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ds_denuncia",nullable = false)
    private String descricao;
    @Column(name = "st_denuncia",nullable = false)
    private String status;
    @Column(name = "tp_denuncia",nullable = false)
    private String tipo;
    @Column(name = "nv_denuncia",nullable = false)
    private String nivel;
    @Column(name = "dt_denuncia")
    private LocalDate dataDenuncia;

    public Denuncia() {
    }

    public Denuncia(String descricao, String status, String tipo, String nivel, LocalDate dataDenuncia) {
        this.descricao = descricao;
        this.status = status;
        this.tipo = tipo;
        this.nivel = nivel;
        this.dataDenuncia = dataDenuncia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public LocalDate getDataDenuncia() {
        return dataDenuncia;
    }

    public void setDataDenuncia(LocalDate dataDenuncia) {
        this.dataDenuncia = dataDenuncia;
    }



    

    
    
}