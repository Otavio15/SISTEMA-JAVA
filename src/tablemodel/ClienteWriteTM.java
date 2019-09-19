
package tablemodel;

import control.Cliente;
import view.ClienteView;
import javax.swing.JOptionPane;

/**
 *
 * @author FERNANDO ROGI
 */
public class ClienteWriteTM {
    
        public static void writeTM(){
        
        Cliente cadastroTM = new Cliente();
        cadastroTM.setNome(Cliente.v[0]);
        cadastroTM.setCpf(Cliente.v[1]);
        cadastroTM.setFone(Cliente.v[2]);
        cadastroTM.setIdade(Cliente.v[3]);
        cadastroTM.setCidade(Cliente.v[4]);

        if (null != Cliente.v[5]) switch (Cliente.v[5]) {
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

        cadastroTM.setFonec(Cliente.v[6]);
        cadastroTM.setEmail(Cliente.v[7]);
        cadastroTM.setCep(Cliente.v[8]);
        cadastroTM.setEstado(Cliente.v[9]);
        cadastroTM.setBairro(Cliente.v[10]);
        cadastroTM.setNumero(Cliente.v[11]);
        cadastroTM.setRua(Cliente.v[12]);

        ClienteView.Modelo.addFuncionario(cadastroTM);
            
        }
}
