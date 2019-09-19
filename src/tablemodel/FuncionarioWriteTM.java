
package tablemodel;

import control.Funcionario;
import javax.swing.JOptionPane;
import view.FuncionarioView;

public class FuncionarioWriteTM {
    
        public static void writeTM(){
        
        Funcionario cadastroTM = new Funcionario();
        cadastroTM.setNome(Funcionario.v[0]);
        cadastroTM.setCpf(Funcionario.v[1]);
        cadastroTM.setEmail(Funcionario.v[2]);
        cadastroTM.setFone(Funcionario.v[3]);
        cadastroTM.setIdade(Funcionario.v[4]);
        cadastroTM.setSalario(Funcionario.v[5]);
        cadastroTM.setFonec(Funcionario.v[6]);
        cadastroTM.setNumero(Funcionario.v[7]);
        cadastroTM.setData(Funcionario.v[8]);
        cadastroTM.setDepartamento(Funcionario.v[9]);
        cadastroTM.setFuncao(Funcionario.v[10]);
        cadastroTM.setObservacao(Funcionario.v[11]);
        
        
        if (null != Funcionario.v[12]) switch (Funcionario.v[12]) {
                case "Masculino":
                    cadastroTM.setSexo("Masculino");
                    break;
                case "Feminino":
                    cadastroTM.setSexo("Feminino");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Sexo não informado");
                    cadastroTM.setSexo("NÃO INFORMADO");
                    break;
        }

        FuncionarioView.Modelo.addFuncionario(cadastroTM);
            
        }
}
