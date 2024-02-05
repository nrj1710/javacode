package nbhgfhj_jh;

import java.util.Scanner;

public class Mystring_practice {

	public static void main(String[] args) {
		//abc();
		//cba();
		//def();
	    //fed();
		//ghi();
	   //ihg();
	   //jkl();
		//lmo();
		//pqr();
	    //stu();
	    //vwx();
	    //yza();
	    //bcd();
	   efg();
		//hij();
		//klm();
		//nop();
		//qrs();
		//tuv();
		//wxy();
		//zab();
		//cde();
		//fgh();
		//ijk();
		//lmn();
		//opq();
		//rst();
		}
		 static void abc() {
		String str = "Hay love come we got it";
		//ti tog ew come love Hay
		String[]x=str.split(" ");
		//x[0]=Hay
		//x[1]=Love
		//x[2]=come
		//x[3]=we
		//x[4 =got
		//x[5]=it
		for(int i=x.length-1; i>=0; i--) {
			System.out.print(x[i]+" ");
		}

	}
		 static void cba(){
			 String str = "Are You Going School";
			 String[]x=str.split(" ");
					 for(int i=x.length-1; i>=0; i--) {
						 System.out.print(x[i]+" ");
					 }
		 }
		 static void def() {
			 String str ="Today is a hot bath today";
			 String[]x=str.split(" ");
			 
			 for(int i=0; i<=x.length; i++) {
				 for(int j=x[i].length()-1; j>=0; j--) {
					 System.out.print(x[i].charAt(j));
				 }
				 System.out.print(" ");
			 }
		 }
             static void fed() {
	      
	      String str ="Deeapk is going class";
			String[]x=str.split(" ");
			  for(int i=0; i<=x.length; i++) {
				for(int j=x[i].length()-1; j>=0; j--) 
				{
					System.out.print(x[i].charAt(j));
				}
				System.out.print(" ");
			}
}
             static void ghi() {
            	 String str ="eclips is a software to use java";
            	 String[]x=str.split(" ");
            	 String temp="";
            	 for(int i=0; i<x.length; i++) {
            		 temp=temp+" "+x[i].replace(x[i].charAt(0),Character.toUpperCase(x[i].charAt(0)));
            	 }
            	 System.out.println(temp);
             }
                static void ihg() {
            	 String str="i have iphone seven";
            	 String []x=str.split(" ");
            	 String temp="";
            	 for(int i=0; i<x.length; i++) {
            		 temp=temp+" "+x[i].replace(x[i].charAt(0),Character.toUpperCase(x[i].charAt(0)));
            	 }System.out.print(temp);
             }
             
                static void jkl() {
                	String str = "Iphone@soCosTaLLY2Buy0987s#o%I&caNt";
                			int uc =0;
                			int lc =0;
                			int dc =0;
                			int sc =0;
                			
                			for (int i=0; i<str.length(); i++) {
                				char c= str.charAt(i);
                				if(Character.isUpperCase(c)) {
                					uc=uc+1;
                					
                				}else if(Character.isLowerCase(c)) {
                					lc=lc+1;
                					
                				}else if(Character.isDigit(c)) {
                					
                					dc=dc+1;
                				}else{
                					sc=sc+1; 
                					
                				
                				System.out.println("UpperCaseCount"+uc);
                				System.out.println("LowerCaseCount"+lc);
                				System.out.println("DigitCount"+dc);
                				System.out.println("Special"+sc);
                			}
                }
                				
                			}
                static void lmo() {
                	String str ="This is Java selenium class";
    				String[]x =str.split(" ");
    				String max ="";
    				String min =x[0];
    				for(int i=0; i<x[i].length()-1; i++) {
    				String temp="";
    				String temp1="";
    				for(int j=0;x[i].length()-1>=j; j++) {
    					temp=temp+x[i].charAt(j);
    					temp1+=x[i].charAt(j);
    					if(temp.length()>max.length()) {
    						max=temp;
    						
    					}else if(min.length() >temp1.length()) {
    						min=temp1;
    					}
    				}
    				}
                	System.out.println("the max word is = "+max);
                	System.out.println("the min word is="+min);
                                          }
                
