package infoclik.fachada;

import infoclik.aluno.Aluno;
import infoclik.aluno.ControladorAluno;
import infoclik.controle.ControladorControle;
import infoclik.controle.Controle;
import infoclik.pagamento.ControladorPagamento;
import infoclik.pagamento.Pagamento;
import infoclik.pagamento.SelecioneMes;
import infoclik.recibo.ControladorRecibo;
import infoclik.recibo.Recibo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cledson
 */
public class Fachada {

    private static Fachada instance = null;

    public static Fachada getInstance() {
        if (Fachada.instance == null) {
            Fachada.instance = new Fachada();
        }

        return Fachada.instance;
    }

    private ControladorAluno controladorAluno;
    private ControladorPagamento controladorPagamento;
    private ControladorControle controladorControle;
    private ControladorRecibo controladorRecibo;

    public void alunoCadastrar(Aluno aluno) throws Exception {
        this.controladorAluno = new ControladorAluno();
        this.controladorAluno.cadastrar(aluno);
    }

    public Aluno alunoProcurar(String cpf) throws Exception {
        this.controladorAluno = new ControladorAluno();
        return this.controladorAluno.procurar(cpf);
    }

    public Aluno alunoProcurarNome(String nome) throws Exception {
        this.controladorAluno = new ControladorAluno();
        return this.controladorAluno.procurarNome(nome);
    }

    public Aluno alunoProcurarId(int id_aluno) throws Exception {
        this.controladorAluno = new ControladorAluno();
        return this.controladorAluno.procurarId(id_aluno);
    }

    public void alunoAtualizar(Aluno aluno) throws Exception {
        this.controladorAluno = new ControladorAluno();
        this.controladorAluno.atualizar(aluno);
    }

    public void alunoRemoverId(int id_aluno) throws Exception {
        this.controladorAluno = new ControladorAluno();
        this.controladorAluno.removerId(id_aluno);
    }

    public void alunoRemover(String cpf) throws Exception {
        this.controladorAluno = new ControladorAluno();
        this.controladorAluno.remover(cpf);
    }

    public ArrayList<Aluno> alunoListar() throws Exception {
        this.controladorAluno = new ControladorAluno();
        return this.controladorAluno.listar();
    }

    public void pagamentoCadastrar(Pagamento pagamento) throws Exception {
        this.controladorPagamento = new ControladorPagamento();
        this.controladorPagamento.cadastrar(pagamento);
    }

    public Pagamento pagamentoProcurar(String nome) throws Exception {
        this.controladorPagamento = new ControladorPagamento();
        return this.controladorPagamento.procurarNome(nome);
    }

    public Pagamento pagamentoProcurarId(int id_aluno) throws Exception {
        this.controladorPagamento = new ControladorPagamento();
        return this.controladorPagamento.procurarId(id_aluno);
    }

    public void pagamentoAtualizar(Pagamento pagamento) throws Exception {
        this.controladorPagamento = new ControladorPagamento();
        this.controladorPagamento.atualizar(pagamento);
    }

    public void pagamentoRemoverId(int id_aluno) throws Exception {
        this.controladorPagamento = new ControladorPagamento();
        this.controladorPagamento.remover(id_aluno);
    }

    public ArrayList<Pagamento> pagamentoListar() throws Exception {
        this.controladorPagamento = new ControladorPagamento();
        return this.controladorPagamento.listar();
    }

    public void controleCadastrar(Controle controle) throws Exception {
        this.controladorControle = new ControladorControle();
        this.controladorControle.cadastrar(controle);
    }

    public Controle controleProcurarNome(String nome) throws Exception {
        this.controladorControle = new ControladorControle();
        return this.controladorControle.procurarNome(nome);
    }

    public Controle controleProcurarId(int id_aluno) throws Exception {
        this.controladorControle = new ControladorControle();
        return this.controladorControle.procurarId(id_aluno);
    }

    public void controleAtualizar(Controle controle) throws Exception {
        this.controladorControle = new ControladorControle();
        this.controladorControle.atualizar(controle);
    }

    public void controleRemoverId(int id_aluno) throws Exception {
        this.controladorControle = new ControladorControle();
        this.controladorControle.removerId(id_aluno);
    }

    public ArrayList<Controle> controleListar() throws Exception {
        this.controladorControle = new ControladorControle();
        return this.controladorControle.listar();
    }

    public void reciboCadastrar(Recibo recibo) throws Exception {
        this.controladorRecibo = new ControladorRecibo();
        this.controladorRecibo.cadastrar(recibo);
    }

    public Recibo reciboProcurarNome(String nome) throws Exception {
        this.controladorRecibo = new ControladorRecibo();
        return this.controladorRecibo.procurarNome(nome);
    }

    public Recibo reciboProcurarId(int id_aluno) throws Exception {
        this.controladorRecibo = new ControladorRecibo();
        return this.controladorRecibo.procurarId(id_aluno);
    }

    public void reciboAtualizar(Recibo recibo) throws Exception {
        this.controladorRecibo = new ControladorRecibo();
        this.controladorRecibo.atualizar(recibo);
    }

    public void reciboRemoverId(int id_aluno) throws Exception {
        this.controladorRecibo = new ControladorRecibo();
        this.controladorRecibo.removerId(id_aluno);
    }

    public ArrayList<Recibo> reciboListar() throws Exception {
        this.controladorRecibo = new ControladorRecibo();
        return this.controladorRecibo.listar();
    }

    public ArrayList<Pagamento> pesquisarNaoPagoPorMes(String mes) throws SQLException, SelecioneMes, Exception {
        this.controladorPagamento = new ControladorPagamento();
        return controladorPagamento.pesquisarNaoPagoPorMes(mes);
    }

}
