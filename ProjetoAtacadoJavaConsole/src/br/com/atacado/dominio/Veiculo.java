package br.com.atacado.dominio;

import java.time.LocalDate;

public class Veiculo extends BaseTranporte {

    protected int codigoFrota;

    protected String placa;

    public int getCodigoFrota() {
        return codigoFrota;
    }

    public void setCodigoFrota(int codigoFrota) {
        this.codigoFrota = codigoFrota;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void Imprimir() {
        System.out.println(" -- decriçao Do Veiculo -- ");
        System.out.println("Codigo Do Veiculo" + codigo);
        System.out.println("Descrição Do Veiculo" + descricao);
        System.out.println("Data De Cadastramento Do Veiculo" + dataInser);
        System.out.println("Codigo Da Frota " + codigoFrota);
        System.out.println("Placa Do Veiculo" + placa);
    }

    public Veiculo(int codigoFrota, String placa, LocalDate dataInser, String descricao, int codigo) {
        super(codigo, descricao, dataInser);
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataInser = dataInser;
        this.codigoFrota = codigoFrota;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo [" +
                "codigo=" + codigo +
                "descricao=" + descricao +
                "dataInser=" + dataInser +
                "codigoFrota=" + codigoFrota +
                ", placa=" + placa
                + "]";
    }

}