                static void pqr() {
                	String str1="hello honey come soon";       //x[0]=hello
                	//String str2="ram swarrop";                    
                    //System.out.println(str1.toLowerCase());
                	//System.out.println(str1.toUpperCase());
                	//System.out.println(str1.length());
                	//System.out.println(str1.charAt(4));
                	//boolean result= str1.equals(str2);
                	//System.out.println(result);
                	String []x=str1.split(" ");
                	for(int i=x.length-1; i>=0; i-- ) {
                		System.out.print(x[i]+" ");
                		
                		
                	}System.out.println(str1.toUpperCase());
       
                }
                				static void stu() {
                					for(int i=1; i<=5; i++) {
                						for(int j=5; j>=i; j--) {             //1
             							System.out.print(j+" ");
                						}i=i+1;
                						System.out.println(" ");
                						
                					}
                				}
                				static void vwx() {
                					for(int i=1; i<=6; i++) {
              						for(int j=1; j<=i; j++) {                //2
                							System.out.print("#" +" " );
                						}
                						System.out.println(" ");
                					}
                					
                						
                					}
                				static void yza() {
               				String A="this is me not you";                   //3
                					String[]x=A.split(" ");
                				for(int i=0; i<x.length; i++) {
                					
									System.out.print(x[i].length());
                				}
                					
                				}
                				static void bcd() {
                					String B ="i am useing laptop";
            				      String[] y =B.split(" ");                  //4
                					String temp=" ";
                					for(int i=0; i<y.length; i++ ) {
               temp=temp+" "+y[i].replace(y[i].charAt(0),Character.toUpperCase(y[i].charAt(0)));
                					}System.out.println(temp);
                				
                				}
                				static void efg() {
                					String s ="this is java selenium class";
                					String []c=s.split(" ");                           //5
                					for(int i=0; i<c.length; i++) {
                						for(int j=c[i].length()-1; j>=0; j--) {
                						System.out.print(c[i].charAt(j));	
                						}System.out.print(" ");
                					}
                					
                					
                				}
                				static void hij() {
                					int a=0, b=0 ,sum=1 ;
                					while(b<1000) {
                						a=b;                                      //6
                    					b=sum;
                    					sum=a+b;
                    					System.out.print(a+",");
                    					
                					}
                					
                				}
                				static void klm() {
                				Scanner sc =new Scanner(System.in);
                				System.out.println("enter a number");         //7
                			    int number = sc.nextInt();
                			    if(isPalindrom(number)) {
                			    	System.out.println(number+"is Palindrom");
                			    	
                			    }else {
                			    	System.out.println(number+"is not a Palindrom");
                			    }
                			    sc.close();
                					
                				}
								private static boolean isPalindrom(int number) {
							  int orignalNum=number;
							  int revNum=0; 
							  while(number>0) {
								  int digit=number%10;
								  revNum=revNum*10+digit;
								  number/=10;
								  
							  }
								 
							  
									return orignalNum==revNum;
								
								
								}
								static void nop() {
									//String str= {"tHiS","Is","jAVa","Class"}
									
									String[] str= {"tHiS","Is","jAVa","Class"};
									System.out.println("size:"+str.length);
									for(int i=0; i<str.length; i++) {                                   //8 counting upper case and lower case
										int uc=0;
										int lc=0;
										for(int j=0; j<str[i].length(); j++) {
											char ch= str[i].charAt(j);
											if (Character.isUpperCase(ch)) {
												uc=uc+1;
											}else if(Character.isLowerCase(ch)) {
												lc=lc+1;
											}
											}
										
						System.out.println((str[i]+"-->"+"UpperCaseCount:"+uc+"::LowerCaseCount:"+lc));	
										}
								}
								
                				static void qrs() {
                					String str="nirajdeepaksingh";
                					String temp=str;
                					for(int i=0; i<str.length(); i++) {                                  //9 countig the charecter in string
                						int count =1;
                						if (temp.charAt(i)!='#') {
                							for(int j=i+1; j< str.length(); j++) {
                								if (temp.charAt(i)==temp.charAt(j)) {
                									count=count+1;
                								}
                							}
                							temp=temp.replace(str.charAt(i),'#');
                							System.out.println(str.charAt(i)+" = "+count);
                							
                						}
                					}
                				
                					
                					
                				}
                				static void tuv() {
                                String str = "This is java selenium program";
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
                				static void wxy() {
                					String str="this is java selenium class";
                					String[]x=str.split(" ");
                					
                					for(int i=0; i<=x.length; i++) {
                						for(int j=x[i].length()-1; j>=0; j--) {
                							System.out.print(x[i].charAt(j));
                						}System.out.print(" ");
                					}
                					
                				}
                				static void zab() {
                					String str="this is selenium program";
                					 String str1= str.replace(" ","");
                					 System.out.println(str1);
                					  String rev="";
                					 for(int i=str1.length()-1; i>=0; i--) {
                						 rev=rev+str1.charAt(i);
                					 }System.out.println(rev);
                					 String value ="";
                					 int j=0;
                					 for(int i=0; i<str.length(); i++) {
                						 if(str.charAt(i)==' ') {
                							 value=value+" ";
                						 }else {
                							 value=value+rev.charAt(j);
                							 j=j+1;
                						 }
                					 }System.out.println(value);
                				}
                				static void cde() {
                					String []str= {"tHis","Is","jAVa","Class"};
                					System.out.println("size:"+str.length);
                					for(int i=0; i<str.length; i++) {
                						int uc=0;
                						int lc=0;
                						for(int j=0; j<str[i].length(); j++) {
                							char ch=str[i].charAt(j);
                							if(Character.isUpperCase(ch)) {
                								uc=uc+1;
                							}else if(Character.isLowerCase(ch)) {
                									lc=lc+1;
                								}
                							}
                							System.out.println(str[i]+"-->"+"Uppercasecount:"+uc +"Lowercasecount:"+lc);
                						}
                					}
                					static void fgh() {
                						for(int i=1; i<=5; i++) {
                							for(int j=5; j>=i; j--) {
                								System.out.print(j+" ");
                							}i=i+1;
                							System.out.println();
                						}
                				        }
                						static void ijk() {
                							for(int i=1; i<=6; i++) {
                								for(int j=1; j<=i; j++) {
                									System.out.print("#"+" ");
                								}System.out.println();
                							}
                							
                						}
                						static void lmn() {
                							String str="hello i am niraj";
                							 String [] x=str.split(" ");
                							 for(int i=0; i<=x.length; i++) {
                								 System.out.println(x[i].length());
                							 }
                						}
                						static void opq() {
                							String str="hey are you comeing";
                							String[]y=str.split(" ");
                							for(int i=0; i<=y.length; i++) {
                								for(int j=y[i].length()-1; j>=0; j--) {
                									System.out.print(y[i].charAt(j));	
                								}System.out.println("  ");
                							}
                						}
                						static void rst() {
                							String str="this is java class";
                							String []x=str.split(" ");
                							String temp="";
                							for(int i=0; i<=x.length; i++) {
                			temp=temp+" "+x[i].replace(x[i].charAt(0),Character.toUpperCase(x[i].charAt(0)));
                							}System.out.println(temp);
                							
                						}
                						
                					   }
                						   
                						   
                					   



