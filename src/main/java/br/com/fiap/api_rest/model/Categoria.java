package br.com.fiap.api_rest.model;

public enum Categoria {
    BEBIDA("Eletrônicos"),
    ESSENCIA("Livros"),
    NARGUILE("Outros");



    private String descricao;

    Categoria(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}

