/* 
 * Copyright (C) 2015 ikonstas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pltag.corpus;

public enum TagNodeType
{

    internal,
    root,
    anchor
    {
        public String getMarker()
        {
            return "<>";
        }
    },
    subst
    {
        public String getMarker()
        {
            return "!";
        }
    },
    foot
    {
        public String getMarker()
        {
            return "*";
        }
    },
    predicted
    {
        public String getMarker()
        {
            return "@";
        }
    },
    terminal;

    public String getMarker()
    {
        return "";
    }
}
