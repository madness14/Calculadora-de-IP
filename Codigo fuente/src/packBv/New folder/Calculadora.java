package packBv;
import java.awt.event.KeyEvent;
/*
░░░░█▐▄▒▒▒▌▌▒▒▌░▌▒▐▐▐▒▒▐▒▒▌▒▀▄▀▄░
░░░█▐▒▒▀▀▌░▀▀▀░░▀▀▀░░▀▀▄▌▌▐▒▒▒▌▐░
░░▐▒▒▀▀▄▐░▀▀▄▄░░░░░░░░░░░▐▒▌▒▒▐░▌
░░▐▒▌▒▒▒▌░▄▄▄▄█▄░░░░░░░▄▄▄▐▐▄▄▀░░
░░▌▐▒▒▒▐░░░░░░░░░░░░░▀█▄░░░░▌▌░░░
▄▀▒▒▌▒▒▐░░░░░░░▄░░▄░░░░░▀▀░░▌▌░░░
▄▄▀▒▐▒▒▐░░░░░░░▐▀▀▀▄▄▀░░░░░░▌▌░░░
░░░░█▌▒▒▌░░░░░▐▒▒▒▒▒▌░░░░░░▐▐▒▀▀▄
░░▄▀▒▒▒▒▐░░░░░▐▒▒▒▒▐░░░░░▄█▄▒▐▒▒▒
▄▀▒▒▒▒▒▄██▀▄▄░░▀▄▄▀░░▄▄▀█▄░█▀▒▒▒▒
╔═╗┌─┐┌┬┐┬ ┬┌─┐┬  ╔╦╗┌─┐┌┬┐┌┬┐┬ ┬
╠═╣│   │ │ │├─┤│  ║║║├─┤ ││ ││└┬┘
╩ ╩└─┘ ┴ └─┘┴ ┴┴─┘╩ ╩┴ ┴─┴┘─┴┘ ┴ 
github.com/madness14
*/


public class Calculadora extends javax.swing.JPanel {

    
    public Calculadora() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jTextField3 = new javax.swing.JTextField();
        Casilla_Direccion_de_Red1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Casilla_IP_1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Bool_Calcular_Host = new javax.swing.JRadioButton();
        Casilla_Host = new javax.swing.JTextField();
        Bool_Calcular_Subred = new javax.swing.JRadioButton();
        Casilla_Subred = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Casilla_Direccion_de_Red = new javax.swing.JLabel();
        Casilla_Direccion_de_Broadcast = new javax.swing.JLabel();
        Casilla_Rango_de_IP_validas = new javax.swing.JLabel();
        Casilla_Iniciar_Proceso = new java.awt.Button();
        Casilla_Limpiar = new java.awt.Button();
        Casilla_IP_2 = new javax.swing.JTextField();
        Casilla_IP_3 = new javax.swing.JTextField();
        Casilla_IP_4 = new javax.swing.JTextField();
        Casilla_Mascara_de_Red = new javax.swing.JLabel();
        Casilla_Mascara_de_Subred = new javax.swing.JLabel();
        Casilla_Clase = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        Casilla_Direccion_de_Red1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Casilla_Direccion_de_Red1.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_Direccion_de_Red1.setText(" ");
        Casilla_Direccion_de_Red1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Calculadora IP owo");

