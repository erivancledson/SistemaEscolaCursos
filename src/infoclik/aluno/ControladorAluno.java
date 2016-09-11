
package infoclik.aluno;

import infoclik.util.Validacao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cledson
 */
public class ControladorAluno {
    
    
    private IRepositorioAlunoBDR repositorioAluno;
	
	
	public ControladorAluno() throws Exception {
		this.repositorioAluno = new RepositorioAlunoBDR();
		
	}
	
	public void cadastrar(Aluno aluno) throws CPFInvalidoException, CampoObrigatorioException, SQLException, AlunoJaCadastradoException, AlunoNaoEncontradoException{
		if(!Validacao.validaCPF(aluno.getCpf())) throw new CPFInvalidoException(aluno.getCpf());
		if(aluno.getNome().equals("") == true) throw new CampoObrigatorioException();
		
		
		if(this.repositorioAluno.existe(aluno.getCpf())) throw new AlunoJaCadastradoException();
		
		this.repositorioAluno.Cadastrar(aluno);
		
	
	}
	
	public void remover(String cpf) throws CPFInvalidoException, AlunoNaoEncontradoException, SQLException, CampoObrigatorioException{
		cpf = cpf.replaceAll("\\.|\\-|\\ ", "");
		Aluno aluno = null;
		
		if(!Validacao.validaCPF(cpf)) throw new CPFInvalidoException(cpf);
		aluno = this.repositorioAluno.procurar(cpf);
		
		
		this.repositorioAluno.remover(cpf);
		
	}
        
        
        
        public void removerId(int id_aluno) throws  AlunoNaoEncontradoException, SQLException, CampoObrigatorioException{
		
		Aluno aluno = null;
		
		
		aluno = this.repositorioAluno.procurarId(id_aluno);
		
		
		this.repositorioAluno.removerId(id_aluno);
		
	}

	public Aluno procurar(String cpf) throws CPFInvalidoException, AlunoNaoEncontradoException, SQLException, CampoObrigatorioException{
		
		
		if(!Validacao.validaCPF(cpf)) throw new CPFInvalidoException(cpf);
		return this.repositorioAluno.procurar(cpf);
	}

        
        public Aluno procurarId(int id_aluno) throws  AlunoNaoEncontradoException, SQLException, CampoObrigatorioException{
		
		return this.repositorioAluno.procurarId(id_aluno);
		
	}
        
        public Aluno procurarNome(String nome) throws  AlunoNaoEncontradoException, SQLException, CampoObrigatorioException{
		
		return this.repositorioAluno.procurarNome(nome);
		
	}
	

	public void atualizar(Aluno aluno) throws AlunoNaoEncontradoException, SQLException, CPFInvalidoException, CampoObrigatorioException{
		if(!Validacao.validaCPF(aluno.getCpf())) throw new CPFInvalidoException(aluno.getCpf());
		if(aluno.getNome().equals("") == true) throw new CampoObrigatorioException();
		
		this.repositorioAluno.atualizar(aluno);
	}

	public ArrayList<Aluno> listar() throws SQLException{
		return this.repositorioAluno.listar();
	}

	
    
}
