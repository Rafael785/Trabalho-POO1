package br.com.atacado.dominio;

import java.time.LocalDate;

public abstract class BaseTranporte {

    protected int codigo;

    protected String descricao;

    protected LocalDate dataInser;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate setDataInser() {
        return dataInser;
    }

    public void setDataInser(LocalDate dataInser) {
        this.dataInser = dataInser;
    }

    public BaseTranporte(int codigo, String descricao, LocalDate datainser) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataInser = datainser;
    }

    public abstract void Imprimir();
}