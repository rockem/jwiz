package org.rockem.jwiz.example.swing;

import org.rockem.wiz.Wizard;
import org.rockem.wiz.WizardAction;

import javax.swing.*;

public class WizardDialog extends JDialog {

    private final Wizard wizard;

    public WizardDialog(WizardAction action) {
        wizard = new Wizard(action);
    }
}
