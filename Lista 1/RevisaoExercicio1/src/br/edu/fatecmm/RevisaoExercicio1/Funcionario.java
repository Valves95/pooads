package br.edu.fatecmm.RevisaoExercicio1;

import java.time.LocalDate;

public class Funcionario {
    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private LocalDate dataContratacao;
    private double salario;
    private String documento;
    private boolean ativo;

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void atualizarSalario(double aumento) {
        if (aumento > 0.0D) {
            this.salario += aumento;
        } else {
            System.out.println("Valor do aumento inválido!!");
        }

    }

    public void demiteFuncionario() {
        this.ativo = false;
        System.out.println(this.nomeFunc + " foi demitido...");
    }

    public void imprimir() {
        System.out.println("ID: " + this.idFunc);
        System.out.println("Nome: " + this.nomeFunc);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Data de Contratação: " + this.dataContratacao);
        System.out.println("Salario: R$" + this.salario);
        System.out.println("Documento: " + this.documento);
        System.out.println("Ativo: " + this.ativo);
        System.out.println("");
    }



}

