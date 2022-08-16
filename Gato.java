package Modulo3.Exrecio3;

public class Gato extends Animal {
    String nome;
    public  void comer(){
        System.out.println("Gatos só podem comer proteína animal");
    };
    public  void passear(){
        System.out.println("Gatos gostam e precisam passear em casa e no jardim");
    }
    public  void brincar(){
        System.out.println("Gatos gostam de se divertir com arranhadores");
    }
    public void banho(){
        System.out.println("Gatos não precisam tomar banho!");
    }
    public void ruido(){
        System.out.println("Gatos miam");
    }
}
