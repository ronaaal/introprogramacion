package semana6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumero {
    private JPanel panelPrincipal;
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumarButton;
    private JLabel lbl_resultado;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton dividirButton;

    public SumaNumero() {
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt(textField1.getText())+ Integer.parseInt(textField2.getText());
                lbl_resultado.setText(String.valueOf(suma));
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resta = Integer.parseInt(textField1.getText()) - Integer.parseInt(textField2.getText());
                lbl_resultado.setText(String.valueOf(resta));
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int multiplicacion = Integer.parseInt(textField1.getText()) * Integer.parseInt(textField2.getText());
                lbl_resultado.setText(String.valueOf(multiplicacion));
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double division = Double.parseDouble(textField1.getText()) / Double.parseDouble(textField2.getText());
                lbl_resultado.setText(String.valueOf(division));
            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio = new JFrame("SumaNumero");
        inicio.setContentPane(new SumaNumero().panelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
