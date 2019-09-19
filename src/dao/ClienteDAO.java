
package dao;

import control.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ClienteWrite;
import view.ClienteView;

public class ClienteDAO {
  
public static void cadastrar(Cliente c){		
//		insere(1,"Godofredo");
//		lista();		
	}
	
public static void insere(
                    String nome,
                    String cpf,
                    String fone,
                    String idade,
                    String cidade,
                    String sexo,
                    String fonec,
                    String email,
                    String cep,
                    String estado,
                    String bairro,
                    String numero,
                    String rua                    
        ) {
    
		String sql = "INSERT INTO cliente (Nome,CPF,Fixo,Idade,Cidade,Sexo,Celular,Email,CEP,Estado,Bairro,Numero,Rua) VALUES ('"+nome+
				"','"+cpf+"','"+fone+"','"+idade+"','"+cidade+"','"+sexo+
                        "','"+fonec+"','"+email+"','"+cep+"','"+estado+"','"+bairro+"','"+numero+"','"+rua+"');";
		Conexao con = new Conexao();
                
		int res = con.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Inserção realizada!");
		} else {
			System.err.println("Inserção NÃO realizada!");
		}
	}
 
        

	public static ArrayList<Cliente> cliente(){
            
		String sql = "SELECT * FROM cliente";
		
                ClienteWrite.cadastros = new ArrayList<>();
                
		try {
                        Conexao con = new Conexao();
                        
                        System.out.println("Nome - CPF - Fixo - Idade - Cidade - Sexo - Celular - E-mail - CEP - Estado - Bairro - Numero - Rua");
                                
			ResultSet consulta = con.executeQuery(sql);
			while(consulta.next()) {
                            
                            Cliente p = new Cliente();
                                   
				p.nome = consulta.getString("Nome");
				p.cpf = consulta.getString("CPF");
                                p.fone = consulta.getString("Fixo");
                                p.idade = consulta.getString("Idade");
                                p.cidade = consulta.getString("Cidade");
                                p.sexo = consulta.getString("Sexo");
                                p.fonec = consulta.getString("Celular");
                                p.email = consulta.getString("Email");
                                p.cep = consulta.getString("CEP");
                                p.estado = consulta.getString("Estado");
                                p.bairro = consulta.getString("Bairro");
                                p.numero = consulta.getString("Numero");
                                p.rua = consulta.getString("Rua");
                                p.id = consulta.getString("id");
                                
                                ClienteWrite.cadastros.add(p);
			}
		} catch (SQLException e) {
		}
                
                return ClienteWrite.cadastros;
	}    
        
        public static void atualiza(
                    String nome,
                    String cpf,
                    String fone,
                    String idade,
                    String cidade,
                    String sexo,
                    String fonec,
                    String email,
                    String cep,
                    String estado,
                    String bairro,
                    String numero,
                    String rua
        ){
            
            String sql = "UPDATE cliente SET Nome = '"+nome+"',CPF = '"+cpf+"',Fixo = '"+fone+"',Idade = '"+idade+"',Cidade = '"+cidade+"',Sexo = '"+sexo+"',Celular = '"+fonec+"',Email = '"+email+"',CEP = '"+cep+"',Estado = '"+estado+"',Bairro = '"+bairro+"',Numero = '"+numero+"',Rua = '"+rua+"' WHERE cpf = '"+Cliente.id+"' ;";
            
		Conexao con = new Conexao();
                
		int res = con.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Inserção realizada!");
		} else {
			System.err.println("Inserção NÃO realizada!");
		}
        
        }
        
        public static void cleartable(){
              String sql = "delete from cliente";

		Conexao con = new Conexao();
                
		int res = con.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Inserção realizada!");
		} else {
			System.err.println("Inserção NÃO realizada!");
		}
        }
        
    public static void clearRow(){
        
              Cliente.id = ClienteWrite.cadastros.get(ClienteView.index).cpf;
              String sql = "delete from cliente WHERE CPF = '"+Cliente.id+"' ;";

		Conexao con = new Conexao();
                
		int res = con.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Inserção realizada!");
		} else {
			System.err.println("Inserção NÃO realizada!");
		}
        }
}
