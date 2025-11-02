
package decisions;

import java.util.Scanner;
public class Decisions {

    
    public static void main(String[] args) {
        int no1,no2,ch,ans;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number :1");
        no1=input.nextInt();
        System.out.println("Enter number :2");
        no2=input.nextInt();
        System.out.println("Enter choice");
        ch=input.nextInt();
        
        if(ch==1){
            ans=no1+no2;
                    System.out.println(ans);
        }
        else if(ch==2)
        {
            ans=no1-no2;
            System.out.println(ans);
        
        }
        else{
            System.out.println("Invalid ");
        }
            
    }
    
}
