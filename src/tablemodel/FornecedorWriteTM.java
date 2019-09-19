
package tablemodel;

import control.Fornecedor;
import view.FornecedorView;

public class FornecedorWriteTM {
                public static void writeTM(){
        
        Fornecedor cadastroTM = new Fornecedor();
        
            cadastroTM.setNome(Fornecedor.v[0]);
            cadastroTM.setCnpj(Fornecedor.v[1]);
            cadastroTM.setEmail(Fornecedor.v[2]);
            cadastroTM.setFone(Fornecedor.v[3]);
            cadastroTM.setNumero(Fornecedor.v[4]);
            cadastroTM.setDescricao(Fornecedor.v[5]);
            cadastroTM.setFonec(Fornecedor.v[6]);
            cadastroTM.setCep(Fornecedor.v[7]);     
            cadastroTM.setBairro(Fornecedor.v[8]);     
            cadastroTM.setEstado(Fornecedor.v[9]);     
            cadastroTM.setCidade(Fornecedor.v[10]);     
            cadastroTM.setRua(Fornecedor.v[11]);     
            
        FornecedorView.Modelo.addFuncionario(cadastroTM);
            
        }
}

