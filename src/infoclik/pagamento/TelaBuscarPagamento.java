/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoclik.pagamento;

import infoclik.fachada.Fachada;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Cledson
 */
public class TelaBuscarPagamento extends javax.swing.JFrame {
public JFrame frmProcurarAluno;
    /**
     * Creates new form TelaCadastropagamento
     */
    public TelaBuscarPagamento() {
        initComponents();
    }
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaBuscarPagamento frame = new TelaBuscarPagamento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelOut1 = new javax.swing.JLabel();
        jTextFieldOut1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelMar = new javax.swing.JLabel();
        jTextFieldMar = new javax.swing.JTextField();
        jLabelAbr = new javax.swing.JLabel();
        jTextFieldAbr = new javax.swing.JTextField();
        jLabelMai = new javax.swing.JLabel();
        jTextFieldMai = new javax.swing.JTextField();
        jLabelJun = new javax.swing.JLabel();
        jTextFieldJun = new javax.swing.JTextField();
        jLabelJul = new javax.swing.JLabel();
        jTextFieldJul = new javax.swing.JTextField();
        jLabelAgosto = new javax.swing.JLabel();
        jTextFieldAgosto = new javax.swing.JTextField();
        jLabelSet = new javax.swing.JLabel();
        jTextFieldset = new javax.swing.JTextField();
        jLabelOut = new javax.swing.JLabel();
        jTextFieldOut = new javax.swing.JTextField();
        jLabelNov = new javax.swing.JLabel();
        jTextFieldNov = new javax.swing.JTextField();
        jLabelDez = new javax.swing.JLabel();
        jTextFieldDez = new javax.swing.JTextField();
        jLabelJan = new javax.swing.JLabel();
        jTextFieldJan = new javax.swing.JTextField();
        jLabelFev = new javax.swing.JLabel();
        jTextFieldFev = new javax.swing.JTextField();
        jLabelId_aluno = new javax.swing.JLabel();
        jTextFieldId_aluno = new javax.swing.JTextField();
        jButtonSair = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabelOut1.setText("Outubro:");

        jLabel9.setText("X");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Procurar Pagamento por nome");

