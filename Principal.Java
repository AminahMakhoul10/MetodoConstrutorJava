package Metodoconstrutor;

public class Principal {
    public static void main(String args[]) {
        Pessoa pai = new Pessoa("Davi", null, null);
        Pessoa mae = new Pessoa("Maria", null, null);
        
        Pessoa filhoA = new Pessoa("Lucas", pai, mae);
        Pessoa filhoB = new Pessoa("Maria", pai, mae);
        
        System.out.println(filhoA.irmao(filhoB));
        
        Pessoa filhoC = new Pessoa("João", pai, null);
        
        System.out.println(filhoA.irmao(filhoC)); 
    }
}
