package br.edu.fatecmm.RevisaoExercicio2;

public class PessoaTest {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setIdade(18);

        pessoa1.imprimirPessoa();

        pessoa1.fazAniversario();
        pessoa1.imprimirPessoa();

        pessoa1.fazAniversario();
        pessoa1.imprimirPessoa();

        pessoa1.fazAniversario();
        pessoa1.imprimirPessoa();

        pessoa1.fazAniversario();
        pessoa1.imprimirPessoa();


    }
}