        Casilla_IP_1.setBackground(new java.awt.Color(255, 255, 255));
        Casilla_IP_1.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_IP_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Casilla_IP_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla_IP_1ActionPerformed(evt);
            }
        });
        Casilla_IP_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_IP_1KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("IP:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("mascara de red:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("mascara de subred:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("clase:");

        Bool_Calcular_Host.setForeground(new java.awt.Color(0, 0, 0));
        Bool_Calcular_Host.setText("Calcular/Host");
        Bool_Calcular_Host.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bool_Calcular_HostActionPerformed(evt);
            }
        });

        Casilla_Host.setBackground(new java.awt.Color(255, 255, 255));
        Casilla_Host.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_Host.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Casilla_Host.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla_HostActionPerformed(evt);
            }
        });

        Bool_Calcular_Subred.setForeground(new java.awt.Color(0, 0, 0));
        Bool_Calcular_Subred.setText("Calcular/Subred");
        Bool_Calcular_Subred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bool_Calcular_SubredActionPerformed(evt);
            }
        });

        Casilla_Subred.setBackground(new java.awt.Color(255, 255, 255));
        Casilla_Subred.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_Subred.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Casilla_Subred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla_SubredActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dirección de red     |     Dirección de Broadcast     |     Rango de IP válidas");

        Casilla_Direccion_de_Red.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Casilla_Direccion_de_Red.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_Direccion_de_Red.setText(" ");

        Casilla_Direccion_de_Broadcast.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Casilla_Direccion_de_Broadcast.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_Direccion_de_Broadcast.setText(" ");

        Casilla_Rango_de_IP_validas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Casilla_Rango_de_IP_validas.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_Rango_de_IP_validas.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Casilla_Direccion_de_Red, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Casilla_Direccion_de_Broadcast, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Casilla_Rango_de_IP_validas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Casilla_Direccion_de_Red)
                    .addComponent(Casilla_Direccion_de_Broadcast)
                    .addComponent(Casilla_Rango_de_IP_validas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Casilla_Iniciar_Proceso.setLabel("Iniciar");
        Casilla_Iniciar_Proceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla_Iniciar_ProcesoActionPerformed(evt);
            }
        });

        Casilla_Limpiar.setLabel("Limpiar");
        Casilla_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla_LimpiarActionPerformed(evt);
            }
        });

        Casilla_IP_2.setBackground(new java.awt.Color(255, 255, 255));
        Casilla_IP_2.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_IP_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Casilla_IP_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla_IP_2ActionPerformed(evt);
            }
        });
        Casilla_IP_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_IP_2KeyTyped(evt);
            }
        });

        Casilla_IP_3.setBackground(new java.awt.Color(255, 255, 255));
        Casilla_IP_3.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_IP_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Casilla_IP_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla_IP_3ActionPerformed(evt);
            }
        });
        Casilla_IP_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_IP_3KeyTyped(evt);
            }
        });

        Casilla_IP_4.setBackground(new java.awt.Color(255, 255, 255));
        Casilla_IP_4.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_IP_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        Casilla_IP_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Casilla_IP_4ActionPerformed(evt);
            }
        });
        Casilla_IP_4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Casilla_IP_4KeyTyped(evt);
            }
        });

        Casilla_Mascara_de_Red.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Casilla_Mascara_de_Red.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_Mascara_de_Red.setText(" ");

        Casilla_Mascara_de_Subred.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Casilla_Mascara_de_Subred.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_Mascara_de_Subred.setText(" ");

        Casilla_Clase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Casilla_Clase.setForeground(new java.awt.Color(0, 0, 0));
        Casilla_Clase.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Bool_Calcular_Host)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Casilla_Host, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(Bool_Calcular_Subred)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Casilla_Subred, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(59, 59, 59)
                                        .addComponent(Casilla_IP_1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Casilla_Clase, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla_Mascara_de_Subred, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Casilla_Mascara_de_Red, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(Casilla_IP_2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(Casilla_IP_3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(Casilla_IP_4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Casilla_Iniciar_Proceso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(Casilla_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Casilla_IP_1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Casilla_IP_2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla_IP_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla_IP_4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla_Mascara_de_Red))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla_Mascara_de_Subred))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Casilla_Clase))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Casilla_Host)
                            .addComponent(Bool_Calcular_Host, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Bool_Calcular_Subred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Casilla_Subred)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Casilla_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Casilla_Iniciar_Proceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void Casilla_IP_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla_IP_1ActionPerformed
        
    }//GEN-LAST:event_Casilla_IP_1ActionPerformed

    private void Bool_Calcular_HostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bool_Calcular_HostActionPerformed
        Bool_Calcular_Subred.setSelected(false);
        
    }//GEN-LAST:event_Bool_Calcular_HostActionPerformed
    
    private void Casilla_HostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla_HostActionPerformed
        
    }//GEN-LAST:event_Casilla_HostActionPerformed

    private void Bool_Calcular_SubredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bool_Calcular_SubredActionPerformed
        Bool_Calcular_Host.setSelected(false);
    }//GEN-LAST:event_Bool_Calcular_SubredActionPerformed

    private void Casilla_SubredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla_SubredActionPerformed
        
    }//GEN-LAST:event_Casilla_SubredActionPerformed

    
    private void Casilla_Iniciar_ProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla_Iniciar_ProcesoActionPerformed
        if (Bool_Calcular_Host.isSelected()) {
        procesarHost();
    } else if (Bool_Calcular_Subred.isSelected()){
        procesarHost();
    } else {
        procesarIP();
    }//GEN-LAST:event_Casilla_Iniciar_ProcesoActionPerformed
}

