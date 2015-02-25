package org.rockem.jwiz.swing;

import org.rockem.wiz.Wizard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class WizardButtonsPanel extends JPanel {

    private final Wizard wizard;

    public WizardButtonsPanel(Wizard wizard) {
        this.wizard = wizard;
        createButtons();
    }

    private void createButtons() {
        add(createBackButton());
        add(createNextButton());
        add(createFinishButton());
        add(createCancelButton());
    }

    private JButton createBackButton() {
        return new JButton(new AbstractAction("Back") {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private JButton createNextButton() {
        return new JButton(new AbstractAction("Next") {
            @Override
            public void actionPerformed(ActionEvent e) {
                wizard.dispatchNext();
            }
        });
    }

    private JButton createFinishButton() {
        return new JButton(new AbstractAction("Finish") {
            @Override
            public void actionPerformed(ActionEvent e) {
                wizard.dispatchFinish();
            }
        });
    }

    private JButton createCancelButton() {
        return new JButton(new AbstractAction("Cancel") {
            @Override
            public void actionPerformed(ActionEvent e) {
                wizard.dispatchCancel();
            }
        });
    }


}
