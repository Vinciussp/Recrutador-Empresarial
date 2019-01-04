/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author vinicius
 */
public class ModeloLogin {
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String permissao;
    private String permissao2;
    private String Area;
    private String Subarea;
    private String Depart;
    private String Status;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the permissao
     */
    public String getPermissao() {
        return permissao;
    }

    /**
     * @param permissao the permissao to set
     */
    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
    
     /**
     * @return the permissao
     */
    public String getPermissao2() {
        return permissao2;
    }
    
     /**
     * @param permissao2 the permissao to set
     */
    public void setPermissao2(String permissao2) {
        this.permissao2 = permissao2;
    }
    
    public String getArea() {
        return Area;
    }

    /**
     * @param Area the permissao to set
     */
    public void setArea(String Area) {
        this.Area = Area;
    }
    
    public String getSubarea() {
        return Subarea;
    }

    /**
     * @param Subarea the permissao to set
     */
    public void setSubarea(String Subarea) {
        this.Subarea = Subarea;
    }
    
    public String getDepart() {
        return Depart;
    }

    /**
     * @param Depart the permissao to set
     */
    public void setDepart(String Depart) {
        this.Depart = Depart;
    }
    
}
