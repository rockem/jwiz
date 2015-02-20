package org.rockem.jwiz.example.swing;

import org.rockem.wiz.Wizard;
import org.rockem.wiz.WizardAction;

import javax.swing.*;
import java.util.List;

public class WizardDialog extends JDialog {

    private final Wizard wizard;

    public WizardDialog(WizardAction action, List<Object> pages) {
        wizard = new Wizard(action, pages);
    }
}
