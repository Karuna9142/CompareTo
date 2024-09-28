package com.comparetoex;
import java.util.Comparator;

	class Id implements Comparator<Employe>
	{

			@Override
			public int compare(Employe o1, Employe o2) 
			{
				if(o1.id==o2.id)
				   return 0;
				else if(o1.id>o2.id)
					return 1;
				else
					return-1;
			}

		}
	


