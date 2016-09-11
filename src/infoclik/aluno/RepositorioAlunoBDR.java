
package infoclik.aluno;

import infoclik.util.Conexao;
import infoclik.util.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Cledson
 */
public class RepositorioAlunoBDR implements IRepositorioAlunoBDR{

	
private Connection conectar = null;
	
	
	
	public RepositorioAlunoBDR() throws Exception {

		this.conectar = Conexao.getConnection(Database.POSTGRESQL);
	}
	
	
	@Override
	public void Cadastrar(Aluno aluno)
			throws AlunoJaCadastradoException, SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql;
		if(aluno != null){
			try{
				sql = "insert into aluno(nome, data_nasc, sexo, est_civil, endereco, bairro, entidade, cidade, cep, tel, responsavel, rg, cpf, horario_optado, data_pag, obs, data_cad ) " +
						"values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				stmt = this.conectar.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				stmt.setString(1, aluno.getNome());
				stmt.setString(2, aluno.getData_nasc());
				stmt.setString(3, aluno.getSexo());
				stmt.setString(4, aluno.getEst_civil());
				stmt.setString(5, aluno.getEndereco());
				stmt.setString(6, aluno.getBairro());
				stmt.setString(7, aluno.getEntidade());
				stmt.setString(8, aluno.getCidade());;
				stmt.setString(9, aluno.getCep());
				stmt.setString(10, aluno.getTel());
				stmt.setString(11, aluno.getResponsavel());
				stmt.setString(12, aluno.getRg());
				stmt.setString(13, aluno.getCpf());	
				stmt.setString(14, aluno.getHorario_optado());
				stmt.setString(15, aluno.getData_pag());
                                stmt.setString(16, aluno.getObs());
				stmt.setString(17, aluno.getData_cad());
                                
                                
                                
				rs = stmt.getGeneratedKeys();
				stmt.execute();
				int alunoId = 0;
				while(rs.next()){
					aluno.getId_aluno();
				}
				
			}finally{
				stmt.close();
				rs.close();
			}
		}
	     } 
        
        
         @Override
	public Aluno procurarId(int id_aluno)
			throws AlunoNaoEncontradoException, SQLException {
		Aluno alunos = null;
		String complemento = " and aluno.id_aluno = " + id_aluno;
		ArrayList<Aluno> Aluno = this.listar(complemento);
		if(Aluno.isEmpty()){
			throw new AlunoNaoEncontradoException();
		}
		return Aluno.get(0);
	}
        
        
        
        @Override
	public Aluno procurarNome(String nome)
			throws AlunoNaoEncontradoException, SQLException {
		Aluno alunos = null;
		String complemento = " and aluno.nome like '%" + nome + "%'";
		ArrayList<Aluno> Aluno = this.listar(complemento);
		if(Aluno.isEmpty()){
			throw new AlunoNaoEncontradoException();
		}
		return Aluno.get(0);
	}
        
        
        
        
        @Override
	public Aluno procurar(String cpf)
			throws AlunoNaoEncontradoException, SQLException {
		Aluno alunos = null;
		String complemento = " and aluno.cpf = '" + cpf+"'";
		ArrayList<Aluno> Aluno = this.listar(complemento);
		if(Aluno.isEmpty()){
			throw new AlunoNaoEncontradoException();
		}
		return Aluno.get(0);
	}
        
        
        
        @Override
	public void atualizar(Aluno aluno)
			throws AlunoNaoEncontradoException, SQLException {
		PreparedStatement stmt = null;
		try{
			if(aluno != null){
				String sql = "update aluno set nome = ?, data_nasc = ?, sexo = ?, "
						+ "est_civil = ?, endereco = ?,  bairro = ?, entidade = ?, cidade = ?, "
						+ "cep = ?, tel = ?, responsavel = ?, rg = ?, horario_optado = ?, data_pag = ?, obs = ?, data_cad = ?"  ;
				sql += " where cpf = ?";
				stmt = this.conectar.prepareStatement(sql);
	                        stmt.setString(1, aluno.getNome());
				stmt.setString(2, aluno.getData_nasc());
				stmt.setString(3, aluno.getSexo());
				stmt.setString(4, aluno.getEst_civil());
				stmt.setString(5, aluno.getEndereco());
				stmt.setString(6, aluno.getBairro());
				stmt.setString(7, aluno.getEntidade());
				stmt.setString(8, aluno.getCidade());;
				stmt.setString(9, aluno.getCep());
				stmt.setString(10, aluno.getTel());
				stmt.setString(11, aluno.getResponsavel());
				stmt.setString(12, aluno.getRg());
					
				stmt.setString(13, aluno.getHorario_optado());
				stmt.setString(14, aluno.getData_pag());
                                stmt.setString(15, aluno.getObs());
				stmt.setString(16, aluno.getData_cad());
                                stmt.setString(17, aluno.getCpf());
				Integer resultado = stmt.executeUpdate();
				
				if(resultado == 0){
					throw new AlunoNaoEncontradoException();
				}
			}
			
		}finally{
			stmt.close();
		}
		
	}
	
        
        
        
        
        
        
        
        
         
        
        
        
        @Override
	public void removerId(int id_aluno) throws AlunoNaoEncontradoException,
			SQLException {
			PreparedStatement stmt = null;
			try{
				String sql ="delete from aluno where id_aluno = ?" ;
				stmt = this.conectar.prepareStatement(sql);
				stmt.setInt(1, id_aluno);
				stmt.execute();
			}finally{
				stmt.close();
			}
		
	}
		
        @Override
	public void remover(String cpf) throws AlunoNaoEncontradoException,
			SQLException {
			PreparedStatement stmt = null;
			try{
				String sql ="delete from aluno where cpf = ?" ;
				stmt = this.conectar.prepareStatement(sql);
				stmt.setString(1, cpf);
				stmt.execute();
			}finally{
				stmt.close();
			}
		
	}
        
        

    @Override
	public ArrayList<Aluno> listar(String complemento) throws SQLException {
		PreparedStatement stmt = null;
		ArrayList<Aluno> aluno = new ArrayList<Aluno>();
		String sql = "";
		ResultSet rs = null;
		try{
			sql += "select * from aluno";
			sql += " where id_aluno is not null";
			sql += complemento;
			stmt = this.conectar.prepareStatement(sql);
			rs = stmt.executeQuery();

			while(rs.next()){
				Aluno alunos = new Aluno(rs.getInt("id_aluno"), rs.getString("nome"), rs.getString("data_nasc"), rs.getString("sexo"), rs.getString("est_civil"), rs.getString("endereco"), rs.getString("bairro"), rs.getString("entidade"), rs.getString("cidade"), rs.getString("cep"), rs.getString("tel"), rs.getString("responsavel"), rs.getString("rg"), rs.getString("cpf"), rs.getString("horario_optado"), rs.getString("data_pag"), rs.getString("obs"), rs.getString("data_cad"));
				
				
				
				
				
				aluno.add(alunos);
				
            
			}
		}finally{
			stmt.close();
			rs.close();
		}
		
		return aluno;

}

        
    @Override
	public ArrayList<Aluno> listar() throws SQLException {
		PreparedStatement stmt = null;
		ArrayList<Aluno> aluno = new ArrayList<Aluno>();
		String sql = "";
		ResultSet rs = null;
		try{
			sql += "select * from aluno";
			sql += " where id_aluno is not null";
			stmt = this.conectar.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()){
				Aluno alunos = new Aluno(rs.getInt("id_aluno"), rs.getString("nome"), rs.getString("data_nasc"), rs.getString("sexo"), rs.getString("est_civil"), rs.getString("endereco"), rs.getString("bairro"), rs.getString("entidade"), rs.getString("cidade"), rs.getString("cep"), rs.getString("tel"), rs.getString("responsavel"), rs.getString("rg"), rs.getString("cpf"), rs.getString("horario_optado"), rs.getString("data_pag"), rs.getString("obs"), rs.getString("data_cad"));

				
				
				
				
				
				
				aluno.add(alunos);
				
            
			}
		}finally{
			stmt.close();
			rs.close();
		}
		
		return aluno;
	}
	
	
    
@Override
	public boolean existe(String cpf) throws SQLException {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try{
			String sql ="select count(*) as quantidade from aluno where cpf = ?";
			stmt = this.conectar.prepareStatement(sql);
			stmt.setString(1, cpf);
			rs = stmt.executeQuery();
			rs.next();
			if(rs.getInt("quantidade") == 0){
				return false;
			}else{
				return true;
			}
		}finally{
			stmt.close();
			rs.close();
		}
	
	}

   

   

}
