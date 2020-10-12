package br.edu.fatecmm.RevisaoExercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class FuncionarioTest {

    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.setIdFunc(01);
        func.setNomeFunc("Joao");
        func.setDepartamento("Financeiro");
        func.setDataContratacao(LocalDate.now());
        func.setSalario(2000.00);
        func.setDocumento("12345678");
        func.setAtivo(true);

        func.imprimir();

        Scanner vDouble = new Scanner(System.in);
        System.out.println("Digite o valor do aumento de salario:");
        func.atualizarSalario(vDouble.nextDouble());
        func.imprimir();

        func.demiteFuncionario();
        func.imprimir();

    }

}
