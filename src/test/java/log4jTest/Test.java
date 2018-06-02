package log4jTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
while(sc.hasNext()){
	int num = sc.nextInt();
	ArrayList<Integer> list = new ArrayList<Integer>(); 
	for(int i=0;i<num;i++)
		list.add(sc.nextInt());
	Collections.sort(list);
	Collections.reverse(list);
	int count = 0;
	while(!list.isEmpty()){
		Iterator<Integer> it = list.iterator();
		int value = 0;
		int temp = 0;
		while(it.hasNext()){
			temp = it.next();
			value = value + temp;
			if(value == 4){
				count ++;
				it.remove();
				break;
			}else if(value > 4){
				value = value - temp;
				continue;
			}else if(value < 4){
				it.remove();
			}
		}
		if(value < 4)
			count ++;
	}
	System.out.println(count);
}
}	

}
