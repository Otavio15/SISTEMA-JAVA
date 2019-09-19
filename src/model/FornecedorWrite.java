
package model;

import control.Fornecedor;
import java.util.ArrayList;
import view.FornecedorView;
import static view.FornecedorView.Modelo;

public class FornecedorWrite {
                public  static ArrayList<Fornecedor> produtos = new ArrayList<>();
                public  static Fornecedor itens = new Fornecedor();
                
            public static void salvar(){
            
            FornecedorWrite.produtos.get(FornecedorView.index).nome = Fornecedor.v[0];
            FornecedorWrite.produtos.get(FornecedorView.index).cnpj = Fornecedor.v[1];
            FornecedorWrite.produtos.get(FornecedorView.index).email = Fornecedor.v[2];
            FornecedorWrite.produtos.get(FornecedorView.index).fone = Fornecedor.v[3];
            FornecedorWrite.produtos.get(FornecedorView.index).numero = Fornecedor.v[4];
            FornecedorWrite.produtos.get(FornecedorView.index).descricao = Fornecedor.v[5];
            FornecedorWrite.produtos.get(FornecedorView.index).fonec = Fornecedor.v[6];
            FornecedorWrite.produtos.get(FornecedorView.index).cep = Fornecedor.v[7];
            FornecedorWrite.produtos.get(FornecedorView.index).bairro = Fornecedor.v[8];
            FornecedorWrite.produtos.get(FornecedorView.index).estado = Fornecedor.v[9];
            FornecedorWrite.produtos.get(FornecedorView.index).cidade = Fornecedor.v[10];
            FornecedorWrite.produtos.get(FornecedorView.index).rua = Fornecedor.v[11];
            
            Fornecedor.id = FornecedorWrite.produtos.get(FornecedorView.index).cnpj;
                     
            itens.setNome(Fornecedor.v[0]);
            itens.setCnpj(Fornecedor.v[1]);
            itens.setEmail(Fornecedor.v[2]);
            itens.setFone(Fornecedor.v[3]);
            itens.setNumero(Fornecedor.v[4]);
            itens.setDescricao(Fornecedor.v[5]);
            itens.setFonec(Fornecedor.v[6]);
            itens.setCep(Fornecedor.v[7]);
            itens.setBairro(Fornecedor.v[8]);
            itens.setEstado(Fornecedor.v[9]);
            itens.setCidade(Fornecedor.v[10]);
            itens.setRua(Fornecedor.v[11]);

            FornecedorWrite.produtos.set(FornecedorView.index, itens);
            Modelo.setValueAt(itens, FornecedorView.index);
                
            }
}
