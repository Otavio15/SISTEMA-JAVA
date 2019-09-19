package control;

public class Fornecedor {
    public static String v[] = new String[13];
    public String nome = null;
    public String cnpj = null;
    public String email = null;
    public String fone = null;
    public String numero = null;
    public String descricao = null;
    public String fonec = null;   
    public String cep = null;
    public String bairro = null;
    public String estado = null;
    public String cidade = null;
    public String rua = null;
     public static String id = "0";
    
    public Fornecedor(){}
    
    public Fornecedor(
    
    String nome,
    String cnpj,
    String email,
    String fone,
    String numero,
    String descricao,
    String fonec,
    String cep,
    String bairro,
    String estado,
    String cidade,
    String rua,      
    String id        
            
    ){
    this.nome = nome;
    this.cnpj = cnpj;
    this.email = email;
    this.fone = fone;
    this.numero = numero;
    this.descricao = descricao;
    this.fonec = fonec;
    this.cep = cep;
    this.bairro = bairro;
    this.estado = estado;
    this.cidade = cidade;
    this.rua = rua;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFonec() {
        return fonec;
    }

    public void setFonec(String fonec) {
        this.fonec = fonec;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
