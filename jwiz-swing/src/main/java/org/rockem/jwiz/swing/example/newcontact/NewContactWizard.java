package org.rockem.jwiz.swing.example.newcontact;


import org.rockem.jwiz.swing.WizardDialog;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class NewContactWizard {

    private static List<Object> pages = Arrays.asList(
            (Object)new GetContactDetailsView(),
            (Object)new GetContactPhoneNumbersView(),
            (Object)new ContactSummaryView()
    );

    public static void main(String[] args) {
        WizardDialog w = new WizardDialog(new NewContactWizardAction(), pages);
        w.showDialog();
    }
}
