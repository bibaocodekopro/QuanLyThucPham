/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import BUS.KhuyenMai_BUS;
import BUS.SanPham_BUS;
import DTO.KhuyenMai_DTO;
import DTO.SanPham_DTO;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author blemb
 */
public class KhuyenMai_GUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form KhuyenMai_GUI
     */
    public KhuyenMai_GUI() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        showAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Timkiem = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        txt_batdau = new javax.swing.JTextField();
        txt_makm = new javax.swing.JTextField();
        txt_tenkm = new javax.swing.JTextField();
        txt_ketthuc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        rbtn_ten = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        txt_timkiem = new javax.swing.JTextField();
        btn_timkiem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_khuyenmai = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btn_them = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin khuyến mãi"));

        txt_batdau.setColumns(10);
        txt_batdau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_batdauActionPerformed(evt);
            }
        });

        txt_makm.setColumns(3);

        txt_tenkm.setColumns(10);

        txt_ketthuc.setColumns(10);
        txt_ketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ketthucActionPerformed(evt);
            }
        });

        jLabel2.setText("Tên KM:");

        jLabel3.setText("Mã KM:");

        jLabel4.setText("Bắt đầu:");

        jLabel5.setText("Kết thúc:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_makm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txt_batdau, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tenkm)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(176, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_makm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenkm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ketthuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_batdau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(94, 94, 94))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 640, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        Timkiem.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        Timkiem.add(jRadioButton2);
        jRadioButton2.setText("Theo mã");

        Timkiem.add(rbtn_ten);
        rbtn_ten.setText("Theo Tên");

        Timkiem.add(jRadioButton6);
        jRadioButton6.setText("Ngày bắt đầu");

        Timkiem.add(jRadioButton7);
        jRadioButton7.setText("Ngày kết thúc");

        btn_timkiem.setText("Tìm kiếm");

        jLabel1.setText("Từ:");

        jLabel6.setText("Đến:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_timkiem)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtn_ten)
                                .addGap(148, 148, 148)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jRadioButton6)
                        .addGap(131, 131, 131))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(rbtn_ten))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timkiem))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 390, 220));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Khuyến mãi"));

        tbl_khuyenmai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã KM", "Tên KM", "Bắt đầu", "Kết thúc"
            }
        ));
        tbl_khuyenmai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_khuyenmaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_khuyenmai);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 270));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tùy chọn"));

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_them)
                        .addGap(18, 18, 18)
                        .addComponent(btn_xoa)
                        .addGap(18, 18, 18)
                        .addComponent(btn_sua)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_xoa)
                    .addComponent(btn_sua))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 370, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_batdauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_batdauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_batdauActionPerformed

    private void txt_ketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ketthucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ketthucActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        showAll();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_khuyenmaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_khuyenmaiMouseClicked
        // TODO add your handling code here:
        int i = tbl_khuyenmai.getSelectedRow();
        txt_makm.setText(tbl_khuyenmai.getModel().getValueAt(i, 1).toString());
        txt_tenkm.setText(tbl_khuyenmai.getModel().getValueAt(i,2).toString());
        txt_batdau.setText(tbl_khuyenmai.getModel().getValueAt(i,3).toString());
        txt_ketthuc.setText(tbl_khuyenmai.getModel().getValueAt(i,4).toString());
        
    }//GEN-LAST:event_tbl_khuyenmaiMouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
        String a = txt_makm.getText();
        String b = txt_tenkm.getText();
        String c = txt_batdau.getText();
        String d = txt_ketthuc.getText();
        String e = "";
        int flag = 0;
        if("".equals(a) || "".equals(b) || "".equals(c) || "".equals(d) ){
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");
        } else {
            for(int i = 0; i < tbl_khuyenmai.getRowCount(); i++){
                if(a.equals(tbl_khuyenmai.getValueAt(i, 1)))
                    flag = 1;
            }
            if(flag != 1){
            new KhuyenMai_BUS().themKM(a, b, c, d);
            } else {
                JOptionPane.showMessageDialog(null, "Mã khuyến mãi bị trùng");
            }
        }
        showAll();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        int i = tbl_khuyenmai.getSelectedRow();
        String id = tbl_khuyenmai.getValueAt(i, 1).toString();
        new KhuyenMai_BUS().xoaKM(id);
        showAll();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        // TODO add your handling code here:
        //lỗi refresh
        int flag = 0;
        int i = tbl_khuyenmai.getSelectedRow();
        String id = tbl_khuyenmai.getValueAt(i, 1).toString();
        String id_new = txt_makm.getText();
        String ten = txt_tenkm.getText();
        String batdau = txt_batdau.getText();
        String ketthuc = txt_ketthuc.getText();
        for(int j = 0; j < tbl_khuyenmai.getRowCount(); j++){
            if(j != i){
                if(id_new.equals(tbl_khuyenmai.getValueAt(j, 1))){
                    flag = 1;
                }
            }
        }
        if(flag != 1){
        new KhuyenMai_BUS().suaKM(id_new, ten, batdau, ketthuc, id);
        
        }
        else JOptionPane.showMessageDialog(null, "Mã khuyến mãi đã tồn tại");
    }//GEN-LAST:event_btn_suaActionPerformed
    public void showAll(){
        DefaultTableModel n = new DefaultTableModel();
        KhuyenMai_BUS bus = new KhuyenMai_BUS();
        bus.docDSKM();
        Vector header = new Vector();
            header.add("STT");
            header.add("Mã KM");
            header.add("Tên KM");
            header.add("Bắt đầu");
            header.add("Kết thúc");
            n = new DefaultTableModel(header,0);
            int k = 0;
        for (KhuyenMai_DTO km :  KhuyenMai_BUS.dskm) {
     
            Vector row = new Vector();
            row.add(k);
            row.add(km.id_km);
            row.add(km.ten_km);
            row.add(km.batdau);
            row.add(km.ketthuc);
            n.addRow(row);
            k++;
        }
        tbl_khuyenmai.setModel(n);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Timkiem;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_timkiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton rbtn_ten;
    private javax.swing.JTable tbl_khuyenmai;
    private javax.swing.JTextField txt_batdau;
    private javax.swing.JTextField txt_ketthuc;
    private javax.swing.JTextField txt_makm;
    private javax.swing.JTextField txt_tenkm;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
