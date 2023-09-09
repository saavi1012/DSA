// Remember to break the loop when element is found
// Remember to update mid after every iteration
// Remember to check the condition for elemrnt not found

import javax.sound.midi.Soundbank;

public class binary_search {
    public static void binarySearch(int arr[], int target){

    int start = 0, end = arr.length - 1;
    int mid = (start+end)/2;

    while(start<=end){
        if (arr[mid]==target){
            System.out.println(mid);
            
        }

        else if(arr[mid]>target){
            end = mid-1;
            System.out.println("Found at: " + );
        }
        else{
            start = mid+1;
        }

        mid = (start+end)/2;
    }
    if(start>end){
    System.out.println("Not found");
    }
    

    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,3,3,3,4,5,6 };
        int target = 3;
        
        binarySearch(arr, target);


        
        
    }
}
