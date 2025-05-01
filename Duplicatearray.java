
public class Solution{  
    
    public static int Duplicatearray(int arr[]) {
    	//Your code goes here
      boolean check[] = new boolean[arr.length];
      for (int i =0;i<arr.length;i++){
        if(check[arr[i]]) {
          return arr[i];
        }
        check[arr[i]] = true;
      }
      return 0;
    }
}