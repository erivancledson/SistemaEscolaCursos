package infoclik.aluno;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cledson
 */

public interface IRepositorioAlunoBDR {
	public void Cadastrar(Aluno aluno) throws AlunoJaCadastradoException, SQLException, CampoObrigatorioException;
	public Aluno procurarId(int id_aluno) throws AlunoNaoEncontradoException, SQLException, CampoObrigatorioException;
        public Aluno procurar(String cpf) throws AlunoNaoEncontradoException, SQLException, CampoObrigatorioException;
        public Aluno procurarNome(String nome) throws AlunoNaoEncontradoException, SQLException, CampoObrigatorioException;
       
	public void atualizar(Aluno aluno)throws AlunoNaoEncontradoException, SQLException, CampoObrigatorioException;
	public void removerId(int id_aluno)throws AlunoNaoEncontradoException, SQLException, CampoObrigatorioException;
        public void remover(String cpf)throws AlunoNaoEncontradoException, SQLException, CampoObrigatorioException;
	public boolean existe(String cpf)throws SQLException, CampoObrigatorioException, AlunoNaoEncontradoException;
        public ArrayList<Aluno> listar()throws SQLException;
        public ArrayList<Aluno> listar(String complemento)throws SQLException;
       
}
