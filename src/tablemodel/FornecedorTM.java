
package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import control.Fornecedor;

public class FornecedorTM extends AbstractTableModel{
    
    public List<Fornecedor> linhas;
    public String[] colunas = new String[]{"Nome","CNPJ","E-mail","Fone","Numero","Descricao","Celular","CEP","Bairro","Estado","Cidade","Rua"};
    
    public FornecedorTM() {
        linhas = new ArrayList<Fornecedor>();
    }
    
    public FornecedorTM(List<Fornecedor> lista) {
        linhas = new ArrayList<Fornecedor>(lista);
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
        Fornecedor f = linhas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return f.getNome();
            case 1:
                return f.getCnpj();
            case 2:
                return f.getEmail();
            case 3:
                return f.getFone(); 
            case 4:
                return f.getNumero();
            case 5:
                return f.getDescricao();
            case 6:
                return f.getFonec();
            case 7:
                return f.getCep();
            case 8:
                return f.getBairro();
            case 9:
                return f.getEstado();
            case 10:
                return f.getCidade();
            case 11:
                return f.getRua();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    //modifica na linha e coluna especificada
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Fornecedor f = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado

        switch (columnIndex) { // Seta o valor do campo respectivo
            case 0:
                f.setNome(aValue.toString());
                break;
            case 1:
                f.setCnpj(aValue.toString());
                break;
            case 2:
                f.setEmail(aValue.toString());
                break;
            case 3:
                f.setFone(aValue.toString());
                break;
            case 4:
                f.setNumero(aValue.toString());
                break;
            case 5:
                f.setDescricao(aValue.toString());
                break;
            case 6:
                f.setFonec(aValue.toString());
                break;
            case 7:
                f.setCep(aValue.toString());
                break;
            case 8:
                f.setBairro(aValue.toString());
                break;
            case 9:
                f.setEstado(aValue.toString());
                break;
            case 10:
                f.setCidade(aValue.toString());
                break;
            case 11:
                f.setRua(aValue.toString());
                break;
            default:
                // Isto não deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
     }
    
    //modifica na linha especificada
    public void setValueAt(Fornecedor aValue, int rowIndex) {
        Fornecedor f = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        
        f.setNome(aValue.getNome());
        f.setCnpj(aValue.getCnpj());
        f.setEmail(aValue.getEmail());
        f.setFone(aValue.getFone());
        f.setNumero(aValue.getNumero());
        f.setDescricao(aValue.getDescricao());
        f.setFonec(aValue.getFonec());
        f.setCep(aValue.getCep());
        f.setBairro(aValue.getBairro());
        f.setEstado(aValue.getEstado());
        f.setCidade(aValue.getCidade());
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
    }
  
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public Fornecedor getFornecedor(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addFuncionario(Fornecedor f) {
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
    public void addLista(List<Fornecedor> f) {
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
