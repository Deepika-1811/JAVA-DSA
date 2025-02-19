import java.util.*;
public class Basics{
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);
    
   /*
   // Data types in java (primitive and non-primitive)
 // integer types
byte num = 127;
short num1 = 2345;
int num2 = 245798;
long num3 = 56743289l;
//float types
float num4 = 456.7f;
double num5 = 897.45673d;
System.out.println(num);
System.out.println(num1);
System.out.println(num2);
System.out.println(num3);
System.out.println(num4);
System.out.println(num5);
// boolean values
boolean flag = true;
System.out.println(flag);
// character values 
char ch = 'a';
char ch1 = 67; // print ascii value
System.out.println(ch1);
System.out.println(ch); 


//non-primitive are strings,arrays,classes..



   //type casting 
int num1 = 125;
byte num2 = (byte)num1; // narrowing casting (manual casting)
System.out.println(num1);
System.out.println(num2);

short num3= 345;
int num4 = num3; // widening casting
System.out.println(num3);
System.out.println(num4);




// Strings


String txt = "abcdefghijklnopqrstuvwxyz";
String txt2 = " letters";
String txt3 = new String(" alphabets");
char arr[] = {'s','t','r','i','n','g','s'};
System.out.println(arr);
System.out.println("string length "+txt.length());
System.out.println("string to uppercase "+txt.toUpperCase());
System.out.println("string lowercase "+txt.toLowerCase());
System.out.println("the index of a character is "+txt.indexOf('d'));
System.out.println(txt+txt2);
System.out.println(txt3.replace('a','A'));
System.out.println("we are the so called \"vikings\" from the north");
System.out.println("It\'s not a big deal");
System.out.println("we are the so called \\vikings from the north"); // to insert a slash in the text
System.out.println("we are the so called \nvikings from the north"); // to insert the text into a new line
System.out.println("we are the so called \tvikings from the north"); // tab space
System.out.println(txt.compareTo(txt3));  // it compares strings based upon their each character unicode values and return a integer value
char ch = txt.charAt(7); // index starts from zero
System.out.println(ch);
System.out.println(txt.equals(txt2)); // return boolean value
System.out.println(txt.startsWith("abcd")); // returns boolean value
System.out.println(txt.endsWith("rgji")); // returns boolean value
System.out.println(txt.substring(5)); // return a string by removing first five characters
System.out.println(Arrays.toString(txt.split("")));
System.out.println(txt.trim());




//Math functions

int num2 = 8;
int num3 = 56;
System.out.println(Math.max(num2,num3)); //max
System.out.println(Math.min(num2,num3)); //min
System.out.println(Math.sqrt(num2)); //squre root
System.out.println(Math.cbrt(num2)); // cube root
int num4 = -57;
System.out.println(Math.abs(num4)); // absolute(positive) value
System.out.println(Math.random()*101); // random value between 0 and 1







// some basic programs 

//Java Program to Find ASCII Value of a character

char ch = sc.nextLine().charAt(0);
int a = ch;
System.out.println("the ascii value of a character is : "+a);




// swap numbers


int num1 = sc.nextInt(); //8
int num2 = sc.nextInt(); //3

 int temp = num1; // temp = 8
num1 = num2; // num1 = 3
num2 = temp; // num2 = 8 

num1 = num1+num2; //11
num2 = num1-num2; //11-3=8
num1 = num1-num2; //11-8 = 3
System.out.println(num1);
System.out.println(num2);







//Java Program to Check Whether an Alphabet is Vowel or Consonant

char ch = sc.nextLine().charAt(0);
if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u' ){
    System.out.println("the alphabet is vowel");
}
else{
    System.out.println("the alphabet is constant");
}




//Java Program to Find the Largest Among Three Numbers

int num1 = sc.nextInt();
int num2 = sc.nextInt();
int num3 = sc.nextInt();
if(num1>num2 && num1> num3){
    System.out.println(num3 + " is the largest number");
}
else if(num2>num3){
    System.out.println(num2 + " is the largest number");
    
}
else{
    System.out.println(num1 + " is the largest number");
}




//Java Program to Find the Largest Among n Numbers

int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++){
    arr[i]= sc.nextInt();
}
int largest = arr[0];
for(int i=0;i<n;i++){
    if(arr[i]>largest){
        largest = arr[i];
    }
}
System.out.println("the largest value among n number of values is : "+largest);




//Java Program to Find all Roots of a Quadratic Equation

double a = sc.nextDouble();
double b = sc.nextDouble();
double c = sc.nextDouble();
double root1,root2;
double desc = (b*b)-4*a*c;
if(desc>0){
     root1 = -b+(Math.sqrt(desc))/2*a;
     root2 = -b-(Math.sqrt(desc))/2*a;
     System.out.println("root1 "+root1);
     System.out.println("root2 "+root2);

}
else if(desc==0){
    
    root1 = root2 = -b/(2*a);
    System.out.println("root1 and root2 are "+root1);

}
else{
    double real = -b/(2*a);
    double ima = Math.sqrt(-desc)/(2*a);
    System.out.println("real root "+real);
    System.out.println("imaginary root "+ima);
}
}
}



// leap year
int year = sc.nextInt();
if(year%400==0 || year%100!=0 && year%4==0 ){
    System.out.println("leap year");
}

else{
    System.out.println("not a leap year");
}




// sum of n natural numbers

int s =0;
int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
    s += arr[i];
    }
    System.out.println(s);





// factorial of a number

int n = sc.nextInt();
int fact = 1;
if(n<=0 && n==1){
    fact = 1;
}
while(n>1){
    fact = fact*n;
    n -=1;

}
System.out.println(fact);






// generate a multiplication table

int n = sc.nextInt();
for(int i=1;i<=10;i++){
    System.out.println(n+" X "+i+" = "+n*i);
}



// to generate a nth fibonacci number

int n = sc.nextInt();
int n1 = 0;
int n2 = 1;
int count =2;
int s = sc.nextInt();
for(int i=2;i<n;i++){
    int n3 = n1+n2;
    count++;
    n1 = n2;
    n2 = n3;
     if(s==count){
    System.out.println(n3);
}
}




//gcd of two numbers

int n1 = sc.nextInt();
int n2 = sc.nextInt();
int gcd = 1;
for(int i=1;i<=n1 && i<=n2 ;i++){
    if(n1%i==0 && n2%i==0){
        gcd =i;
    }
}
System.out.println(gcd);




// lcm of two numbers

static int gcdi(int n1, int n2){
    int gcd = 1;
    for(int i=1;i<=n1 && i<=n2;i++){
        if(n1%i==0 && n2%i==0){
            gcd = i;
        }
    }
    return gcd;
}


int n1 = sc.nextInt();
int n2 = sc.nextInt();
int gc = gcdi(n1,n2);
int lcm = (n1*n2)/gc;
System.out.println(lcm);







//Display alphabets(A-Z) using  loop

char c;
for(c='A' ;c<='Z';c++){
    System.out.print(c+" ");
}






//Java Program to Count Number of Digits in an Integer

int n = sc.nextInt();
int count =0;
while(n>0){
    count++;
    n /=10;
}
System.out.println(count);




//Java Program to Reverse a Number


int n = sc.nextInt(); //63
int rev =0;
while(n>0){
    int s = n%10; // 3 ... 6
    rev = (rev*10)+s; // 3 ....30+6
    n/=10; //6   ......0
}
System.out.println(rev);





// calculate power of a number

int base = sc.nextInt();
int exp = sc.nextInt();
int pow =1;
while(exp>0){
    pow *= base;
    exp--;
}
System.out.println(pow);




// cheack wheather a number is prime or not

int n = sc.nextInt();
int count =0;
for(int i=2;i<n;i++){    (i*i<n....for optimised code)
    if(n%i==0){
        count++;
    }
}
if(count ==0){
    System.out.println("prime");
}
else{
    System.out.println("not prime");
}

// factors of a number

int n = sc.nextInt();
for(int i=1;i<=n;i++){
    if(n%i==0){
        System.out.print(i+" ");
    }
}



// check wheather a amstrong number or not (3 digit number)

int n = sc.nextInt();
int s =n;
int am =0;
while(n>0){
    int r = n%10;
     am +=Math.pow(r,3);
    n/=10;
}
if(am==s){
    System.out.println("amstrong num");

}
else{
    System.out.println("not amstrong ");
}








// Switch Case

int n1 = sc.nextInt();
int n2 = sc.nextInt();
int n3 = sc.nextInt();
char ch = sc.next().charAt(0);
switch(ch){
    case '+':
    System.out.println(n1+n2+n3);
    break;
    case '-':
    System.out.println(n1-n2-n3);
    break;
    case '*':
    System.out.println(n1*n2*n3);
    break;
    case '/':
    System.out.println(n1/n2/n3);
    break;
    case '%':
    System.out.println(n1%n2);
    break;
    default:
    System.out.println("invalid input");

}






//  sum of elements in the array

int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
}
int sum =0;
// to display the array
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
// to calculate the sum
for(int i=0;i<n;i++){
    sum +=arr[i];
}
System.out.println(sum);












int n = sc.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++){
    arr[i] = sc.nextInt();
}
int min = arr[0];  // int max = 0
// to display the array
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();


for(int i=0;i<n;i++){
    if(arr[i]<min){ // arr[i]>max
        min = arr[i];
    }
}
System.out.println("min value is "+min);










// two dimensional array

int r = sc.nextInt();
int c = sc.nextInt();
int arr[][] = new int[r][c];
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        arr[i][j] = sc.nextInt();
    }
}
//printing the array
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}






// addition of two matrices

// for first matrix
int r = sc.nextInt();
int c = sc.nextInt();
int a[][] = new int[r][c];
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        a[i][j] = sc.nextInt();
    }
}
System.out.println("enter values for second matrix");
// for matrix2
int b[][] = new int[r][c];
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        b[i][j] = sc.nextInt();
    }
}
int d[][]= new int[r][c];
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        d[i][j]= a[i][j]+b[i][j];
        System.out.print(d[i][j]+" ");
    }
    System.out.println();
}







// transpose of a matrix

int r = sc.nextInt();
int c = sc.nextInt();
int arr[][] = new int[r][c];
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        arr[i][j] = sc.nextInt();
    }
}
//printing the array
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
// transpose of a matrix
for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
        System.out.print(arr[j][i]+" ");
    }
    System.out.println();



// finding the second largest number of a given number

int n = sc.nextInt();
int max = 1;
int count=0;
while (n>0) {
    int r = n%10;
    if(r>max){
        count++;
        if(count==2){
            max =r;
            break;
        }
    }
    n/=10;
}
System.out.println(" the second largest value is "+max);







// length of the string without using predefined functions
String s = sc.nextLine();
int count =0;
char ch[] = s.toCharArray();
for(char i:ch){
    count++;
}
System.out.println(count);







// reverse a string

String s = sc.nextLine();
char ch[] = s.toCharArray();
for(int i=ch.length-1;i>=0;i--){
    System.out.print(ch[i]);

}







// palindrome
String s = sc.nextLine();
String n ="";
for(int i=s.length()-1;i>=0;i--){
    n +=s.charAt(i);
}

if(s.equals(n)){
    System.out.println("palindrome");
}
else{
    System.out.println("not palindrome");
}

*/

}
    }
