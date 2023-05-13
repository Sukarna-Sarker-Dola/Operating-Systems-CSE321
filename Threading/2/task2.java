import java.util.Arrays;
public class task2 {
  public static void main (String[]args) {
        thone obj1=new thone();
        thtwo obj2=new thtwo();
        ththree obj3=new ththree();
        thfour obj4=new thfour();
        thfive obj5=new thfive();
        thsix obj6=new thsix();
        thseven obj7=new thseven();
        theight obj8=new theight();
        thnine obj9=new thnine();
        thten obj10=new thten();
        
        
        obj1.start();
        try {
        obj1.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();     
        }
        int div1=obj1.divisor1();
        int num1=obj1.number1();
        obj2.start();
        try {
        obj2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();     
        }
        int div2=obj2.divisor2();
        int num2=obj2.number2();
        obj3.start();
        try {
       obj3.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();     
        }
        int div3=obj3.divisor3();
        int num3=obj3.number3();
        obj4.start();
        try {
       obj4.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();     
        }
        int div4=obj4.divisor4();
        int num4=obj4.number4();
        obj5.start();
        try {
       obj5.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();     
        }
        int div5=obj5.divisor5();
        int num5=obj5.number5();
        obj6.start();
        try {
       obj6.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();     
        }
        int div6=obj6.divisor6();
        int num6=obj6.number6();
        obj7.start();
        try {
       obj7.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();     
        }
        int div7=obj7.divisor7();
        int num7=obj7.number7();
        obj8.start();
        try {
       obj8.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();     
        }
        int div8=obj8.divisor8();
        int num8=obj8.number8();
         obj9.start();
        try {
       obj9.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();     
        }
        int div9=obj9.divisor9();
        int num9=obj9.number9();
      
        obj10.start();
        try {
       obj10.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();     
        }
        int div10=obj10.divisor10();
        int num10=obj10.number10();
        int []a={div1,div2,div3,div4,div5,div6,div7,div8,div9,div10};
        Arrays.sort(a);
         if(a[a.length-1]==div10) {
           System.out.print("This number: "+num10+" has the largest number of divisors which is: "+div10+" from the results from 1 to 100000");
         }
         else if(a[a.length-1]==div9) {
           System.out.print("This number: "+num9+" has the largest number of divisors which is: "+div9+" from the results from 1 to 100000");
         }
         else if(a[a.length-1]==div8) {
           System.out.print("This number: "+num8+" has the largest number of divisors which is: "+div8+" from the results from 1 to 100000");
         }
         else if(a[a.length-1]==div7) {
          System.out.print("This number: "+num7+" has the largest number of divisors which is: "+div7+" from the results from 1 to 100000");
         }
         else if(a[a.length-1]==div6) {
         System.out.print("This number: "+num6+" has the largest number of divisors which is: "+div6+" from the results from 1 to 100000");
         }
         else if(a[a.length-1]==div5) {
           System.out.print("This number: "+num5+" has the largest number of divisors which is: "+div5+" from the results from 1 to 100000");
         }
         else if(a[a.length-1]==div4) {
           System.out.print("This number: "+num4+" has the largest number of divisors which is: "+div4+" from the results from 1 to 100000");
         }
         else if(a[a.length-1]==div3) {
           System.out.print("This number: "+num3+" has the largest number of divisors which is: "+div3+" from the results from 1 to 100000");
         }
         else if(a[a.length-1]==div2) {
           System.out.print("This number: "+num2+" has the largest number of divisors which is: "+div2+" from the results from 1 to 100000");
         }
         else if(a[a.length-1]==div1) {
           System.out.print("This number: "+num1+" has the largest number of divisors which is: "+div1+" from the results from 1 to 100000");
         }
         
    }
}
class thone extends Thread {
  int maxcount=1;
  int number=1;
  int i;
    public void run() {       
      for ( i = 2;  i <= 10000;  i++ ) {      
           int count=0;            
           for ( int j = 1;  j <= i;  j++ ) { 
              if ( i % j == 0 )
                 count++;
           }           
           if (count > maxcount) {
              maxcount = count;
              number = i;
           }       
       }
    }
   public int divisor1() {
      int div=maxcount;
      return div;
    }
   public int number1() {
      int num=number;
      return num;
    }
    }
class thtwo extends Thread {
  int maxcount=1;
  int number=1;
  int i;
    public void run() {       
      for ( i = 10001;  i <= 20000;  i++ ) {      
           int count=0;            
           for ( int j = 1;  j <= i;  j++ ) { 
              if ( i % j == 0 )
                 count++;
           }           
           if (count > maxcount) {
              maxcount = count;
              number = i;
           }       
       }
    }
   public int divisor2() {
      int div=maxcount;
      return div;
    }
   public int number2() {
      int num=number;
      return num;
    }
    }
