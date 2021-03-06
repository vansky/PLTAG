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

import java.util.ArrayList;
import java.util.List;

public class Entry
{

    public String file, treeNumber, wordNumber, baseForm, senseNumber;
    private List<Relation> properties;

    public Entry()
    {
        properties = new ArrayList<Relation>();
    }
    
    public Entry(String file, String treeNumber, String wordNumber, String baseForm, String senseNumber)
    {
        this();
        this.file = file;
        this.treeNumber = treeNumber;
        this.wordNumber = wordNumber;
        this.baseForm = baseForm;
        this.senseNumber = senseNumber;        
    }        

    public void setArgsMods(List<String> deps)
    {
        for(String dep : deps)
        {
            properties.add(new Relation(dep));
        }
//        propfields = deps;
//        Iterator<String> i = propfields.iterator();
//        while (i.hasNext())
//        {
//            String dep = (String) i.next();
//            Relation rel = new Relation(dep);
//            properties.add(rel);
//        }

    }

    public List<Relation> getArgsMods()
    {
        return properties;
    }

    public int numOfArgs()
    {
        return properties.size() - 1;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %s %s %s, %s", file, treeNumber, wordNumber, baseForm, properties);
    }
}
