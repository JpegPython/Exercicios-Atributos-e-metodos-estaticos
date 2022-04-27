package Exercicio3;

import java.time.LocalTime;

import java.util.Date;

public class Palestra {
    
    protected String titulo;
    protected String nomeDoPalestrante;
    protected String local;
    protected Date data;
    protected LocalTime horarioDeInicio;
    protected int duracao;
    protected static int participantes;
    protected static int numMaxParticipantes;


    public static int numDeParticipantes(){
        return numMaxParticipantes-participantes;
    }

    public void adicionarPr(){
        participantes++;
    }


}
