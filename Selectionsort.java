import java.util.Scanner;

import java.util.*;
public class Selectionsort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            //int j=i+1;
            int min=i;
           for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                 min=j;
            }
           }
           int temp=arr[i];
           arr[i]=arr[min];
           arr[min]=temp;
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
              }
        }
    }

