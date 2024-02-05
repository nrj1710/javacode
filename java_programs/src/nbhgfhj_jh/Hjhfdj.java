package nbhgfhj_jh;


import java.util.Scanner;


public class Hjhfdj {

	

	public static void main(String[] args) {
		//abc();
		//def();
		//ghi();
		//jkl();
        //mno(); 
		//pqr();
		//stu();
		//vwx();
		//yza();
		//bcd();
		//efg();
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
		//uvw();
		//xyz();
		//abcd();
		//efgh();
		//ijkl();
		//mnop();
		//qrst();
		//uvwx();
		yzab();
		//cdef();
		//ghij();
	}
          	
		
		static void abc() {
		for(int i=1; i<=5; i++)
		for(int j=1; j<=10; j++)
			
			System.out.println(i+ " "+j);
		}
			
		static void def() {    //fibonacci series
			int n=1;  
			
			int firstTerm=0, secondTerm =1;
			System.out.println("fibonacci series");
			
			
			for(int i= 1; i<=1000; ++i) {
				System.out.print(firstTerm +" ");
				System.out.print(",");
				int nextTerm= firstTerm+secondTerm;
				firstTerm=secondTerm;
				secondTerm=nextTerm;
			}
			
		}
		static void ghi() {
			for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
			}
		static void jkl() {
			int n=5;
			for(int i=5; i>=1; i--  ) {
				
			for(int j=i; j>=i; j++) {
				System.out.print("*");
				
					
				}
			
			System.out.println();
				
			}
				
			}
		
		static void mno() {
			int x=0;
			while(x<10) {
				x=x+1;
				System.out.println(x);
			}
		}
		static void pqr() {
			int x=11;  //x=1
			while(x<=110){//while(x<=10)
				System.out.println(x);
				x=x+11;//x=x+1
			}
			System.out.println("hai");
			
		}
		

		static void stu() {
			int x=1;
			while(x<=10) {
				System.out.println("niraj");
				x=x+1;
			}System.out.println("hello");
		}
		
		static void vwx() {
			int p =10;             // revise this concept
			do {
				System.out.println(p);
				p=p+1;
		
		}while(p<20);
		}
		
		
		static void yza() {
			
			for(int i=2; i<=20; i+=2 )
				System.out.println(i);
		
		}
		
		
		static void bcd() {
			int x =1;
			while(x<=10) {
				System.out.print(x);
				if(x<10) {
					System.out.print(",");
					}else{
						System.out.println(".");
				}
				x+=1;
			}System.out.println("come soon");
			System.out.println("hello");
			System.out.println("niraj");
			System.out.println("\n");
			System.out.println("\n"+"\t"+"deepak");
		}

		
		static void efg() {
			String str = "Garima";
			
			for(int i=10; i>=1; i--) {
				if(i==5)
				
				System.out.print(i );
				
			}System.out.println(str);
			
		}
		
		static void hij() {
			for (int i= 1; i <=5; i++) {
				
				
				for(int j= 1; j<=i; j++) {
					
					System.out.print("j");
					System.out.print("\t");
					
				}
				System.out.println();
			}
		}
		static void klm() {
			for(int i=1; i<=5; i++) {                                 //5 4 3 2 1 
				                                                      //5 4 3 2 
				                                                      //5 4 3 
				                                                      //5 4 
				                                                      //5 
				for(int j=5; j>=i ; j--) {
					System.out.print(j+" ");
				
			}
			System.out.println();
			
		}
}
		
		static void nop() {
			for(int i=1; i<=5; i++) {
				for(int j=1; j<=5; j++ ) {
					System.out.print(j+ " ");
					
						
					
			}System.out.println();
			
		}
}			
	
		static void qrs() {
			for(int i=1; i<=5; i++) {
				
				for(int j=1; j<=i; j++) {
					
				System.out.print(j+ " ");
			}
				System.out.println();
		}
          }
		
