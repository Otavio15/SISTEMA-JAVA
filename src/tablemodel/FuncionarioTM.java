
package tablemodel;

import control.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FuncionarioTM extends AbstractTableModel{
    
    public List<Funcionario> linhas;
    public String[] colunas = new String[]{"Nome","CPF","E-mail","Fone","Idade","Salário","Celular","Número","Data de entrega","Departamento","Função","Observação","Sexo"};
    
    public FuncionarioTM() {
        linhas = new ArrayList<Funcionario>();
    }
    
    public FuncionarioTM(List<Funcionario> lista) {
        linhas = new ArrayList<Funcionario>(lista);
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
        Funcionario f = linhas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return f.getNome();
            case 1:
                return f.getCpf();
            case 2:
                return f.getEmail();
            case 3:
                return f.getFone(); 
            case 4:
                return f.getIdade();
            case 5:
                return f.getSalario();
            case 6:
                return f.getFonec();
            case 7:
                return f.getNumero();
            case 8:
                return f.getData();
            case 9:
                return f.getDepartamento();
            case 10:
                return f.getFuncao();
            case 11:
                return f.getObservacao();
            case 12:
                return f.getSexo();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
        /*

    */
    @Override
    //modifica na linha e coluna especificada
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Funcionario f = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado

        switch (columnIndex) { // Seta o valor do campo respectivo
            case 0:
                f.setNome(aValue.toString());
                break;
            case 1:
                f.setCpf(aValue.toString());
                break;
            case 2:
                f.setEmail(aValue.toString());
                break;
            case 3:
                f.setFone(aValue.toString());
                break;
            case 4:
                f.setIdade(aValue.toString());
                break;
            case 5:
                f.setSalario(aValue.toString());
                break;
            case 6:
                f.setFonec(aValue.toString());
                break;
            case 7:
                f.setNumero(aValue.toString());
                break;
            case 8:
                f.setData(aValue.toString());
                break;
            case 9:
                f.setDepartamento(aValue.toString());
                break;
            case 10:
                f.setFuncao(aValue.toString());
                break;
            case 11:
                f.setObservacao(aValue.toString());
                break;
            case 12:
                f.setSexo(aValue.toString());
                break;
            default:
                // Isto não deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
     }
    
    //modifica na linha especificada
    public void setValueAt(Funcionario aValue, int rowIndex) {
        Funcionario f = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        
        f.setNome(aValue.getNome());
        f.setCpf(aValue.getCpf());
        f.setEmail(aValue.getEmail());
        f.setFone(aValue.getFone());
        f.setIdade(aValue.getIdade());
        f.setSalario(aValue.getSalario());
        f.setFonec(aValue.getFonec());
        f.setNumero(aValue.getNumero());
        f.setData(aValue.getData());
        f.setDepartamento(aValue.getDepartamento());
        f.setFuncao(aValue.getFuncao());
        f.setObservacao(aValue.getObservacao());
        f.setSexo(aValue.getSexo());
        
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
    
    public Funcionario getFuncionario(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addFuncionario(Funcionario f) {
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
    public void addLista(List<Funcionario> f) {
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
