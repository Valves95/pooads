package br.edu.fatecmm.RevisaoExercicio5;

import java.util.Random;

public class Jogador {
    private String nome;
    private int cartela[] = new int[24];
    private boolean sorteado[] = new boolean[24];

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void gerarCartela(){
        Random gerador = new Random();

        for (int i = 0; i < 24; i++) {
            this.cartela[i] = gerador.nextInt(74)+1;

            for(int j = 0; j < i; j++){//verifica se o número sorteado já existe na cartela
                if (this.cartela[j] == this.cartela[i]) i--;
            }

        }

        for (int i = 0; i < 24; i++){
            this.sorteado[i] = false;
        }

    }

    public void imprimirCartela(){
        System.out.println("Cartela de "+this.nome);
        for (int i = 0; i<24; i++){
            if (i==5||i==10||i==14||i==19) System.out.print("\n");
            if (i==12) System.out.print("\t");
            if (this.sorteado[i]) {
                System.out.print(this.cartela[i] + "X\t");
            }else System.out.print(this.cartela[i] + " \t");
        }
        System.out.println("\n");
    }



    public boolean conferirCartela(int x){
        int i;
        for (i = 0; i<24; i++){
            if (this.cartela[i]==x){
                this.sorteado[i]=true;
                i=24;
            }
        }
        if (    this.sorteado[0]    && this.sorteado[1]     && this.sorteado[2]     && this.sorteado[3]     &&  this.sorteado[4]    ||
                this.sorteado[5]    && this.sorteado[6]     && this.sorteado[7]     && this.sorteado[8]     && this.sorteado[9]     ||
                this.sorteado[10]   && this.sorteado[11]                            && this.sorteado[12]    && this.sorteado[13]    ||
                this.sorteado[14]   && this.sorteado[15]    && this.sorteado[16]    && this.sorteado[17]    && this.sorteado[18]    ||
                this.sorteado[19]   && this.sorteado[20]    && this.sorteado[21]    && this.sorteado[22]    && this.sorteado[23]    ||

                this.sorteado[0]    && this.sorteado[5]     && this.sorteado[10]    && this.sorteado[14]    &&  this.sorteado[19]   ||
                this.sorteado[1]    && this.sorteado[6]     && this.sorteado[11]    && this.sorteado[15]    && this.sorteado[20]    ||
                this.sorteado[2]    && this.sorteado[7]                             && this.sorteado[16]    && this.sorteado[21]    ||
                this.sorteado[3]    && this.sorteado[8]     && this.sorteado[12]    && this.sorteado[17]    && this.sorteado[22]    ||
                this.sorteado[4]    && this.sorteado[9]     && this.sorteado[13]    && this.sorteado[18]    && this.sorteado[23]    ||

                this.sorteado[0]    && this.sorteado[6]                             && this.sorteado[17]    && this.sorteado[23]    ||
                this.sorteado[4]    && this.sorteado[8]                             && this.sorteado[15]    && this.sorteado[19])
        {
            System.out.println("Jogador "+this.nome+" bateu.");
            return true; //Retorna true se o jogador completar alguma coluna, linha ou diagonal.
        }else return false;
    }


}
