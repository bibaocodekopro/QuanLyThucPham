/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BUS.SanPham_BUS;
import DTO.SanPham_DTO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author blemb
 */
public class Main_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Main_Menu
     */
    Color DefaultColor, ClickedColor;
    public Main_Menu() {
        initComponents();
       
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(1200, 580));
        
        DefaultColor = new Color(0,0,0);
        ClickedColor = new Color(13,36,52);
        
        pnl_khuyenmai.setBackground(DefaultColor);
        pnl_banhang.setBackground(DefaultColor);
        pnl_nhaphang.setBackground(DefaultColor);
        pnl_sanpham.setBackground(DefaultColor);
        pnl_thanhvien.setBackground(DefaultColor);
        pnl_thongke.setBackground(DefaultColor);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnl_khuyenmai = new javax.swing.JPanel();
        lb_khuyenmai = new javax.swing.JLabel();
        pnl_sanpham = new javax.swing.JPanel();
        lb_sanpham = new javax.swing.JLabel();
        pnl_banhang = new javax.swing.JPanel();
        lb_banhang = new javax.swing.JLabel();
        pnl_thongke = new javax.swing.JPanel();
        lb_thongke = new javax.swing.JLabel();
        pnl_nhaphang = new javax.swing.JPanel();
        lb_nhaphang = new javax.swing.JLabel();
        pnl_thanhvien = new javax.swing.JPanel();
        lb_thanhvien = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_close = new javax.swing.JLabel();
        lb_minimize = new javax.swing.JLabel();
        container = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1200, 675));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1200, 675));
        setMinimumSize(new java.awt.Dimension(1200, 675));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 675));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 675));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuBar.setBackground(new java.awt.Color(0, 0, 0));
        MenuBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        pnl_khuyenmai.setBackground(new java.awt.Color(0, 0, 0));

        lb_khuyenmai.setBackground(new java.awt.Color(255, 255, 255));
        lb_khuyenmai.setForeground(new java.awt.Color(255, 255, 255));
        lb_khuyenmai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/khuyenmai.png"))); // NOI18N
        lb_khuyenmai.setText("Khuyến mãi");
        lb_khuyenmai.setAlignmentX(20.0F);
        lb_khuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_khuyenmaiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_khuyenmaiLayout = new javax.swing.GroupLayout(pnl_khuyenmai);
        pnl_khuyenmai.setLayout(pnl_khuyenmaiLayout);
        pnl_khuyenmaiLayout.setHorizontalGroup(
            pnl_khuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_khuyenmaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_khuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pnl_khuyenmaiLayout.setVerticalGroup(
            pnl_khuyenmaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_khuyenmaiLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(lb_khuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_sanpham.setBackground(new java.awt.Color(0, 0, 0));

        lb_sanpham.setBackground(new java.awt.Color(255, 255, 255));
        lb_sanpham.setForeground(new java.awt.Color(255, 255, 255));
        lb_sanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sanpham.png"))); // NOI18N
        lb_sanpham.setText("Sản phẩm");
        lb_sanpham.setAlignmentX(20.0F);
        lb_sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_sanphamMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_sanphamLayout = new javax.swing.GroupLayout(pnl_sanpham);
        pnl_sanpham.setLayout(pnl_sanphamLayout);
        pnl_sanphamLayout.setHorizontalGroup(
            pnl_sanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_sanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_sanpham, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_sanphamLayout.setVerticalGroup(
            pnl_sanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_sanphamLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(lb_sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_banhang.setBackground(new java.awt.Color(0, 0, 0));

        lb_banhang.setBackground(new java.awt.Color(255, 255, 255));
        lb_banhang.setForeground(new java.awt.Color(255, 255, 255));
        lb_banhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BanHang.png"))); // NOI18N
        lb_banhang.setText("Bán hàng");
        lb_banhang.setAlignmentX(20.0F);
        lb_banhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_banhangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_banhangMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout pnl_banhangLayout = new javax.swing.GroupLayout(pnl_banhang);
        pnl_banhang.setLayout(pnl_banhangLayout);
        pnl_banhangLayout.setHorizontalGroup(
            pnl_banhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_banhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_banhang, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_banhangLayout.setVerticalGroup(
            pnl_banhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_banhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_banhang, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_thongke.setBackground(new java.awt.Color(0, 0, 0));

        lb_thongke.setBackground(new java.awt.Color(255, 255, 255));
        lb_thongke.setForeground(new java.awt.Color(255, 255, 255));
        lb_thongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thongke.png"))); // NOI18N
        lb_thongke.setText("Thống kê");
        lb_thongke.setAlignmentX(20.0F);
        lb_thongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_thongkeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_thongkeLayout = new javax.swing.GroupLayout(pnl_thongke);
        pnl_thongke.setLayout(pnl_thongkeLayout);
        pnl_thongkeLayout.setHorizontalGroup(
            pnl_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_thongkeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnl_thongkeLayout.setVerticalGroup(
            pnl_thongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_thongkeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pnl_nhaphang.setBackground(new java.awt.Color(0, 0, 0));

        lb_nhaphang.setBackground(new java.awt.Color(255, 255, 255));
        lb_nhaphang.setForeground(new java.awt.Color(255, 255, 255));
        lb_nhaphang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nhaphang_1.png"))); // NOI18N
        lb_nhaphang.setText("Nhập hàng");
        lb_nhaphang.setAlignmentX(20.0F);
        lb_nhaphang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_nhaphangMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_nhaphangLayout = new javax.swing.GroupLayout(pnl_nhaphang);
        pnl_nhaphang.setLayout(pnl_nhaphangLayout);
        pnl_nhaphangLayout.setHorizontalGroup(
            pnl_nhaphangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_nhaphangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_nhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnl_nhaphangLayout.setVerticalGroup(
            pnl_nhaphangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_nhaphangLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(lb_nhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_thanhvien.setBackground(new java.awt.Color(0, 0, 0));

        lb_thanhvien.setBackground(new java.awt.Color(255, 255, 255));
        lb_thanhvien.setForeground(new java.awt.Color(255, 255, 255));
        lb_thanhvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thanhvien.png"))); // NOI18N
        lb_thanhvien.setText("Thành viên");
        lb_thanhvien.setAlignmentX(20.0F);
        lb_thanhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_thanhvienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_thanhvienLayout = new javax.swing.GroupLayout(pnl_thanhvien);
        pnl_thanhvien.setLayout(pnl_thanhvienLayout);
        pnl_thanhvienLayout.setHorizontalGroup(
            pnl_thanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_thanhvienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_thanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnl_thanhvienLayout.setVerticalGroup(
            pnl_thanhvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_thanhvienLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(lb_thanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_khuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_banhang, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_nhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_thanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pnl_banhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_khuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnl_sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_thanhvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(pnl_thongke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_nhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuBarLayout = new javax.swing.GroupLayout(MenuBar);
        MenuBar.setLayout(MenuBarLayout);
        MenuBarLayout.setHorizontalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addGroup(MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuBarLayout.setVerticalGroup(
            MenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuBarLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(MenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 130, 580));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Source Sans Pro SemiBold", 2, 36)); // NOI18N
        jLabel2.setText("Vegetable Fresh");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 40));

        lb_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        lb_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_closeMouseClicked(evt);
            }
        });
        jPanel1.add(lb_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 30, -1, -1));

        lb_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/minimize.png"))); // NOI18N
        lb_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(lb_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 80));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 1060, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_banhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_banhangMouseClicked
        // TODO add your handling code here:
        BanHang_GUI bh = new BanHang_GUI();
        container.removeAll();
        container.add(bh).setVisible(true);
        
        pnl_banhang.setBackground(ClickedColor);
        pnl_khuyenmai.setBackground(DefaultColor);
        pnl_nhaphang.setBackground(DefaultColor);
        pnl_sanpham.setBackground(DefaultColor);
        pnl_thanhvien.setBackground(DefaultColor);
        pnl_thongke.setBackground(DefaultColor);
        
        
        
            
        
        
    }//GEN-LAST:event_lb_banhangMouseClicked

    private void lb_khuyenmaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_khuyenmaiMouseClicked
        // TODO add your handling code here:
        container.removeAll();
        KhuyenMai_GUI km = new KhuyenMai_GUI();
        
        container.add(km).setVisible(true);
        pnl_khuyenmai.setBackground(ClickedColor);
        pnl_banhang.setBackground(DefaultColor);
        pnl_nhaphang.setBackground(DefaultColor);
        pnl_sanpham.setBackground(DefaultColor);
        pnl_thanhvien.setBackground(DefaultColor);
        pnl_thongke.setBackground(DefaultColor);
    }//GEN-LAST:event_lb_khuyenmaiMouseClicked

    private void lb_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_sanphamMouseClicked
        // TODO add your handling code here:
        container.removeAll();
        SanPham_GUI sp = new SanPham_GUI();
        
        container.add(sp).setVisible(true);
        pnl_khuyenmai.setBackground(DefaultColor);
        pnl_banhang.setBackground(DefaultColor);
        pnl_nhaphang.setBackground(DefaultColor);
        pnl_sanpham.setBackground(ClickedColor);
        pnl_thanhvien.setBackground(DefaultColor);
        pnl_thongke.setBackground(DefaultColor);
    }//GEN-LAST:event_lb_sanphamMouseClicked

    private void lb_thanhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_thanhvienMouseClicked
        // TODO add your handling code here:
        pnl_khuyenmai.setBackground(DefaultColor);
        pnl_banhang.setBackground(DefaultColor);
        pnl_nhaphang.setBackground(DefaultColor);
        pnl_sanpham.setBackground(DefaultColor);
        pnl_thanhvien.setBackground(ClickedColor);
        pnl_thongke.setBackground(DefaultColor);
    }//GEN-LAST:event_lb_thanhvienMouseClicked

    private void lb_thongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_thongkeMouseClicked
        // TODO add your handling code here:
        pnl_khuyenmai.setBackground(DefaultColor);
        pnl_banhang.setBackground(DefaultColor);
        pnl_nhaphang.setBackground(DefaultColor);
        pnl_sanpham.setBackground(DefaultColor);
        pnl_thanhvien.setBackground(DefaultColor);
        pnl_thongke.setBackground(ClickedColor);
    }//GEN-LAST:event_lb_thongkeMouseClicked

    private void lb_nhaphangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_nhaphangMouseClicked
        // TODO add your handling code here:
        pnl_khuyenmai.setBackground(DefaultColor);
        pnl_banhang.setBackground(DefaultColor);
        pnl_nhaphang.setBackground(ClickedColor);
        pnl_sanpham.setBackground(DefaultColor);
        pnl_thanhvien.setBackground(DefaultColor);
        pnl_thongke.setBackground(DefaultColor);
    }//GEN-LAST:event_lb_nhaphangMouseClicked

    private void lb_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_closeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lb_closeMouseClicked

    private void lb_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_lb_minimizeMouseClicked

    private void lb_banhangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_banhangMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_banhangMouseEntered

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
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuBar;
    private javax.swing.JDesktopPane container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_banhang;
    private javax.swing.JLabel lb_close;
    private javax.swing.JLabel lb_khuyenmai;
    private javax.swing.JLabel lb_minimize;
    private javax.swing.JLabel lb_nhaphang;
    private javax.swing.JLabel lb_sanpham;
    private javax.swing.JLabel lb_thanhvien;
    private javax.swing.JLabel lb_thongke;
    private javax.swing.JPanel pnl_banhang;
    private javax.swing.JPanel pnl_khuyenmai;
    private javax.swing.JPanel pnl_nhaphang;
    private javax.swing.JPanel pnl_sanpham;
    private javax.swing.JPanel pnl_thanhvien;
    private javax.swing.JPanel pnl_thongke;
    // End of variables declaration//GEN-END:variables
}
