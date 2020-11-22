package ru.geekbrains.CatEat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.GroupLayout.Alignment.*;

public class MyWindow extends JFrame {

    public MyWindow(Plate plate, Cat catFelix, Cat catTom, Cat catGav){

        setTitle("давай покормим котов");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,800,100);
        setResizable(false);

        //элементы формы
        JButton btTom = new JButton("Покормить Тома");
        JButton btGav = new JButton("Покормить котёнка по имени \"Гав\"");
        JButton btFelix = new JButton("Покормить Феликса");
        JButton btAdd = new JButton("Добавить еды в тарелку");
        JTextField fCountEat = new JTextField();


        setLayout(new GridLayout(2, 3));
        add(btFelix);
        add(btGav);
        add(btTom);
        add(fCountEat);
        add(btAdd);

        btFelix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                catFelix.eat(plate);
                plate.info();
            }
        });

        btTom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                catTom.eat(plate);
                plate.info();
            }
        });

        btGav.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                catGav.eat(plate);
                plate.info();
            }
        });

        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = Integer.parseInt(fCountEat.getText());
                plate.addEat(count);
            }
        });
        setVisible(true);
    }
}
