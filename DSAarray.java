import java.util.*;

public class DSAarray{
    public static int search(int arr[],int n,int x){
        int flag=0;
        for (int i=0;i<n;i++){
            if (arr[i]==x){
                System.out.println("element found at "+ i+" position");
                flag=1;
                break;
                
            }
        }
        if (flag==0){
            System.out.println("match not found");
        }

        return 0;
    }
    public static int insert(int arr[],int n,int x,int pos,int cap){
        int index=pos-1;
        if (cap==n){
            System.out.print("cannot insert,array is full");
        }
        else{
            for (int i=n;i>=index;i--){
                arr[i+1]=arr[i];
            }
            arr[index]=x;
            System.out.println("inserted");
           
        }
        
        return (n+1);
    }
    public static int print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        return 0;
    }
    public static int deleteEle(int arr[],int n,int x){
        int i;
        for (i=0;i<n;i++){
            if (arr[i]==x){
                break;
            }
        }
        if (i==n){
            return n;
        }
        for (int j=i;j<n-1;j++){
            arr[j]=arr[j+1];
            
        }
      
        System.out.println("deleted");
        
        return (n-1);
    }
    public static int update(int arr[],int n,int x,int newEle){
        for (int i=0;i<n;i++){
            if (arr[i]==x){
                arr[i]=newEle;
                System.out.println("updated");
                break;
            }
            else{
                return -1;
            }
        }
        return n;
    }
    public static void main(String[] args){
        int []arr=new int[20];
        System.out.println("this is an array of 20 items, choose the no. of items you wish to include: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the items: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("this is your array: ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("choose from the following options: 1 to search, 2 to insert, 3 to delete, 4 to update and 5 to view");
        int c=sc.nextInt();
        if (c==1){
            System.out.println("enter the no. you want to search: ");
            int x=sc.nextInt();
            search(arr,n,x);
        }
        else if (c==2){
            System.out.println("enter the position where you want to insert");
            int pos=sc.nextInt();
            System.out.println("enter the no. you want to add: ");
            int x=sc.nextInt();
            int cap=arr.length;
            
            insert(arr,n,x,pos,cap);
            n++;
            print(arr,n);
            
        }
        else if (c==3){
            System.out.println("enter the element you want to delete:");
            int x=sc.nextInt();
            deleteEle(arr,n,x);
            n--;
            print(arr,n);
        }
        else if (c==4){
            System.out.println("enter the element you want to update:");
            int x=sc.nextInt();
            System.out.println("enter the new element: ");
            int newEle=sc.nextInt();
            update(arr,n,x,newEle);
            print(arr,n);
        }
    }
}