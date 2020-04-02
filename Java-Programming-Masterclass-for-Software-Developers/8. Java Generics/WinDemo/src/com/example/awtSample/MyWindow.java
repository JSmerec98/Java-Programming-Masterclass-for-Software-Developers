package com.example.awtSample;

import java.awt.*;
import java.awt.event.*;

public class MyWindow extends Frame
{
    public MyWindow(String title) {
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SanSerif", Font.BOLD,18);
        Font sanSerifSmall = new Font("SansSerif",Font.BOLD,21);
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java Developer Course",60,60);
        g.setFont(sansSerifLarge);
        g.drawString("by Tim Buchalka", 60, 100);
    }
}
