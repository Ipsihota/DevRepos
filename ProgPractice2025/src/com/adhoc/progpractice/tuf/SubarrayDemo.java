package com.adhoc.progpractice.tuf;

public class SubarrayDemo {
// Find the single element among duplicate element in an array.
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }

    private static int getSingleElement(int[] arr) {
        //size of the array:
        int n = arr.length;

        // Find the maximum element:
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        // Declare hash array of size maxi+1
        // And hash the given array:
        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        //Find the single element and return the answer:
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }


    public static void main1(String[] args) {
        int arr[] = {1,2,1,2,4,3,3};

        int xxor = 0;
        for (int i = 0; i < arr.length; i++) {
            xxor = xxor ^ arr[i];
        }
        System.out.println(xxor);
    }
}
