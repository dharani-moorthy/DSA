package Searching;
public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={4,1,2,8,4,5,2,9,2,6,7,13,11,12};
        int target =122;
        int a=Targets(arr,target);
        System.out.println(a);
    }
    static int Targets(int [] arr,int target){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
