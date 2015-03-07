/*
 * This file is part of JWiz.
 *
 * JWiz is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JWiz is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JWiz.  If not, see <http://www.gnu.org/licenses/>.
 */
package test.org.rockem.wiz;

import org.junit.Before;
import org.junit.Test;
import org.rockem.wiz.Wizard;
import org.rockem.wiz.WizardAction;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WizardTest {

    private WizardAction action;
    private Wizard wizard;
    private List<Object> pages = Arrays.asList(new Object(), new Object(), new Object());

    @Before
    public void setUp() throws Exception {
        action = mock(WizardAction.class);
        wizard = new Wizard(action, pages);
    }

    @Test
    public void shouldExecuteActionOnFinish() throws Exception {
        wizard.dispatchFinish();
        verify(action).execute();
    }

    @Test
    public void shouldCancelActionOnCancel() throws Exception {
        wizard.dispatchCancel();
        verify(action).cancel();
    }

    @Test
    public void shouldRetrieveFirstPage() throws Exception {
        assertTrue("Current page is not the first page",
                wizard.getCurrentPage() == pages.get(0));
    }

    @Test
    public void nextGoToNextPage() throws Exception {
        wizard.dispatchNext();
        assertTrue("Current page is not the second page",
                wizard.getCurrentPage() == pages.get(1));
    }
}
