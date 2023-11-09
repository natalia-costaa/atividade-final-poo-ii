package br.tech.natalia.pessoas;

import br.tech.natalia.composicao.Endereco;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Funcionario extends Pessoa {

    private Integer matricula;

    private Double salario;

    private String dataAdmissao;

    private String cargo;


    public void cadastrar(Integer matricula, String nome, String dataNascimento, Endereco endereco,
                          Double salario, String dataAdmissao, String cargo, String telsContato) {
        this.matricula = matricula;
        setNome(nome);
        setDataNascimento(dataNascimento);
        setEndereco(endereco);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        setTelsContato(telsContato);
    }

    public void promover(String novoCargo) {
        this.cargo = novoCargo;
    }

    public Double reajustarSalario(double percentual) {
        return this.salario = this.salario + (this.salario * (percentual/100));
    }

    public int tempoDeServico() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataAdm = LocalDate.parse(this.dataAdmissao,formato);
        LocalDate dataAtual = LocalDate.now();
        long idade = ChronoUnit.YEARS.between(dataAdm,dataAtual);
        return (int)idade;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}
