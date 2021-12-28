class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList r=new ArrayList();
       for(int i=0;i<n;i++)
       {
           if(arr[i]==(i+1))
           {
               r.add(arr[i]);
           }
       }
      return r; 
    }
}