package dao;

import control.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ProdutoWrite;
import view.ProdutosView;

public class ProdutoDAO {

    public static void cadastrar(Produto c) {
//		insere(1,"Godofredo");
//		lista();		
    }

    public static void insere(
            String nome,
            //String codigo_produto,
            String valor_da_compra,
            String marca,
            String data_da_compra,
            String valor_da_venda,
            String categoria,
            String descricao,
            String fornecedor,
            String prateleira,
            String quant
    ) {
        String sql = "INSERT INTO produtos (Nome,Valor_da_compra,Marca,Valor_da_venda,Categoria,Descricao,Fornecedor,Prateleira,Data_da_compra,quantidade) VALUES ('" + nome
                + "','" + valor_da_compra + "','" + marca + "','" + valor_da_venda
                + "','" + categoria + "','" + descricao + "','" + fornecedor + "','" + prateleira + "','" + data_da_compra + "','" + quant + "');";
        Conexao con = new Conexao();

        int res = con.executeUpdate(sql);
        if (res >= 1) {
            System.out.println("Inserção realizada!");
        } else {
            System.err.println("Inserção NÃO realizada!");
        }
    }

    public static ArrayList<Produto> produtos() {
        String sql = "SELECT * FROM produtos ORDER BY nome ASC";

        ProdutoWrite.produtos = new ArrayList<>();

        try {
            Conexao con = new Conexao();
            ResultSet consulta = con.executeQuery(sql);
            while (consulta.next()) {

                Produto p = new Produto();

                p.nome = consulta.getString("Nome");
                p.codigo_produto = consulta.getString("id");
                p.valor_da_compra = consulta.getString("Valor_da_compra");
                p.marca = consulta.getString("Marca");
                p.valor_da_venda = consulta.getString("Valor_da_venda");
                p.categoria = consulta.getString("Categoria");
                p.descricao = consulta.getString("Descricao");
                p.fornecedor = consulta.getString("Fornecedor");
                p.prateleira = consulta.getString("Prateleira");
                p.data_da_compra = consulta.getString("Data_da_compra");
                p.id = consulta.getString("id");
                p.quant = consulta.getString("quantidade");
                ProdutoWrite.produtos.add(p);

            }
        } catch (SQLException e) {
        }

        return ProdutoWrite.produtos;
    }

    public static void atualiza(
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
            String quant
    ) {

        String sql = "UPDATE produtos SET nome = '" + nome + "',valor_da_compra = '" + valor_da_compra + "',marca = '" + marca + "',valor_da_venda = '" + valor_da_venda + "',categoria = '" + categoria + "',descricao = '" + descricao + "',fornecedor = '" + fornecedor + "',prateleira = '" + prateleira + "',data_da_compra = '" + data_da_compra + "',quantidade = '" + quant + "' WHERE id = '" + Produto.id + "' ;";

        Conexao con = new Conexao();

        int res = con.executeUpdate(sql);
        if (res >= 1) {
            System.out.println("Inserção realizada!");
        } else {
            System.err.println("Inserção NÃO realizada!");
        }
    }

    public static void cleartable() {
        String sql = "delete from produtos";

        Conexao con = new Conexao();

        int res = con.executeUpdate(sql);
        if (res >= 1) {
            System.out.println("Inserção realizada!");
        } else {
            System.err.println("Inserção NÃO realizada!");
        }
    }

    public static void clearRow() {
        Produto.id = ProdutoWrite.produtos.get(ProdutosView.index).codigo_produto;
        String sql = "delete from produtos WHERE id = '" + Produto.id + "' ;";

        Conexao con = new Conexao();

        int res = con.executeUpdate(sql);
        if (res >= 1) {
            System.out.println("Inserção realizada!");
        } else {
            System.err.println("Inserção NÃO realizada!");
        }
    }

    public static ArrayList<Produto> pesquisa() {
        String sql = "SELECT * FROM produtos WHERE " + ProdutosView.escolha1 + " like '%" + Produto.pesquisa + "%' ;";

        ProdutoWrite.produtos = new ArrayList<>();

        try {
            Conexao con = new Conexao();
            ResultSet consulta = con.executeQuery(sql);
            while (consulta.next()) {

                Produto p = new Produto();

                p.nome = consulta.getString("Nome");
                p.codigo_produto = consulta.getString("id");
                p.valor_da_compra = consulta.getString("Valor_da_compra");
                p.marca = consulta.getString("Marca");
                p.valor_da_venda = consulta.getString("Valor_da_venda");
                p.categoria = consulta.getString("Categoria");
                p.descricao = consulta.getString("Descricao");
                p.fornecedor = consulta.getString("Fornecedor");
                p.prateleira = consulta.getString("Prateleira");
                p.data_da_compra = consulta.getString("Data_da_compra");
                p.id = consulta.getString("id");
                p.quant = consulta.getString("quantidade");
                ProdutoWrite.produtos.add(p);

            }
        } catch (SQLException e) {
        }
        return ProdutoWrite.produtos;
    }

    public static String gerarTxt() {
        String sql = "SELECT * FROM produtos ORDER BY nome ASC";
        String aux = "";

        try {
            Conexao con = new Conexao();
            ResultSet consulta = con.executeQuery(sql);
            int cont = 1;
            while (consulta.next()) {
                aux += "<< "+cont+" \n";
                aux += "Nome: "+consulta.getString("Nome") + "\n";
                aux += "id: "+consulta.getString("id") + "\n";
                aux += "Valor da compra:"+consulta.getString("Valor_da_compra") + "\n";
                aux += "Marca: "+consulta.getString("Marca") + "\n";
                aux += "Valor da venda: "+consulta.getString("Valor_da_venda") + "\n";
                aux += "Categoria: "+consulta.getString("Categoria") + "\n";
                aux += "Descricao: "+consulta.getString("Descricao") + "\n";
                aux += "Fornecedor: "+consulta.getString("Fornecedor") + "\n";
                aux += "Prateleira: "+consulta.getString("Prateleira") + "\n";
                aux += "Data_da_compra: "+consulta.getString("Data_da_compra") + "\n";
                aux += "id: "+consulta.getString("id") + "\n";
                aux += "Quantidade: "+consulta.getString("quantidade") + "\n";
                aux += ">> \n \n \n";
                cont++;
            }
        } catch (SQLException e) {
        }

        return aux;
    }
}
