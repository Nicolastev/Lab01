import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
package micalculadora;

public class Calculadora extends javax.swing.JFrame {
    
    private String operacionActual = "";
    private String operacionPrevista = "";    
    public float numero1=0;
    public float numero2=0;
    public String operador="";
            
    public Calculadora() {
          initComponents();
        setLocationRelativeTo(null);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn_raiz = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_cero = new javax.swing.JButton();
        btn_tan = new javax.swing.JButton();
        btn_cos = new javax.swing.JButton();
        btn_sen = new javax.swing.JButton();
        btn_porciento = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_rest = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        btn_mult = new javax.swing.JButton();
        btn_expo = new javax.swing.JButton();
        txtresultado = new javax.swing.JLabel();
        txtoperacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_raiz.setBackground(new java.awt.Color(0, 0, 0));
        btn_raiz.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_raiz.setForeground(new java.awt.Color(0, 153, 153));
        btn_raiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_raiz.setText("√");
        btn_raiz.setBorder(null);
        btn_raiz.setFocusPainted(false);
        btn_raiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_raiz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_raiz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope.png"))); // NOI18N
        btn_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raizActionPerformed(evt);
            }
        });
        jPanel2.add(btn_raiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 50, 50));

        btn_c.setBackground(new java.awt.Color(0, 0, 0));
        btn_c.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_c.setForeground(new java.awt.Color(255, 255, 255));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setBorder(null);
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3_1.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 50));

        btn_del.setBackground(new java.awt.Color(0, 0, 0));
        btn_del.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btn_del.setForeground(new java.awt.Color(255, 255, 255));
        btn_del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_del.setText("DEL");
        btn_del.setBorder(null);
        btn_del.setFocusPainted(false);
        btn_del.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_del.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_del.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3_1.png"))); // NOI18N
        jPanel2.add(btn_del, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 50, 50));

        btn_7.setBackground(new java.awt.Color(0, 0, 0));
        btn_7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3_1.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, 50));

        btn_8.setBackground(new java.awt.Color(0, 0, 0));
        btn_8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3_1.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 50, 50));

        btn_9.setBackground(new java.awt.Color(0, 0, 0));
        btn_9.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3_1.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 50, 50));

        btn_4.setBackground(new java.awt.Color(0, 0, 0));
        btn_4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3_1.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 50, 50));

        btn_5.setBackground(new java.awt.Color(0, 0, 0));
        btn_5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3_1.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 50, 50));

        btn_6.setBackground(new java.awt.Color(0, 0, 0));
        btn_6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3_1.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 50, 50));

        btn_1.setBackground(new java.awt.Color(0, 0, 0));
        btn_1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3_1.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 50, 50));

        btn_2.setBackground(new java.awt.Color(0, 0, 0));
        btn_2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3_1.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 50, 50));

        btn_3.setBackground(new java.awt.Color(0, 0, 0));
        btn_3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3_1.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 50, 50));

        btn_cero.setBackground(new java.awt.Color(0, 0, 0));
        btn_cero.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_cero.setForeground(new java.awt.Color(255, 255, 255));
        btn_cero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_cero.setText("0");
        btn_cero.setBorder(null);
        btn_cero.setFocusPainted(false);
        btn_cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3.png"))); // NOI18N
        btn_cero.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/btn3_1.png"))); // NOI18N
        btn_cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceroActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 50, 50));

        btn_tan.setBackground(new java.awt.Color(0, 0, 0));
        btn_tan.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btn_tan.setForeground(new java.awt.Color(255, 255, 255));
        btn_tan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/BTN4.png"))); // NOI18N
        btn_tan.setText("Tan");
        btn_tan.setBorder(null);
        btn_tan.setFocusPainted(false);
        btn_tan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_tan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/BTN4.png"))); // NOI18N
        btn_tan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn4_1.png"))); // NOI18N
        btn_tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tanActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 50, 50));

        btn_cos.setBackground(new java.awt.Color(0, 0, 0));
        btn_cos.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btn_cos.setForeground(new java.awt.Color(255, 255, 255));
        btn_cos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/BTN4.png"))); // NOI18N
        btn_cos.setText("Cos");
        btn_cos.setBorder(null);
        btn_cos.setFocusPainted(false);
        btn_cos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/BTN4.png"))); // NOI18N
        btn_cos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn4_1.png"))); // NOI18N
        btn_cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 50, 50));

        btn_sen.setBackground(new java.awt.Color(0, 0, 0));
        btn_sen.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        btn_sen.setForeground(new java.awt.Color(255, 255, 255));
        btn_sen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/BTN4.png"))); // NOI18N
        btn_sen.setText("Sen");
        btn_sen.setBorder(null);
        btn_sen.setBorderPainted(false);
        btn_sen.setFocusPainted(false);
        btn_sen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_sen.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/BTN4.png"))); // NOI18N
        btn_sen.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn4_1.png"))); // NOI18N
        btn_sen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_senActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 50, 50));

        btn_porciento.setBackground(new java.awt.Color(0, 0, 0));
        btn_porciento.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_porciento.setForeground(new java.awt.Color(0, 153, 153));
        btn_porciento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_porciento.setText("%");
        btn_porciento.setBorder(null);
        btn_porciento.setFocusPainted(false);
        btn_porciento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porciento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_porciento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope.png"))); // NOI18N
        btn_porciento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcientoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porciento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 50, 50));

        btn_igual.setBackground(new java.awt.Color(0, 0, 0));
        btn_igual.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(0, 153, 153));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorder(null);
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 50, 50));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        jButton5.setText("/");
        jButton5.setBorder(null);
        jButton5.setFocusPainted(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 50, 50));

        btn_suma.setBackground(new java.awt.Color(0, 0, 0));
        btn_suma.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(0, 153, 153));
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setBorder(null);
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 50, 50));

        btn_rest.setBackground(new java.awt.Color(0, 0, 0));
        btn_rest.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_rest.setForeground(new java.awt.Color(0, 153, 153));
        btn_rest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_rest.setText("-");
        btn_rest.setBorder(null);
        btn_rest.setFocusPainted(false);
        btn_rest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_rest.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_rest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope.png"))); // NOI18N
        btn_rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restActionPerformed(evt);
            }
        });
        jPanel2.add(btn_rest, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 50, 50));

        jButton31.setBackground(new java.awt.Color(0, 0, 0));
        jButton31.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(0, 153, 153));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        jButton31.setText(".");
        jButton31.setBorder(null);
        jButton31.setFocusPainted(false);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        jButton31.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope.png"))); // NOI18N
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 50, 50));

        btn_mult.setBackground(new java.awt.Color(0, 0, 0));
        btn_mult.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_mult.setForeground(new java.awt.Color(0, 153, 153));
        btn_mult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_mult.setText("*");
        btn_mult.setBorder(null);
        btn_mult.setFocusPainted(false);
        btn_mult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mult.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_mult.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope.png"))); // NOI18N
        btn_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mult, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 50, 50));

        btn_expo.setBackground(new java.awt.Color(0, 0, 0));
        btn_expo.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btn_expo.setForeground(new java.awt.Color(0, 153, 153));
        btn_expo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_expo.setText(" χ²");
        btn_expo.setBorder(null);
        btn_expo.setFocusPainted(false);
        btn_expo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_expo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope 1.png"))); // NOI18N
        btn_expo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/micalculadora/Btn ope.png"))); // NOI18N
        btn_expo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_expoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_expo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 50, 50));

        txtresultado.setBackground(new java.awt.Color(255, 255, 255));
        txtresultado.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        txtresultado.setForeground(new java.awt.Color(255, 255, 255));
        txtresultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 38, 230, -1));

        txtoperacion.setBackground(new java.awt.Color(255, 255, 255));
        txtoperacion.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtoperacion.setForeground(new java.awt.Color(255, 255, 255));
        txtoperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(txtoperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumero("8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumero("5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumero("2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceroActionPerformed
       addNumero("0");
    }//GEN-LAST:event_btn_ceroActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        addNumero("+");
        operador="+";
        txtoperacion.setText(txtoperacion.getText() + " + ");
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
       realizarOperacion();
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        txtoperacion.setText("");
        txtresultado.setText("");
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumero("1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumero("3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumero("4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
       addNumero("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumero("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumero("9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_senActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_senActionPerformed
        addNumero("Sen(");
    }//GEN-LAST:event_btn_senActionPerformed

    private void btn_cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cosActionPerformed
        addNumero("Cos(");
    }//GEN-LAST:event_btn_cosActionPerformed

    private void btn_tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tanActionPerformed
        addNumero("Tan(");
    }//GEN-LAST:event_btn_tanActionPerformed

    private void btn_porcientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcientoActionPerformed
        addNumero("%");
    }//GEN-LAST:event_btn_porcientoActionPerformed

    private void btn_expoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_expoActionPerformed
       addNumero("^");
    }//GEN-LAST:event_btn_expoActionPerformed

    private void btn_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multActionPerformed
        addNumero("*");
    }//GEN-LAST:event_btn_multActionPerformed

    private void btn_restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restActionPerformed
        addNumero("-");
    }//GEN-LAST:event_btn_restActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        addNumero("/");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
       addNumero(".");
    }//GEN-LAST:event_jButton31ActionPerformed

    private void btn_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_raizActionPerformed
        addNumero("√");
    }//GEN-LAST:event_btn_raizActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    public void addNumero(String numero){
        //private void calcular() {
        try {
            numero2 = Float.parseFloat(txtresultado.getText());
            float resultado = 0;
            switch (operador) {
                case "+":
                    resultado = numero1 + numero2;
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    break;
                case "/":
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        JOptionPane.showMessageDialog(this, "No se puede dividir por cero.");
                        return;
                    }
                    break;
                case "%":
                    resultado = (numero1 * numero2) / 100;
                    break;
            }
            txtresultado.setText(String.valueOf(resultado));
            operacionActual = operacionPrevista + " " + numero2 + " = " + resultado;
            txtoperacion.setText(operacionActual);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese números válidos.");
        }
    }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_cero;
    private javax.swing.JButton btn_cos;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_expo;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_mult;
    private javax.swing.JButton btn_porciento;
    private javax.swing.JButton btn_raiz;
    private javax.swing.JButton btn_rest;
    private javax.swing.JButton btn_sen;
    private javax.swing.JButton btn_suma;
    private javax.swing.JButton btn_tan;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtoperacion;
    private javax.swing.JLabel txtresultado;
    // End of variables declaration//GEN-END:variables

