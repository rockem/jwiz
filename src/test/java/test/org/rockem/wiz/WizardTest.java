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

import org.junit.Test;
import org.rockem.wiz.Wizard;
import org.rockem.wiz.WizardAction;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WizardTest {

    @Test
    public void shouldExecuteActionOnFinish() throws Exception {
        WizardAction action = mock(WizardAction.class);
        Wizard w = new Wizard(action);
        w.dispatchFinish();
        verify(action).execute();
    }

    @Test
    public void shouldCancelActionOnCancel() throws Exception {
        WizardAction action = mock(WizardAction.class);
        Wizard w = new Wizard(action);
        w.dispatchCancel();
        verify(action).cancel();
    }
}
