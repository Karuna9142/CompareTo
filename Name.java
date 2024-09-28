package com.comparetoex;
import java.util.Comparator;

class Name implements Comparator<Employe>
{
       @Override
		public int compare(Employe o1, Employe o2)
		{
			return o1.name.compareTo(o2.name);
			
		}

	

}
