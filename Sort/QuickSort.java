import java.util.*;
class QuickSort{
    static int partition(int a[],int low,int high){
        int i=low-1;
        int pivot=a[high];

        for(int j=low;j<high;j++){
            if(a[j]<=pivot){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }

        int temp1=a[i+1];
        a[i+1]=a[high];
        a[high]=temp1;

        return i+1;
    }
    static void quickSort(int a[],int low,int high){
        if(low<high){
            int pi=partition(a, low, high);
            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);
        }
    }
    static void printArray(int a[]){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");
    }
    public static void main(String[] args) {
        int a[] ={0,0,2,1};
        quickSort(a, 0, a.length-1);
        printArray(a);
    }
}