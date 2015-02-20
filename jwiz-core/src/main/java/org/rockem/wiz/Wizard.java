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

package org.rockem.wiz;

import java.util.List;

public class Wizard {

    private final WizardAction action;
    private final List<Object> pages;

    public Wizard(WizardAction action, List<Object> pages) {
        this.action = action;
        this.pages = pages;
    }

    public void dispatchFinish() {
        action.execute();
    }

    public void dispatchCancel() {
        action.cancel();
    }

    public Object getCurrentPage() {
        return pages.get(0);
    }
}
