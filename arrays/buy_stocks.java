import java.util.*;

public class buy_stocks{

    public static int buying_selling(int prices[]){
    int buy_price=Integer.MAX_VALUE;
    int Maxprice=0;
    for(int i=0;i<prices.length;i++){
        if(buy_price<prices[i]){
            int profit=prices[i] - buy_price;
            Maxprice=Math.max(Maxprice, profit);
        }else{
        buy_price=prices[i];
        }
    }
    return Maxprice;
    }
    public static void main(String[] args) {
    int prices[]={7,1,5,3,6,4};
    System.out.println(buying_selling(prices));
    }
}