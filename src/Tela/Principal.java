/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import cod.concatPDFs;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.scenario.effect.Merge;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import cod.concatPDFs;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfStamper;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author alex_
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setIcon();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pdf1 = new javax.swing.JLabel();
        pdf1_Text = new javax.swing.JTextField();
        JUNTAR = new javax.swing.JButton();
        Procurar1 = new javax.swing.JButton();
        pdf2 = new javax.swing.JLabel();
        pdf2_Text = new javax.swing.JTextField();
        Procurar2 = new javax.swing.JButton();
        pdf3 = new javax.swing.JLabel();
        pdf3_Text = new javax.swing.JTextField();
        Procurar3 = new javax.swing.JButton();
        pdf4 = new javax.swing.JLabel();
        pdf4_Text = new javax.swing.JTextField();
        Procurar4 = new javax.swing.JButton();
        pdf5 = new javax.swing.JLabel();
        pdf5_Text = new javax.swing.JTextField();
        Procurar5 = new javax.swing.JButton();
        pdf6 = new javax.swing.JLabel();
        pdf6_Text = new javax.swing.JTextField();
        Procurar6 = new javax.swing.JButton();
        pdf7 = new javax.swing.JLabel();
        pdf7_Text = new javax.swing.JTextField();
        Procurar7 = new javax.swing.JButton();
        pdf8 = new javax.swing.JLabel();
        pdf8_Text = new javax.swing.JTextField();
        Procurar8 = new javax.swing.JButton();
        pdf9 = new javax.swing.JLabel();
        pdf9_Text = new javax.swing.JTextField();
        Procurar9 = new javax.swing.JButton();
        pdf10 = new javax.swing.JLabel();
        pdf10_Text = new javax.swing.JTextField();
        Procurar10 = new javax.swing.JButton();
        saida = new javax.swing.JLabel();
        saida_Text = new javax.swing.JTextField();
        Procurar_Saida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PDF JOIN - V.1.0 - By. Alexandre Nântua");

        pdf1.setText("PDF 1");

        JUNTAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JUNTAR.setText("JUNTAR");
        JUNTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JUNTARActionPerformed(evt);
            }
        });

        Procurar1.setText("PROCURAR");
        Procurar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar1ActionPerformed(evt);
            }
        });

        pdf2.setText("PDF 2");

        Procurar2.setText("PROCURAR");
        Procurar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar2ActionPerformed(evt);
            }
        });

        pdf3.setText("PDF 3");

        Procurar3.setText("PROCURAR");
        Procurar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar3ActionPerformed(evt);
            }
        });

        pdf4.setText("PDF 4");

        Procurar4.setText("PROCURAR");
        Procurar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar4ActionPerformed(evt);
            }
        });

        pdf5.setText("PDF 5");

        Procurar5.setText("PROCURAR");
        Procurar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar5ActionPerformed(evt);
            }
        });

        pdf6.setText("PDF 6");

        Procurar6.setText("PROCURAR");
        Procurar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar6ActionPerformed(evt);
            }
        });

        pdf7.setText("PDF 7");

        Procurar7.setText("PROCURAR");
        Procurar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar7ActionPerformed(evt);
            }
        });

        pdf8.setText("PDF 8");

        Procurar8.setText("PROCURAR");
        Procurar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar8ActionPerformed(evt);
            }
        });

        pdf9.setText("PDF 9");

        Procurar9.setText("PROCURAR");
        Procurar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar9ActionPerformed(evt);
            }
        });

        pdf10.setText("PDF 10");

        Procurar10.setText("PROCURAR");
        Procurar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar10ActionPerformed(evt);
            }
        });

        saida.setText("SAÍDA");

        Procurar_Saida.setText("PROCURAR");
        Procurar_Saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Procurar_SaidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Arquivos de entrada");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Saída");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pdf10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pdf10_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Procurar10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pdf1)
                            .addComponent(pdf2)
                            .addComponent(pdf3)
                            .addComponent(pdf4)
                            .addComponent(pdf5)
                            .addComponent(pdf6)
                            .addComponent(pdf7)
                            .addComponent(pdf8)
                            .addComponent(pdf9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdf1_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Procurar1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdf2_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Procurar2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdf3_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Procurar3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdf4_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Procurar4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdf5_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Procurar5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdf6_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Procurar6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdf7_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Procurar7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdf8_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Procurar8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdf9_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Procurar9))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saida_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Procurar_Saida)
                        .addGap(16, 16, 16)
                        .addComponent(JUNTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf1)
                    .addComponent(pdf1_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Procurar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf2)
                    .addComponent(pdf2_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Procurar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf3)
                    .addComponent(pdf3_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Procurar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf4)
                    .addComponent(pdf4_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Procurar4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf5)
                    .addComponent(pdf5_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Procurar5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf6)
                    .addComponent(pdf6_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Procurar6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf7)
                    .addComponent(pdf7_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Procurar7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf8)
                    .addComponent(pdf8_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Procurar8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf9)
                    .addComponent(pdf9_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Procurar9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdf10)
                    .addComponent(pdf10_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Procurar10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saida)
                    .addComponent(saida_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JUNTAR)
                    .addComponent(Procurar_Saida))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Procurar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar1ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF", "pdf");
        JFileChooser file = new JFileChooser();
        file.setFileFilter(filter);

        int i = file.showOpenDialog(null);
        if (i == 1) {
            pdf1_Text.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            pdf1_Text.setText(arquivo.getPath());
        }

    }//GEN-LAST:event_Procurar1ActionPerformed
    private void JUNTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JUNTARActionPerformed
        try {
            String user = System.getProperty("user.name");
            //System.out.println(user);

            if (saida_Text.getText().isEmpty()) {
                saida_Text.setText("C:/Users/" + user + "/Documents/");
            }

            List<InputStream> pdfs = new ArrayList<InputStream>();
            if (!pdf1_Text.getText().isEmpty()) {
                pdfs.add(new FileInputStream(pdf1_Text.getText()));
            }
            if (!pdf2_Text.getText().isEmpty()) {
                pdfs.add(new FileInputStream(pdf2_Text.getText()));
            }
            if (!pdf3_Text.getText().isEmpty()) {
                pdfs.add(new FileInputStream(pdf3_Text.getText()));
            }
            if (!pdf4_Text.getText().isEmpty()) {
                pdfs.add(new FileInputStream(pdf4_Text.getText()));
            }
            if (!pdf5_Text.getText().isEmpty()) {
                pdfs.add(new FileInputStream(pdf5_Text.getText()));
            }
            if (!pdf6_Text.getText().isEmpty()) {
                pdfs.add(new FileInputStream(pdf6_Text.getText()));
            }
            if (!pdf7_Text.getText().isEmpty()) {
                pdfs.add(new FileInputStream(pdf7_Text.getText()));
            }
            if (!pdf8_Text.getText().isEmpty()) {
                pdfs.add(new FileInputStream(pdf8_Text.getText()));
            }
            if (!pdf9_Text.getText().isEmpty()) {
                pdfs.add(new FileInputStream(pdf9_Text.getText()));
            }
            if (!pdf10_Text.getText().isEmpty()) {
                pdfs.add(new FileInputStream(pdf10_Text.getText()));
            }

            OutputStream output = new FileOutputStream(saida_Text.getText() + "-join.pdf");

            JOptionPane.showMessageDialog(null, "PDF gerado com sucesso em " + saida_Text.getText());

            try {
                Runtime.getRuntime().exec("explorer " + saida_Text.getText());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }

            pdf1_Text.setText("");
            pdf2_Text.setText("");
            pdf3_Text.setText("");
            pdf4_Text.setText("");
            pdf5_Text.setText("");
            pdf6_Text.setText("");
            pdf7_Text.setText("");
            pdf8_Text.setText("");
            pdf9_Text.setText("");
            pdf10_Text.setText("");
            saida_Text.setText("");

            concatPDFs.concatPDFs(pdfs, output, true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_JUNTARActionPerformed

    private void Procurar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar2ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF", "pdf");
        JFileChooser file = new JFileChooser();
        file.setFileFilter(filter);
        int i = file.showOpenDialog(null);
        if (i == 1) {
            pdf2_Text.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            pdf2_Text.setText(arquivo.getPath());
        }
    }//GEN-LAST:event_Procurar2ActionPerformed

    private void Procurar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar3ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF", "pdf");
        JFileChooser file = new JFileChooser();
        file.setFileFilter(filter);
        int i = file.showOpenDialog(null);
        if (i == 1) {
            pdf3_Text.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            pdf3_Text.setText(arquivo.getPath());
        }
    }//GEN-LAST:event_Procurar3ActionPerformed

    private void Procurar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar4ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF", "pdf");
        JFileChooser file = new JFileChooser();
        file.setFileFilter(filter);
        int i = file.showOpenDialog(null);
        if (i == 1) {
            pdf4_Text.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            pdf4_Text.setText(arquivo.getPath());
        }
    }//GEN-LAST:event_Procurar4ActionPerformed

    private void Procurar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar5ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF", "pdf");
        JFileChooser file = new JFileChooser();
        file.setFileFilter(filter);
        int i = file.showOpenDialog(null);
        if (i == 1) {
            pdf5_Text.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            pdf5_Text.setText(arquivo.getPath());
        }
    }//GEN-LAST:event_Procurar5ActionPerformed

    private void Procurar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar6ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF", "pdf");
        JFileChooser file = new JFileChooser();
        file.setFileFilter(filter);
        int i = file.showOpenDialog(null);
        if (i == 1) {
            pdf6_Text.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            pdf6_Text.setText(arquivo.getPath());
        }
    }//GEN-LAST:event_Procurar6ActionPerformed

    private void Procurar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar7ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF", "pdf");
        JFileChooser file = new JFileChooser();
        file.setFileFilter(filter);
        int i = file.showOpenDialog(null);
        if (i == 1) {
            pdf7_Text.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            pdf7_Text.setText(arquivo.getPath());
        }
    }//GEN-LAST:event_Procurar7ActionPerformed

    private void Procurar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar8ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF", "pdf");
        JFileChooser file = new JFileChooser();
        file.setFileFilter(filter);
        int i = file.showOpenDialog(null);
        if (i == 1) {
            pdf8_Text.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            pdf8_Text.setText(arquivo.getPath());
        }
    }//GEN-LAST:event_Procurar8ActionPerformed

    private void Procurar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar9ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF", "pdf");
        JFileChooser file = new JFileChooser();
        file.setFileFilter(filter);
        int i = file.showOpenDialog(null);
        if (i == 1) {
            pdf9_Text.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            pdf9_Text.setText(arquivo.getPath());
        }
    }//GEN-LAST:event_Procurar9ActionPerformed

    private void Procurar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar10ActionPerformed
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF", "pdf");
        JFileChooser file = new JFileChooser();
        file.setFileFilter(filter);
        int i = file.showOpenDialog(null);
        if (i == 1) {
            pdf10_Text.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            pdf10_Text.setText(arquivo.getPath());
        }
    }//GEN-LAST:event_Procurar10ActionPerformed

    private void Procurar_SaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Procurar_SaidaActionPerformed
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int i = file.showSaveDialog(null);

        if (i == 1) {
            saida_Text.setText("");
        } else {
            File arquivo = file.getSelectedFile();
            saida_Text.setText(arquivo.getPath());
        }
    }//GEN-LAST:event_Procurar_SaidaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JUNTAR;
    private javax.swing.JButton Procurar1;
    private javax.swing.JButton Procurar10;
    private javax.swing.JButton Procurar2;
    private javax.swing.JButton Procurar3;
    private javax.swing.JButton Procurar4;
    private javax.swing.JButton Procurar5;
    private javax.swing.JButton Procurar6;
    private javax.swing.JButton Procurar7;
    private javax.swing.JButton Procurar8;
    private javax.swing.JButton Procurar9;
    private javax.swing.JButton Procurar_Saida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel pdf1;
    private javax.swing.JLabel pdf10;
    private javax.swing.JTextField pdf10_Text;
    private javax.swing.JTextField pdf1_Text;
    private javax.swing.JLabel pdf2;
    private javax.swing.JTextField pdf2_Text;
    private javax.swing.JLabel pdf3;
    private javax.swing.JTextField pdf3_Text;
    private javax.swing.JLabel pdf4;
    private javax.swing.JTextField pdf4_Text;
    private javax.swing.JLabel pdf5;
    private javax.swing.JTextField pdf5_Text;
    private javax.swing.JLabel pdf6;
    private javax.swing.JTextField pdf6_Text;
    private javax.swing.JLabel pdf7;
    private javax.swing.JTextField pdf7_Text;
    private javax.swing.JLabel pdf8;
    private javax.swing.JTextField pdf8_Text;
    private javax.swing.JLabel pdf9;
    private javax.swing.JTextField pdf9_Text;
    private javax.swing.JLabel saida;
    private javax.swing.JTextField saida_Text;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("pdf.png")));
    }
}
