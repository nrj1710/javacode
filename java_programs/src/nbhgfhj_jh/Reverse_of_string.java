package nbhgfhj_jh;

import java.util.Iterator;
import java.util.Scanner;

public class Reverse_of_string {

	public static void main(String[] args) {
		//abc();
		//def();
		//ghi();
		//opq();
		//jkl();
		//mno();
		//pqr();
		//stu();
		vwx();
		//yza();
		//bcd();
		}
		
		static void abc() {
		String str ="This is Java class";
		                                                                           //siht si avaJ ssalc
		
		String[]x= str.split(" ");
		//x[0]=This
		//x[1]= is
		//x[2]=java
	    //x[3]=class
		for(int i=0; i< x.length; i++) {
			for(int j=x[i].length()-1; j>=0; j--) {
				System.out.print(x[i].charAt(j));
				
			}
			System.out.print(" ");
			
		}

	}
		static void def() {
			String str ="This is Java class";
		
		                                                                            //ssalc avaJ si sihT
		String[]x= str.split(" ");
		        //x[0]=This
				//x[1]= is
				//x[2]=java
			    //x[3]=class
		
		for(int i=x.length-1; i>=0; i--) {
			for(int j=x[i].length()-1; j>=0; j--) {
				System.out.print(x[i].charAt(j));
				
			}
			System.out.print(" ");
			
		}

			
		}
		static void ghi() {
			String str = "This is Java selenium class";
			                                                                       //Class Selenium Java is This
					String[]x=str.split(" ");
					//x[0]=This
					//x[1]=is
					//x[2]=java
					//x[3]=selenium
					//x[4]=class
			for(int i=x.length-1; i>=0; i--) {
				System.out.print(x[i]+" ");
			}
				
			}
			
			static void opq() {
				String str = "This is Java selenium class";
				//ssalC mineleS avaJ si sihT
						String[]x=str.split(" ");
						//x[0]=This
						//x[1]=is
						//x[2]=java
						//x[3]=selenium
						//x[4]=class
				for(int i=x.length-1; i>=0; i--) {
					System.out.print(x[i]+" ");
				}
				System.out.println();
				System.out.println("String size:"+str.length());
				
				for(int i=str.length()-1; i>=0; i--) {
					System.out.print(str.charAt(i));
					
				}
		}

			
		static void jkl() {
			String str ="this is java selinum class";
			//This Is Java Selenium Class
			
			String []x =str.split(" ");
			String temp="";
			
			for(int i=0; i<x.length; i++) {
				//for(int j =0; j<x[i].length(); j++) {
				temp =temp+ "  " +x[i].replace(x[i].charAt(0),Character.toUpperCase(x[i].charAt(0)));
					
				}
			System.out.println(temp);
			}
		
              static void mno () {
            	  
	            String str= "car is running but bus is stopped";
	            String[]x= str.split(" ");
	        //x[0]= car
			//x[1]=is 
			//x[2]=running
			//x[3]=but
			//x[4]=bus
			//x[5]=is
			//x[6]=stopped
			
	            for (int i=0; i<x.length; i++) {
		        //System.out.println(x[i]);
		             for(int j=x[i].length()-1; j>=0; j--) {
			         System.out.print(x[i].charAt(j));
		            }
		                System.out.print(" ");
			
		                    }
	
                    }
                static void pqr() {
                	String str ="This$is@java*Cl#asS190Batch";
                	int uc= 0;
                	int lc=0;
                	int dc =0;
                	int sc=0;
                	
                	for (int i=0; i<str.length(); i++) {
                		char c= str.charAt(i);
                		if(Character.isUpperCase(c)) {
                			uc =uc+1;
                		}else if(Character.isLowerCase(c)) {
                			lc=lc+1;
                			}else if(Character.isDigit(c)){
                				dc=dc+1;
                		}else  {
                			sc=sc+1;
                		}
                	}
                	 System.out.println("UpperCaseCount:"+uc);
                	 System.out.println("LowerCaseCount:"+lc);
                	 System.out.println("DigitCount:"+dc);
                	 System.out.println("Special Characters Count:"+sc);
                }
                static void stu () {
                	Scanner sc= new Scanner(System.in);                                       //string palidrom
                	System.out.println("entr a string");
                      String s =sc.next();
                      String reverse="";
                      for(int i=s.length()-1; i>=0; i--) {
                    	  reverse=reverse+s.charAt(i);
                    	  
                      }System.out.println("reverse;"+reverse);
                      if(s.equals(reverse)) {
                    	  System.out.println("given string is palidrom:"+s);
                      }
                      else {
                    	  System.out.println("given string is not palidrom:"+reverse);
                      }
                      
                      
                	
                }
                    static void vwx() {
                    	String str= "This is java selenium program";
			                                                                        //marg or pmui nelesava jsisihT
                    	String str1 = str.replace(" ", "");
                        System.out.println(str1);
                         String rev= "";
                      for (int i =str1.length()-1; i>=0; i--) {                         //10 retain spaces
                              rev = rev + str1.charAt(i);
                                 }
                           System.out.println(rev);
                                String value="";
                                   int j =0;
                                  for (int i = 0; i <str.length(); i++) {
                                    if(str.charAt(i)== ' ') {
                                    value = value +  " ";
                                         } else {
                                     value = value +rev.charAt(j);
                                           j=j+1;
                                                     }
                                                            }
                                              System.out.println(value);
                                     }
				                

			
				
			
                   
                 static void yza() {
                	 Scanner sc = new Scanner(System.in);
                	 System.out.println("Enter a string");
                	 String str = sc.next();                       // vowels counting
                	 int vc =0;
                	 int cc =0;
                	 char[]vowels= {'a','e','i','o','u'};
                	 for (int i=0; i<str.length(); i++) {
                		 char c=str.charAt(i);
                		 int temp= vc;
                		 for (int j=0; j<vowels.length; j++) {
                			 if(c==vowels[j]) {
                				 vc=vc+1;
                				 
                			 }
                		 }
                	 }
                	 
                	 System.out.println("vowels count:"+vc);
                	 System.out.println("consonent count:"+cc);
                	 
                	 }
                 static void bcd() {
                	 String str ="sreenivasramanujan";                         //counting the charecter
                	 String temp = str;
                	 for(int i=0; i<str.length(); i++) {
                		 int count =1;
                		 if (temp.charAt(i)!='#') {
                			 for (int j=i+1; j<str.length(); j++) {
                				 if (temp.charAt(i)==temp.charAt(j)) {
                					 count=count+1;
                					 temp=str.replace(str.charAt(j), '#');
                				 }
                			 }
                			 System.out.println(str.charAt(i)+" "+count);
                		 }
                	 }
                	 
                 }
                 }
	
