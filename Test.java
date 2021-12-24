import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Test {
	public static void main(String[] args) {
		/*String str = "abbahdbb3242243242@%$@^$^@^$$$$$$daahrhhrbbaabbbcdccbbra";
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		int count = 1;
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		for(int i=0; i<ch.length; i++) {
			if(i+1 == ch.length) {
				break;
			}
			else {
				if(ch[i]==ch[i+1]) {
					count++;
				}
				else {
					hm.put(ch[i], count);
					count=1;
				}
			}
		}
		System.out.println(hm);
		
		int maxValue = Collections.max(hm.values());
		for(Map.Entry map : hm.entrySet()) {
			if((int)map.getValue() == maxValue) {
				System.out.println(map.getKey() + " occurred highest number of times.");
			}
		}*/
		
		 
	        /*String A="java";
	        String B="java";
	        
	        System.out.println(A.length() + B.length());
	        char Aarray[] = A.toCharArray();
	        char Barray[] = B.toCharArray();
	        for(int i=0; i<A.length() & i<B.length(); i++){
	            if((int)Aarray[i] > (int)Barray[i]){
	                System.out.println("Yes");
	                break;
	            }
	            else if((int)Aarray[i] == (int)Barray[i]){
	            	if(i == A.length()-1 || i == B.length()-1) {
	            		System.out.println("No");
		                break;
	            	}else
	            		continue;
	            }
	            else{
	                System.out.println("No");
	                break;
	            }
	        }

	        System.out.print(String.valueOf(Aarray[0]).toUpperCase() + A.substring(1, A.length()));
	        System.out.print(" "+String.valueOf(Barray[0]).toUpperCase() + B.substring(1, B.length()));*/
		
		
		/*String smallest = "";
        String largest = "";
        String str = "welcometojava";
        int k = 3;
        
        SortedSet<String> sets=new TreeSet<String>();
        for(int i=0;i<=str.length()-k;i++){
            sets.add(str.substring(i,i+k));
        }
        System.out.println(sets);
        System.out.println(sets.first());
        System.out.println(sets.last());*/
		
		
		//Palindrome function
		/*String A = "madam";
        char ch[] = A.toCharArray();
        char[] newch = new char[ch.length];
        int j=0;
        for(int i=A.length()-1; i>=0; i--){
            newch[j]=ch[i];
            j++;
        }
        String B = String.valueOf(newch);
        System.out.println(A.equals(B) ? "Yes" : "No");*/
		
		
		//Check Anagrams
		/*String A = "anagram";
		String B = "margana";
		if(A.length() == B.length()) {
			char[] charA = A.toCharArray();
			char[] charB = B.toCharArray();
			Arrays.sort(charA);
			Arrays.sort(charB);
			HashMap hmA = new HashMap();
			HashMap hmB = new HashMap();
			int countA = 1;
			int countB = 1;
			for(int i=0; i<charA.length-1; i++) {
				if(charA[i] == charA[i+1]) {
					countA++;
				}
				else {
					hmA.put(charA[i], i);
					countA=1;
				}
				
				if(charB[i] == charB[i+1]) {
					countB++;
				}
				else {
					hmB.put(charB[i], i);
					countB=1;
				}
			}
				System.out.println(hmA.equals(hmB) ? "Anagrams" : "Not Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}*/
		
		
		//String Tokenization
		/*String str = " He is a very very good boy, isn't he? ";
		String delims = "[ .,?'@#$%^&*()!\\_;:`~<>=]+";
		String[] tokens = str.trim().split(delims);
		System.out.println(tokens.length);
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}*/
		
		
		//Check Valid regex pattern
		/*String pattern = "([A-Z])(.+)";
		try {
			Pattern.compile(pattern);
			System.out.println("Valid");
		}
		catch(PatternSyntaxException e) {
			System.out.println("Invalid");
		}*/
		
		String m = "My new site ";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Integer");
		int a = scan.nextInt();
		System.out.println("Enter Double");
		double b = scan.nextDouble();
		System.out.println("Enter String");
		scan.nextLine();
		String c = scan.nextLine();
		System.out.println(m+c);
		int[] ahk = new int[5];
	}
}
