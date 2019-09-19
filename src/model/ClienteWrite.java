package model;


import control.Cliente;
import dao.ClienteDAO;
import view.ClienteView;
import static view.ClienteView.Modelo;
import java.util.ArrayList;

public class ClienteWrite {
    
         public static ArrayList<Cliente> cadastros = new ArrayList<>();
         public static Cliente cadastro = new Cliente();
         
            public static void salvar(){
            
            ClienteWrite.cadastros.get(ClienteView.index).nome = Cliente.v[0];
            ClienteWrite.cadastros.get(ClienteView.index).cpf = Cliente.v[1];
            ClienteWrite.cadastros.get(ClienteView.index).fone = Cliente.v[2];
            ClienteWrite.cadastros.get(ClienteView.index).idade = Cliente.v[3];
            ClienteWrite.cadastros.get(ClienteView.index).cidade = Cliente.v[4];
            ClienteWrite.cadastros.get(ClienteView.index).sexo = Cliente.v[5];
            ClienteWrite.cadastros.get(ClienteView.index).fonec = Cliente.v[6];
            ClienteWrite.cadastros.get(ClienteView.index).email = Cliente.v[7];
            ClienteWrite.cadastros.get(ClienteView.index).cep = Cliente.v[8];
            ClienteWrite.cadastros.get(ClienteView.index).estado = Cliente.v[9];
            ClienteWrite.cadastros.get(ClienteView.index).bairro = Cliente.v[10];
            ClienteWrite.cadastros.get(ClienteView.index).numero = Cliente.v[11];
            ClienteWrite.cadastros.get(ClienteView.index).rua = Cliente.v[12];
            
            Cliente.id = ClienteWrite.cadastros.get(ClienteView.index).cpf;
        
            cadastro.setNome(Cliente.v[0]);
            cadastro.setCpf(Cliente.v[1]);
            cadastro.setFone(Cliente.v[2]);
            cadastro.setCidade(Cliente.v[3]);
            cadastro.setIdade(Cliente.v[4]);
            cadastro.setSexo(Cliente.v[5]);
            cadastro.setFonec(Cliente.v[6]);
            cadastro.setEmail(Cliente.v[7]);
            cadastro.setCep(Cliente.v[8]);
            cadastro.setEstado(Cliente.v[9]);
            cadastro.setBairro(Cliente.v[10]);
            cadastro.setNumero(Cliente.v[11]);
            cadastro.setRua(Cliente.v[12]);
            
            ClienteWrite.cadastros.set(ClienteView.index, cadastro);
            Modelo.setValueAt(cadastro, ClienteView.index);
                
            } 
         
}
