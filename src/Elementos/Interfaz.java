
package Elementos;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.jfree.chart.ChartFrame;




public class Interfaz extends JFrame {
    /*El Label de la izquierda tiene el objetivo, Funcion objetivo y las 3 restricciones
      El Label del centro va a tener los valores de las restricciones Fijas para que no sean editadas
      Y el Label de la derecha va a tener los valores que tomara la grafica
      Para (1) x numero + y numero = z
      cuando x vale 0 y y vale 0 pero ya te la sabritas
     Fox1 Funcion objetivo x1
     txtR1x1Final se refiere al valor de cuando x1 o x2 no vale 0 :p
     */

    private TextField txtFox1,txtFox2,txtR1x1,txtR1x2,txtR2x1,txtR2x2,txtR3x1,txtR3x2,txtR1Coeficiente,txtR2Coeficiente,txtR3Coeficiente;
    private JLabel l_Izquierda, l_Centro, l_Derecho,l_Objetivo,l_Fox1,l_Fox2,
            l_Restriccion1,l_Restriccion2,l_Restriccion3,l_Rr1x1,l_Rr1x2,l_Rr2x1,l_Rr2x2,l_Rr3x1,l_Rr3x2,l_FuncionObjetivo
            ,l_SujetoA,l_SujetoARestriccion1,l_SujetoARestriccion2,l_SujetoARestriccion3, l_R1x1IsCero,l_R1x2IsCero, l_R2x1IsCero,l_R2x2IsCero, l_R3x1IsCero,l_R3x2IsCero,
            l_FuncionObjetivoFijax1,l_FuncionObjetivoFijax2, l_R1x1Final, l_R1x2Final, l_R2x1Final, l_R2x2Final, l_R3x1Final, l_R3x2Final;

    private JButton b_Limpiar, b_Calcular,b_AgregarR,b_BorrarR,b_Graficar, b_Pruebas;
    private JComboBox j_Objetivo, j_Desigualdad1,j_Desigualdad2,j_Desigualdad3;

