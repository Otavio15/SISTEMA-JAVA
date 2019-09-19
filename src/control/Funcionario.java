/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author FERNANDO ROGI
 */
public class Funcionario {

    public static String v[] = new String[14];
    public String nome;
    public String cpf;
    public String email;
    public String fone;
    public String idade;
    public String salario;
    public String fonec;
    public String numero;
    public String data;
    public String departamento;
    public String funcao;
    public String observacao;
    public String sexo;
     public static String id = "0";
    
    public Funcionario(){}
    
    public Funcionario(
    
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
    String obcervacao,
    String sexo,
    String id
            
    ){
    this.nome = nome;
    this.cpf = cpf;
    this.email = email;
    this.fone = fone;
    this.idade = idade;
    this.salario = salario;
    this.fonec = fonec;
    this.numero = numero;
    this.data = data;
    this.departamento = departamento;
    this.funcao = funcao;
    this.observacao = obcervacao;
    this.sexo = sexo;
    this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }
    
    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getFonec() {
        return fonec;
    }
    
    public void setFonec(String fonec){
        this.fonec = fonec;
    }
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
