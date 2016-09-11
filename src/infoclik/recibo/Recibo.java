/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoclik.recibo;

/**
 *
 * @author Cledson
 */
public class Recibo {
    private int id_recibo;
    private int id_aluno;
    private String valor;
    private String nome;
    private String importancia;
    private String referente;
    private String data;

    public Recibo(int id_recibo, int id_aluno, String valor, String nome, String importancia, String referente, String data) {
        this.id_recibo = id_recibo;
        this.id_aluno = id_aluno;
        this.valor = valor;
        this.nome = nome;
        this.importancia = importancia;
        this.referente = referente;
        this.data = data;
    }

    public Recibo(int id_aluno, String valor, String nome, String importancia, String referente, String data) {
        this.id_aluno = id_aluno;
        this.valor = valor;
        this.nome = nome;
        this.importancia = importancia;
        this.referente = referente;
        this.data = data;
    }

    public int getId_recibo() {
        return id_recibo;
    }

    public void setId_recibo(int id_recibo) {
        this.id_recibo = id_recibo;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }

    public String getReferente() {
        return referente;
    }

    public void setReferente(String referente) {
        this.referente = referente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Recibo{" + "id_aluno=" + id_aluno + ", valor=" + valor + ", nome=" + nome + ", importancia=" + importancia + ", referente=" + referente + ", data=" + data + '}';
    }
    
    
    
}
