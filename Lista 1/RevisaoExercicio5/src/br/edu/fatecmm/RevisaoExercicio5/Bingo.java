package br.edu.fatecmm.RevisaoExercicio5;

import java.util.Random;

public class Bingo {
    private int nSorteados[] = new int[75];
    private int rodada=0;

    public int getRodada() {
        return rodada;
    }

    public int sortearNumero(){
        Random gerador = new Random();
        boolean y=true;

        do{
            nSorteados[rodada] = gerador.nextInt(74)+1;

            y = false;

            for(int j = 0; j < rodada; j++){ //verifica se o número sorteado já foi sorteado anteriormente
                if (this.nSorteados[j] == this.nSorteados[rodada]) y = true;
            }

        }while(y);

        System.out.println("Rodada:"+ (rodada+1)+" - Numero sorteado:"+this.nSorteados[rodada]+"\n");
        rodada++;

        return this.nSorteados[rodada-1];

    }

}
