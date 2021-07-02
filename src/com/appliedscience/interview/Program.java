package com.appliedscience.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program {
	
 static	List<Score> listedsore = new ArrayList<>();
	
	
	public static void add(Score score)
	{
		listedsore.add(score);
		
		if(listedsore.isEmpty())
		{
			listedsore.add(score);
		}else
		{
			System.out.println("inside else "+score.getName());
			
			HashMap<String, Score> hashedscore = new HashMap<String, Score>();
			
			for(Score var: listedsore)
			{
				String key =  var.getValue()+var.getName();	
				hashedscore.put(key, var);	
			}
			
			String key =  score.getValue()+score.getName();	
			hashedscore.put(key, score);
			
			listedsore =  new ArrayList<>();
			
			for(Map.Entry<String, Score> value :hashedscore.entrySet() )
			{
				if(listedsore.isEmpty())
				{
				listedsore.add(value.getValue());
				}else
				{
					listedsore.add(0, value.getValue());
				}
				
			}
			
		}
		

	}
	
	
	public static void main(String[] args) 
	{
		add(new Score("vinod",1));
		add( new Score("Raina",2));
		add(new Score("Tyson",3));
		add(new Score("vinod",10));
		add(new Score("vinod",10));
		
		for (Score score : listedsore)
		{
		System.out.println(score.getName() +' '+ score.getValue());	
		}
		
	}
	

}