        jLabelNome.setText("Nome:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelMar.setText("Março:");

        jLabelAbr.setText("Abril:");

        jLabelMai.setText("Maio:");

        jLabelJun.setText("Junho:");

        jLabelJul.setText("Julho:");

        jLabelAgosto.setText("Agosto:");

        jLabelSet.setText("Setembro:");

        jLabelOut.setText("Outubro:");

        jLabelNov.setText("Novembro:");

        jLabelDez.setText("Dezembro:");

        jLabelJan.setText("Janeiro:");

        jLabelFev.setText("Fevereiro");

        jLabelId_aluno.setText("Código do aluno:");

        jTextFieldId_aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldId_alunoActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelId_aluno)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldId_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldJul, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNov)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldNov, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelMar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldMar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAgosto)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabelDez)
                                                        .addGap(12, 12, 12)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jTextFieldAgosto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextFieldDez, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabelAbr)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldAbr, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelSet)
                                                    .addComponent(jLabelJan)
                                                    .addComponent(jLabelMai)))
                                            .addComponent(jButtonAtualizar, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jTextFieldJan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabelFev)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTextFieldFev, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jTextFieldset, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextFieldMai, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabelJun)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabelOut)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jTextFieldJun, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(jTextFieldOut, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonSair))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabelJul)))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJun)
                    .addComponent(jTextFieldJun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMai)
                    .addComponent(jTextFieldAbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAbr)
                    .addComponent(jTextFieldMar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelJul)
                    .addComponent(jTextFieldJul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAgosto)
                    .addComponent(jTextFieldAgosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSet)
                    .addComponent(jTextFieldset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelOut)
                    .addComponent(jTextFieldOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDez, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldJan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelJan)
                    .addComponent(jLabelNov)
                    .addComponent(jTextFieldNov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDez)
                    .addComponent(jLabelFev)
                    .addComponent(jTextFieldFev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId_aluno)
                    .addComponent(jTextFieldId_aluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldId_alunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldId_alunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldId_alunoActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
               try{
					String nome = jTextFieldNome.getText();
					Fachada fachada = Fachada.getInstance();
					Pagamento pagamento = fachada.pagamentoProcurar(nome);
					
                                        
                                       
                                        pagamento.setNome(jTextFieldNome.getText());
                                        pagamento.setMar(jTextFieldMar.getText());
                                        pagamento.setAbr(jTextFieldAbr.getText());
                                        pagamento.setMai(jTextFieldMai.getText());
                                        pagamento.setJun(jTextFieldJun.getText());
                                        pagamento.setJul(jTextFieldJul.getText());
                                        pagamento.setAgo(jTextFieldAgosto.getText());
                                        pagamento.setSet(jTextFieldset.getText());
                                        pagamento.setOut(jTextFieldOut.getText());
                                        pagamento.setNov(jTextFieldNov.getText());
                                        pagamento.setDez(jTextFieldDez.getText());
                                        pagamento.setJan(jTextFieldJan.getText());
                                        pagamento.setFev(jTextFieldFev.getText());
                                       
                 
					fachada.pagamentoAtualizar(pagamento);
					
				} catch (PagamentoNaoEncontradoException e1){
					JOptionPane.showMessageDialog(frmProcurarAluno, e1.getMessage(), " ERRO ", JOptionPane.ERROR_MESSAGE);
				} catch (infoclik.aluno.CampoObrigatorioException e1) {
					JOptionPane.showMessageDialog(frmProcurarAluno, e1.getMessage(), " ERRO " , JOptionPane.ERROR_MESSAGE);
				
				}catch (Exception e1){
					JOptionPane.showMessageDialog(frmProcurarAluno, e1.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
				} 

    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
          String nome = jTextFieldNome.getText();
				try {
					
					Fachada.getInstance().pagamentoProcurar(nome);
					Fachada fachada = Fachada.getInstance();
					Pagamento temp = fachada.pagamentoProcurar(nome);
                                        
                                        
                                        jTextFieldNome.setText(temp.getNome());
                                        jTextFieldMar.setText(temp.getMar());
                                        jTextFieldAbr.setText(temp.getAbr());
                                        jTextFieldMai.setText(temp.getMai());
                                        jTextFieldJun.setText(temp.getJun());
                                        jTextFieldJul.setText(temp.getJul());
                                        jTextFieldAgosto.setText(temp.getAgo());
                                        jTextFieldset.setText(temp.getSet());
                                        jTextFieldOut.setText(temp.getOut());
                                        jTextFieldNov.setText(temp.getNov());
                                        jTextFieldDez.setText(temp.getDez());
                                        jTextFieldJan.setText(temp.getJan());
                                        jTextFieldFev.setText(temp.getFev());
					jTextFieldId_aluno.setText(Integer.toString(temp.getId_aluno()));
					
					
					

				
				} catch (PagamentoNaoEncontradoException e1){
					JOptionPane.showMessageDialog(frmProcurarAluno, e1.getMessage(), " ERRO ", JOptionPane.ERROR_MESSAGE);
				} catch (infoclik.aluno.CampoObrigatorioException e1) {
					JOptionPane.showMessageDialog(frmProcurarAluno, e1.getMessage(), " ERRO " , JOptionPane.ERROR_MESSAGE);
				}catch (Exception e1){
					JOptionPane.showMessageDialog(frmProcurarAluno, e1.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
				} 
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAbr;
    private javax.swing.JLabel jLabelAgosto;
    private javax.swing.JLabel jLabelDez;
    private javax.swing.JLabel jLabelFev;
    private javax.swing.JLabel jLabelId_aluno;
    private javax.swing.JLabel jLabelJan;
    private javax.swing.JLabel jLabelJul;
    private javax.swing.JLabel jLabelJun;
    private javax.swing.JLabel jLabelMai;
    private javax.swing.JLabel jLabelMar;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNov;
    private javax.swing.JLabel jLabelOut;
    private javax.swing.JLabel jLabelOut1;
    private javax.swing.JLabel jLabelSet;
    private javax.swing.JTextField jTextFieldAbr;
    private javax.swing.JTextField jTextFieldAgosto;
    private javax.swing.JTextField jTextFieldDez;
    private javax.swing.JTextField jTextFieldFev;
    private javax.swing.JTextField jTextFieldId_aluno;
    private javax.swing.JTextField jTextFieldJan;
    private javax.swing.JTextField jTextFieldJul;
    private javax.swing.JTextField jTextFieldJun;
    private javax.swing.JTextField jTextFieldMai;
    private javax.swing.JTextField jTextFieldMar;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNov;
    private javax.swing.JTextField jTextFieldOut;
    private javax.swing.JTextField jTextFieldOut1;
    private javax.swing.JTextField jTextFieldset;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        jTextFieldNome.setText("");
 jTextFieldMar.setText("");
 jTextFieldAbr.setText("");
 jTextFieldMai.setText("");
 jTextFieldJun.setText("");
 jTextFieldJul.setText("");
 jTextFieldAgosto.setText("");
jTextFieldset.setText("");
jTextFieldOut.setText("");
jTextFieldNov.setText("");
jTextFieldDez.setText("");
jTextFieldJan.setText("");
jTextFieldFev.setText("");
jTextFieldId_aluno.setText("");        

    }
}

