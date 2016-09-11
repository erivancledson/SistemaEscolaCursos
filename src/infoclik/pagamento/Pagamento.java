
package infoclik.pagamento;

/**
 *
 * @author Cledson
 */
public class Pagamento {


private int id_pagamento;
private String nome;
private String mar;
private String abr;
private String mai;
private String jun;
private String jul;
private String ago;
private String set;
private String out;
private String nov;
private String dez;
private String jan;
private String fev;
private int id_aluno;

    public Pagamento(int id_pagamento, String nome, String mar, String abr, String mai, String jun, String jul, String ago, String set, String out, String nov, String dez, String jan, String fev, int id_aluno) {
        this.id_pagamento = id_pagamento;
        this.nome = nome;
        this.mar = mar;
        this.abr = abr;
        this.mai = mai;
        this.jun = jun;
        this.jul = jul;
        this.ago = ago;
        this.set = set;
        this.out = out;
        this.nov = nov;
        this.dez = dez;
         this.jan = jan;
        this.fev = fev;
        this.id_aluno = id_aluno;
    }
    
    
    public Pagamento(String nome, String mar, String abr, String mai, String jun, String jul, String ago, String set, String out, String nov, String dez, String jan, String fev, int id_aluno) {
        this.nome = nome;
        this.mar = mar;
        this.abr = abr;
        this.mai = mai;
        this.jun = jun;
        this.jul = jul;
        this.ago = ago;
        this.set = set;
        this.out = out;
        this.nov = nov;
        this.dez = dez;
        this.jan = jan;
        this.fev = fev;
        this.id_aluno = id_aluno;
    }

    public int getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public String getAbr() {
        return abr;
    }

    public void setAbr(String abr) {
        this.abr = abr;
    }

    public String getMai() {
        return mai;
    }

    public void setMai(String mai) {
        this.mai = mai;
    }

    public String getJun() {
        return jun;
    }

    public void setJun(String jun) {
        this.jun = jun;
    }

    public String getJul() {
        return jul;
    }

    public void setJul(String jul) {
        this.jul = jul;
    }

    public String getAgo() {
        return ago;
    }

    public void setAgo(String ago) {
        this.ago = ago;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public String getNov() {
        return nov;
    }

    public void setNov(String nov) {
        this.nov = nov;
    }

    public String getDez() {
        return dez;
    }

    public void setDez(String dez) {
        this.dez = dez;
    }
    
      public String getJan() {
        return jan;
    }

    public void setJan(String jan) {
        this.jan = jan;
    }

    public String getFev() {
        return fev;
    }

    public void setFev(String fev) {
        this.fev = fev;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "id_pagamento=" + id_pagamento + ", nome=" + nome + ", mar=" + mar + ", abr=" + abr + ", mai=" + mai + ", jun=" + jun + ", jul=" + jul + ", ago=" + ago + ", set=" + set + ", out=" + out + ", nov=" + nov + ", dez=" + dez + ", jan=" + jan + ", fev=" + fev + ", id_aluno=" + id_aluno + '}';
    }

    
    






}
