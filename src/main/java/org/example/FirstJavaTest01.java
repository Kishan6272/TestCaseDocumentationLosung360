package org.example;

import java.util.HashMap;

public class FirstJavaTest01 {

    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,2,4,3,4,4,3,3,3};

        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=arr.length;


        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int val= hm.get(arr[i]);
                hm.put(arr[i],val+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }


        System.out.println(hm);
    }
}
