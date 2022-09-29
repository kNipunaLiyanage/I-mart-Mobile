/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JframesSubs;

import InsideManage.AdminPanelHome;
import classes.DB;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nipuna
 */
public class ProfitCalcMonthly extends javax.swing.JFrame {

    /**
     * Creates new form ProfitCalcDaily
     */
    int lastX, lastY;
    double to1, tot2, tot3, tot4;
    String date1, date2;

    public ProfitCalcMonthly() {
        initComponents();
        try {
            Date d2 = new Date();
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat format3 = new SimpleDateFormat("hh:mm:ss");
            String date_systemadd = format2.format(d2);
            String time_systemadd = format3.format(d2);
            jLabel2.setText("Today is " + date_systemadd);

            ImageIcon i = new ImageIcon(getClass().getResource("/Logos/apple.png"));
            Image se = i.getImage();
            setIconImage(se);

            jTable1.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 15));
            jTable1.setRowHeight(50);
            //change the alignment of the table
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            jTable1.setDefaultRenderer(String.class, centerRenderer);
            for (int x = 0; x < jTable1.getColumnCount(); x++) {

                jTable1.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);

            }

            jTable3.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 15));
            jTable3.setRowHeight(50);
            //change the alignment of the table
            DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
            centerRenderer2.setHorizontalAlignment(JLabel.CENTER);
            jTable3.setDefaultRenderer(String.class, centerRenderer);
            for (int x = 0; x < jTable3.getColumnCount(); x++) {

                jTable3.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);

            }
            jTable2.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 15));
            jTable2.setRowHeight(50);
            //change the alignment of the table
            DefaultTableCellRenderer centerRenderer3 = new DefaultTableCellRenderer();
            centerRenderer3.setHorizontalAlignment(JLabel.CENTER);
            jTable2.setDefaultRenderer(String.class, centerRenderer);
            for (int x = 0; x < jTable2.getColumnCount(); x++) {

                jTable2.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);

            }
            jTable4.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 15));
            jTable4.setRowHeight(50);
            //change the alignment of the table
            DefaultTableCellRenderer centerRenderer4 = new DefaultTableCellRenderer();
            centerRenderer4.setHorizontalAlignment(JLabel.CENTER);
            jTable4.setDefaultRenderer(String.class, centerRenderer);
            for (int x = 0; x < jTable4.getColumnCount(); x++) {

                jTable4.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);

            }
            loaddata();
            loaddata2();
            loaddata3();
            loaddata4();
            finaltotalcal();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ProfitCalcMonthly(String date1, String date2) {
        this();
        try {

            this.date1 = date1;
            this.date2 = date2;

            Date d2 = new Date();
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat format3 = new SimpleDateFormat("hh:mm:ss");
            String date_systemadd = format2.format(d2);
            String time_systemadd = format3.format(d2);
            jLabel2.setText("Profit between  " + date1 + " and " + date2);

            ImageIcon i = new ImageIcon(getClass().getResource("/Logos/apple.png"));
            Image se = i.getImage();
            setIconImage(se);

            jTable1.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 15));
            jTable1.setRowHeight(50);
            //change the alignment of the table
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            jTable1.setDefaultRenderer(String.class, centerRenderer);
            for (int x = 0; x < jTable1.getColumnCount(); x++) {

                jTable1.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);

            }

            jTable3.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 15));
            jTable3.setRowHeight(50);
            //change the alignment of the table
            DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
            centerRenderer2.setHorizontalAlignment(JLabel.CENTER);
            jTable3.setDefaultRenderer(String.class, centerRenderer);
            for (int x = 0; x < jTable3.getColumnCount(); x++) {

                jTable3.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);

            }
            jTable2.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 15));
            jTable2.setRowHeight(50);
            //change the alignment of the table
            DefaultTableCellRenderer centerRenderer3 = new DefaultTableCellRenderer();
            centerRenderer3.setHorizontalAlignment(JLabel.CENTER);
            jTable2.setDefaultRenderer(String.class, centerRenderer);
            for (int x = 0; x < jTable2.getColumnCount(); x++) {

                jTable2.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);

            }
            jTable4.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 15));
            jTable4.setRowHeight(50);
            //change the alignment of the table
            DefaultTableCellRenderer centerRenderer4 = new DefaultTableCellRenderer();
            centerRenderer4.setHorizontalAlignment(JLabel.CENTER);
            jTable4.setDefaultRenderer(String.class, centerRenderer);
            for (int x = 0; x < jTable4.getColumnCount(); x++) {

                jTable4.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);

            }
            loaddata();
            loaddata2();
            loaddata3();
            loaddata4();
            finaltotalcal();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Daily Profit Checker");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 310, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 20, -1, 50));

        jLabel5.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Total profit from cash invoices today is LKR ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 900, 30));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "InvoiceId", "Model", "IMEI/Serial", "Discount", "Selling Price", "Quantity", "Sub Total", "buyprice", "Profit", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(123);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(123);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(123);
            jTable1.getColumnModel().getColumn(2).setMinWidth(123);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(123);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(123);
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Discount");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Selling Price");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Quantity");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Sub Total");
            jTable1.getColumnModel().getColumn(7).setHeaderValue("buyprice");
            jTable1.getColumnModel().getColumn(8).setHeaderValue("Profit");
            jTable1.getColumnModel().getColumn(9).setHeaderValue("Time");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1360, 120));

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RepId", "Description", "Cost"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(123);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(123);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(123);
            jTable2.getColumnModel().getColumn(2).setMinWidth(123);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(123);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(123);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 590, 140));

        jLabel7.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 255));
        jLabel7.setText("Total profit from repairs today is LKR ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 750, 30));

        jTable3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "InvoiceId", "Model", "IMEI/Serial", "Discount", "Selling Price", "Quantity", "Sub Total", "buyprice", "Profit", "Time"
            }
        ));
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(123);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(123);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(123);
            jTable3.getColumnModel().getColumn(2).setMinWidth(123);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(123);
            jTable3.getColumnModel().getColumn(2).setMaxWidth(123);
            jTable3.getColumnModel().getColumn(3).setHeaderValue("Discount");
            jTable3.getColumnModel().getColumn(4).setHeaderValue("Selling Price");
            jTable3.getColumnModel().getColumn(5).setHeaderValue("Quantity");
            jTable3.getColumnModel().getColumn(6).setHeaderValue("Sub Total");
            jTable3.getColumnModel().getColumn(7).setHeaderValue("buyprice");
            jTable3.getColumnModel().getColumn(8).setHeaderValue("Profit");
            jTable3.getColumnModel().getColumn(9).setHeaderValue("Time");
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 1360, 190));

        jLabel8.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 255));
        jLabel8.setText("Total profit from card invoices today is LKR ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 900, 30));

        jTable4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "Imie", "Model", "Customer payment", "Our cost", "Final cost"
            }
        ));
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMinWidth(123);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(123);
            jTable4.getColumnModel().getColumn(0).setMaxWidth(123);
            jTable4.getColumnModel().getColumn(3).setMinWidth(123);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(123);
            jTable4.getColumnModel().getColumn(3).setMaxWidth(123);
        }

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 610, 700, 140));

        jLabel9.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 102));
        jLabel9.setText("Total our loss from repairs today is LKR ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, 580, 30));

        jLabel10.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 255));
        jLabel10.setText("Total profit from card invoices today is LKR ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 900, 30));

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel4.setText("Total profit is");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 1370, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background/white2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 760));

        setSize(new java.awt.Dimension(1368, 752));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        // Move frame by the mouse delta
        setLocation(getLocationOnScreen().x + x - lastX,
                getLocationOnScreen().y + y - lastY);
        lastX = x;
        lastY = y;
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        lastX = evt.getXOnScreen();
        lastY = evt.getYOnScreen();
    }//GEN-LAST:event_formMouseMoved

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        new AdminPanelHome().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(ProfitCalcMonthly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfitCalcMonthly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfitCalcMonthly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfitCalcMonthly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfitCalcMonthly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables

    private void loaddata() {
        try {
            Date d2 = new Date();
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat format3 = new SimpleDateFormat("hh:mm:ss");
            String date_systemadd = format2.format(d2);
            String time_systemadd = format3.format(d2);

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

            System.out.println("call");
            double totalproficalc = 0;
            ResultSet rs = DB.search("select * from invoiceitems where statusz='SOLD' and paytype='CASH' and datez between '" + date1 + "' and '" + date2 + "' ");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("invoiceID"));
                v.add(rs.getString("modelz"));
                v.add(rs.getString("imieserial"));
                v.add(rs.getString("discountz"));
                v.add(rs.getString("sellingprice"));
                v.add(rs.getString("qty"));
                v.add(rs.getString("totalz"));
                v.add(rs.getString("buyingprice"));
                double buyinp = Double.parseDouble(rs.getString("buyingprice"));
                int qty = Integer.parseInt(rs.getString("qty"));
                double labeto = buyinp * qty;
                double labunatotal = Double.parseDouble(rs.getString("totalz"));
                double totprofit = labunatotal - labeto;
                totalproficalc = totalproficalc + totprofit;
                v.add(totprofit);
                v.add(rs.getString("timez"));

                dtm.addRow(v);
            }
            to1 = totalproficalc;
            jLabel5.setText("Total profit from CASH invoices  is LKR  " + totalproficalc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loaddata2() {
        try {
            Date d2 = new Date();
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat format3 = new SimpleDateFormat("hh:mm:ss");
            String date_systemadd = format2.format(d2);
            String time_systemadd = format3.format(d2);

            DefaultTableModel dtm = (DefaultTableModel) jTable3.getModel();

            System.out.println("call");
            double totalproficalc = 0;
            double bankuwatawatenagana = 0;
            ResultSet rs = DB.search("select * from invoiceitems where statusz='SOLD' and paytype='CARD' and datez between '" + date1 + "' and '" + date2 + "' ");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("invoiceID"));
                v.add(rs.getString("modelz"));
                v.add(rs.getString("imieserial"));
                v.add(rs.getString("discountz"));
                v.add(rs.getString("sellingprice"));
                v.add(rs.getString("qty"));
                v.add(rs.getString("totalz"));
                v.add(rs.getString("buyingprice"));
                double buyinp = Double.parseDouble(rs.getString("buyingprice"));
                int qty = Integer.parseInt(rs.getString("qty"));
                double labeto = buyinp * qty;
                double sellpricez = Double.parseDouble(rs.getString("sellingprice"));
                double actual_sellprice = (sellpricez * 100) / 103;
                double acttotz = actual_sellprice * qty;
                double zz = sellpricez - actual_sellprice;
                bankuwatawatenagana = bankuwatawatenagana + zz;
                double totprofit = acttotz - labeto;
                totalproficalc = totalproficalc + totprofit;
                v.add(totprofit);
                v.add(rs.getString("timez"));

                dtm.addRow(v);
            }
            tot2 = totalproficalc;
            jLabel8.setText("Total profit from CARD invoices  is LKR  " + totalproficalc);
            jLabel10.setText("Bank cost from CARD invoices  is LKR  " + bankuwatawatenagana);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loaddata3() {
        try {
            Date d2 = new Date();
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat format3 = new SimpleDateFormat("hh:mm:ss");
            String date_systemadd = format2.format(d2);
            String time_systemadd = format3.format(d2);

            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();

            System.out.println("call");
            double totalproficalc = 0;
            ResultSet rs = DB.search("select * from completedrepairs where datez between'" + date1 + "' and '" + date2 + "'");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("repid"));
                v.add(rs.getString("description"));
                double labunatotal = Double.parseDouble(rs.getString("cost"));
                totalproficalc = totalproficalc + labunatotal;
                v.add(labunatotal);

                dtm.addRow(v);
            }
            tot3 = totalproficalc;
            jLabel7.setText("Total income from repairs  is LKR  " + totalproficalc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loaddata4() {
        try {
            Date d2 = new Date();
            SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat format3 = new SimpleDateFormat("hh:mm:ss");
            String date_systemadd = format2.format(d2);
            String time_systemadd = format3.format(d2);

            DefaultTableModel dtm = (DefaultTableModel) jTable4.getModel();

            System.out.println("call");
            double totalproficalc = 0;
            ResultSet rs = DB.search("select * from returnbacktocustomer where date between'" + date1 + "' and '" + date2 + "'");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("invid"));
                v.add(rs.getString("imieserial"));
                v.add(rs.getString("modelz"));
                double labunatotalcus = Double.parseDouble(rs.getString("customerpayment"));
                double apegana = Double.parseDouble(rs.getString("ourcost"));
                double awasanagana = apegana - labunatotalcus;
                totalproficalc = totalproficalc + awasanagana;
                v.add(totalproficalc);

                dtm.addRow(v);
            }
            tot4 = totalproficalc;
            jLabel9.setText("Total cost from returned item  is LKR  " + totalproficalc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void finaltotalcal() {
        try {
            double dd1 = to1 + tot2 + tot3;
            double dd2 = dd1 - tot4;
            jLabel4.setText("Total profit between " + date1 + " and " + date2 + " is " + dd2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
