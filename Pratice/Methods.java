// Syntax of methods 

/* acess modifier return-type name()
  //body
  return statement;
 */


import java.util.Arrays;
import java.util.Scanner;

public class Methods{



   /*  static void sum(){ // without return type 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1");
        int num1 = sc.nextInt();
        System.out.println("enter the num2");
        int num2 = sc.nextInt();
        System.out.println("the sum is: "+(num1+num2));
    }

    

    static int sum2(){ // with return type 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num1");
        int num1 = sc.nextInt();
        System.out.println("enter the num2");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        return sum;
    }


    
    // methods with parameters...
    static int sum2(int num1,int num2){ 
        int sum = num1+num2;
        return sum;
    }    



    static String text(String txt){ 
        System.out.print("Hello ");
        return txt ;
    }    



    // Shadowing...

    static int c = 67;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
     System.out.println(c);
     int c = 89; // class variable c is showded by this local variable ...
     System.out.println(c);    




    // var args..
    fun(2,3,4,5,6,8,9,70,56);// calling the method

} // end of main method
static void fun(int ...v){ // this method takes variable arguments
    System.out.println(Arrays.toString(v)); 
}




    fun(4,5,"f","d","g","j","u","i","y","o");

    }
    static void fun(int a, int b,String ...v){
        System.out.println(a+" "+b+" "+ Arrays.toString(v));
    }
}
/* v is declared implicitly as an array of string you can add any number of elements 
because the length is not constant. length is either zero or more than zero
 */


 /* 


//  prime by using functions...

 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    isPrime(sc.nextInt());

 }
    static void isPrime(int n){
        int c = 2;
        int count=0;
        for(c=2;c*c<n;c++){
            if(n%c==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("prime");
        }
        else{
            System.out.println(" not prime");
            
        }

    }
        



        // amstrong number...of a three digit number
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            isAmstrong(sc.nextInt());
        }
        public static void isAmstrong(int n){
            int sum =0;
            int s =n;
            while(n>0){
                int r = n%10;
                sum += Math.pow(r, 3);
                n/=10;
            }
            if(s==sum){
                System.out.println("amstrong");
            }
            else{
                System.out.println("not amstrong");
            }


            


            // method overloading(based on number of  parameters)

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
               System.out.println( sum(2,5)); // based upon the number of parameters the compiler decides which method is to be executed when it calls
               System.out.println( sum(2,6,8));                
            }
            static int sum(int a, int b){
                return a+b;
            }
            static int sum(int a, int b, int c){
                return a+b+c;



                
                // method overloading(based on datatype)
                public static void main(String args[]){
                    Scanner sc = new Scanner(System.in);
                    int num1 = sum(5, 9);
                    double num2 = sum(5.9, 9.3);
                    System.out.println(num1);
                    System.out.println(num2);
                }
                static int sum(int a, int b){
                    return a+b;
                }
                static  double sum(double a, double b){
                    return a+b;



                    */

                }

            

        
 


    
