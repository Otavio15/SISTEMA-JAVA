
package dao;

import control.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FuncionarioWrite;
import view.FuncionarioView;

public class FuncionarioDAO {
        
public static void cadastrar(Funcionario c){		
//		insere(1,"Godofredo");
//		lista();		
	}
	
public static void insere(
    String nome,
    String cpf,
    String email,
    String fone,
    String idade,
    String salario,
    String fonec,
    String numero,
    String data,
    String departamento,
    String funcao,
    String observacao,
    String sexo

        ) {
		String sql = "INSERT INTO funcionarios (Nome,CPF,Email,Fixo,Idade,Salario,Celular,Numero,Data1,Departamento,Funcao,Observacao,Sexo) VALUES ('"+nome+
				"','"+cpf+"','"+email+"','"+fone+"','"+idade+"','"+salario+
                        "','"+fonec+"','"+numero+"','"+data+"','"+departamento+"','"+funcao+"','"+observacao+"','"+sexo+"');";
		Conexao con = new Conexao();
                
		int res = con.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Inserção realizada!");
		} else {
			System.err.println("Inserção NÃO realizada!");
		}
	}
 
	public static ArrayList<Funcionario> funcionario(){
		String sql = "SELECT * FROM funcionarios";
		
                FuncionarioWrite.cadastros = new ArrayList<>();
                
		try {
                        Conexao con = new Conexao();
			ResultSet consulta = con.executeQuery(sql);
			while(consulta.next()) {
                            
                                Funcionario p = new Funcionario();
                            
				p.nome = consulta.getString("Nome");
				p.cpf = consulta.getString("CPF");
                                p.email = consulta.getString("Email");
                                p.fone = consulta.getString("Fixo");
                                p.idade = consulta.getString("Idade");
                                p.salario = consulta.getString("Salario");
                                p.fonec = consulta.getString("Celular");
                                p.numero = consulta.getString("Numero");
                                p.data = consulta.getString("Data1");
                                p.departamento = consulta.getString("Departamento");
                                p.funcao = consulta.getString("Funcao");
                                p.observacao = consulta.getString("Observacao");
                                p.sexo = consulta.getString("Sexo");
                                p.id = consulta.getString("id");
                                
                                FuncionarioWrite.cadastros.add(p);
			}
		} catch (SQLException e) {
		}
                
                return FuncionarioWrite.cadastros;
                
	}	
        
                public static void atualiza(
                        String nome,
                        String cpf,
                        String email,
                        String fone,
                        String idade,
                        String salario,
                        String fonec,
                        String numero,
                        String data,
                        String departamento,
                        String funcao,
                        String observacao,
                        String sexo
        ){
        
                String sql = "UPDATE funcionarios SET Nome = '"+nome+"',CPF = '"+cpf+"',Email = '"+email+"',Fixo = '"+fone+"',Idade = '"+idade+"',Salario = '"+salario+"',Celular = '"+fonec+"',Numero = '"+numero+"',Data1 = '"+data+"',Departamento = '"+departamento+"',Funcao = '"+funcao+"',Observacao = '"+observacao+"',Sexo = '"+sexo+"' WHERE CPF = '"+Funcionario.id+"' ;";
            
		Conexao con = new Conexao();
                
		int res = con.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Inserção realizada!");
		} else {
			System.err.println("Inserção NÃO realizada!");
		}
        
        }
                
                
               public static void cleartable(){
              String sql = "delete from funcionarios";

		Conexao con = new Conexao();
                
		int res = con.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Inserção realizada!");
		} else {
			System.err.println("Inserção NÃO realizada!");
		}
        }         
               
           public static void clearRow(){
               Funcionario.id = FuncionarioWrite.cadastros.get(FuncionarioView.index).cpf;
              String sql = "delete from funcionarios WHERE CPF = '"+Funcionario.id+"' ;";

		Conexao con = new Conexao();
                
		int res = con.executeUpdate(sql);
		if (res >= 1) {
			System.out.println("Inserção realizada!");
		} else {
			System.err.println("Inserção NÃO realizada!");
		}
        }        
}