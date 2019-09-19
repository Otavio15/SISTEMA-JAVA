
package dao;

import control.Fornecedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FornecedorWrite;
import view.FornecedorView;

public class FornecedorDAO {
    
public static void cadastrar(Fornecedor c){		
//		insere(1,"Godofredo");
//		lista();		
	}
	
public static void insere(
    String nome,
    String cnpj,
    String email,
    String fone,
    String numero,
    String descricao,
    String fonec,
    String cep,
    String bairro,
    String estado,
    String cidade,
    String rua  

        ) {
		String sql = "INSERT INTO fornecedores (Nome,CNPJ,Email,Fixo,Numero,Descricao,Celular,CEP,Bairro,Estado,Cidade,Rua) VALUES ('"+nome+
				"','"+cnpj+"','"+email+"','"+fone+"','"+numero+"','"+descricao+
                        "','"+fonec+"','"+cep+"','"+bairro+"','"+estado+"','"+cidade+"','"+rua+"');";
		Conexao con = new Conexao();
                
		int res = con.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Inserção realizada!");
		} else {
			System.err.println("Inserção NÃO realizada!");
		}
	}
 
	public static ArrayList<Fornecedor> fornecedor() {
            
		String sql = "SELECT * FROM fornecedores";
		
                FornecedorWrite.produtos = new ArrayList<>();
                
		try {             
                    
                        Conexao con = new Conexao();
			ResultSet consulta = con.executeQuery(sql);
			while(consulta.next()) {
                            
                            Fornecedor p = new Fornecedor();
                            
				p.nome = consulta.getString("Nome");
				p.cnpj = consulta.getString("CNPJ");
                                p.email = consulta.getString("Email");
                                p.fone = consulta.getString("Fixo");
                                p.numero = consulta.getString("Numero");
                                p.descricao = consulta.getString("Descricao");
                                p.fonec = consulta.getString("Celular");
                                p.cep = consulta.getString("CEP");
                                p.bairro = consulta.getString("Bairro");
                                p.estado = consulta.getString("Estado");
                                p.cidade = consulta.getString("Cidade");
                                p.rua = consulta.getString("Rua");
                                p.id = consulta.getString("id");
                                
                                FornecedorWrite.produtos.add(p);
			}
		} catch (SQLException e) {
		}
                
                return FornecedorWrite.produtos;
	}
        
                public static void atualiza(
                            String nome,
                            String cnpj,
                            String email,
                            String fone,
                            String numero,
                            String descricao,
                            String fonec,
                            String cep,
                            String bairro,
                            String estado,
                            String cidade,
                            String rua  
        ){
        
            String sql = "UPDATE fornecedores SET Nome = '"+nome+"',CNPJ = '"+cnpj+"',Email = '"+email+"',Fixo = '"+fone+"',Numero = '"+numero+"',Descricao = '"+descricao+"',Celular = '"+fonec+"',CEP = '"+cep+"',Bairro = '"+bairro+"',Estado = '"+estado+"',Cidade = '"+cidade+"',Rua = '"+rua+"' WHERE CNPJ = '"+Fornecedor.id+"' ;";
            
		Conexao con = new Conexao();
                
		int res = con.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Inserção realizada!");
		} else {
			System.err.println("Inserção NÃO realizada!");
		}
        
        }
                
                
                public static void cleartable(){
              String sql = "delete from fornecedores";

		Conexao con = new Conexao();
                
		int res = con.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Inserção realizada!");
		} else {
			System.err.println("Inserção NÃO realizada!");
		}
        }
                
            public static void clearRow(){
              Fornecedor.id = FornecedorWrite.produtos.get(FornecedorView.index).cnpj;
              String sql = "delete from fornecedores WHERE CNPJ = '"+Fornecedor.id+"' ;";

		Conexao con = new Conexao();
                
		int res = con.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Inserção realizada!");
		} else {
			System.err.println("Inserção NÃO realizada!");
		}
        }        
}
