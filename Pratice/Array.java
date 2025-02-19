import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        
        // syntax
        //datatype[] variable_name = new datatype[size];
       // int[] nums; // declaration of array, nums is getting defined in the stack
      //  nums = new int[5] //intialization: actually here object is being created in the heap
/* 
      int nums[] = {56,89,76,34,21,10};
      System.out.println(nums[0]);
      String[] arr = new String[5];
      System.out.println(arr);// prints null which is default value
      int num[] = new int[5];
      for(int i=0;i<arr.length;i++){ //  to accept the input(normal for loop)
        num[i] =  sc.nextInt(); */



      
      // enhanced for loop
      /* Syntax
       for(datatype variable reference: arrayname){
       //block of statements
       }
       
      for(int j:num){ // to print hte values
        System.out.print(j+" ");

      }
        
        System.out.println(Arrays.toString(num));


// Array of objets
String[] str = new String[5];
for(int i=0;i<str.length;i++){
    str[i] = sc.next();
}
System.out.println(Arrays.toString(str));




// passing through functions
int[] nums = {3,5,8,9,6};
change(nums);
System.out.println(Arrays.toString(nums));

    }
static void change(int[] arr){
    arr[0] = 88;


    */


    // two dimensional array
    /*
     Syntax:: 
     int[][] nums = new int[rows][columns]; // adding no of rows mandatory

     

     int[][] arr1 = {
        {1,2,3},
        {4,5},           // any number of columns
        {6,8}
     };

     int[][] arr = new int[3][3];

    
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;i++){
            arr[i][j] = sc.nextInt();
        }
     }
     // output
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;i++){
            System.out.println(arr[i][j]);
        }
        System.out.println();
     }

*/




// ArrayList

/* ArrayList<Integer> list = new ArrayList<Integer>(5);
 list.add(23);
list.add(33);
list.add(43);
list.add(53);
list.add(63);
list.add(13);
list.add(73);
list.add(83); 
System.out.println(list); // prints the list
System.out.println(list.contains(56)); // returns a boolean value
list.set(0, 99); // replace the 0th index with element
list.remove(2);  // removes te value at provided index
System.out.println(list);


// to add elements to list (input)
for(int i=0;i<5;i++){
    list.add(sc.nextInt());
}
// to get the items from the list
for(int i=0;i<5;i++){
    System.out.println(list.get(i)); // pass the index here..list[index] will not support 
}



// multi dimensional arraylist

ArrayList<ArrayList<Integer>> list = new ArrayList<>();
// to add arraylists
for(int i=0;i<3;i++){
    list.add(new ArrayList<>());
}
// to add elements
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        list.get(i).add(sc.nextInt());
    }
}

System.out.println(list);





// swap function using arrays

int arr[] = {4,5,6,7,8};
swap(arr,2,4);
System.out.println(Arrays.toString(arr));
    }
     static void swap(int arr[],int ind1,int ind2){
    int temp =  arr[ind1];
     arr[ind1] =  arr[ind2];
     arr[ind2] = temp;


     

     // max item from an array

     int arr[] = {1,3,5,6,7,8};
     System.out.println(max(arr));
}
static int max(int[] arr){
    int max = arr[0];
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max = arr[i];
        }
    }
    return max;

    


    // max item in a given range

    int arr[] = {1,3,5,6,7,8};
    System.out.println(max(arr,1,4));
}
static int max(int[] arr,int start,int end){
   int max = arr[0];
   for(int i=start;i<=end;i++){
       if(max<arr[i]){
           max = arr[i];
       }
   }
   return max;


   


   // reverse the array(using for loop)

   int arr[] = {1,3,5,6,7,8};
  for(int i=arr.length-1;i>=0;i--){
    System.out.print(arr[i]+" ");

  }

  

  // swapping an array by using a swap function (two-pointer method)
  
  
  int arr[] = {1,3,5,6,7,8,4};
  int start =0;
  int end = arr.length-1;
  while(start<end){
    swap(arr, start, end);
    start++;
    end--;
    
  }
  System.out.println(Arrays.toString(arr));
}
static void swap(int[] arr,int start,int end){
    int temp = arr[start]; 
    arr[start] = arr[end];
    arr[end] = temp;

    */

    
 
}
}


