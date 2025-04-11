package br.com.vicente.contador.model;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String  pessoaResponsavel;

    public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public Tarefa(TarefaRecord tarefaRecord) {
        this.descricao = tarefaRecord.descricao();
        this.concluida = tarefaRecord.concluida();
        this.pessoaResponsavel = tarefaRecord.pessoaResponsavel();
    }




    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public void setPessoaResponsavel(String pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"descricao\": \"" + descricao + "\",\n" +
                "  \"concluida\": " + concluida + ",\n" +
                "  \"pessoaResponsavel\": \"" + pessoaResponsavel + "\"\n" +
                "}";
    }

}
