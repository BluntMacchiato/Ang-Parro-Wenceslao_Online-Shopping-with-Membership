/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import javax.swing.JOptionPane;
import ph.edu.dlsu.datasal.parro.mylinkedlist.MyLinkedList;

/**
 *
 * @author renzl
 */
public class Panel2 extends javax.swing.JPanel {
    Panel3 p3;
    /**
     * Creates new form Panel2
     */
    public Panel2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gopro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        computer = new javax.swing.JLabel();
        keyboard = new javax.swing.JLabel();
        webcam = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        scanner = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        playstation = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        usb = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        speaker = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_shoppingcart = new java.awt.TextArea();

        setBackground(new java.awt.Color(14, 7, 252));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 685));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        gopro.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\resizedImages\\goPro5.jpg")); // NOI18N
        gopro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goproMouseClicked(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Shopping Cart");

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        jLabel2.setText("ELECTRONICS");

        computer.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\resizedImages\\hpComputer.jpg")); // NOI18N
        computer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                computerMouseClicked(evt);
            }
        });

        keyboard.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\resizedImages\\keyboard.jpg")); // NOI18N
        keyboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keyboardMouseClicked(evt);
            }
        });

        webcam.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\resizedImages\\networkCamera.jpg")); // NOI18N
        webcam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                webcamMouseClicked(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("GoPro Hero5 Session");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HP Pavilion 550-033d");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Logitech Wireless Desktop MK250");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("D-Link DCS-1130L");

        scanner.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\resizedImages\\scanner.jpg")); // NOI18N

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Canon Lide 220 CanoScan");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("₱16,450.00");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("₱49,950.00");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("₱1,250.00");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("₱3,410.00");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("₱4,620.00");

        playstation.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\Sony Playstation 4.jpg")); // NOI18N

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Sony Playstation 4");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("₱14,990.00");

        usb.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\SanDisk SDIX-128G-P57 iXpand.jpg")); // NOI18N

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("SanDisk SDIX-128G-P57 iXpand");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("₱5,480.00");

        speaker.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\Logitech G51 5.1 Channel Speakers.jpg")); // NOI18N

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Logitech G51 5.1 Channel Speakers");

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("₱8,990.00");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\clear.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\clear.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\clear.png")); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\clear.png")); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\clear.png")); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\clear.png")); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\clear.png")); // NOI18N

        jLabel26.setIcon(new javax.swing.ImageIcon("C:\\Users\\renzl\\Desktop\\clear.png")); // NOI18N

        txt_shoppingcart.setBackground(new java.awt.Color(14, 7, 252));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel16))
                .addGap(176, 176, 176)
                .addComponent(jLabel19)
                .addGap(191, 191, 191)
                .addComponent(jLabel22)
                .addGap(186, 186, 186)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(106, 106, 106)
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(gopro)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel6)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(97, 97, 97)
                                                .addComponent(jLabel7)
                                                .addGap(88, 88, 88)
                                                .addComponent(jLabel8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(playstation)
                                                        .addGap(98, 98, 98)
                                                        .addComponent(usb))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(computer)
                                                        .addGap(94, 94, 94)
                                                        .addComponent(keyboard))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(66, 66, 66)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel24))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(speaker)
                                            .addComponent(webcam)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addComponent(jLabel5))))
                            .addComponent(scanner)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(jLabel26)
                                .addGap(207, 207, 207)
                                .addComponent(jLabel17)
                                .addGap(195, 195, 195)
                                .addComponent(jLabel23))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel20)))
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(191, 191, 191)
                                .addComponent(jLabel14)
                                .addGap(192, 192, 192)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(txt_shoppingcart, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(computer)
                            .addComponent(gopro)
                            .addComponent(keyboard)
                            .addComponent(webcam))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scanner)
                                    .addComponent(playstation)
                                    .addComponent(usb)
                                    .addComponent(speaker))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel25)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(231, 231, 231))))
                    .addComponent(txt_shoppingcart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel17)
                    .addComponent(jLabel23)
                    .addComponent(jLabel26))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents
    
private MyLinkedList<String> product = new MyLinkedList<String>();    
    
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked

    }//GEN-LAST:event_formMouseClicked

    private void goproMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goproMouseClicked

        product.createList();
        product.add(1, "gopro");
        txt_shoppingcart.append("GoPro Hero5 Session\n");

        JOptionPane.showMessageDialog(null, "GoPro has been added");
    }//GEN-LAST:event_goproMouseClicked

    private void computerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_computerMouseClicked
        product.createList();
        product.add(1, "HP Pavilion");
        txt_shoppingcart.setText("HP Pavilion 550-033d");
       
        JOptionPane.showMessageDialog(null, "HP Pavilion has been added");
    }//GEN-LAST:event_computerMouseClicked

    private void keyboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keyboardMouseClicked
        product.createList();
        product.add(1, "Logitech Wireless Desktop");
        txt_shoppingcart.setText("Logitech Wireless Desktop MK250");
       
        JOptionPane.showMessageDialog(null, "Logitech Desktop has been added");
    }//GEN-LAST:event_keyboardMouseClicked

    private void webcamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_webcamMouseClicked
        product.createList();
        product.add(1, "Logitech Wireless Desktop");
        txt_shoppingcart.setText("Logitech Wireless Desktop MK250");
       
        JOptionPane.showMessageDialog(null, "Logitech Desktop has been added");
    }//GEN-LAST:event_webcamMouseClicked
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel computer;
    private javax.swing.JLabel gopro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel keyboard;
    private javax.swing.JLabel playstation;
    private javax.swing.JLabel scanner;
    private javax.swing.JLabel speaker;
    private java.awt.TextArea txt_shoppingcart;
    private javax.swing.JLabel usb;
    private javax.swing.JLabel webcam;
    // End of variables declaration//GEN-END:variables
}