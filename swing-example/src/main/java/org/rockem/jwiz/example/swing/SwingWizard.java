package org.rockem.jwiz.example.swing;

import org.rockem.wiz.WizardAction;

import javax.swing.*;

public class SwingWizard {

    public static void main(String[] args) {
        new SwingWizard().execute();
    }

    private void execute() {
        createWizardDialog(new WizardAction() {
            @Override
            public void execute() {

            }

            @Override
            public void cancel() {

            }
        });
    }

    private void createWizardDialog(WizardAction action) {
        WizardDialog w = new WizardDialog(action);
        w.setSize(800, 600);
        w.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        w.setVisible(true);
    }
}
