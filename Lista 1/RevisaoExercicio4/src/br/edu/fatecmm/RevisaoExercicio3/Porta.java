package br.edu.fatecmm.RevisaoExercicio3;

public class Porta
{
    private boolean aberta=false;
    private String cor;
    private double dimensaoX, dimensaoY, dimensaoZ;

    public Porta( ) {
        this.dimensaoX = 0.8;
        this.dimensaoY = 2.1;
        this.dimensaoZ = 0.1;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void abre(){
        if(this.aberta) System.out.println("A porta já está aberta.");
        else{
            this.aberta=true;
            System.out.println("Abrindo porta...");
        }
    }

    public void fecha(){
        if (!this.aberta) System.out.println("A porta já está fechada.");
        else{
            this.aberta = false;
            System.out.println("Fechando porta...");
        }
    }

    public void pinta(String s){
        this.cor = s;
        System.out.println("a Porta foi pintada de "+this.cor);
    }

    public boolean estaAberta(){
        if (this.aberta){
            System.out.println("A porta está aberta!!");
        }else {
            System.out.println("A porta não está aberta!!");
        }
        return this.aberta;
    }

}
