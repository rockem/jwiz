package org.rockem.jwiz.swing;

import javafx.collections.ObservableMap;
import org.rockem.wiz.Wizard;
import org.rockem.wiz.WizardChangedListener;

import javax.swing.*;
import java.awt.*;
import java.util.Observer;


public class WizardPagePanel extends JPanel implements WizardChangedListener {

    private final Wizard wizard;

    public WizardPagePanel(Wizard wizard) {
        super(new BorderLayout());
        this.wizard = wizard;
        this.wizard.addWizardChangedListener(this);
        wizardChanged();
    }

    @Override
    public void wizardChanged() {
        removeAll();
        add((Component)wizard.getCurrentPage(), BorderLayout.CENTER);
    }
}
