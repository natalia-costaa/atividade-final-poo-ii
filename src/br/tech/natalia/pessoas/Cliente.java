package br.tech.natalia.pessoas;

import br.tech.natalia.composicao.Endereco;

public class Cliente extends Pessoa {

    private String codigo;
    private String profissao;

    public Cliente() {

    }
    public void cadastrar(String codigo, String nome, String dataNascimento, Endereco endereco,
                         String profissao, String telsContato) {
        this.codigo = codigo;
        setNome(nome);
        setDataNascimento(dataNascimento);
        setEndereco(endereco);
        this.profissao = profissao;
        setTelsContato(telsContato);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
