package log4jTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			String[] s = str.split("[+]");
			TreeSet<Integer> set = new TreeSet<Integer>();
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			for(int i=0;i<s.length;i++){
				int temp = Integer.valueOf(s[i]);
				set.add(temp);
				if(map.containsKey(temp))
					map.put(temp, map.get(temp)+1);
				else
					map.put(temp, 1);
			}
			Iterator it = set.iterator();
			String res = "";
			while(it.hasNext()){
				int temp = (Integer)it.next();
				res = res + String.valueOf(temp) + "*" + map.get(temp) + "+";
			}
			System.out.println(res.substring(0, res.length()-1));
		}
	}	
}
