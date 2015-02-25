package org.rockem.jwiz.swing.example.newcontact;

import javax.swing.*;import java.awt.*;

/**
 * Created by ESegal on 23/02/2015.
 */
public class GetContactDetailsView extends JPanel {

    public GetContactDetailsView() {
        super(new GridLayout(3, 2));
        add(new JLabel("Name"));
        add(new JTextField());
        add(new JLabel("Acupation"));
        add(new JTextField());
        add(new JLabel("Age"));
        add(new JTextField());

    }
}
