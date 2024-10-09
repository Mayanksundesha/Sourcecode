//reverse array program
import java.util.*;
public class ReverseArray{
    public static void reverse(int number[] ){
        int start = 0 ; int last = number.length-1;
        while(start < last){
            int temp =  number[last];
            number[last]= number[start];
            number[start] = temp;
            start++;
            last--;
        }
    }
public static void main(String args[]){
    int number[]={1,2,3,4,5,6};
    reverse(number);
    for(int i = 0 ; i<number.length; i++){
        System.out.println(number[i]);
    }
    // System.out.println();
}
}
