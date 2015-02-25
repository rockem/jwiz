package org.rockem.jwiz.swing;

import org.rockem.wiz.Wizard;
import org.rockem.wiz.WizardAction;

import javax.swing.*;
import java.awt.*;
import java.util.List;


public class WizardDialog extends JDialog {

    private final Wizard wizard;

    public WizardDialog(WizardAction action, List<Object> pages) {
        wizard = new Wizard(action, pages);
        setLayout(new BorderLayout());
        add(new WizardPagePanel(wizard), BorderLayout.CENTER);
        add(new WizardButtonsPanel(wizard), BorderLayout.PAGE_END);
        setSize(800, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void showDialog() {
        setVisible(true);
    }
}
