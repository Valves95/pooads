package br.edu.fatecmm.RevisaoExercicio5;

public class BingoTest {

    public static void main(String[] args) {

        int x;
        boolean y1=false,y2=false;
        Bingo b1 = new Bingo();
        Jogador p1 = new Jogador("Carlos");
        Jogador p2 = new Jogador("Maria");

        p1.gerarCartela();
        p1.imprimirCartela();

        p2.gerarCartela();
        p2.imprimirCartela();


        do{
            x = b1.sortearNumero();
            y1=p1.conferirCartela(x);
            y2=p2.conferirCartela(x);

            p1.imprimirCartela();
            p2.imprimirCartela();
        }while(y1==false&&y2==false);

    }
}
