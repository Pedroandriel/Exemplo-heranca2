package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Moto extends Veiculos {

   private boolean bau, antena ;

   public Moto(String marca){
       super(marca);
   }

   Scanner scanner =  new Scanner(System.in);
    // não esquecer de abilitar o Scanner //


   // a class pai (identificada como a principal,embora, nomeada como com um terno técnico por nome "pai",
    //  é a Veiculos = class principal, e a class que recebe as informações da class Pai é a  que por um nome técinico
    //  é chamada como "filho" é a class moto,ou seja " Pai é  = Veiculos = Filho é = Moto. E de grande a importancia
    //  não esquecer de fazer os gets e sets na class principal "Pai ")



    public void cadastrarMoto(){
        System.out.println("/------ Cadastrar Moto --------/");
        System.out.println("Informe a marca:      ");
        super.setMarca(scanner.nextLine());
        System.out.println("Informe o modelo:    ");
        super.setModelo(scanner.nextLine());
        System.out.println("Informe o ano:    ");
        super.setAno(scanner.nextInt());
        System.out.println("Informe a Placa:     ");
        super.setPlaca(scanner.nextInt());
        System.out.println("Informe se a moto tem bau: [true - false]  ");
        bau = scanner.nextBoolean();
        System.out.println("Informe se a moto tem antena:    ");
        antena = scanner.nextBoolean();








    }








}
