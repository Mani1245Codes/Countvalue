import java.util.*;
public class Countvalue {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the range:");
        int a=in.nextInt(); //range value
        int count=0;
        int sum=0;
        int arr[]=new int[a];
        System.out.println("Enter the elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt(); //array input
        }
        System.out.println("Enter the target value:");
        int b=in.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==b){
                count++; //count
            }
            else{
                sum=sum*i;
            }

        }
        System.out.println(b+" - "+count);
    }
}


/*Enter the range:
5
Enter the elements:
1
2
2
2
4
Enter the target value:
2
2 - 3*/