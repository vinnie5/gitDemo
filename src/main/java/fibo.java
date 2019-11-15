public class fibo{  
 static int n1=0,n2=1,n3=0;    
 public static  int  Fibonacci_print(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         //System.out.print(" "+n3);   
         Fibonacci_print(count-1);    
     }
    else{
    	System.out.print(" "+n3);
    	
    }
   // System.out.print(" "+n3);  
    return n3;
 }    

 public static void main(String args[]){    
  int count=4;    
  //System.out.print(n1+" "+n2);//printing 0 and 1    
  Fibonacci_print(count-1);//n-2 because 2 numbers are already printed   
 }  
}  