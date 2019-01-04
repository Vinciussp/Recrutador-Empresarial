package modelo;


public class Usuario {
    
    private int id;
    private String data;
    private String empresa;
    private String descricao;
    private String destinatario;
    private String departamento;
    private String dataentrega;
    private String horario;
    private String pesquisa;
    private String login;
    private String usuario;
    private String recebimento;
    private String entrega;
    private String correios;
    private String baixa;
    
  
    public String getEmpresa() {
        return empresa;
    }
    
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    public String getDescricao() {
        return descricao; 
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;   
    }     
    
    public int getId() {
        return id;  
    }     
    
    public void setId(int id) {
        this.id = id;     
    }     
    
    public String getData() {
        return data;     
    }     
    
    public void setData(String data) {
        this.data = data;     
    }  
    
    public String getDestinatario() {
        return destinatario;     
    }     
    
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    public String getDepartamento() {
        return departamento;     
    }     
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
        public String getDataentrega() {
        return dataentrega;     
    }     
    
    public void setDataentrega(String dataentrega) {
        this.dataentrega = dataentrega;
    }
    
             public String getHorario() {
        return horario;     
    }     
    
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public void setLogin(String login) {
       this.login = login;
    }

    public String getLogin() {
      return login;
    }

    public void setUsuario(String usuario) {
       this.usuario = usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
     public void setRecebimento(String recebimento) {
       this.recebimento = recebimento;
    }
    
    public String getRecebimento() {
        return recebimento;
    }
    public void setEntrega(String entrega) {
     this.entrega = entrega;
    }
    public String getEntrega() {
       return entrega;
    }

    public void setCorreios(String correios) {
        this.correios = correios;
    }
    
    public String getCorreios(){
        return correios;
    }

    public void setBaixa(String baixa) {
        this.baixa = baixa;
    }
 public String getBaixa(){
        return baixa;
    }
}
