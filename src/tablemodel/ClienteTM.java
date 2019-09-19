package tablemodel;


import control.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author Gilberto Toledo
 */
public class ClienteTM extends AbstractTableModel{

    public List<Cliente> linhas;
    public String[] colunas = new String[]{"Nome","CPF","Fixo","Idade","Cidade","Sexo","Celular","E-mail","CEP","Estado","Bairro","Número","rua"};
    
    public ClienteTM() {
        linhas = new ArrayList<Cliente>();
    }
    
    public ClienteTM(List<Cliente> lista) {
        linhas = new ArrayList<Cliente>(lista);
    }
    
    @Override
    public int getColumnCount() {        
        return colunas.length;
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente f = linhas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return f.getNome();
            case 1:
                return f.getCpf();
            case 2:
                return f.getFone();
            case 3:
                return f.getIdade(); 
            case 4:
                return f.getCidade();
            case 5:
                return f.getSexo();
            case 6:
                return f.getFonec();
            case 7:
                return f.getEmail();
            case 8:
                return f.getCep();
            case 9:
                return f.getEstado();
            case 10:
                return f.getBairro();
            case 11:
                return f.getNumero();
            case 12:
                return f.getRua();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
        /*
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
    @Override
    */
    @Override
    //modifica na linha e coluna especificada
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Cliente f = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado

        switch (columnIndex) { // Seta o valor do campo respectivo
            case 0:
                f.setNome(aValue.toString());
                break;
            case 1:
                f.setCpf(aValue.toString());
                break;
            case 2:
                f.setFone(aValue.toString());
                break;
            case 3:
                f.setIdade(aValue.toString());
                break;
            case 4:
                f.setCidade(aValue.toString());
                break;
            case 5:
                f.setSexo(aValue.toString());
                break;
            case 6:
                f.setFonec(aValue.toString());
                break;
            case 7:
                f.setEmail(aValue.toString());
                break;
            case 8:
                f.setCep(aValue.toString());
                break;
            case 9:
                f.setEstado(aValue.toString());
                break;
            case 10:
                f.setBairro(aValue.toString());
                break;
            case 11:
                f.setNumero(aValue.toString());
                break;
            case 12:
                f.setRua(aValue.toString());
                break;
            default:
                // Isto não deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
     }
    
    //modifica na linha especificada
    public void setValueAt(Cliente aValue, int rowIndex) {
        Cliente f = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        
        f.setNome(aValue.getNome());
        f.setCpf(aValue.getCpf());
        f.setFone(aValue.getFone());
        f.setIdade(aValue.getIdade());
        f.setCidade(aValue.getCidade());
        f.setSexo(aValue.getSexo());
        f.setFonec(aValue.getFonec());
        f.setEmail(aValue.getEmail());
        f.setCep(aValue.getCep());
        f.setEstado(aValue.getEstado());
        f.setBairro(aValue.getBairro());
        f.setNumero(aValue.getNumero());
        f.setRua(aValue.getRua());
        
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
        fireTableCellUpdated(rowIndex, 5);
        fireTableCellUpdated(rowIndex, 6);
        fireTableCellUpdated(rowIndex, 7);
        fireTableCellUpdated(rowIndex, 8);
        fireTableCellUpdated(rowIndex, 9);
        fireTableCellUpdated(rowIndex, 10);
        fireTableCellUpdated(rowIndex, 11);
        fireTableCellUpdated(rowIndex, 12);
    }
  
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public Cliente getFuncionario(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addFuncionario(Cliente f) {
        // Adiciona o registro.
        linhas.add(f);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
     /* Remove a linha especificada. */
    public void remove(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Cliente ao final dos registros. */
    public void addLista(List<Cliente> f) {
        // Pega o tamanho antigo da tabela.
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.
        linhas.addAll(f);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return linhas.isEmpty();
    }   
}