		static void tuv() {                               //1 2 3 4 5
			for(int i=5; i>=1; i--) {                     //1 2 3 4
		                                                  //1 2 3
			                                              //1 2
			for(int j=1; j<=i; j++) {                     //1
				
			System.out.print(j+ " ");
		}
			System.out.println();
			
		}
			
		}	
		
		static void wxy() {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a  number: ");
			int x =sc.nextInt();//12345
			int rem =0;
			int rev =0;
			while(x>=1){
			rem =x%10; //6 5 4 3 2 1
			x=x/10;
			rev= rev*10+rem ;    //0*10+6=6= 6*10+5 = 65*10+4=654*10+3=6543*10+2=65432*10+1=654321
			
				
			}
			System.out.println("reverse number:"+ rev);
		}
		
		static void zab() {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter Day Number: ");
			int dayNo =sc.nextInt();
			switch(dayNo) {
			case 1:
				System.out.println("Monday");
			case 2:
				System.out.println("Tuesday");
			case 3:
				System.out.println("wednesday");
				break;
			case 4:
				System.out.println("Thursday");
			case 5:
				System.out.println("Friday");
			case 6:
				System.out.println("Saturday");
			case 7:
				System.out.println("sunday");
				default:
					System.out.println("invalid");
					break;
			}
			
		}
		static void cde() {
			int x=1;
			while(x<=10) {
				System.out.println(x);
				if(x>=8) {
					System.out.println("hai");
				}x=x+1;
			}
		}
		
			
		
		
		static void fgh() {
			int x=1;
			while(x<=10) {
				System.out.println(x);
				if(x>=8) {
					System.out.println("hai");
					break;
				}x=x+1;
			}
		}
		static void ijk() {
			int x=1;
			while(x<=10) {
				System.out.println(x);
				if(x>=8) {
					System.out.println("hai");
					break;
				}System.out.println("raju");
				x=x+1;
			}
		}
		static void lmn() {
			int x= 1;
			while(x<=10) {
				System.out.println(x);
				while(x<=5) {
					System.out.println("hello");
				}
				x=x+1;
			}
		}
		static void opq() {
			
			int x= 1;
			while(x<=10) {
				System.out.println(x);
				while(x<=5) {
					System.out.println("hello");
					if(x==3) {
						System.out.println("bye bye");
					}
					x=x+1;
				}
				x=x+1;
			}
		}
		static void rst() {
		int x= 1;
		while(x<=10) {
			System.out.println(x);
			while(x<=5) {
				System.out.println("hello");
                   x=x+1;
			}
			x=x+1;
		}
	}
		
		
		
		
          static void uvw () {
			
			int x= 1;
			while(x<=10) {
				System.out.println(x);
				while(x<=5) {
					System.out.println("hello");
					if(x==3) {
						System.out.println("bye bye");
						break;
					}
					x=x+1;
				}
				x=x+1;
			}
		}
          static void xyz() {
        	  for(int i=1; i<=5; i++) {
        		  System.out.println("Ramesh");
        		  if(i>3) {
        			  System.out.println("Suresh");
        		  }
        		  System.out.println("Krishna");
        	  }
        	  
          }
          
          

           
              static void abcd() {
                  Scanner sc = new Scanner(System.in);                            //palindrome OF A NUMBER//

                  System.out.print("Enter a number: ");
                  int number = sc.nextInt();

                  if (isPalindrome(number)) {
                      System.out.println(number + " is a palindrome.");
                  } else {
                      System.out.println(number + " is not a palindrome.");
                  }

                  sc.close();  }                                              // Function to check if a number is a palindrome
              private static boolean isPalindrome(int num) {
                  int originalNum = num;
                  int reversedNum = 0;

                  while (num > 0) {
                      int digit = num % 10;
                      reversedNum = reversedNum * 10 + digit;
                      num /= 10;
                  }

                  return originalNum == reversedNum;
              }
              
              
              
              
                
