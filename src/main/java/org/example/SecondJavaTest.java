package org.example;

public class SecondJavaTest {


    public static void prefix(int arr[])
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum =sum+arr[i];
            arr[i]=sum;
        }

    }

    public static void main(String[] args) {
        //          0,1, 2, 3, 4,5,6,7,8,9,10
        int arr[]={10,15,2,2,25,20,5,9,16,3,5};
        int arr1[]={10,15,2,2,25,20,5,9,16,3,5};
        int target=25;
        prefix(arr1);


//        for(int i=0;i<arr1.length;i++ )
//        {
//            for(int j=0;i<arr1.length;i++ );
//        }
         int j=0;

        if(arr[0]+arr[1]==target)
        {   System.out.println("kishan");
            System.out.println(arr[0]+" "+arr[1]);}

        for(int i=2;i<arr1.length;i++){
      //  System.out.print(arr1[i]+" ");

          if(arr1[i]-arr1[j]==target)
          {
              System.out.println(arr[i-1]+" "+arr[i]);
          }
          j++;
        }

      //  for(int )


    }

    //




}
