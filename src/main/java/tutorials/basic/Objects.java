/*
 * Copyright (c) 2018. by 10bashi - I just started learning programming. So please forgive for my mistakes!
 */

package tutorials.basic;

import javax.swing.*;

public class Objects {


    public static void main (String[] args){

        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(800,600);
        window.setTitle("My first Java Window");

        JLabel label = new JLabel();
        label.setText("My Label");
        window.add(label);

        String s = "hi";
//        s.hashCode();
        System.out.println(s.hashCode());

    }
}
