/*
 *  Copyright (C) 2010 Zigabyte Corporation. All rights reserved.
 *
 *  This file is part of QuantDesk - http://code.google.com/p/quantdesk/
 *
 *  QuantDesk is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  QuantDesk is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with QuantDesk.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.winance.optimizer.portfolio;

import com.winance.optimizer.symbols.Symbol;
import java.util.ArrayList;


public class Portfolio
{
    public Portfolio()
    {
        positions = new ArrayList<Symbol>();
    }

    public void addPosition(Symbol symbol)
    {
        positions.add(symbol);
    }

    public Symbol getPosition(int index)
    {
        if(index<size())
            return positions.get(index);

        return null;
    }

    public void removePosition(Symbol position)
    {
        positions.remove(position);
    }

    public int size()
    {
        return positions.size();
    }

    private ArrayList<Symbol> positions;
}