class ththree extends Thread {
  int maxcount=1;
  int number=1;
  int i;
    public void run() {       
      for ( i = 20001;  i <= 30000;  i++ ) {      
           int count=0;            
           for ( int j = 1;  j <= i;  j++ ) { 
              if ( i % j == 0 )
                 count++;
           }           
           if (count > maxcount) {
              maxcount = count;
              number = i;
           }       
       }
    }
   public int divisor3() {
      int div=maxcount;
      return div;
    }
   public int number3() {
      int num=number;
      return num;
    }
    }
class thfour extends Thread {
  int maxcount=1;
  int number=1;
  int i;
    public void run() {       
      for ( i = 30001;  i <= 40000;  i++ ) {      
           int count=0;            
           for ( int j = 1;  j <= i;  j++ ) { 
              if ( i % j == 0 )
                 count++;
           }           
           if (count > maxcount) {
              maxcount = count;
              number = i;
           }       
       }
    }
   public int divisor4() {
      int div=maxcount;
      return div;
    }
   public int number4() {
      int num=number;
      return num;
    }
    }
class thfive extends Thread {
  int maxcount=1;
  int number=1;
  int i;
    public void run() {       
      for ( i = 40001;  i <= 50000;  i++ ) {      
           int count=0;            
           for ( int j = 1;  j <= i;  j++ ) { 
              if ( i % j == 0 )
                 count++;
           }           
           if (count > maxcount) {
              maxcount = count;
              number = i;
           }       
       }
    }
   public int divisor5() {
      int div=maxcount;
      return div;
    }
   public int number5() {
      int num=number;
      return num;
    }
    }
class thsix extends Thread {
  int maxcount=1;
  int number=1;
  int i;
    public void run() {       
      for ( i = 50001;  i <= 60000;  i++ ) {      
           int count=0;            
           for ( int j = 1;  j <= i;  j++ ) { 
              if ( i % j == 0 )
                 count++;
           }           
           if (count > maxcount) {
              maxcount = count;
              number = i;
           }       
       }
    }
   public int divisor6() {
      int div=maxcount;
      return div;
    }
   public int number6() {
      int num=number;
      return num;
    }
    }
class thseven extends Thread {
  int maxcount=1;
  int number=1;
  int i;
    public void run() {       
      for ( i = 60001;  i <= 70000;  i++ ) {      
           int count=0;            
           for ( int j = 1;  j <= i;  j++ ) { 
              if ( i % j == 0 )
                 count++;
           }           
           if (count > maxcount) {
              maxcount = count;
              number = i;
           }       
       }
    }
   public int divisor7() {
      int div=maxcount;
      return div;
    }
   public int number7() {
      int num=number;
      return num;
    }
    }
class theight extends Thread {
  int maxcount=1;
  int number=1;
  int i;
    public void run() {       
      for ( i = 70001;  i <= 80000;  i++ ) {      
           int count=0;            
           for ( int j = 1;  j <= i;  j++ ) { 
              if ( i % j == 0 )
                 count++;
           }           
           if (count > maxcount) {
              maxcount = count;
              number = i;
           }       
       }
    }
   public int divisor8() {
      int div=maxcount;
      return div;
    }
   public int number8() {
      int num=number;
      return num;
    }
    }
class thnine extends Thread {
  int maxcount=1;
  int number=1;
  int i;
    public void run() {       
      for ( i = 80001;  i <= 90000;  i++ ) {      
           int count=0;            
           for ( int j = 1;  j <= i;  j++ ) { 
              if ( i % j == 0 )
                 count++;
           }           
           if (count > maxcount) {
              maxcount = count;
              number = i;
           }       
       }
    }
   public int divisor9() {
      int div=maxcount;
      return div;
    }
   public int number9() {
      int num=number;
      return num;
    }
    }
class thten extends Thread {
  int maxcount=1;
  int number=1;
  int i;
    public void run() {       
      for ( i = 90001;  i <= 100000;  i++ ) {      
           int count=0;            
           for ( int j = 1;  j <= i;  j++ ) { 
              if ( i % j == 0 )
                 count++;
           }           
           if (count > maxcount) {
              maxcount = count;
              number = i;
           }       
       }
    }
   public int divisor10() {
      int div=maxcount;
      return div;
    }
   public int number10() {
      int num=number;
      return num;
    }
    }