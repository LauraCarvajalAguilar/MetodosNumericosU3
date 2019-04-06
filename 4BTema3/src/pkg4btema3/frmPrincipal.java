package pkg4btema3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmPrincipal extends javax.swing.JFrame {
    DefaultTableModel modelo;
    String datos[][] = {};
    String encabezado[] = {"x", "x", "x"};//asigno nombre de fila principal

    public frmPrincipal() {
        initComponents();
        modelo = new DefaultTableModel(datos, encabezado);
        TablaInverza.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbFila = new javax.swing.JLabel();
        txtFila = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtColumna = new javax.swing.JTextField();
        jbCrearM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMatrizEntrad = new javax.swing.JTable();
        jbInvertir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaInverza = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbFila.setText("FILA:");

        txtFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilaActionPerformed(evt);
            }
        });

        jLabel2.setText("COLUMNA:");

        txtColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColumnaActionPerformed(evt);
            }
        });

        jbCrearM.setText("CREAR MATRIZ");
        jbCrearM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearMActionPerformed(evt);
            }
        });

        jtMatrizEntrad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtMatrizEntrad);

        jbInvertir.setText("MATRIZ INVERSA");
        jbInvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInvertirActionPerformed(evt);
            }
        });

        jLabel3.setText("Matriz Inversa");

        TablaInverza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TablaInverza);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbFila)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFila, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbInvertir)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jbCrearM)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbFila))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jbCrearM)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbInvertir)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilaActionPerformed
    }//GEN-LAST:event_txtFilaActionPerformed

    private void txtColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColumnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColumnaActionPerformed

    private void jbCrearMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearMActionPerformed
        int canfila = 0;
        int cancolumna = 0;

        try {
            canfila = Integer.parseInt(txtFila.getText());
            cancolumna = Integer.parseInt(txtColumna.getText());
            int tamMatriz[][] = new int[canfila][cancolumna];

            this.mostrarMatriz(tamMatriz, canfila, cancolumna);
        } catch (Exception e) {

            if (canfila == cancolumna) {

                JOptionPane.showMessageDialog(rootPane, "Los valores correctos");
            } else {

                JOptionPane.showMessageDialog(rootPane, "ingrese numeros enteros, o mayores a cero");
            }
        }
    }//GEN-LAST:event_jbCrearMActionPerformed

    private void jbInvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInvertirActionPerformed
        try {

            int fila = Integer.parseInt(txtFila.getText());
            int columna = Integer.parseInt(txtColumna.getText());
            String matrizSalida[][] = new String[fila][columna];

            String datos[] = new String[columna];
            for (int x = 0; x < columna; x++) {
                String cadena = Integer.toString(x);
                String cabeza = "x" + cadena;
                datos[x] = cabeza;
            }
            double matrizResultado[][] = matrizInversa(guardar());
            double matrizfinal[][] = matrizResultado;

            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {

                    System.out.println(matrizfinal[i][j]);
                    matrizSalida[i][j] = String.valueOf(matrizfinal[i][j]);
                }
            }
            modelo.setDataVector(matrizSalida, datos);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Perfect");
        }
    }//GEN-LAST:event_jbInvertirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    public void mostrarMatriz(int matriz[][], int fila, int columna) {

        DefaultTableModel model = (DefaultTableModel) jtMatrizEntrad.getModel();

        model.setRowCount(fila);
        model.setColumnCount(columna);

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                jtMatrizEntrad.setValueAt(matriz[fila][columna], fila, columna);
            }
        }
    }

    public double[][] guardar() {

        //double[][] array_reg = new double[tblMatriz.getRowCount()][tblMatriz.getColumnCount()];
        int fila = Integer.parseInt(txtFila.getText());
        int columna = Integer.parseInt(txtColumna.getText());

        double[][] array_reg = new double[fila][columna];

        for (int f = 0; f < fila; f++) {
            for (int c = 0; c < columna; c++) {
                array_reg[f][c] = Integer.parseInt((String) jtMatrizEntrad.getValueAt(f, c));
                System.out.println("numero = " + array_reg[f][c]);
            }

        }

        return array_reg;
    }

    public double[][] matrizInversa(double[][] matriz) {
        double det = 1 / determinante(matriz);
        double[][] nmatriz = matrizAdjunta(matriz);
        multiplicarMatriz(det, nmatriz);
        return nmatriz;
    }

    //funcion matrizmultiplicar
    public void multiplicarMatriz(double n, double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] *= n;
            }
        }
    }

    //funcion matrizadjunta
    public double[][] matrizAdjunta(double[][] matriz) {

        double[][] matriz1 = matrizCofactores(matriz);

        return matrizTranspuesta(matriz1);

    }

    //funcion matrizcofactores
    public double[][] matrizCofactores(double[][] matriz) {
        double[][] nm = new double[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                double[][] det = new double[matriz.length - 1][matriz.length - 1];
                double detValor;
                for (int k = 0; k < matriz.length; k++) {
                    if (k != i) {
                        for (int l = 0; l < matriz.length; l++) {
                            if (l != j) {
                                int indice1 = k < i ? k : k - 1;
                                int indice2 = l < j ? l : l - 1;
                                det[indice1][indice2] = matriz[k][l];
                            }
                        }
                    }
                }
                detValor = determinante(det);
                nm[i][j] = detValor * (double) Math.pow(-1, i + j + 2);
                //System.out.println("cofactores = " + nm[i][j]);
            }
        }
        return nm;
    }

    //funcion matriztranspuesta
    public double[][] matrizTranspuesta(double[][] matriz) {
        double[][] nuevam = new double[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                nuevam[i][j] = matriz[j][i];
                //System.out.println("Transpuesta " + nuevam[i][j]);
            }
        }
        return nuevam;
    }

    //funcion matriz determinante
    public double determinante(double[][] matriz) {
        assert matriz != null;
        assert matriz.length > 0;
        assert matriz.length == matriz[0].length;

        double determinante = 0.0;

        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Si la matriz es 1x1, el determinante es el elemento de la matriz
        if ((filas == 1) && (columnas == 1)) {
            return matriz[0][0];
        }

        int signo = 1;

        for (int columna = 0; columna < columnas; columna++) {
            // Obtiene el adjunto de fila=0, columna=columna, pero sin el signo.
            double[][] submatriz = getSubmatriz(matriz, filas, columnas, columna);
            determinante = determinante + signo * matriz[0][columna] * determinante(submatriz);
            signo *= -1;
        }
        //System.out.println("determinante = " + determinante);
        return determinante;
    }

    public static double[][] getSubmatriz(double[][] matriz, int filas, int columnas, int columna) {
        double[][] submatriz = new double[filas - 1][columnas - 1];
        int contador = 0;
        for (int j = 0; j < columnas; j++) {
            if (j == columna) {
                continue;
            }
            for (int i = 1; i < filas; i++) {
                submatriz[i - 1][contador] = matriz[i][j];
            }
            contador++;
        }
        return submatriz;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaInverza;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbCrearM;
    private javax.swing.JButton jbInvertir;
    private javax.swing.JLabel jlbFila;
    private javax.swing.JTable jtMatrizEntrad;
    private javax.swing.JTextField txtColumna;
    private javax.swing.JTextField txtFila;
    // End of variables declaration//GEN-END:variables
}
