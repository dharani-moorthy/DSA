package Searching;
// time complexity O(log n)
public class BinarySearch {
    public static void main(String[]arugs){
        int arr[]={-1,2,3,4,7,8,22,33};
        int target=8;
        int answer=Binary(arr, target);
        System.out.println(answer);
    }
    static int Binary(int []arr,int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e) {
            int mid = (s + e )/ 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
