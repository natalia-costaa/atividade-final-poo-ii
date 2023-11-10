package br.tech.natalia.appMain;

import br.tech.natalia.composicao.Endereco;
import br.tech.natalia.pessoas.Cliente;
import br.tech.natalia.pessoas.Funcionario;

public class Main {
    public static void main(String[] args) {

        Endereco enderecoFunc = new Endereco();
        Endereco enderecoClien = new Endereco();

        enderecoFunc.cadastrarEnd("Av Ruy Carneiro", "560", "00000","Joao Pessoa",
                "PB", "BR");
        enderecoClien.cadastrarEnd("Av Epitacio Pessoa", "987", "11111","Joao Pessoa",
                "PB", "BR");

        Funcionario func1 = new Funcionario();
        Cliente cliente1 = new Cliente();

        func1.cadastrar(01, "Pedro", "18/09/1986", enderecoFunc,1000.0,
				"02/02/2002", "Prof", "958959963");

        cliente1.cadastrar("C01", "Joao", "01/01/1980", enderecoClien, "Lider de Projecta",
             "9191981981981981");


        System.out.println(func1.getNome() + func1.getEndereco());
        System.out.println(cliente1.getNome() + cliente1.getEndereco());

        System.out.println(func1.getCargo());
        func1.promover("Diretor");
        System.out.println(func1.getCargo());

        System.out.println(func1.getSalario());
        func1.reajustarSalario(3.5);
        System.out.println(func1.getSalario());

        System.out.println(func1.getNome()+ " tem " + func1.tempoDeServico() + " anos de serviço e tem "
                + func1.obterIdade() + " anos de idade.");

        System.out.println(cliente1.getNome()+ " de codigo " + cliente1.getCodigo() +
                " foi atendido por " + func1.getNome() + " que ocupa o cargo de " + func1.getCargo());


        System.out.println(cliente1.getCodigo());
        cliente1.setCodigo("C02");
        System.out.println(cliente1.getCodigo());

        System.out.println(cliente1.getNome());
        cliente1.setNome("Joao Pedro");
        System.out.println(cliente1.getNome());



    }
}