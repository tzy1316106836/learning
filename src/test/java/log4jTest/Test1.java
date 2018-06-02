package log4jTest;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder(str);
			for(int j=0;j<sb.length();j++){
				for(int i=0;i<sb.length();i++){
					char c = sb.charAt(i);
					if(count(sb,c)>1){
						StringBuilder sbb = new StringBuilder(sb.toString());
						sbb.replace(i, i+1, "");
						if(sbb.toString().compareTo(sb.toString())>0){
							sb = sbb;
							i--;
						}
					}
					
				}
			}
			System.out.println(sb.toString());
		}
	}

	private static int count(StringBuilder sb, char c) {
		int count = 0;
		String temp = sb.toString();
		for(int i=0;i<temp.length();i++){
			if(temp.charAt(i)==c){
				count++;
			}
		}
		return count;
	}
}