private void procesarIP() {
    String ip1 = Casilla_IP_1.getText();
    String ip2 = Casilla_IP_2.getText();
    String ip3 = Casilla_IP_3.getText();
    String ip4 = Casilla_IP_4.getText();

    String direccionIP = ip1 + "." + ip2 + "." + ip3 + "." + ip4;

    int primerOcteto = Integer.parseInt(ip1);

    String clase;
    if (primerOcteto >= 1 && primerOcteto <= 126) {
        clase = "A";
    } else if (primerOcteto >= 128 && primerOcteto <= 191) {
        clase = "B";
    } else if (primerOcteto >= 192 && primerOcteto <= 223) {
        clase = "C";
    } else if (primerOcteto >= 224 && primerOcteto <= 239) {
        clase = "D";
    } else if (primerOcteto >= 240 && primerOcteto <= 255) {
        clase = "E";
    } else {
        clase = "No valido";
        Casilla_Clase.setText("No valido");
        Casilla_Mascara_de_Red.setText("No valido");
        Casilla_Mascara_de_Subred.setText("No valido");
        return;
    }

    String netMask;
    if (primerOcteto >= 1 && primerOcteto <= 126) {
        netMask = "255.0.0.0";
    } else if (primerOcteto >= 128 && primerOcteto <= 191) {
        netMask = "255.255.0.0";
    } else if (primerOcteto >= 192 && primerOcteto <= 223) {
        netMask = "255.255.255.0";
    } else if (primerOcteto >= 224 && primerOcteto <= 239) {
        netMask = "255.255.255.255";
    } else if (primerOcteto >= 240 && primerOcteto <= 255) {
        netMask = "255.255.255.255";
    } else {
        netMask = "No valido";
    }

    if (netMask.equals("No valido")) {
        Casilla_Clase.setText("No valido");
        Casilla_Mascara_de_Red.setText("No valido");
        Casilla_Mascara_de_Subred.setText("No valido");
        return;
    }

    String[] parts = netMask.split("\\.");
    StringBuilder subnetMaskBinary = new StringBuilder();
    StringBuilder subnetMaskIP = new StringBuilder();
    for (String part : parts) {
        int decimal = Integer.parseInt(part);
        subnetMaskIP.append(decimal).append(".");
        String binary = Integer.toBinaryString(decimal);
        while (binary.length() < 8) {
            binary = "0" + binary;
        }
        subnetMaskBinary.append(binary).append(".");
    }

    subnetMaskIP.deleteCharAt(subnetMaskIP.length() - 1);
    subnetMaskBinary.deleteCharAt(subnetMaskBinary.length() - 1);

    Casilla_Clase.setText(clase);
    Casilla_Mascara_de_Red.setText(netMask);
    Casilla_Mascara_de_Subred.setText(subnetMaskIP.toString());

    String[] ipParts = direccionIP.split("\\.");
    String[] mascaraParts = netMask.split("\\.");
    int[] networkAddress = new int[4];
    for (int i = 0; i < 4; i++) {
        networkAddress[i] = Integer.parseInt(ipParts[i]) & Integer.parseInt(mascaraParts[i]);
    }
    String direccionDeRed = networkAddress[0] + "." + networkAddress[1] + "." + networkAddress[2] + "." + networkAddress[3];
    Casilla_Direccion_de_Red.setText(direccionDeRed);

    int[] broadcastAddress = new int[4];
    for (int i = 0; i < 4; i++) {
        broadcastAddress[i] = Integer.parseInt(ipParts[i]) | (~Integer.parseInt(mascaraParts[i]) & 0xFF);
    }
    String direccionDeBroadcast = broadcastAddress[0] + "." + broadcastAddress[1] + "." + broadcastAddress[2] + "." + broadcastAddress[3];
    Casilla_Direccion_de_Broadcast.setText(direccionDeBroadcast);

    int[] primeraIP = new int[4];
    int[] ultimaIP = new int[4];
    for (int i = 0; i < 4; i++) {
        primeraIP[i] = networkAddress[i];
        ultimaIP[i] = broadcastAddress[i];
    }
    primeraIP[3] += 1;
    ultimaIP[3] -= 1;
    String rangoIPsValidas = primeraIP[0] + "." + primeraIP[1] + "." + primeraIP[2] + "." + primeraIP[3] + " - " + ultimaIP[0] + "." + ultimaIP[1] + "." + ultimaIP[2] + "." + ultimaIP[3];
    Casilla_Rango_de_IP_validas.setText(rangoIPsValidas);
}

