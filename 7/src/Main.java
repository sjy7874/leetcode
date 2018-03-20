public class Main {

    public static void main(String[] args){

        int x = 1534236469;
        Main s = new Main();
        System.out.println(s.reverse(x));

    }

/*给定一个范围为 32 位 int 的整数，将其颠倒。

例 1:

输入: 123
输出:  321


例 2:

输入: -123
输出: -321


例 3:

输入: 120
输出: 21*/

    public int reverse(int x) {

        int carry = 0;
        if(x<0){
            carry = 1;
            x = 0-x;
        }
        double y=0;
        int res;
        while (x>0){
            y = y*10 + x%10;
            x = x/10;
        }
        if(carry==1){
            y = 0-y;
        }
        if(y<-2147483648||y>2147483647)
            res = 0;
        else
            res = (int)y;
        return res;

    }
}
