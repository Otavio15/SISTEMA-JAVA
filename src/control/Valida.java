
package control;

import javax.swing.JOptionPane;
import model.ClienteWrite;
import model.FornecedorWrite;
import model.FuncionarioWrite;
import model.ProdutoWrite;

public class Valida {
    
    public static boolean testa = false;
    
    public static void cpf(){
        for (int i = 0; i < ClienteWrite.cadastros.size(); i++) {
            String cpf = ClienteWrite.cadastros.get(i).cpf;
            
            if(Cliente.v[1] == null ? cpf == null : Cliente.v[1].equals(cpf)){
                JOptionPane.showMessageDialog(null, "O CPF já existe na lista de registros");
                testa = true;
                break;
            }
        }   
    }
    
        public static void cnpj(){
        for (int i = 0; i < FornecedorWrite.produtos.size(); i++) {
            String cnpj = FornecedorWrite.produtos.get(i).cnpj;
            
            if(Fornecedor.v[1] == null ? cnpj == null : Fornecedor.v[1].equals(cnpj)){
                JOptionPane.showMessageDialog(null, "O CNPJ já existe na lista de registros");
                testa = true;
                break;
            }
        }  
    }
        
        public static void cpff(){
        for (int i = 0; i < FuncionarioWrite.cadastros.size(); i++) {
            String cpf = FuncionarioWrite.cadastros.get(i).cpf;
            
            if(Funcionario.v[1] == null ? cpf == null : Funcionario.v[1].equals(cpf)){
                JOptionPane.showMessageDialog(null, "O CPF já existe na lista de registros");
                testa = true;
                break;
            }
        }   
    }     
        
    public static void produto(){
        for (int i = 0; i < ProdutoWrite.produtos.size(); i++) {
            String produto = ProdutoWrite.produtos.get(i).codigo_produto;
            
            if(Produto.v[1] == null ? produto == null : Produto.v[1].equals(produto)){
                JOptionPane.showMessageDialog(null, "O Código do produto já existe na lista de registros");
                testa = true;
                break;
            }
        }
    }    
}
