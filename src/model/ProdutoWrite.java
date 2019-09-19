package model;

import control.Produto;
import control.Produto;
import view.ProdutosView;
import java.util.ArrayList;
import static view.ProdutosView.Modelo;

public class ProdutoWrite {

    public static ArrayList<Produto> produtos = new ArrayList<>();
    public static Produto itens = new Produto();

    public static void salvar() {

        ProdutoWrite.produtos.get(ProdutosView.index).nome = Produto.v[0];
        ProdutoWrite.produtos.get(ProdutosView.index).codigo_produto = Produto.v[1];
        ProdutoWrite.produtos.get(ProdutosView.index).valor_da_compra = Produto.v[2];
        ProdutoWrite.produtos.get(ProdutosView.index).marca = Produto.v[3];
        ProdutoWrite.produtos.get(ProdutosView.index).data_da_compra = Produto.v[4];
        ProdutoWrite.produtos.get(ProdutosView.index).valor_da_venda = Produto.v[5];
        ProdutoWrite.produtos.get(ProdutosView.index).categoria = Produto.v[6];
        ProdutoWrite.produtos.get(ProdutosView.index).descricao = Produto.v[7];
        ProdutoWrite.produtos.get(ProdutosView.index).fornecedor = Produto.v[8];
        ProdutoWrite.produtos.get(ProdutosView.index).prateleira = Produto.v[9];
        ProdutoWrite.produtos.get(ProdutosView.index).quant = Produto.v[10];

        Produto.id = ProdutoWrite.produtos.get(ProdutosView.index).codigo_produto;

        itens.setNome(Produto.v[0]);
        itens.setCodigo_produto(Produto.v[1]);
        itens.setValor_da_compra(Produto.v[2]);
        itens.setMarca(Produto.v[3]);
        itens.setData_da_compra(Produto.v[4]);
        itens.setValor_da_venda(Produto.v[5]);
        itens.setCategoria(Produto.v[6]);
        itens.setDescricao(Produto.v[7]);
        itens.setFornecedor(Produto.v[8]);
        itens.setPrateleira(Produto.v[9]);
        itens.setQuant(Produto.v[10]);

        ProdutoWrite.produtos.set(ProdutosView.index, itens);
        Modelo.setValueAt(itens, ProdutosView.index);

    }

}
