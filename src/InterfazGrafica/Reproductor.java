package InterfazGrafica;

import javax.swing.*;
import FuncionamientoApp.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reproductor extends JFrame {
    Biblioteca biblioteca;
    public Reproductor(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        setTitle("Reproductor de Video");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //South
        JPanel panelReproduccion = new JPanel();
        panelReproduccion.setLayout(new BoxLayout(panelReproduccion, BoxLayout.X_AXIS));
        JButton Pause = new JButton("Pause");
        JButton Play = new JButton("Play");
        JButton Stop = new JButton("Stop");

        panelReproduccion.add(Pause);
        panelReproduccion.add(Play);
        panelReproduccion.add(Stop);
        add(panelReproduccion, BorderLayout.SOUTH);


        //Center
        JPanel tecladoNumerico = new JPanel();
        tecladoNumerico.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JTextArea pantalla = new JTextArea();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;

        tecladoNumerico.add(pantalla, gbc);

        JButton limpiar = new JButton("Limpiar");
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.setText("");
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        tecladoNumerico.add(limpiar, gbc);

        JButton b1 = new JButton("  1  ");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("1");
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        tecladoNumerico.add(b1, gbc);
        JButton b2 = new JButton("  2  ");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("2");
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        tecladoNumerico.add(b2, gbc);
        JButton b3 = new JButton("  3  ");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("3");
            }
        });
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        tecladoNumerico.add(b3, gbc);
        JButton b4 = new JButton("  4  ");
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("4");
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        tecladoNumerico.add(b4, gbc);
        JButton b5 = new JButton("  5  ");
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("5");
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        tecladoNumerico.add(b5, gbc);
        JButton b6 = new JButton("  6  ");
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("6");
            }
        });
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        tecladoNumerico.add(b6, gbc);
        JButton b7 = new JButton("  7  ");
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("7");
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        tecladoNumerico.add(b7, gbc);
        JButton b8 = new JButton("  8  ");
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("8");
            }
        });
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        tecladoNumerico.add(b8, gbc);
        JButton b9 = new JButton("  9  ");
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("9");
            }
        });
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        tecladoNumerico.add(b9, gbc);
        JButton b0 = new JButton("0");
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pantalla.append("0");
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        tecladoNumerico.add(b0, gbc);

        add(tecladoNumerico, BorderLayout.CENTER);


        //North
        JProgressBar progressBar = new JProgressBar();
        progressBar.setStringPainted(true);

        add(progressBar, BorderLayout.NORTH);

        setVisible(true);
    }
}