private void procesarHost() {
    String ip1 = Casilla_IP_1.getText();
    String ip2 = Casilla_IP_2.getText();
    String ip3 = Casilla_IP_3.getText();
    String ip4 = Casilla_IP_4.getText();

    int hosts = Integer.parseInt(Casilla_Host.getText());

    String direccionIP = ip1 + "." + ip2 + "." + ip3 + "." + ip4;

    String clase;
    int primerOcteto = Integer.parseInt(ip1);
    if (primerOcteto >= 1 && primerOcteto <= 126) {
        clase = "A";
    } else if (primerOcteto >= 128 && primerOcteto <= 191) {
        clase = "B";
    } else if (primerOcteto >= 192 && primerOcteto <= 223) {
        clase = "C";
    } else if (primerOcteto >= 224 && primerOcteto <= 239) {
        clase = "D";
    } else if (primerOcteto >= 240 && primerOcteto <= 255) {
        clase = "E";
    } else {
        clase = "No válido";
        Casilla_Clase.setText("No válido");
        Casilla_Mascara_de_Red.setText("No válido");
        Casilla_Mascara_de_Subred.setText("No válido");
        return;
    }

    int bitsDeHost = (int) Math.ceil(Math.log(hosts + 2) / Math.log(2));
    int bitsDeSubred = 32 - bitsDeHost;

    StringBuilder mascaraRed = new StringBuilder();
    StringBuilder mascaraSubred = new StringBuilder();
    for (int i = 0; i < bitsDeSubred; i++) {
        mascaraSubred.append("1");
    }
    for (int i = bitsDeSubred; i < 32; i++) {
        mascaraSubred.append("0");
    }

    String[] partesMascara = mascaraSubred.toString().split("(?<=\\G.{8})");
    for (String parte : partesMascara) {
        mascaraRed.append(Integer.parseInt(parte, 2)).append(".");
    }
    mascaraRed.deleteCharAt(mascaraRed.length() - 1);

    String[] parts = mascaraRed.toString().split("\\.");
    StringBuilder subnetMaskBinary = new StringBuilder();
    StringBuilder subnetMaskIP = new StringBuilder();
    for (String part : parts) {
        int decimal = Integer.parseInt(part);
        subnetMaskIP.append(decimal).append(".");
        String binary = Integer.toBinaryString(decimal);
        while (binary.length() < 8) {
            binary = "0" + binary;
        }
        subnetMaskBinary.append(binary).append(".");
    }

    subnetMaskIP.deleteCharAt(subnetMaskIP.length() - 1);
    subnetMaskBinary.deleteCharAt(subnetMaskBinary.length() - 1);

    Casilla_Clase.setText(clase);
    Casilla_Mascara_de_Red.setText(calcularNetMask(primerOcteto));
    Casilla_Mascara_de_Subred.setText(subnetMaskIP.toString());

    String[] ipParts = direccionIP.split("\\.");
    String[] mascaraParts = mascaraRed.toString().split("\\.");
    int[] direccionRed = new int[4];
    for (int i = 0; i < 4; i++) {
        direccionRed[i] = Integer.parseInt(ipParts[i]) & Integer.parseInt(mascaraParts[i]);
    }
    String direccionDeRed = direccionRed[0] + "." + direccionRed[1] + "." + direccionRed[2] + "." + direccionRed[3];
    Casilla_Direccion_de_Red.setText(direccionDeRed);

    int[] direccionBroadcast = new int[4];
    for (int i = 0; i < 4; i++) {
        direccionBroadcast[i] = direccionRed[i] | (~Integer.parseInt(mascaraParts[i]) & 0xFF);
    }
    String direccionDeBroadcast = direccionBroadcast[0] + "." + direccionBroadcast[1] + "." + direccionBroadcast[2] + "." + direccionBroadcast[3];
    Casilla_Direccion_de_Broadcast.setText(direccionDeBroadcast);

    int[] primeraIP = new int[4];
    int[] ultimaIP = new int[4];
    for (int i = 0; i < 4; i++) {
        primeraIP[i] = direccionRed[i];
        ultimaIP[i] = direccionBroadcast[i];
    }
    primeraIP[3] += 1;
    ultimaIP[3] -= 1;
    String rangoIPsValidas = primeraIP[0] + "." + primeraIP[1] + "." + primeraIP[2] + "." + primeraIP[3] + " - " + ultimaIP[0] + "." + ultimaIP[1] + "." + ultimaIP[2] + "." + ultimaIP[3];
    Casilla_Rango_de_IP_validas.setText(rangoIPsValidas);
}

