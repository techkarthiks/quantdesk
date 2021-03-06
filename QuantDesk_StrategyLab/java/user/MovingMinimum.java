/*
 *  javastock - Java MetaStock parser and Stock Portfolio Simulator
 *  Copyright (C) 2005 Zigabyte Corporation. ALL RIGHTS RESERVED.
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.

 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.

 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package user;

import com.zigabyte.metastock.data.StockDataPoint;
import com.zigabyte.stock.indicator.*;

/** Compute the maximum price over the last dayCount days. **/
public class MovingMinimum extends AbstractMovingIndicator {
  //// CONSTRUCTORS
  /** @see AbstractMovingIndicator#AbstractMovingIndicator(int) **/
  public MovingMinimum(int dayCount) {
    this(dayCount, false);
  }
  /** @see AbstractMovingIndicator#AbstractMovingIndicator(int,boolean) **/
  public MovingMinimum(int dayCount, boolean countCalendarDays) {
    this(dayCount, countCalendarDays, StockDataPoint.FieldID.HIGH);
  }
  /** @see AbstractMovingIndicator#AbstractMovingIndicator(int,boolean,StockDataPoint.FieldID) **/
  public MovingMinimum(int dayCount, boolean countCalendarDays,
		       StockDataPoint.FieldID fieldID) {
    super(dayCount, countCalendarDays, fieldID);
  }

  //// AbstractMovingIndicator
  /** Result is initially zero **/
  public double initialCombinationValue() {
    return Double.MAX_VALUE;
  } 
  /** Combine by taking maximum item value. **/
  public double combine(double combination, double itemValue) {
    return Math.min(combination, itemValue);
  }
  //// OBJECT toString
  public String toString() {
    return super.toString("Max");
  }
}



