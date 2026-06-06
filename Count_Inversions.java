class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        System.out.println(Solution.bruteForce(arr));
        System.out.println(Solution.inversionCount(arr));
    }

    static int inversionCount(int[] arr) {
        /*
            Time Complexity: O(n log n)
            Space Complexity: O(n)
        */

        return mergeSort(arr, 0, arr.length-1);
    }

    static int mergeSort(int[] arr, int s, int e) {
        int cnt = 0;
        if (s < e) {
            int mid = s + (e-s) / 2;
            cnt += mergeSort(arr, s, mid);
            cnt += mergeSort(arr, mid+1, e);
            cnt += merge(arr, s, mid, e);
        }

        return cnt;
    }

    static int merge(int[] arr, int s, int m, int e) {
        int n1 = m - s + 1, n2 = e - m, idx = s, cnt = 0;
        int[] a1 = new int[n1], a2 = new int[n2];

        for (int i = 0; i < n1; i++)
            a1[i] = arr[idx++];

        for (int i = 0; i < n2; i++)
            a2[i] = arr[idx++];

        int i = 0, j = 0;
        idx = s;

        while (i < n1 && j < n2) {
            if(a1[i] <= a2[j])
                arr[idx++] = a1[i++];

            else {
                cnt += n1 - i;
                arr[idx++] = a2[j++];
            }
        }

        while (i < n1)
            arr[idx++] = a1[i++];

        while (j < n2)
            arr[idx++] = a2[j++];

        return cnt;
    }

    static int bruteForce(int[] arr) {
        /*
            Time Complexity: O(n^2)
            Space Complexity: O(1)
        */

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) 
            for (int j = i+1; j < arr.length; j++) 
                if (arr[i] > arr[j])
                    cnt++;
        
        return cnt;
    }
}