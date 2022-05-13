/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;
import Controle.ControlaUsuario;
import entidade.Usuario;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPCompleta = new javax.swing.JPanel();
        jPCentral = new javax.swing.JPanel();
        jPCentralInferior = new javax.swing.JPanel();
        jLNome = new javax.swing.JLabel();
        jLSenha = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jPSenha = new javax.swing.JPasswordField();
        jBCriarCadastro = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jPCentralSuperior = new javax.swing.JPanel();
        jBLogin = new javax.swing.JButton();
        jPSenhaL = new javax.swing.JPasswordField();
        jtfUsuario = new javax.swing.JTextField();
        jLUsuario = new javax.swing.JLabel();
        jLSenhaL = new javax.swing.JLabel();
        jPInferior = new javax.swing.JPanel();
        jPEsquerda = new javax.swing.JPanel();
        jPDireita = new javax.swing.JPanel();
        jPSuperior = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPCompleta.setLayout(new java.awt.BorderLayout());

        jPCentral.setLayout(new java.awt.BorderLayout());

        jPCentralInferior.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 91, 147), 1, true), "Novo por aqui? Cadastre-se:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(33, 91, 147))); // NOI18N
        jPCentralInferior.setPreferredSize(new java.awt.Dimension(391, 180));

        jLNome.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLNome.setText("Insira seu nome:");

        jLSenha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLSenha.setText("Crie sua senha:");

        jBCriarCadastro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jBCriarCadastro.setText("Criar meu cadastro");
        jBCriarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCriarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCriarCadastroActionPerformed(evt);
            }
        });

        jBCancelar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPCentralInferiorLayout = new javax.swing.GroupLayout(jPCentralInferior);
        jPCentralInferior.setLayout(jPCentralInferiorLayout);
        jPCentralInferiorLayout.setHorizontalGroup(
            jPCentralInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCentralInferiorLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPCentralInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLSenha)
                    .addComponent(jLNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCentralInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCentralInferiorLayout.createSequentialGroup()
                        .addComponent(jBCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jBCriarCadastro))
                    .addComponent(jtfNome)
                    .addComponent(jPSenha))
                .addContainerGap())
        );
        jPCentralInferiorLayout.setVerticalGroup(
            jPCentralInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCentralInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPCentralInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPCentralInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenha)
                    .addComponent(jPSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPCentralInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCriarCadastro)
                    .addComponent(jBCancelar))
                .addContainerGap())
        );

        jPCentral.add(jPCentralInferior, java.awt.BorderLayout.SOUTH);

        jPCentralSuperior.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 91, 147), 1, true), "Já tem cadastro? Insira os dados acesse:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(33, 91, 147))); // NOI18N
        jPCentralSuperior.setPreferredSize(new java.awt.Dimension(300, 180));

        jBLogin.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jBLogin.setText("Login");
        jBLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBLogin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jBLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });

        jPSenhaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPSenhaLActionPerformed(evt);
            }
        });

        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });

        jLUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLUsuario.setText("Usuário: ");

        jLSenhaL.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLSenhaL.setText("Senha: ");

        javax.swing.GroupLayout jPCentralSuperiorLayout = new javax.swing.GroupLayout(jPCentralSuperior);
        jPCentralSuperior.setLayout(jPCentralSuperiorLayout);
        jPCentralSuperiorLayout.setHorizontalGroup(
            jPCentralSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCentralSuperiorLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPCentralSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBLogin)
                    .addGroup(jPCentralSuperiorLayout.createSequentialGroup()
                        .addGroup(jPCentralSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLUsuario)
                            .addComponent(jLSenhaL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPCentralSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfUsuario)
                            .addComponent(jPSenhaL, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPCentralSuperiorLayout.setVerticalGroup(
            jPCentralSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCentralSuperiorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPCentralSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuario)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPCentralSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSenhaL)
                    .addComponent(jPSenhaL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBLogin)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPCentral.add(jPCentralSuperior, java.awt.BorderLayout.CENTER);

        jPCompleta.add(jPCentral, java.awt.BorderLayout.CENTER);

        jPInferior.setPreferredSize(new java.awt.Dimension(20, 20));
        jPInferior.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPInferiorLayout = new javax.swing.GroupLayout(jPInferior);
        jPInferior.setLayout(jPInferiorLayout);
        jPInferiorLayout.setHorizontalGroup(
            jPInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );
        jPInferiorLayout.setVerticalGroup(
            jPInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPCompleta.add(jPInferior, java.awt.BorderLayout.SOUTH);

        jPEsquerda.setPreferredSize(new java.awt.Dimension(30, 314));

        javax.swing.GroupLayout jPEsquerdaLayout = new javax.swing.GroupLayout(jPEsquerda);
        jPEsquerda.setLayout(jPEsquerdaLayout);
        jPEsquerdaLayout.setHorizontalGroup(
            jPEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPEsquerdaLayout.setVerticalGroup(
            jPEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        jPCompleta.add(jPEsquerda, java.awt.BorderLayout.WEST);

        jPDireita.setPreferredSize(new java.awt.Dimension(30, 314));

        javax.swing.GroupLayout jPDireitaLayout = new javax.swing.GroupLayout(jPDireita);
        jPDireita.setLayout(jPDireitaLayout);
        jPDireitaLayout.setHorizontalGroup(
            jPDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPDireitaLayout.setVerticalGroup(
            jPDireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        jPCompleta.add(jPDireita, java.awt.BorderLayout.EAST);

        jPSuperior.setLayout(new java.awt.BorderLayout());

        jLTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(33, 91, 147));
        jLTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTitulo.setText("Dicionário de termos de Gestão");
        jLTitulo.setPreferredSize(new java.awt.Dimension(335, 45));
        jPSuperior.add(jLTitulo, java.awt.BorderLayout.CENTER);

        jPCompleta.add(jPSuperior, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPCompleta, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jPSenhaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPSenhaLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPSenhaLActionPerformed

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
        ControlaUsuario usr = new ControlaUsuario();
        boolean acesso = false;
        acesso = usr.logar(jtfUsuario.getText(), jPSenhaL.getText());
        if(jtfUsuario.getText().isEmpty() || jPSenhaL.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
        jtfUsuario.setText("");
            jPSenhaL.setText("");
        }
        else if (acesso) {
            TelaPrincipal telaP = new TelaPrincipal();
            telaP.setVisible(true);
            this.dispose();
            jtfUsuario.setText("");
            jPSenhaL.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.");
            jtfUsuario.setText("");
            jPSenhaL.setText("");
        }
    }//GEN-LAST:event_jBLoginActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBCriarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCriarCadastroActionPerformed

        Usuario urs = new Usuario();      
        ControlaUsuario ctlUsr = new ControlaUsuario();

        if ((jtfNome.getText().isEmpty()) || (jPSenha.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
            jtfNome.requestFocus();
            return;
        }
        String nomeCadastro = jtfNome.getText();
        String senhaCadastro = jPSenha.getText();
        boolean conteudo = ctlUsr.testaExistencia(nomeCadastro);
        if (conteudo) {
            JOptionPane.showMessageDialog(null, "Usuário já cadastrado!");
            jtfNome.setText("");
            jPSenha.setText("");
            jtfNome.requestFocus();
            return;
        }

        urs.setNome(jtfNome.getText());
        urs.setSenha(jPSenha.getText());

        if (ctlUsr.salvar(urs, true)) { 
            JOptionPane.showMessageDialog(null, "Registro adicionado com SUCESSO ao arquivo!");

            Object rowData[] = new Object[3];
            rowData[1] = jtfNome.getText();
            rowData[2] = jPSenha.getText();

            jtfNome.setText("");
            jPSenha.setText("");

            jtfNome.requestFocus();
        } else {
            JOptionPane.showMessageDialog(null, "Erro, problemas ao SALVAR em arquivo!");
        }
    }//GEN-LAST:event_jBCriarCadastroActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBCriarCadastro;
    private javax.swing.JButton jBLogin;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLSenhaL;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPanel jPCentral;
    private javax.swing.JPanel jPCentralInferior;
    private javax.swing.JPanel jPCentralSuperior;
    private javax.swing.JPanel jPCompleta;
    private javax.swing.JPanel jPDireita;
    private javax.swing.JPanel jPEsquerda;
    private javax.swing.JPanel jPInferior;
    private javax.swing.JPasswordField jPSenha;
    private javax.swing.JPasswordField jPSenhaL;
    private javax.swing.JPanel jPSuperior;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
