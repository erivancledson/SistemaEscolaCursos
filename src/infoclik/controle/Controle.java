package infoclik.controle;

/**
 *
 * @author Cledson
 */
public class Controle {
    
    private int id_controle;
    private String nome_aluno;
    private String curso;
    private String apostila;
    private String data_entre;
    private String media;
    private String frequencia;
    private String data_desistencia;
    private String motivo;
    private int id_aluno;

    public Controle(int id_controle, String nome_aluno, String curso, String apostila, String data_entre, String media, String frequencia, String data_desistencia, String motivo, int id_aluno) {
        this.id_controle = id_controle;
        this.nome_aluno = nome_aluno;
        this.curso = curso;
        this.apostila = apostila;
        this.data_entre = data_entre;
        this.media = media;
        this.frequencia = frequencia;
        this.data_desistencia = data_desistencia;
        this.motivo = motivo;
        this.id_aluno = id_aluno;
    }
    
     public Controle(String nome_aluno, String curso, String apostila, String data_entre, String media, String frequencia, String data_desistencia, String motivo, int id_aluno) {
        
        this.nome_aluno = nome_aluno;
        this.curso = curso;
        this.apostila = apostila;
        this.data_entre = data_entre;
        this.media = media;
        this.frequencia = frequencia;
        this.data_desistencia = data_desistencia;
        this.motivo = motivo;
        this.id_aluno = id_aluno;
    }

    public int getId_controle() {
        return id_controle;
    }

    public void setId_controle(int id_controle) {
        this.id_controle = id_controle;
    }

    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getApostila() {
        return apostila;
    }

    public void setApostila(String apostila) {
        this.apostila = apostila;
    }

    public String getData_entre() {
        return data_entre;
    }

    public void setData_entre(String data_entre) {
        this.data_entre = data_entre;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public String getData_desistencia() {
        return data_desistencia;
    }

    public void setData_desistencia(String data_desistencia) {
        this.data_desistencia = data_desistencia;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    @Override
    public String toString() {
        return "Controle{" + "id_controle=" + id_controle + ", nome_aluno=" + nome_aluno + ", curso=" + curso + ", apostila=" + apostila + ", data_entre=" + data_entre + ", media=" + media + ", frequencia=" + frequencia + ", data_desistencia=" + data_desistencia + ", motivo=" + motivo + ", id_aluno=" + id_aluno + '}';
    }
     
     
     
     
    
    
}


