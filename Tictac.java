package TICTAC;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tictac extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    
    public Tictac() {
        initComponents();
    }
    private void gameScore()
    {
    }
    
    private void choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    
    private void WinningGame()
    {
        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.GREEN);
            btn2.setBackground(Color.GREEN);
            btn3.setBackground(Color.GREEN);
        }
        if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn4.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
        }
        if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn7.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
        }
        if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.GREEN);
            btn4.setBackground(Color.GREEN);
            btn7.setBackground(Color.GREEN);
        }
        if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn2.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
        }
        if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
        }
        if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
        }
        if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn7.setBackground(Color.GREEN);
        }
                if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.GREEN);
            btn2.setBackground(Color.GREEN);
            btn3.setBackground(Color.GREEN);
        }
        if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn4.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
        }
        if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn7.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
        }
        if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.GREEN);
            btn4.setBackground(Color.GREEN);
            btn7.setBackground(Color.GREEN);
        }
        if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn2.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
        }
        if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
        }
        if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
        }
        if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this, "Player O Win", "TIC TAC TOE", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn7.setBackground(Color.GREEN);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 48)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(204, 255, 255));
        btnreset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnreset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     

        btn8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            btn8.setForeground(Color.BLACK);
        }
        else
        {
            btn8.setForeground(Color.YELLOW);
        }
        choose_a_Player();
        WinningGame();
    }                                    

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     

        btn1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            btn1.setForeground(Color.BLACK);
        }
        else
        {
            btn1.setForeground(Color.YELLOW);
        }
        choose_a_Player();
        WinningGame();
    }                                    

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     

        btn2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            btn2.setForeground(Color.BLACK);
        }
        else
        {
            btn2.setForeground(Color.YELLOW);
        }
        choose_a_Player();
        WinningGame();
    }                                    

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     

        btn3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            btn3.setForeground(Color.BLACK);
        }
        else
        {
            btn3.setForeground(Color.YELLOW);
        }
        choose_a_Player();
        WinningGame();
    }                                    

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     

        btn4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            btn4.setForeground(Color.BLACK);
        }
        else
        {
            btn4.setForeground(Color.YELLOW);
        }
        choose_a_Player();
        WinningGame();
    }                                    

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     

        btn5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            btn5.setForeground(Color.BLACK);
        }
        else
        {
            btn5.setForeground(Color.YELLOW);
        }
        choose_a_Player();
        WinningGame();
    }                                    

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     

        btn6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            btn6.setForeground(Color.BLACK);
        }
        else
        {
            btn6.setForeground(Color.YELLOW);
        }
        choose_a_Player();
        WinningGame();
    }                                    

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     

        btn7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            btn7.setForeground(Color.BLACK);
        }
        else
        {
            btn7.setForeground(Color.YELLOW);
        }
        choose_a_Player();
        WinningGame();
    }                                    

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     

        btn9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X"))
        {
            btn9.setForeground(Color.BLACK);
        }
        else
        {
            btn9.setForeground(Color.YELLOW);
        }
        choose_a_Player();
        WinningGame();
    }                                    

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {                                         

        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        
        btn1.setBackground(Color.GRAY);
        btn2.setBackground(Color.GRAY);
        btn3.setBackground(Color.GRAY);
        
        btn4.setBackground(Color.GRAY);
        btn5.setBackground(Color.GRAY);
        btn6.setBackground(Color.GRAY);
        
        btn7.setBackground(Color.GRAY);
        btn8.setBackground(Color.GRAY);
        btn9.setBackground(Color.GRAY);
    }                                        


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tictac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}




