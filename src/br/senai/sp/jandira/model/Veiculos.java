package br.senai.sp.jandira.model;

public class Veiculos {
   private String modelo , marca;
    private int ano, placa;

    public Veiculos(String marca){
        this.marca = "Honda";
    }

    public void acelerar(){
        System.out.println(" O veiculo está acelerado....");
    }
    public void freiar(){
        System.out.println("O veiculo está freiando...");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }
}
