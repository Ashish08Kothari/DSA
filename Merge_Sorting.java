import java.util.Arrays;

class Solution{
    public static void main(String[] args) {
        int[] arr = new int[]{12,13,11,10,4,1,5,2,0,-1};
        new Solution().mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    void mergeSort(int[] arr, int l, int r) {
        if(l < r) {
            int mid = l + (r-l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr,l,r,mid);
        }
    }

    void merge(int[] arr, int l, int r, int m) {
        int n1 = m - l + 1, n2 = r - m;
        int[] a1 = new int[n1], a2 = new int[n2];

        int k = l;

        for(int i = 0; i < n1; i++)
            a1[i] = arr[k++];

        for(int i = 0; i < n2; i++)
            a2[i] = arr[k++];

        int i = 0, j = 0;

        while(i < n1 && j < n2) {
            if(a1[i] <= a2[j])
                arr[l++] = a1[i++];

            else
                arr[l++] = a2[j++];
        }

        while(i < n1)
            arr[l++] = a1[i++];

        while(j < n2)
            arr[l++] = a2[j++];
    }
}



/*
    Time Complexity: O(nlogn)
    Space Complexity: O(n)
*/