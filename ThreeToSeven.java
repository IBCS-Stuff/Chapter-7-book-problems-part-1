import java.util.Arrays;

class ThreeToSeven{
    public static void main(String[] args){
        int[] data = {27, 51, 33, -1, 101};


       System.out.println(Arrays.toString(TheEvens(-6, 38)));
    }
    public static int[] TheEvens(int a, int b){
        int Large = Math.max(a, b);
        int Small = Math.min(a, b);
        int z = 0;
        for(int i = Small; i <= Large; i++){
            if (!(i % 2 == 0)){
                z+= 1;
            }
        }
        

        int[] SpecialNumbers = new int[z];
        int f = 0;
        for(int i = Small; i <= Large; i++){
            if (!(i % 2 == 0)){
               SpecialNumbers[f] = i;
               f++;
            }
            
        }
        return SpecialNumbers;
    }
}