package infoclik.pagamento;

import infoclik.aluno.Aluno;
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
public class RepositorioPagamentoBDR implements IRepositorioPagamentoBDR {

    private Connection conectar = null;

    public RepositorioPagamentoBDR() throws Exception {

        this.conectar = Conexao.getConnection(Database.POSTGRESQL);
    }

    @Override
    public void Cadastrar(Pagamento pagamento)
            throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        if (pagamento != null) {
            try {
                sql = "insert into pagamento(nome_alunopag, mar, abr, mai, jun, jul, ago, set, out, nov, dez, jan, fev, id_aluno) "
                        + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                stmt = this.conectar.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, pagamento.getNome());
                stmt.setString(2, pagamento.getMar());
                stmt.setString(3, pagamento.getAbr());
                stmt.setString(4, pagamento.getMai());
                stmt.setString(5, pagamento.getJun());
                stmt.setString(6, pagamento.getJul());
                stmt.setString(7, pagamento.getAgo());
                stmt.setString(8, pagamento.getSet());;
                stmt.setString(9, pagamento.getOut());
                stmt.setString(10, pagamento.getNov());
                stmt.setString(11, pagamento.getDez());
                stmt.setString(12, pagamento.getJan());
                stmt.setString(13, pagamento.getDez());
                stmt.setInt(14, pagamento.getId_aluno());

                rs = stmt.getGeneratedKeys();
                stmt.execute();
                int pagamentoId = 0;
                while (rs.next()) {
                    pagamento.getId_pagamento();
                }

            } finally {
                stmt.close();
                rs.close();
            }
        }
    }

    @Override
    public Pagamento procurarId(int id_aluno) throws PagamentoNaoEncontradoException, SQLException, CampoObrigatorioException {
        Pagamento pagamento = null;
        String complemento = " and pagamento.id_aluno = " + id_aluno;
        ArrayList<Pagamento> Pagamento = this.listar(complemento);
        if (Pagamento.isEmpty()) {
            throw new PagamentoNaoEncontradoException();
        }
        return Pagamento.get(0);
    }

    @Override
    public Pagamento procurar(String nome)
            throws PagamentoNaoEncontradoException, SQLException {
        Pagamento pagamento = null;
        String complemento = " and pagamento.nome_alunopag like '%" + nome + "%'";
        ArrayList<Pagamento> Pagamento = this.listar(complemento);
        if (Pagamento.isEmpty()) {
            throw new PagamentoNaoEncontradoException();
        }
        return Pagamento.get(0);
    }

    @Override
    public void remover(int id_aluno) throws PagamentoNaoEncontradoException,
            SQLException {
        PreparedStatement stmt = null;
        try {
            String sql = "delete from pagamento where id_aluno = ?";
            stmt = this.conectar.prepareStatement(sql);
            stmt.setInt(1, id_aluno);
            stmt.execute();
        } finally {
            stmt.close();
        }

    }

    @Override
    public ArrayList<Pagamento> listar(String complemento) throws SQLException {
        PreparedStatement stmt = null;
        ArrayList<Pagamento> pagamento = new ArrayList<Pagamento>();
        String sql = "";
        ResultSet rs = null;
        try {
            sql += "select * from pagamento";
            sql += " where id_pagamento is not null";
            sql += complemento;
            stmt = this.conectar.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Pagamento pagamentos = new Pagamento(rs.getInt("id_pagamento"), rs.getString("nome_alunopag"), rs.getString("mar"), rs.getString("abr"), rs.getString("mai"), rs.getString("jun"), rs.getString("jul"), rs.getString("ago"), rs.getString("set"), rs.getString("out"), rs.getString("nov"), rs.getString("dez"), rs.getString("jan"), rs.getString("fev"), rs.getInt("id_aluno"));

                pagamento.add(pagamentos);

            }
        } finally {
            stmt.close();
            rs.close();
        }

        return pagamento;

    }

    @Override
    public ArrayList<Pagamento> listar() throws SQLException {
        PreparedStatement stmt = null;
        ArrayList<Pagamento> pagamento = new ArrayList<Pagamento>();
        String sql = "";
        ResultSet rs = null;
        try {
            sql += "select * from pagamento";
            sql += " where id_pagamento is not null";
            stmt = this.conectar.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Pagamento pagamentos = new Pagamento(rs.getInt("id_pagamento"), rs.getString("nome_alunopag"), rs.getString("mar"), rs.getString("abr"), rs.getString("mai"), rs.getString("jun"), rs.getString("jul"), rs.getString("ago"), rs.getString("set"), rs.getString("out"), rs.getString("nov"), rs.getString("dez"), rs.getString("jan"), rs.getString("fev"), rs.getInt("id_aluno"));

                pagamento.add(pagamentos);

            }
        } finally {
            stmt.close();
            rs.close();
        }

        return pagamento;
    }

    @Override
    public void atualizar(Pagamento pagamento)
            throws PagamentoNaoEncontradoException, SQLException {
        PreparedStatement stmt = null;
        try {
            if (pagamento != null) {
                String sql = "update pagamento set nome_alunopag = ?, mar = ?, abr = ?, "
                        + "mai = ?, jun = ?,  jul = ?, ago = ?, set = ?, "
                        + "out = ?, nov = ?, dez = ?, jan = ?, fev = ?";
                sql += " where id_aluno = ?";
                stmt = this.conectar.prepareStatement(sql);
                stmt.setString(1, pagamento.getNome());
                stmt.setString(2, pagamento.getMar());
                stmt.setString(3, pagamento.getAbr());
                stmt.setString(4, pagamento.getMai());
                stmt.setString(5, pagamento.getJun());
                stmt.setString(6, pagamento.getJul());
                stmt.setString(7, pagamento.getAgo());
                stmt.setString(8, pagamento.getSet());
                stmt.setString(9, pagamento.getOut());
                stmt.setString(10, pagamento.getNov());
                stmt.setString(11, pagamento.getDez());
                stmt.setString(12, pagamento.getJan());
                stmt.setString(13, pagamento.getFev());
                stmt.setInt(14, pagamento.getId_aluno());
                Integer resultado = stmt.executeUpdate();

                if (resultado == 0) {
                    throw new PagamentoNaoEncontradoException();
                }
            }

        } finally {
            stmt.close();
        }

    }

    public ArrayList<Pagamento> pesquisarNaoPagoPorMes(String mes) throws SQLException {
        PreparedStatement stmt = null;
        ArrayList<Pagamento> pagamento = new ArrayList<>();
        String sql = "";
        ResultSet rs = null;
        mes = mes.toLowerCase().substring(0, 3);
        try {
            sql += "select id_aluno, nome_alunopag from pagamento";
            sql += " where "
                    + mes+" = '' and "
                    + "id_pagamento is not null";
            stmt = this.conectar.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
               pagamento.add(new Pagamento(rs.getString("nome_alunopag"), "", "", "", "", "", "", "", "", "", "", "", "", rs.getInt("id_aluno")));
            }
        } finally {
            stmt.close();
            rs.close();
        }

        return pagamento;
    }
}
