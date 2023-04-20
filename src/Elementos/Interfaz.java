
package Elementos;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
public class Interfaz extends JFrame {
    /*El Label de la izquierda tiene el objetivo, Funcion objetivo y las 3 restricciones
      El Label del centro va a tener los valores de las restricciones Fijas para que no sean editadas
      Y el Label de la derecha va a tener los valores que tomara la grafica
      Para (1) x numero + y numero = z
      cuando x vale 0 y y vale 0 pero ya te la sabritas
     Fox1 Funcion objetivo x1
     */
    private TextField txtFox1,txtFox2;
    private JLabel l_Izquierda, l_Centro, l_Derecho,
            l_Objetivo,l_Fox1,l_Fox2, l_Restriccion1,l_Restriccion2,l_Restriccion3;

    private JButton b_Limpiar,b_Calcular,b_AgregarR,b_BorrarR;
    private JComboBox j_Objetivo, j_Desigualdad1,j_Desigualdad2,j_Desigualdad3;

    public Interfaz(){
              setLayout(null);
        //Creacion de los componentes
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\jossu\\OneDrive\\Escritorio\\MetodoGrafico\\MetodoGrafico\\src\\gato.jpg");
        l_Objetivo = new JLabel("Objetivo:");
        b_Limpiar = new JButton("Limpiar");
        b_Calcular = new JButton("Calcular");
        l_Derecho = new JLabel();
        l_Centro = new JLabel();
        b_AgregarR = new JButton("Agregar Restriccion");
        b_BorrarR = new JButton("Borrar Restriccion");
        l_Izquierda = new JLabel();
        j_Objetivo = new JComboBox();
        j_Desigualdad1 = new JComboBox();
        j_Desigualdad2 = new JComboBox();
        j_Desigualdad3 = new JComboBox();
        l_Fox1 = new JLabel("X1 +");
        l_Fox2 = new JLabel("X2");
        l_Restriccion1 = new JLabel("Restriccion 1:");
        l_Restriccion2 = new JLabel("Restriccion 2:");
        l_Restriccion3 = new JLabel("Restriccion 3:");
        txtFox1 = new TextField();
        txtFox2 = new TextField();

        //Propiedades
        j_Objetivo.addItem("Maximizar");
        j_Objetivo.addItem("Minizar");
        j_Desigualdad1.addItem("≥");
        j_Desigualdad1.addItem("≤");
        j_Desigualdad1.addItem("=");
        j_Desigualdad2.addItem("≥");
        j_Desigualdad2.addItem("≤");
        j_Desigualdad2.addItem("=");
        j_Desigualdad3.addItem("≥");
        j_Desigualdad3.addItem("≤");
        j_Desigualdad3.addItem("=");

        l_Fox1.setBounds(80,70,50,60);
        txtFox1.setBounds(15,90,60,25);
        txtFox2.setBounds(115,90,60,25);
        l_Fox2.setBounds(185,70,50,60);
        l_Restriccion1.setBounds(20,120,80,60);
        l_Restriccion2.setBounds(20,190,80,60);
        l_Restriccion3.setBounds(20,260,80,60);
        l_Objetivo.setBounds(20,10,100,50);
        j_Objetivo.setBounds(20,50,100,20);
        j_Desigualdad1.setBounds(220,160,40,25);
        j_Desigualdad2.setBounds(220,230,40,25);
        j_Desigualdad3.setBounds(220,300,40,25);
        l_Izquierda.setBorder(BorderFactory.createLineBorder(Color.black));
        l_Izquierda.setBounds(0,0,400,600);
        l_Centro.setBorder(BorderFactory.createLineBorder(Color.black));
        l_Centro.setBounds(410,0,400,600);
        l_Derecho.setBorder(BorderFactory.createLineBorder(Color.black));
        l_Derecho.setBounds(820,0,400,600);
        b_AgregarR.setBounds(20,450,150,40);
        b_BorrarR.setBounds(20,500,150,40);
        b_Calcular.setBounds(200,450,150,40);
        b_Limpiar.setBounds(200,500,150,40);
        
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
        
        add(l_Derecho);
        add(l_Centro);
        setResizable(false);
        //Propiedades del Frame
        setIconImage(icon);
        setTitle("Ola Padilla");
        add(l_Izquierda);
        setSize(1200,600);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
