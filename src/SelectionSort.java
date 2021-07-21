/**
 * @program: algorithm
 * @packagename: PACKAGE_NAME
 * @author: Mr Zuo
 * @date: 2021-07-21 18:55
 **/
//选择排序
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,5,8,7,4,5,6,1,3};

        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
//                if (arr[minPos] > arr[j])
//                    minPos = j;
                minPos = arr[minPos] > arr[j]?  j: minPos ;
            }
            swap(arr, i, minPos);


//            System.out.println("经过第" + i + "次循环之后，数组的内容");
//            print(arr);
        }


//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print( arr[i] + " ");
//        }
        print(arr);

    }
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
    }
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



}
