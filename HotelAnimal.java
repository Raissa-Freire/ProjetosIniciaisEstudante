package Modulo3.Exrecio3;
import java.util.Scanner;

public class HotelAnimal {
     static Animal p;
    public static void boasVindas() {
        System.out.println("Bem vindo ao Hotel Animal ");
        System.out.println("Qual bichinho deseja hospedar conosco?");
        System.out.println("Para Cão digite: 1; Para Gato digite: 2;");
        Scanner input = new Scanner(System.in);
        int bichinho = input.nextInt();
        if (bichinho==1){
           p = new Cao();
            System.out.println("Que legal teremos aqui mais um Cão");}
        else if (bichinho==2){
            p = new Gato();
            System.out.println("Que legal teremos aqui mais um Gato");}
        else { p = new Animal();
            System.out.println("Nós só hospedamos Cães ou Gatos!");}
    }
    public static void acao(){
        p.comer();
        p.passear();
        p.brincar();
        p.banho();
        p.ruido();
    }
    public static void main(String[]args){
        boasVindas();
        acao();

    }
}