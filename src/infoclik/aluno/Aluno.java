
package infoclik.aluno;

/**
 *
 * @author Cledson
 */
public class Aluno {
    private int id_aluno;
    private String nome;
    private String data_nasc;
    private String sexo;
    private String est_civil;
    private String endereco;
    private String bairro;
    private String entidade;
    private String cidade;
    private String cep;
    private String tel;
    private String responsavel;
    private String rg;
    private String cpf;
    private String horario_optado;
    private String data_pag;
    private String obs;
    private String data_cad;

    
    public Aluno(String nome, String data_nasc, String sexo, String est_civil, String endereco, String bairro, String entidade, String cidade, String cep, String tel, String responsavel, String rg, String cpf, String horario_optado, String data_pag, String obs, String data_cad) {
       
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.est_civil = est_civil;
        this.endereco = endereco;
        this.bairro = bairro;
        this.entidade = entidade;
        this.cidade = cidade;
        this.cep = cep;
        this.tel = tel;
        this.responsavel = responsavel;
        this.rg = rg;
        this.cpf = cpf;
        this.horario_optado = horario_optado;
        this.data_pag = data_pag;
        this.obs = obs;
        this.data_cad = data_cad;
    }
    
    
    
    public Aluno(int id_aluno, String nome, String data_nasc, String sexo, String est_civil, String endereco, String bairro, String entidade, String cidade, String cep, String tel, String responsavel, String rg, String cpf, String horario_optado, String data_pag, String obs, String data_cad) {
        this.id_aluno = id_aluno;
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.sexo = sexo;
        this.est_civil = est_civil;
        this.endereco = endereco;
        this.bairro = bairro;
        this.entidade = entidade;
        this.cidade = cidade;
        this.cep = cep;
        this.tel = tel;
        this.responsavel = responsavel;
        this.rg = rg;
        this.cpf = cpf;
        this.horario_optado = horario_optado;
        this.data_pag = data_pag;
        this.obs = obs;
        this.data_cad = data_cad;
    }

    

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEst_civil() {
        return est_civil;
    }

    public void setEst_civil(String est_civil) {
        this.est_civil = est_civil;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEntidade() {
        return entidade;
    }

    public void setEntidade(String entidade) {
        this.entidade = entidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getHorario_optado() {
        return horario_optado;
    }

    public void setHorario_optado(String horario_optado) {
        this.horario_optado = horario_optado;
    }

    public String getData_pag() {
        return data_pag;
    }

    public void setData_pag(String data_pag) {
        this.data_pag = data_pag;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getData_cad() {
        return data_cad;
    }

    public void setData_cad(String data_cad) {
        this.data_cad = data_cad;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Aluno{" + "id_aluno=" + id_aluno + ", nome=" + nome + ", data_nasc=" + data_nasc + ", sexo=" + sexo + ", est_civil=" + est_civil + ", endereco=" + endereco + ", bairro=" + bairro + ", entidade=" + entidade + ", cidade=" + cidade + ", cep=" + cep + ", tel=" + tel + ", responsavel=" + responsavel + ", rg=" + rg + ", cpf=" + cpf + ", horario_optado=" + horario_optado + ", data_pag=" + data_pag + ", obs=" + obs + ", data_cad=" + data_cad + '}';
    }
    
    
    

    
    
}
