public class Main {
    public static void main(String[] args){

        int a = 12312321;
        Main main = new Main();
        System.out.println(main.isPalindrome(a));


    }

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int div = 1;
        while (x / div >= 10)
        {
            div *= 10;
        }

        while (x>0){
            int l = x/div;
            int r = x%10;
            if(l!=r)
                return false;
            x = x%div;
            x = x/10;
            div = div/100;
        }
        return true;

    }
}