    public Interfaz(){
        setLayout(new BorderLayout());
        JFrame f_Grafico = new JFrame("Grafico");
        //Creacion de los componentes
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\jossu\\OneDrive\\Escritorio\\MetodoGrafico\\MetodoGrafico\\src\\gato.jpg");
        l_Objetivo = new JLabel("Objetivo:");
        b_Limpiar = new JButton("Limpiar");
        b_Calcular = new JButton("Calcular");
        b_AgregarR = new JButton("Agregar Restriccion");
        b_BorrarR = new JButton("Borrar Restriccion");
        b_Graficar  = new JButton("Graficar");
        b_Pruebas = new JButton("Pruebas");
        l_Restriccion1 = new JLabel("Restriccion 1:");
        l_Restriccion2 = new JLabel("Restriccion 2:");
        l_Restriccion3 = new JLabel("Restriccion 3:");
        l_SujetoA = new JLabel("Sujeto A:");
        l_SujetoARestriccion1 = new JLabel("Para Restriccion 1:");
        l_SujetoARestriccion2 = new JLabel("Para Restriccion 2:");
        l_SujetoARestriccion3 = new JLabel("Para Restriccion 3:");
        l_Fox1 = new JLabel("X1 +");
        l_Fox2 = new JLabel("X2");
        l_Rr1x1 = new JLabel("X1 +");
        l_Rr1x2 = new JLabel("X2");
        l_Rr2x1 = new JLabel("X1 +");
        l_Rr2x2 = new JLabel("X2");
        l_Rr3x1 = new JLabel("X1 +");
        l_Rr3x2 = new JLabel("X2");
        l_FuncionObjetivoFijax1 = new JLabel();
        l_FuncionObjetivoFijax2 = new JLabel();
        l_R1x1IsCero = new JLabel("x1=0");
        l_R1x2IsCero = new JLabel("x2=0");
        l_R2x1IsCero = new JLabel("x1=0");
        l_R2x2IsCero = new JLabel("x2=0");
        l_R3x1IsCero = new JLabel("x1=0");
        l_R3x2IsCero = new JLabel("x2=0");
        l_R1x1Final = new JLabel();
        l_R1x2Final = new JLabel();
        l_R2x1Final = new JLabel();
        l_R2x2Final = new JLabel();
        l_R3x1Final = new JLabel();
        l_R3x2Final = new JLabel();
        l_Derecho = new JLabel();
        l_Centro = new JLabel();
        l_FuncionObjetivo = new JLabel();
        l_Izquierda = new JLabel();
        j_Objetivo = new JComboBox();
        j_Desigualdad1 = new JComboBox();
        j_Desigualdad2 = new JComboBox();
        j_Desigualdad3 = new JComboBox();
        txtR1x1 = new TextField();
        txtR1x2 = new TextField();
        txtR2x1 = new TextField();
        txtR2x2 = new TextField();
        txtR3x1 = new TextField();
        txtR3x2 = new TextField();
        txtFox1 = new TextField();
        txtFox2 = new TextField();
        txtR1Coeficiente = new TextField();
        txtR2Coeficiente = new TextField();
        txtR3Coeficiente = new TextField();

        //Propiedades
        j_Objetivo.addItem("Maximizar");
        j_Objetivo.addItem("Minimizar");
        j_Desigualdad1.addItem("≥");
        j_Desigualdad1.addItem("≤");
        j_Desigualdad1.addItem("=");
        j_Desigualdad2.addItem("≥");
        j_Desigualdad2.addItem("≤");
        j_Desigualdad2.addItem("=");
        j_Desigualdad3.addItem("≥");
        j_Desigualdad3.addItem("≤");
        j_Desigualdad3.addItem("=");
        XYSeriesCollection datasetRestricciones = new XYSeriesCollection();


        //declaracion de la grafica
        JFreeChart chart = ChartFactory.createXYLineChart("Grafica", "Eje X"
                , "Eje Y"
                , datasetRestricciones, PlotOrientation.VERTICAL
                , true, false, false);


        XYSeriesCollection datasetObjetico = new XYSeriesCollection();

        //Restriccion 1
        XYSeries seriesRestriccion1 = new XYSeries("Restriccion 1");
        seriesRestriccion1.add(0,0);
        datasetRestricciones.addSeries(seriesRestriccion1);
        //Restriccion 2
        XYSeries seriesRestriccion2 = new XYSeries("Restriccion 2");
        seriesRestriccion2.add(0,0);
        datasetRestricciones.addSeries(seriesRestriccion2);
        //Restriccion 3
        XYSeries seriesRestriccion3 = new XYSeries("Restriccion 3");
        seriesRestriccion3.add(0,0);
        datasetRestricciones.addSeries(seriesRestriccion3);
        //Creacion de objetos para la grafica
        XYLineAndShapeRenderer renderObjetivo = new XYLineAndShapeRenderer();
        renderObjetivo.setSeriesPaint(0, Color.RED);
        XYLineAndShapeRenderer renderRestricciones = new XYLineAndShapeRenderer();
        renderRestricciones.setSeriesPaint(0, Color.BLUE);
        renderRestricciones.setSeriesShapesVisible(0, true);
        renderRestricciones.setSeriesFillPaint(0, new Color(255, 255, 255, 100));
        XYPlot plot1 = chart.getXYPlot();
        plot1.setDataset(0, datasetObjetico);
        plot1.setRenderer(0, renderObjetivo);
        plot1.setDataset(1, datasetRestricciones);
        plot1.setRenderer(1, renderRestricciones);
        JFreeChart chart1 = new JFreeChart("Metodo Grafico",JFreeChart.DEFAULT_TITLE_FONT,plot1,true);
        chart1.setBackgroundPaint(Color.white);
        ChartPanel chartPanel = new ChartPanel(chart1);
        chartPanel.setBackground(Color.RED);
        //Tamaño del grafico
        chartPanel.setPreferredSize(new java.awt.Dimension(300, 300));
        f_Grafico.setSize(900,700);
        f_Grafico.setLocationRelativeTo(this);
        //f_Grafico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //f_Grafico.getContentPane().setLayout(null);
        f_Grafico.getContentPane().add(chartPanel);

        //Funcion objetivo
        l_Fox1.setBounds(80,70,50,60);
        txtFox1.setBounds(15,90,60,25);
        txtFox2.setBounds(115,90,60,25);
        l_FuncionObjetivoFijax1.setBounds(20,40,140,100);
        l_FuncionObjetivoFijax2.setBounds(20,60,140,100);
        //TxtBox de las restricciones
        txtR1x1.setBounds(15,160,60,25);
        txtR1x2.setBounds(115,160,60,25);
        txtR2x1.setBounds(15,230,60,25);
        txtR2x2.setBounds(115,230,60,25);
        txtR3x1.setBounds(15,300,60,25);
        txtR3x2.setBounds(115,300,60,25);
        l_FuncionObjetivo.setBounds(20,20,80,60);
        l_Fox2.setBounds(185,70,50,60);
        //Restriccion base 1
        l_Restriccion1.setBounds(20,120,80,20);
        l_SujetoARestriccion1.setBounds(20,120,120,20);
        //Restriccion 1 Cuando x1 es cero y x2 es cero
        l_R1x1IsCero.setBounds(20,140,80,20);
        l_R1x2IsCero.setBounds(120,140,80,20);
        //El final en el nombre es por que ya estan fijados y no se pueden modificar
        l_R1x1Final.setBounds(20,160,80,25);
        l_R1x2Final.setBounds(120,160,80,25);
        l_Rr1x1.setBounds(80,140,50,60);
        l_Rr1x2.setBounds(185,140,50,60);
        txtR1Coeficiente.setBounds(270,160,70,25);
        //Restriccion base 2
        l_Restriccion2.setBounds(20,190,80,60);
        l_SujetoARestriccion2.setBounds(20,180,120,60);
        //Restriccion 2 Cuando x1 es cero y x2 es cero
        l_R2x1IsCero.setBounds(20,200,200,60);
        l_R2x2IsCero.setBounds(120,200,200,60);

        l_R2x1Final.setBounds(20,240,80,25);
        l_R2x2Final.setBounds(120,240,80,25);

        l_Rr2x1.setBounds(80,210,50,60);
        l_Rr2x2.setBounds(185,210,50,60);
        txtR2Coeficiente.setBounds(270,230,70,25);
        //Restriccion base 3
        l_Restriccion3.setBounds(20,260,80,60);
        l_SujetoARestriccion3.setBounds(20,280,120,20);
        //Restriccion 3 Cuando x1 es cero y x2 es cero
        l_R3x1IsCero.setBounds(20,280,200,60);
        l_R3x2IsCero.setBounds(120,280,200,60);

        l_R3x1Final.setBounds(20,320,80,25);
        l_R3x2Final.setBounds(120,320,80,25);

        l_Rr3x1.setBounds(80,280,50,60);
        l_Rr3x2.setBounds(185,280,50,60);
        txtR3Coeficiente.setBounds(270,300,70,25);
        //Propiedades de los componentes
        l_Objetivo.setBounds(20,10,100,50);
        j_Objetivo.setBounds(20,50,100,20);
        j_Desigualdad1.setBounds(220,160,40,25);
        j_Desigualdad2.setBounds(220,230,40,25);
        j_Desigualdad3.setBounds(220,300,40,25);
        l_Izquierda.setBorder(BorderFactory.createLineBorder(Color.black));
        l_Izquierda.setBounds(0,0,400,600);
        l_Centro.setBorder(BorderFactory.createLineBorder(Color.black));
        l_Centro.setBounds(410,0,400,700);
        l_Derecho.setBorder(BorderFactory.createLineBorder(Color.black));
        l_Derecho.setBounds(820,0,400,600);
        //l_FuncionObjetivoFijax1.setBorder(BorderFactory.createLineBorder(Color.black));
        //Botones y funcionamiento
        b_AgregarR.setBounds(20,450,150,40);
        b_BorrarR.setBounds(20,500,150,40);
        b_Calcular.setBounds(200,450,150,40);
        b_Limpiar.setBounds(200,500,150,40);
        b_Graficar.setBounds(120,500,150,30);
        //Boton para rellenar espacios pa ver si jala esta mauser
        b_Pruebas.setBounds(120,400,150,30);
        b_Pruebas.addActionListener(this::actionPerformed);

        //Comportamiento de los botones y los ComboBox
        j_Objetivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(j_Objetivo.getSelectedItem().equals("Maximizar")){
                    l_FuncionObjetivo.setText("Maximizar");
                }else{
                    l_FuncionObjetivo.setText("Minimizar");
                }
            }
        });
        b_Limpiar.addActionListener(new Eventos(txtFox1,txtFox2,txtR1x1,txtR1x2,txtR2x1,txtR2x2,txtR3x1,txtR3x2,txtR1Coeficiente,txtR2Coeficiente,txtR3Coeficiente));
        b_Calcular.addActionListener(this::actionPerformed);
        b_AgregarR.addActionListener(this::actionPerformed);
        b_BorrarR.addActionListener(this::actionPerformed);
        /*
           Esta parte de codigo la copie directo de la del amaral porque cuando yo lo ponia saltaba un error donde no debia
           Pero por alguna razon la grafica no se muestra en la ventana que se abre al darle a graficar 👍
         */
        b_Graficar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                f_Grafico.setVisible(true);

                f_Grafico.add(chartPanel);
                //Convertir restricciones X y Y a double para usarlas en la grafica
                //Restriccion Y
                String txtResY1 = l_R1x1Final.getText();
                final double txtRestriccionY1_double = Double.parseDouble(txtResY1);

                String txtResY2 = l_R2x1Final.getText();
                final double txtRestriccionY2_double = Double.parseDouble(txtResY2);

                String txtResY3 = l_R3x1Final.getText();
                final double txtRestriccionY3_double = Double.parseDouble(txtResY3);

                // Ahora las X

                String txtResX1 = l_R1x2Final.getText();
                final double txtRestriccionX1_double = Double.parseDouble(txtResX1);

                String txtResX2 = l_R2x2Final.getText();
                final double txtRestriccionX2_double = Double.parseDouble(txtResX2);

                String txtResX3 = l_R3x2Final.getText();
                final double txtRestriccionX3_double = Double.parseDouble(txtResX3);

                // Actualizamos la grafica a los nuevos valores dependiendo de
                // las funciones

                seriesRestriccion1.clear(); // Limpiamos antiguos valores
                seriesRestriccion2.clear(); // Limpiamos antiguos valores
                seriesRestriccion3.clear(); // Limpiamos antiguos valores
                seriesRestriccion1.add(0.0, txtRestriccionY1_double);
                seriesRestriccion1.add(txtRestriccionX1_double, 0.0);
                seriesRestriccion2.add(0.0, txtRestriccionY2_double);
                seriesRestriccion2.add(txtRestriccionX2_double, 0.0);
                seriesRestriccion3.add(0.0, txtRestriccionY3_double);
                seriesRestriccion3.add(txtRestriccionX3_double, 0.0);

            }
        });
        /*
        JLabel txtTitleZ = new JLabel("Conocer el valor de Z");
        txtTitleZ.setFont(new Font("Poppins", Font.BOLD, 14));
        txtTitleZ.setEnabled(false);
        txtTitleZ.setBounds(672, 402, 225, 31);
        f_Grafico.add(txtTitleZ);
        JLabel txtSubTitle = new JLabel("Para la segunda restricción");
        txtSubTitle.setFont(new Font("Poppins", Font.PLAIN, 14));
        txtSubTitle.setEnabled(false);
        txtSubTitle.setBounds(671, 420, 194, 31);
        f_Grafico.add(txtSubTitle);
        JLabel txtParaA = new JLabel("A(0,0) = ");
        txtParaA.setFont(new Font("Poppins", Font.PLAIN, 14));
        txtParaA.setEnabled(false);
        txtParaA.setBounds(681, 462, 71, 31);
        f_Grafico.add(txtParaA);
        JLabel txtParaB = new JLabel("B(0,0) = ");
        txtParaB.setFont(new Font("Poppins", Font.PLAIN, 14));
        txtParaB.setEnabled(false);
        txtParaB.setBounds(681, 483, 71, 31);
        f_Grafico.add(txtParaB);
        */
        //Apartado de las 3 restricciones que van a estar ahi por mientras
        //JLabel de la izquierda
        l_Izquierda.add(txtR1x1);
        l_Izquierda.add(txtR1x2);
        l_Izquierda.add(txtR2x1);
        l_Izquierda.add(txtR2x2);
        l_Izquierda.add(txtR3x1);
        l_Izquierda.add(txtR3x2);
        l_Izquierda.add(l_Rr1x1);
        l_Izquierda.add(l_Rr1x2);
        l_Izquierda.add(l_Rr2x1);
        l_Izquierda.add(l_Rr2x2);
        l_Izquierda.add(l_Rr3x1);
        l_Izquierda.add(l_Rr3x2);
        l_Izquierda.add(txtR1Coeficiente);
        l_Izquierda.add(txtR2Coeficiente);
        l_Izquierda.add(txtR3Coeficiente);
        l_Izquierda.add(j_Desigualdad1);
        l_Izquierda.add(j_Desigualdad2);
        l_Izquierda.add(j_Desigualdad3);
        l_Izquierda.add(l_Restriccion1);
        l_Izquierda.add(l_Restriccion2);
        l_Izquierda.add(l_Restriccion3);
        l_Izquierda.add(txtFox1);
        l_Izquierda.add(txtFox2);
        l_Izquierda.add(l_Fox1);
        l_Izquierda.add(l_Fox2);
        l_Izquierda.add(l_Objetivo);
        l_Izquierda.add(b_AgregarR);
        l_Izquierda.add(b_BorrarR);
        l_Izquierda.add(b_Calcular);
        l_Izquierda.add(b_Limpiar);
        l_Izquierda.add(j_Objetivo);
        //Contenido del JLabel del centro
        l_Centro.add(b_Graficar);
        l_Centro.add(l_FuncionObjetivo);
        l_Centro.add(l_SujetoARestriccion1);
        l_Centro.add(l_SujetoARestriccion2);
        l_Centro.add(l_SujetoARestriccion3);
        l_Centro.add(l_R1x1IsCero);
        l_Centro.add(l_R2x1IsCero);
        l_Centro.add(l_R3x1IsCero);
        l_Centro.add(l_FuncionObjetivoFijax1);
        l_Centro.add(l_FuncionObjetivoFijax2);

        l_Centro.add(l_R1x1Final);
        l_Centro.add(l_R1x2Final);
        l_Centro.add(l_R2x1Final);
        l_Centro.add(l_R2x2Final);
        l_Centro.add(l_R3x1Final);
        l_Centro.add(l_R3x2Final);
        l_Centro.add(l_R1x1IsCero);
        l_Centro.add(l_R1x2IsCero);
        l_Centro.add(l_R2x1IsCero);
        l_Centro.add(l_R2x2IsCero);
        l_Centro.add(l_R3x1IsCero);
        l_Centro.add(l_R3x2IsCero);
        l_Derecho.add(chartPanel);



        getContentPane().add(chartPanel);
        add(l_Derecho);
        add(l_Centro);
        add(b_Pruebas);
        setResizable(false);
        //Propiedades del Frame
        setIconImage(icon);
        setTitle("Ola Padilla");
        add(l_Izquierda);
        setSize(1200,600);
        setVisible(true);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b_AgregarR){
            //Agregar restriccion
            JOptionPane.showMessageDialog(null, "Agregar Restriccion");
        }
        if(e.getSource()==b_BorrarR){
            //Borrar restriccion
            JOptionPane.showMessageDialog(null, "Borrar Restriccion");
        }
        if(e.getSource()== b_Calcular){
            //Calcular
            despejarXyY(txtR1x1,txtR1x2,txtR2x1,txtR2x2,txtR3x1,txtR3x2,txtR1Coeficiente,txtR2Coeficiente,txtR3Coeficiente,l_R1x1Final,l_R1x2Final,l_R2x1Final,l_R2x2Final,l_R3x1Final,l_R3x2Final);
            l_FuncionObjetivoFijax1.setText(txtFox1.getText() + "X1");
            l_FuncionObjetivoFijax2.setText(txtFox2.getText() + "X2");
        }
        if(e.getSource() == b_Pruebas){
            txtFox1.setText("600");
            txtFox2.setText("700");

            //Restriccion 1
            txtR1x1.setText("1");
            txtR1x2.setText("2");
            txtR1Coeficiente.setText("140");
            //Restriccion 2
            txtR2x1.setText("2");
            txtR2x2.setText("2");
            txtR2Coeficiente.setText("140");
            //Restriccion 3
            txtR3x1.setText("3");
            txtR3x2.setText("2");
            txtR3Coeficiente.setText("240");

        }
    }
    public static void despejarXyY(TextField R1x1,TextField R1x2,TextField R2x1,TextField R2x2, TextField R3x1,
                                   TextField R3x2,TextField R1Coeficiente,TextField R2Coeficiente, TextField R3Coeficiente,
                                   JLabel l_R1x1Final,JLabel l_R1x2Final,JLabel l_R2x1Final, JLabel l_R2x2Final,JLabel l_R3x1Final,JLabel l_R3x2Final){
        //Restriccion 1
        Double R1x1Double = Double.parseDouble(R1x1.getText());
        Double R1x2Double = Double.parseDouble(R1x2.getText());
        Double R1CoeficienteDouble = Double.parseDouble(R1Coeficiente.getText());
        R1x1Double = R1CoeficienteDouble / R1x1Double;
        R1x2Double = R1CoeficienteDouble / R1x2Double;
        l_R1x1Final.setText(R1x2Double.toString());
        l_R1x2Final.setText(R1x1Double.toString());

        //Restriccion 2
        Double R2x1Double = Double.parseDouble(R2x1.getText());
        Double R2x2Double = Double.parseDouble(R2x2.getText());
        Double R2CoeficienteDouble = Double.parseDouble(R2Coeficiente.getText());
        R2x1Double = R2CoeficienteDouble / R2x1Double;
        R2x2Double = R2CoeficienteDouble / R2x2Double;
        l_R2x1Final.setText(R2x2Double.toString());
        l_R2x2Final.setText(R2x1Double.toString());
        //Restriccion 3
        Double R3x1Double = Double.parseDouble(R3x1.getText());
        Double R3x2Double = Double.parseDouble(R3x2.getText());
        Double R3CoeficienteDouble = Double.parseDouble(R3Coeficiente.getText());
        R3x1Double = R3CoeficienteDouble / R3x1Double;
        R3x2Double = R3CoeficienteDouble / R3x2Double;
        l_R3x1Final.setText(R3x2Double.toString());
        l_R3x2Final.setText(R3x1Double.toString());


    }

}
