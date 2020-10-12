package br.edu.fatecmm.RevisaoExercicio4;

import br.edu.fatecmm.RevisaoExercicio3.Porta;

public class Casa {
    private String cor;

    Porta porta1=new Porta(), porta2=new Porta(), porta3=new Porta();

    public void pinta(String s){
        this.cor = s;
        System.out.println("A casa foi pintada de "+s);
    }

    public int quantasPortasEstaoAbertas(){
        int x=0;

        if (porta1.estaAberta()) x++;
        if (porta2.estaAberta()) x++;
        if (porta3.estaAberta()) x++;

        return x;
    }





}
