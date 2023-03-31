

public class test {

    public static void main(String[] args) {
//定义存储int类型数组，赋值元素1，2，3，4，5
        int[] arr = {1,2,3,4,5};
//为0索引元素赋值为6
        arr[0] = 6;
//获取数组0索引上的元素
        int i = arr[0];
      //  System.out.println(i);
//直接输出数组0索引元素
        System.out.println(arr[0]);
        for (int a = 0;a<arr.length;a++){
            System.out.println(arr[a]);
        }
    }



}