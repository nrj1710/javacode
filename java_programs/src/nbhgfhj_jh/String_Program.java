package nbhgfhj_jh;

public class String_Program {

	public static void main(String[] args) {
	 String str1 ="Nirajkumar";
	 System.out.println("size:"+str1.length());
	 System.out.println(str1.charAt(3));
	 System.out.println(str1.charAt(5));
	 
	 
	 
	 String str2= "nirajkumar";
	 boolean result = str1.equals(str2);
	 System.out.println(result);
	 
	 result=str1.equalsIgnoreCase(str2);
	 System.out.println(result);
	 
	 
	 String str3 ="srea";
	 
	 result =str1.contains(str3);
	 
	 System.out.println(result);
	 
	 System.out.println(str1.contains("rajk"));
	 
	 System.out.println(str1.contains("umar"));
	 
	 String value = str1.substring(4);
	 System.out.println(value);
	 
	 value =str1.substring(3,6);
	 System.out.println(value);
	  
	 String str4 ="Ramesh";
	 System.out.println(str4.trim());
	 System.out.println(str4);
	 
	 String str5="Suresh";
	 
	 value = str5.toUpperCase();
	 System.out.println(value);
	 System.out.println(str5.toLowerCase());
	 
	 String str6="";
	 
	 System.out.println(str6.isEmpty());
	 System.out.println(str5.isEmpty());
	 System.out.println(str6.isBlank());
	 
	 String str7 =str4.concat(" "+str5);
	 System.out.println(str7);
	 
	 value= str1.replace('r' , 'a');
	 System.out.println(value);
	 value = str1.replaceFirst("aj", "ej");
	 System.out.println(value);
	 
	 System.out.println(str1.indexOf('a'));
	 System.out.println(str1.indexOf('j'));
	 System.out.println(str1.lastIndexOf('r'));
	 System.out.println(str1.indexOf("niraj"));
	 
   String str8 ="welcome to Quality Thought";
   
   String[] data =str8.split("");
   System.out.println(data.length);
   for(int i=0; i<data.length; i++) {
	   System.out.println(data[i]);
	   }
   System.out.println(data[2]);
   String[] data1 =str8.split("to");
   System.out.print(data1.length);
   for(int i=0; i<data1.length; i++){
	   
	   System.out.print(data1[i]);
   }
   int x=900;
   String y= "800";
   System.out.println(x+Integer.parseInt(y));
   
   
   
   int   a =900;
   String c="700";
   System.out.println(a+ Integer.parseInt(c));
   String p =String.valueOf(a);
   System.out.println(p);
   
   double d =999.09;
   String z1 = String.valueOf(d);
System.out.println(d);

 double d1=Double.parseDouble(y);
System.out.println(d1);

float f1 =22.2f;
double d2 =f1;


char l ='A';

System.out.println(Character.toUpperCase(l));
System.out.println(Character.isLowerCase(l));


	}

}
