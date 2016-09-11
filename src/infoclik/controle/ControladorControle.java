package infoclik.controle;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cledson
 */
public class ControladorControle {
        private IRepositorioControle repositorioControle;
	
	
	public ControladorControle() throws Exception {
		this.repositorioControle = new RepositorioControleBDR();
		
	}
	
	public void cadastrar(Controle controle) throws  CampoObrigatorioException, SQLException, ControleNaoEncontradoException{
		
		if(controle.getNome_aluno().equals("") == true) throw new CampoObrigatorioException();
		
		
		
		
		this.repositorioControle.Cadastrar(controle);
		
	
	}
	
	public void removerId(int id_aluno) throws  ControleNaoEncontradoException, SQLException, CampoObrigatorioException{
				Controle controle = null;
		
		
		controle = this.repositorioControle.procurarId(id_aluno);
		
		
		this.repositorioControle.removerId(id_aluno);
		
	}
        
        
        
        
        public Controle procurarId(int id_aluno) throws  ControleNaoEncontradoException, SQLException, CampoObrigatorioException{
		
		return this.repositorioControle.procurarId(id_aluno);
		
	}
        
        public Controle procurarNome(String nome) throws  ControleNaoEncontradoException, SQLException, CampoObrigatorioException{
		
		return this.repositorioControle.procurarNome(nome);
		
	}
	

	public void atualizar(Controle controle) throws ControleNaoEncontradoException, SQLException,  CampoObrigatorioException{
		
		if(controle.getNome_aluno().equals("") == true) throw new CampoObrigatorioException();
		
		this.repositorioControle.atualizar(controle);
	}

	public ArrayList<Controle> listar() throws SQLException{
		return this.repositorioControle.listar();
	}

}
