package Metodoconstrutor;

public class Pessoa {
    public String nome;
    public Pessoa pai;
    public Pessoa mae;
    
    public Pessoa(String nome, Pessoa pai, Pessoa mae) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }
    
    public boolean irmao(Pessoa pessoa) {
        if (this.pai != null && this.pai.equals(pessoa.pai)) {
            return true;
        }
        if (this.mae != null && this.mae.equals(pessoa.mae)) {
            return true;
        }
        return false;
    }
}
