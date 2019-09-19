/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Fornecedor;
import model.FornecedorWrite;
import dao.FornecedorDAO;
import javax.swing.JOptionPane;
import tablemodel.FornecedorTM;
import java.awt.Color;
/**
 *
 * @author otavio
 */
public class FornecedorView extends javax.swing.JFrame {

            //Gerador chama a class tabela e dá um nome
                public static FornecedorTM Modelo;
            //.........................................
    
    public String modoDep;
    
    public FornecedorView() {
        initComponents();
        
        setLocationRelativeTo(null);
        LoadTable();

        //Modo "Excluir" desativa a maioria dos botões
            modoDep = "Excluir";
        //..........................................
        
        //Chama a função do modoDep
            ManipulaInterfaceDep();
        //.........................
    }
    
    public static int index;
    
            public void LoadTable(){
        //Modelo recebe a criação de tabelas
            Modelo = new FornecedorTM(FornecedorDAO.fornecedor());
        //..................................
        
        //Seta o conteúdo de modelo na tabela local
            jTabela.setModel(Modelo);
        //.........................................
        
        //Define as larguras de cada posição
        jTabela.getColumnModel().getColumn(0).setPreferredWidth(140);
        jTabela.getColumnModel().getColumn(1).setPreferredWidth(120);
        jTabela.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTabela.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTabela.getColumnModel().getColumn(4).setPreferredWidth(130);
        jTabela.getColumnModel().getColumn(5).setPreferredWidth(100);
        jTabela.getColumnModel().getColumn(6).setPreferredWidth(130);
        jTabela.getColumnModel().getColumn(7).setPreferredWidth(170);
        //..................................
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCnpj = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jRua = new javax.swing.JTextField();
        jFone = new javax.swing.JFormattedTextField();
        jCelular = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCep = new javax.swing.JFormattedTextField();
        jNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBairro = new javax.swing.JTextField();
        jNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDescricao = new javax.swing.JTextField();
        jCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jEstado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jbNovo = new javax.swing.JButton();
        jSalvar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jExcluir = new javax.swing.JButton();
        jCLinha = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("FIXO");

        jLabel6.setText("NÚMERO");

        try {
            jCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCnpjActionPerformed(evt);
            }
        });

        jLabel13.setText("RUA");

        try {
            jFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFoneActionPerformed(evt);
            }
        });

        try {
            jCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCelularActionPerformed(evt);
            }
        });

        jLabel7.setText("CELULAR");

        jLabel8.setText("CEP");

        jLabel9.setText("E-MAIL");

        try {
            jCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCepActionPerformed(evt);
            }
        });

        jNome.setToolTipText("");
        jNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 204, 255));
        jLabel1.setFont(new java.awt.Font("Quartz", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(73, 188, 227));
        jLabel1.setText("Cadastro de fornecedor");

        jBairro.setToolTipText("");

        jNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumeroActionPerformed(evt);
            }
        });

        jLabel10.setText("BAIRRO");
        jLabel10.setToolTipText("");

        jDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDescricaoActionPerformed(evt);
            }
        });

        jCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCidadeActionPerformed(evt);
            }
        });

        jLabel11.setText("DESCRIÇÃO");

        jLabel2.setText("NOME");
        jLabel2.setToolTipText("");

        jLabel12.setText("ESTADO");

        jLabel3.setText("CNPJ");

        jLabel4.setText("CIDADE");

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CNPJ", "E-MAIL", "Fixo", "Idade", "Número", "Celular", "CEP", "Bairro", "Estado", "Cidade", "Rua"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTabelaMouseReleased(evt);
            }
        });
        jTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTabelaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTabela);

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/document-add.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/input-checked-outline.png"))); // NOI18N
        jSalvar.setText("Salvar alterações");
        jSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarActionPerformed(evt);
            }
        });

        jbCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group.png"))); // NOI18N
        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/th-list-outline.png"))); // NOI18N
        jExcluir.setText("Limpar tabela");
        jExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirActionPerformed(evt);
            }
        });

        jCLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user-delete-outline.png"))); // NOI18N
        jCLinha.setText("Limpar linha");
        jCLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCLinhaActionPerformed(evt);
            }
        });

        jbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trash.png"))); // NOI18N
        jbLimpar.setText("Limpar campos");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/business-card.png"))); // NOI18N
        jEdit.setText("Editar");
        jEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(jFone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(jEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(jCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(jNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(jDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(jEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(jCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(jCep, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(jRua, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))))
                        .addGap(2, 2, 2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel11, jLabel2, jLabel3, jLabel5, jLabel6, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel12, jLabel13, jLabel4, jLabel7, jLabel8});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jExcluir)
                    .addComponent(jCLinha)
                    .addComponent(jSalvar)
                    .addComponent(jEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBairro, jCelular, jCep, jCidade, jCnpj, jDescricao, jEmail, jEstado, jFone, jNome, jNumero, jRua});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jCLinha, jEdit, jExcluir, jSalvar, jbCadastrar, jbLimpar, jbNovo});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel12, jLabel13, jLabel4, jLabel7, jLabel8});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel11, jLabel2, jLabel3, jLabel5, jLabel6, jLabel9});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

            public void ManipulaInterfaceDep() {
        switch (modoDep) {

            case "Novo":
                jbCadastrar.setEnabled(true);
                jbLimpar.setEnabled(true);
                jCLinha.setEnabled(false);
                jNome.setEnabled(true);
                jCnpj.setEnabled(true);
                jFone.setEnabled(true);
                jNumero.setEnabled(true);
                jCidade.setEnabled(true);
                jCelular.setEnabled(true);
                jEmail.setEnabled(true);
                jCep.setEnabled(true);
                jEstado.setEnabled(true);
                jBairro.setEnabled(true);
                jDescricao.setEnabled(true);
                jbNovo.setEnabled(false);
                jExcluir.setEnabled(false);
                jSalvar.setEnabled(false);
                jEdit.setEnabled(false);
                jRua.setEnabled(true);
                break;

            case "Editar":
                jbCadastrar.setEnabled(false);
                jbLimpar.setEnabled(true);
                jNome.setEnabled(true);
                jCnpj.setEnabled(true);
                jFone.setEnabled(true);
                jNumero.setEnabled(true);
                jCidade.setEnabled(true);
                jCelular.setEnabled(true);
                jEmail.setEnabled(true);
                jCep.setEnabled(true);
                jEstado.setEnabled(true);
                jBairro.setEnabled(true);
                jDescricao.setEnabled(true);
                jEdit.setEnabled(false);
                jbNovo.setEnabled(false);
                jCLinha.setEnabled(false);
                jExcluir.setEnabled(false);
                jSalvar.setEnabled(true);
                jRua.setEnabled(true);
                break;

            case "Excluir":
                jbNovo.setEnabled(true);
                jbCadastrar.setEnabled(false);
                jbLimpar.setEnabled(false);
                jCLinha.setEnabled(false);
                jNome.setEnabled(false);
                jCnpj.setEnabled(false);
                jFone.setEnabled(false);
                jNumero.setEnabled(false);
                jCidade.setEnabled(false);
                jCelular.setEnabled(false);
                jEmail.setEnabled(false);
                jCep.setEnabled(false);
                jEstado.setEnabled(false);
                jBairro.setEnabled(false);
                jDescricao.setEnabled(false);
                jExcluir.setEnabled(false);
                jSalvar.setEnabled(false);
                jEdit.setEnabled(false);
                jRua.setEnabled(false);
                break;

            case "Selecao":
                jbCadastrar.setEnabled(false);
                jbLimpar.setEnabled(false);
                jbNovo.setEnabled(true);
                jNome.setEnabled(false);
                jCnpj.setEnabled(false);
                jFone.setEnabled(false);
                jNumero.setEnabled(false);
                jCidade.setEnabled(false);
                jCelular.setEnabled(false);
                jEmail.setEnabled(false);
                jCep.setEnabled(false);
                jEstado.setEnabled(false);
                jBairro.setEnabled(false);
                jDescricao.setEnabled(false);
                jExcluir.setEnabled(true);
                jSalvar.setEnabled(false);
                jCLinha.setEnabled(true);
                jEdit.setEnabled(true);      
                jRua.setEnabled(false);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Modo inválido");
        }
    }
    private void jCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCnpjActionPerformed

    private void jFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFoneActionPerformed

    private void jCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCelularActionPerformed

    private void jCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCepActionPerformed

    private void jNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeActionPerformed

    private void jNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNumeroActionPerformed

    private void jDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDescricaoActionPerformed

    private void jCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCidadeActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limpar();
        modoDep = "Novo";
        ManipulaInterfaceDep();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarActionPerformed
        LogicView();
        salvar();
        FornecedorDAO.atualiza(Fornecedor.v[0], Fornecedor.v[1], Fornecedor.v[2], Fornecedor.v[3], Fornecedor.v[4], Fornecedor.v[5], Fornecedor.v[6], Fornecedor.v[7], Fornecedor.v[8], Fornecedor.v[9], Fornecedor.v[10], Fornecedor.v[11]);
    }//GEN-LAST:event_jSalvarActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        
        LogicView();
        if (jNome.getText().isEmpty() || jCnpj.getText().equals("  .   .   /    -  ")) {
            JOptionPane.showMessageDialog(null, "Nome ou CNPJ não inserido.", "Não é possível cadastrar", JOptionPane.ERROR_MESSAGE);
        } else {

        modoDep = "Excluir";
        ManipulaInterfaceDep();    
        
        FornecedorDAO.insere(Fornecedor.v[0], Fornecedor.v[1], Fornecedor.v[2], Fornecedor.v[3], Fornecedor.v[4], Fornecedor.v[5], Fornecedor.v[6], Fornecedor.v[7], Fornecedor.v[8], Fornecedor.v[9], Fornecedor.v[10], Fornecedor.v[11]);        
        LoadTable();
        limpar();
        }
        
    }//GEN-LAST:event_jbCadastrarActionPerformed
   
    public void LogicView(){
            Fornecedor.v[0] = jNome.getText();
            Fornecedor.v[1] = jCnpj.getText();
            Fornecedor.v[2] = jEmail.getText();
            Fornecedor.v[3] = jFone.getText();
            Fornecedor.v[4] = jNumero.getText();
            Fornecedor.v[5] = jDescricao.getText();
            Fornecedor.v[6] = jCelular.getText();
            Fornecedor.v[7] = jCep.getText();
            Fornecedor.v[8] = jBairro.getText();
            Fornecedor.v[9] = jEstado.getText();
            Fornecedor.v[10] = jCidade.getText();
            Fornecedor.v[11] = jRua.getText();
    }
    
    private void jExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirActionPerformed
        
        Modelo.limpar();

        while (FornecedorWrite.produtos.size() > 0) {
            FornecedorWrite.produtos.clear();
        }
        
        limpar();
        
        jEdit.setEnabled(false);
        jExcluir.setEnabled(false);
        jCLinha.setEnabled(false);

        jEdit.setEnabled(false);
        jExcluir.setEnabled(false);
        jCLinha.setEnabled(false);
        
        FornecedorDAO.cleartable();
    }//GEN-LAST:event_jExcluirActionPerformed

    
            public void eventTable(){
        
        if(BackGround != Color.ORANGE && BackGround != Color.CYAN){
            jTabela.setSelectionBackground(BackGround);
        }else{
            BackGround = jTabela.getSelectionBackground();
        } 
        
            int aux = jTabela.getSelectedRow();
            if (aux >= 0 && aux < Modelo.getRowCount()) {
                
                Fornecedor D = Modelo.getFornecedor(aux);

                jNome.setText(D.nome);
                jCnpj.setText(D.cnpj);
                jEmail.setText(D.email);
                jFone.setText(D.fone);
                jNumero.setText(D.numero);
                jDescricao.setText(D.descricao);
                jCelular.setText(D.fonec);
                jCep.setText(D.cep);
                jBairro.setText(D.bairro);
                jEstado.setText(D.estado);
                jCidade.setText(D.cidade);
                jRua.setText(D.rua);
                
                modoDep = "Selecao";
                ManipulaInterfaceDep();
            }

    }        
    
    
    Color BackGround = Color.CYAN.CYAN;
    
        public void salvar(){
        
        if (jNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome não inserido.", "Não é possível cadastrar", JOptionPane.ERROR_MESSAGE);
        } else if (control.Valida.testa == false){
            
            index = jTabela.getSelectedRow(); 
            
            LogicView();
            FornecedorWrite.salvar();
            
            modoDep = "Excluir";
            ManipulaInterfaceDep();
            limpar();
        }
        control.Valida.testa = false;
    }
    
    private void jCLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCLinhaActionPerformed
        jExcluir.setEnabled(false);
        jCLinha.setEnabled(false);
        jEdit.setEnabled(false);
        
        index = jTabela.getSelectedRow();
        FornecedorDAO.clearRow();
        
        Modelo.remove(index);
        FornecedorWrite.produtos.remove(index);
        limpar();      
        
    }//GEN-LAST:event_jCLinhaActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

         public void limpar() {
                jNome.setText("");
                jCnpj.setText("");
                jEmail.setText("");
                jFone.setText("");
                jNumero.setText("");
                jDescricao.setText("");
                jCelular.setText("");
                jCep.setText("");
                jBairro.setText("");
                jEstado.setText("");
                jCidade.setText("");
                jRua.setText("");
    }
    
    private void jEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditActionPerformed

        modoDep = "Editar";
        ManipulaInterfaceDep();
        jTabela.setSelectionBackground(java.awt.Color.ORANGE);
        
        modoDep = "Editar";
        ManipulaInterfaceDep();
    }//GEN-LAST:event_jEditActionPerformed

    private void jTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaMouseClicked
        eventTable();
    }//GEN-LAST:event_jTabelaMouseClicked

    private void jTabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabelaKeyReleased
        eventTable();
    }//GEN-LAST:event_jTabelaKeyReleased

    private void jTabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaMouseReleased
        eventTable();
    }//GEN-LAST:event_jTabelaMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FornecedorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jBairro;
    private javax.swing.JButton jCLinha;
    private javax.swing.JFormattedTextField jCelular;
    private javax.swing.JFormattedTextField jCep;
    private javax.swing.JTextField jCidade;
    private javax.swing.JFormattedTextField jCnpj;
    private javax.swing.JTextField jDescricao;
    private javax.swing.JButton jEdit;
    private javax.swing.JTextField jEmail;
    private javax.swing.JTextField jEstado;
    private javax.swing.JButton jExcluir;
    private javax.swing.JFormattedTextField jFone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNome;
    private javax.swing.JTextField jNumero;
    private javax.swing.JTextField jRua;
    private javax.swing.JButton jSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbNovo;
    // End of variables declaration//GEN-END:variables
}