private String calcularNetMask(int primerOcteto) {
    String netMask;
    if (primerOcteto >= 1 && primerOcteto <= 126) {
        netMask = "255.0.0.0";
    } else if (primerOcteto >= 128 && primerOcteto <= 191) {
        netMask = "255.255.0.0";
    } else if (primerOcteto >= 192 && primerOcteto <= 223) {
        netMask = "255.255.255.0";
    } else if (primerOcteto >= 224 && primerOcteto <= 239) {
        netMask = "255.255.255.255";
    } else if (primerOcteto >= 240 && primerOcteto <= 255) {
        netMask = "255.255.255.255";
    } else {
        netMask = "No valido";
    }
    return netMask;
}



    private void Casilla_IP_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla_IP_2ActionPerformed
    }//GEN-LAST:event_Casilla_IP_2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void Casilla_IP_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla_IP_3ActionPerformed
    }//GEN-LAST:event_Casilla_IP_3ActionPerformed

    private void Casilla_IP_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla_IP_4ActionPerformed
    }//GEN-LAST:event_Casilla_IP_4ActionPerformed

    private void Casilla_IP_1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_IP_1KeyTyped
        if (Casilla_IP_1.getText().length() >= 3) {
        evt.consume();
        return;
    }

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_Casilla_IP_1KeyTyped

    private void Casilla_IP_2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_IP_2KeyTyped
        if (Casilla_IP_2.getText().length() >= 3) {
        evt.consume();
        return;
    }

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_Casilla_IP_2KeyTyped

    private void Casilla_IP_3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_IP_3KeyTyped
        if (Casilla_IP_3.getText().length() >= 3) {
        evt.consume();
        return;
    }

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_Casilla_IP_3KeyTyped

    private void Casilla_IP_4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Casilla_IP_4KeyTyped
        if (Casilla_IP_4.getText().length() >= 3) {
        evt.consume();
        return;
    }

        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_Casilla_IP_4KeyTyped

    private void Casilla_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Casilla_LimpiarActionPerformed
        limpiarInformacion();
    }//GEN-LAST:event_Casilla_LimpiarActionPerformed
    private void limpiarInformacion() {
    Casilla_IP_1.setText("");
    Casilla_IP_2.setText("");
    Casilla_IP_3.setText("");
    Casilla_IP_4.setText("");
    Casilla_Clase.setText("");
    Casilla_Mascara_de_Red.setText("");
    Casilla_Mascara_de_Subred.setText("");
    Casilla_Direccion_de_Red.setText("");
    Casilla_Direccion_de_Broadcast.setText("");
    Casilla_Rango_de_IP_validas.setText("");
}
 
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Bool_Calcular_Host;
    private javax.swing.JRadioButton Bool_Calcular_Subred;
    private javax.swing.JLabel Casilla_Clase;
    private javax.swing.JLabel Casilla_Direccion_de_Broadcast;
    private javax.swing.JLabel Casilla_Direccion_de_Red;
    private javax.swing.JLabel Casilla_Direccion_de_Red1;
    private javax.swing.JTextField Casilla_Host;
    private javax.swing.JTextField Casilla_IP_1;
    private javax.swing.JTextField Casilla_IP_2;
    private javax.swing.JTextField Casilla_IP_3;
    private javax.swing.JTextField Casilla_IP_4;
    private java.awt.Button Casilla_Iniciar_Proceso;
    private java.awt.Button Casilla_Limpiar;
    private javax.swing.JLabel Casilla_Mascara_de_Red;
    private javax.swing.JLabel Casilla_Mascara_de_Subred;
    private javax.swing.JLabel Casilla_Rango_de_IP_validas;
    private javax.swing.JTextField Casilla_Subred;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
