
package model;

import control.Funcionario;
import java.util.ArrayList;
import view.FuncionarioView;
import static view.FuncionarioView.Modelo;


public class FuncionarioWrite {
    
         public static ArrayList<Funcionario> cadastros = new ArrayList<>();
         public static Funcionario cadastro = new Funcionario();
            
            public static void salvar(){      
            FuncionarioWrite.cadastros.get(FuncionarioView.index).nome = Funcionario.v[0];
            FuncionarioWrite.cadastros.get(FuncionarioView.index).cpf = Funcionario.v[1];
            FuncionarioWrite.cadastros.get(FuncionarioView.index).email = Funcionario.v[2];
            FuncionarioWrite.cadastros.get(FuncionarioView.index).fone = Funcionario.v[3];
            FuncionarioWrite.cadastros.get(FuncionarioView.index).idade = Funcionario.v[4];
            FuncionarioWrite.cadastros.get(FuncionarioView.index).salario = Funcionario.v[5];
            FuncionarioWrite.cadastros.get(FuncionarioView.index).fonec = Funcionario.v[6];
            FuncionarioWrite.cadastros.get(FuncionarioView.index).numero = Funcionario.v[7];
            FuncionarioWrite.cadastros.get(FuncionarioView.index).data = Funcionario.v[8];
            FuncionarioWrite.cadastros.get(FuncionarioView.index).departamento = Funcionario.v[9];
            FuncionarioWrite.cadastros.get(FuncionarioView.index).funcao = Funcionario.v[10];
            FuncionarioWrite.cadastros.get(FuncionarioView.index).numero = Funcionario.v[11];
            FuncionarioWrite.cadastros.get(FuncionarioView.index).sexo = Funcionario.v[12];
            
            Funcionario.id = FuncionarioWrite.cadastros.get(FuncionarioView.index).cpf;
                     
            cadastro.setNome(Funcionario.v[0]);
            cadastro.setCpf(Funcionario.v[1]);
            cadastro.setEmail(Funcionario.v[2]);
            cadastro.setFone(Funcionario.v[3]);
            cadastro.setIdade(Funcionario.v[4]);
            cadastro.setSalario(Funcionario.v[5]);
            cadastro.setFonec(Funcionario.v[6]);
            cadastro.setNumero(Funcionario.v[7]);
            cadastro.setData(Funcionario.v[8]);
            cadastro.setDepartamento(Funcionario.v[9]);
            cadastro.setFuncao(Funcionario.v[10]);
            cadastro.setObservacao(Funcionario.v[11]);
            cadastro.setSexo(Funcionario.v[12]);
            
            FuncionarioWrite.cadastros.set(FuncionarioView.index, cadastro);
            Modelo.setValueAt(cadastro, FuncionarioView.index);
                
            }
    
}
