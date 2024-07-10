package Practice;

import java.util.Arrays;

public class exArraysMethod
{
    public static void main(String[] args)
    {
        int[] iArr={1,2,3,4,5};
        System.out.println(Arrays.toString(iArr));          // toString() method is used to print the array elements in a single line
        System.out.println(Arrays.equals(iArr, iArr));    // equals() method is used to compare two arrays

        int[][] arr2D={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr2D)); //  deepToString() method is used to print the 2D array elements in a single line

        //copyOf() method is used to copy the elements of an array to another array
        // 배열 전체를 복사해서 새로운 배열을 만들어 반환한다

        // copyOfRange() method is used to copy the elements of an array to another array from a specified range
        // 배열의 일부분을 복사해서 새로운 배열을 만들어 반환한다

        // sort() method is used to sort the elements of an array in ascending order
        // 배열을 오름차순으로 정렬한다
       

    }
    
}
