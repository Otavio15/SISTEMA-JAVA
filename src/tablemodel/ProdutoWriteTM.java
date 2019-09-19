/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablemodel;


import javax.swing.JOptionPane;
import control.Produto;
import view.ProdutosView;

/**
 *
 * @author FERNANDO ROGI
 */
public class ProdutoWriteTM {
            public static void writeTM(){
        
        Produto cadastroTM = new Produto();
        
            cadastroTM.setNome(Produto.v[0]);
            cadastroTM.setCodigo_produto(Produto.v[1]);
            cadastroTM.setValor_da_compra(Produto.v[2]);
            cadastroTM.setMarca(Produto.v[3]);
            cadastroTM.setData_da_compra(Produto.v[4]);
            cadastroTM.setValor_da_venda(Produto.v[5]);
            cadastroTM.setCategoria(Produto.v[6]);
            cadastroTM.setDescricao(Produto.v[7]);
            cadastroTM.setFornecedor(Produto.v[8]);
            cadastroTM.setPrateleira(Produto.v[9]);
            cadastroTM.setQuant(Produto.v[10]);
            
        ProdutosView.Modelo.addFuncionario(cadastroTM);
        }
}
