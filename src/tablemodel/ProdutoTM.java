package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import control.Produto;
public class ProdutoTM extends AbstractTableModel{
    public List<Produto> linhas;
    public String[] colunas = new String[]{"Nome","Marca","Data da compra","Valor da venda","Categoria","Descrição","Fornecedor","Prateleira","Quantidade"};
    
    public ProdutoTM() {
        linhas = new ArrayList<Produto>();
    }
    
    public ProdutoTM(List<Produto> lista) {
        linhas = new ArrayList<Produto>(lista);
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
        Produto f = linhas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return f.getNome();
            case 1:
                return f.getMarca(); 
            case 2:
                return f.getData_da_compra();
            case 3:
                return f.getValor_da_venda();
            case 4:
                return f.getCategoria();
            case 5:
                return f.getDescricao();
            case 6:
                return f.getFornecedor();
            case 7:
                return f.getPrateleira();
            case 8:
                return f.getQuant();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
  
    @Override
    //modifica na linha e coluna especificada
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Produto f = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado

        switch (columnIndex) { // Seta o valor do campo respectivo
            case 0:
                f.setNome(aValue.toString());
                break;
            case 1:
                f.setMarca(aValue.toString());
                break;
            case 2:
                f.setData_da_compra(aValue.toString());
                break;
            case 3:
                f.setValor_da_venda(aValue.toString());
                break;
            case 4:
                f.setCategoria(aValue.toString());
                break;
            case 5:
                f.setDescricao(aValue.toString());
                break;
            case 6:
                f.setFornecedor(aValue.toString());
                break;
            case 7:
                f.setPrateleira(aValue.toString());
                break;
            case 8:
                f.setQuant(aValue.toString());
                break;
            default:
                // Isto não deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
     }
    
    //modifica na linha especificada
    public void setValueAt(Produto aValue, int rowIndex) {
        Produto f = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        
        f.setNome(aValue.getNome());
        f.setMarca(aValue.getMarca());
        f.setData_da_compra(aValue.getData_da_compra());
        f.setValor_da_venda(aValue.getValor_da_venda());
        f.setCategoria(aValue.getCategoria());
        f.setDescricao(aValue.getDescricao());
        f.setFornecedor(aValue.getFornecedor());
        f.setPrateleira(aValue.getPrateleira());
        f.setQuant(aValue.getQuant());
        
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
        fireTableCellUpdated(rowIndex, 5);
        fireTableCellUpdated(rowIndex, 6);
        fireTableCellUpdated(rowIndex, 7);
        fireTableCellUpdated(rowIndex, 8);
    }
  
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public Produto getFuncionario(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addFuncionario(Produto f) {
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
    public void addLista(List<Produto> f) {
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
