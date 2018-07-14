package bao;

public class Paixu {
    public static void main(String args[]){
        int[] a1 = {14,22,56,89,48,5,6,26,2,8,12};
        System.out.print("之前的顺序是：");
        for (int num : a1) { System.out.print(num+"\t");

        }
        System.out.println();
        for (int i = 0; i< a1.length-1 ;i++){       //控制循环排序的次数
            for (int j = 0 ;j < a1.length-i-1 ; j++){     //控制一次排序多少次
                if (a1[j]>a1[j+1]){
                    int temp = a1[j];
                    a1[j] = a1[j+1];
                    a1[j+1] = temp;
                }
            }
        }
        System.out.print("之后的顺序是：");
        for (int i = 0 ;i< a1.length;i++){
            System.out.print(a1[i]+"\t");
        }
        System.out.println();
        System.out.print("之后的顺序是：");
        for (int num: a1 ) {
            System.out.print(num+"\t");
        }
    }
}
