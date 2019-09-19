
package control;

import java.util.ArrayList;

public class Produto {
    public static String v[] = new String[12];
    public String nome = null;
    public String codigo_produto = null;
    public String valor_da_compra = null;
    public String marca = null;
    public String data_da_compra = null;
    public String valor_da_venda = null;
    public String categoria = null;
    public String descricao = null;  
    public String fornecedor = null;
    public String prateleira = null;
    public String quant = null;
    public static String id = "0";
    public static String pesquisa;
    
    public Produto(){}
    
    public Produto(
    String nome,
    String codigo_produto,
    String valor_da_compra,
    String marca,
    String data_da_compra,
    String valor_da_venda,
    String categoria,
    String descricao,
    String fornecedor,
    String prateleira,
    String id,
    String quant        
    ){
    this.nome = nome;
    this.codigo_produto = codigo_produto;
    this.valor_da_compra = valor_da_compra;
    this.marca = marca;
    this.data_da_compra = data_da_compra;
    this.valor_da_venda = valor_da_venda;
    this.categoria = categoria;
    this.descricao = descricao;
    this.fornecedor = fornecedor;
    this.prateleira = prateleira;
    this.id = id;
    this.quant = quant;
    }
    
    public String getQuant(){
        return quant;
    }
    
    public void setQuant(String quant){
        this.quant = quant;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(String codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getValor_da_compra() {
        return valor_da_compra;
    }

    public void setValor_da_compra(String valor_da_compra) {
        this.valor_da_compra = valor_da_compra;
    }

    public String getValor_da_venda() {
        return valor_da_venda;
    }

    public void setValor_da_venda(String valor_da_venda) {
        this.valor_da_venda = valor_da_venda;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getData_da_compra() {
        return data_da_compra;
    }

    public void setData_da_compra(String data_da_compra) {
        this.data_da_compra = data_da_compra;
    }

}

