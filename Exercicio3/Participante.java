package Exercicio3;



public class Participante {
    protected String matricula;
    protected String nome;
    protected String email;

    
    
    public void construirParticipante(String mat,String nome, String email){
        this.email=email;
        this.matricula=mat;
        this.nome=nome;
    }
    
}
