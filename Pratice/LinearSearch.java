import java.util.Arrays;
import java.util.Scanner;
public class LinearSearch {

    /* 
// search the target  in the array and return its index 

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,5,8,7,20,45};
        int target = 7;
        int result = linear(arr, target);
         System.out.println(result);
        
}
    static int linear(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==target){
                return i;
            }
        }
        // this line will execute if none of the return statements have executed
        // hence the target not found
        return -1;
}




        

 // search the target in the array and return its value 

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,5,8,7,20,45};
        int target = 7;
        int result = linear(arr, target);
       System.out.println(result);
}

        static int linear(int[] arr, int target){
            if(arr.length==0){
                return -1;
            }
            for(int i : arr){
                if(i==target){
                    return i;
                }
            }
            return -1;
}






// search the element and return true or false

            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,5,8,7,20,45};
        int target = 7;
         boolean result = linear(arr, target); 
         System.out.println(result);
}

            static boolean linear(int[] arr, int target){
                if(arr.length==0){
                    return false;
                }
                for(int i : arr){
                    if(i==target){
                        return true ;
                    }
                }
                return false;

    }
                
            
 // search the character in a string 

                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    String s = "deepika";
                    char target = 'p';
                    System.out.println(search(s,target));
                }
                static boolean search(String str, char target){
                    if(str.length()==0){
                        return false;
                    }
                   // for(int i=0;i<str.length();i++){
                   //    if(target == str.charAt(i)){
                   //      return true;
                  // 
                  //     }
                  //   }
                        
                        for(char ch:str.toCharArray()){
                            if(ch == target){
                                return true;
                            }
                        }
                    return false;
                }
                */



    // search in a given range and return the index value

                /* 
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int arr[] = {1,5,8,7,20,45};
                    int target = 20;
                    int result = linear(arr, target, 0,5);
                   System.out.println(result);
            }
            
                    static int linear(int[] arr, int target, int start,int end){
                        if(arr.length==0){
                            return -1;
                        }
                        for(int i =start;i<=end;i++){
                            if(arr[i]==target){
                                return i;
                            }
                        }
                        return -1;
            }
                        

 // search for a minimum value in the array

                        public static void main(String[] args) {
                            Scanner sc = new Scanner(System.in);
                            int arr[] = {78,5,8,7,20,45};
                            int result = search(arr);
                           System.out.println(result);
                    }
                    
                            static int search(int[] arr){
                                
                                if(arr.length==0){
                                    return -1;
                                }
                                int min = arr[0];
                                for(int i =0;i<arr.length;i++){
                                    if(arr[i]<min){
                                        min = arr[i];
                                    }
                                }
                    return min;
                    
                }

                

 // search in two dimensional array and returning index of element if it found

                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
                    int target = 6;
                    int[] ans = search(arr,target);
                    System.out.println(Arrays.toString(ans));
                }
                static int[] search(int arr[][],int target){
                    for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                            if(arr[i][j]==target){
                                return new int[]{i,j};
                            }
                        }
                    }
                   return new int[]{-1, -1};
}
                   


   //  search for maximum value in two dimensional array

                   public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
                    int ans = search(arr);
                    System.out.println(ans);
                }
                static int search(int arr[][]){
                    int max = arr[0][0];
                    for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[i].length;j++){
                            if(arr[i][j]>max){
                                max = arr[i][j];
                            }
                        }
                    }
                   return max;
}



// Even digits (returns the number of numbers which contain even number of digits)

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {12,45,786,963,1,3401};
    System.out.println(find(arr));
}
static int find(int[] arr){
    int count=0;
    for(int n:arr){
    if(even(n)==true){
        count++;
    }
    }
    return count;
}
static boolean even(int n){
    boolean flag = false;
    int c=0;
    while(n>0){
        c++;
        n/=10;
    }
    if(c%2==0){
        return true;
    }
    else{
        return false;
    }
    
}
    
*/
                
}



