package Studying;

public class Main {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};

        System.out.println("Исходный массив:");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + "  ");

        System.out.println();

        System.out.println("Обратный порядок:");
        for(int i=a.length-1;i>=0;i--)
            System.out.print(a[i] + "  ");

    }
}
