package Wrapper_Class_Codes;

import java.util.Scanner;

public class ExtractNumrFromStringSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String with digit");
		
		String str=s.nextLine();
	       String temp="";
	        int sum=0;
	        for(int i=0;i<str.length();i++)
	        {
	           char ch=str.charAt(i);
	           if(Character.isDigit(ch)){
	            temp+=ch;
	           }
	           else{
	            if(!temp.equals("")){
	                sum+=Integer.parseInt(temp);
	                temp="";
	            }
	           }
	           
	        }
	        if(!temp.equals(""))
	        {
	            sum+=Integer.parseInt(temp);
	            
	        }
	        System.out.println("Sum is:  "+sum);
	    }
}