            	   static void efgh(){  
            	   int i,fact=1;                                                // factorial number
            	   int number=5;             //It is the number to calculate factorial    
            	   for(i=1;i<=number;i++){    
            	       fact=fact*i;    
            	   }    
            	   System.out.println("Factorial of "+number+" is: "+fact);    
            	  } 
            	   
            	       
            		    static void  ijkl () {                                            //prime number
            		    int i,m=0,flag=0;      
            		    int n=88;                                           //it is the number to be checked    
            		    m=n/2;      
            		    if(n==0||n==1){  
            		     System.out.println(n+" is not prime number");      
            		    }else{  
            		     for(i=2;i<=m;i++){      
            		      if(n%i==0){      
            		       System.out.println(n+" is not prime number");      
            		       flag=1;      
            		       break;      
            		      }      
            		     }      
            		     if(flag==0)  { System.out.println(n+" is prime number"); }  
            		    }//end of else  
            		  } 
            		    
            		   

            		    
            		         static void mnop () {                                     // even odd

            		            Scanner sc = new Scanner(System.in);

            		            System.out.print("Enter a number: ");
            		            int num = sc.nextInt();

            		            if(num%2 == 0){
            		                System.out.println(num + " is even");
            		            }else{
            		                System.out.println(num + " is odd");
            		            }
            		        }
            		         
            		         
            		          
            		          
            		         static void qrst () {                             //  square root of number
            		         System.out.print("Enter a number: ");  
            	                                                           //creating object of the Scanner class  
            		         Scanner sc = new Scanner(System.in);  
            		                                                                //reading a number form the user  
            		         int n = sc.nextInt();  
            		                                                        //calling the method and prints the result  
            		         System.out.println("The square root of "+ n+ " is: "+squareRoot(n));  
            		         }  
            		                                                                       //user-defined method that contains the logic to find the square root  
            		         public static double squareRoot(int num)   
            		         {  
            		                                                             //temporary variable  
            		         double t;  
            		         double sqrtroot=num/2;  
            		         do   
            		         {  
            		         t=sqrtroot;  
            		         sqrtroot=(t+(num/t))/2;  
            		         }   
            		         while((t-sqrtroot)!= 0);  
            		         return sqrtroot;  
            		         } 
            		         
            		         
           static void uvwx () {                        //square of a number
             int d = 1000;
            double f;
          f=Math.pow(d, 2);
        System.out.println("The square of "+d+" = "+f);
            		        	    	//int number = 1000;                                        //another simple method
            		        	    	//int cube = number * number*number; // Squaring by multiplying the number with itself
            		        	    	//System.out.println(cube);  // This will output 2
            		        	    }
            		        	    
            		        	    static void yzab() {                                  
            		        	   for(int i=1; i<=5; i++) {
            		        	     for (int j=5; j>=i; j--) {
            		        	    	System.out.print(j+" ");                         
            		        	     }i=i+1;
            		        	     
            		        	     System.out.println(" ");
            		        	    	              }
            		        	    }                                                   
            		        	  

            		        	    
            	public static void cdef() {
            		String s="this is java selenium automation class ";
            		String[] x=s.split(" ");
            		System.out.println(x[0].length()+"="+x[0]);
            		System.out.println(x[1].length()+"="+x[1]);
            		System.out.println(x[2].length()+"="+x[2]);
            		System.out.println(x[3].length()+"="+x[3]);
            		System.out.println(x[4].length()+"="+x[4]);
            		System.out.println(x[5].length()+"="+x[5]);
         
            	}
            		        
            	static void ghij(){
            		for(int i=1; i<=6; i++) {  
//            			# 
//            			# # 
//            			# # # 
//            			# # # # 
//            			# # # # # 
//            			# # # # # # 

            			for(int j=1; j<=i; j++) { 
            				System.out.print("#"+" ");
            			}System.out.println();
            		}
            		
            	
            	
            	}
            	}



            		           
            		    
            		    
            		   
            	   
          



		




	
			
		
			
			
			
			
			
		
		
		


	
