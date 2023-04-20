
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
     */
    private JLabel l_Izquierda, l_Centro, l_Derecho,
            l_Objetivo;

    private JButton b_Limpiar,b_Calcular,b_AgregarR,b_BorrarR;
    private JComboBox j_Objetivo;

    public Interfaz(){
        setLayout(null);
        //Creacion de los componentes
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\jossu\\OneDrive\\Escritorio\\MetodoGrafico\\MetodoGrafico\\src\\gato.jpg");
        l_Objetivo = new JLabel("Objetivo:");
        b_Limpiar = new JButton("Limpiar");
        b_Calcular = new JButton("Calcular");
        b_AgregarR = new JButton("Agregar Restriccion");
        b_BorrarR = new JButton("Borrar Restriccion");
        l_Izquierda = new JLabel();
        j_Objetivo = new JComboBox();

        //Propiedades
        j_Objetivo.addItem("Maximizar");
        j_Objetivo.addItem("Minizar");

        l_Objetivo.setBounds(20,10,100,50);
        j_Objetivo.setBounds(20,50,100,20);
        l_Izquierda.setBorder(BorderFactory.createLineBorder(Color.black));
        l_Izquierda.setBounds(0,0,400,600);
        b_AgregarR.setBounds(20,450,150,40);
        b_BorrarR.setBounds(20,500,150,40);
        b_Calcular.setBounds(200,450,150,40);
        b_Limpiar.setBounds(200,500,150,40);

        l_Izquierda.add(l_Objetivo);
        l_Izquierda.add(b_AgregarR);
        l_Izquierda.add(b_BorrarR);
        l_Izquierda.add(b_Calcular);
        l_Izquierda.add(b_Limpiar);
        l_Izquierda.add(j_Objetivo);
        
        //Propiedades del Frame
        setIconImage(icon);
        setTitle("Ola Padilla");
        add(l_Izquierda);
        setSize(1200,600);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
