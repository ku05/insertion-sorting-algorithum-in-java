import java.util.*;
class insertion_sort{
    public static void main(String args[]){
        Scanner SC=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the array:");
        for(int i=0;i<5;i++){
           a[i]=SC.nextInt();
        }
        for(int i=1;i<5;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && key<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.println("After sorting the array:");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}