package queennCrossn;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	
    public static int digitcheck(String n){
        if (n.length()==1)
        {
             return Integer.parseInt(n);
        }
         long p = 0;
        System.out.println(n);
        for(int i = 0;i<n.length();i++){
            
            p += Integer.parseInt(Character.toString( n.charAt(i)));
        }
   
        return digitcheck( Long.toString(p));
        
        
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n+2];
//input        
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
//sorting
        Arrays.sort(s, new Comparator<Object>() {
            @Override
            public int compare(Object a1, Object a2) {
                BigDecimal bigDec1 = new BigDecimal((String)a1);
                BigDecimal bigDec2 = new BigDecimal((String)a2);
                return bigDec2.compareTo(bigDec1);
            }
            });
//output
        for(int i=0;i<n;i++){
          System.out.println(s[i]);
         } 
     }
	}


