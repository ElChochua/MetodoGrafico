package Elementos;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eventos implements ActionListener {
    private TextField[] textFields;
    //Constructor que permite introducir un numero N de TextFields con el uso de varargs
    public Eventos(TextField... textFields){
        this.textFields = textFields;
    }
    //Ciclo For que se cicla por una cantidad N de TextFields
    @Override
    public void actionPerformed(ActionEvent e) {
        for(TextField textField : textFields){
            textField.setText(null);
        }
    }
}
