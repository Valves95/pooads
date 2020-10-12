package br.edu.fatecmm.RevisaoExercicio4;

public class CasaTest {

    public static void main(String[] args) {

        Casa c1 = new Casa();

        c1.pinta("Azul");

        c1.porta1.pinta("Branco");
        c1.porta2.pinta("Marrom");
        c1.porta3.pinta("cinza");

        c1.porta1.abre();
        c1.porta3.abre();
        c1.porta3.fecha();
        c1.porta1.fecha();
        c1.porta3.abre();



        System.out.println(c1.quantasPortasEstaoAbertas()+" porta(s) aberta(s)");


    }
}
