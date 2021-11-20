class QuestionsTenAndEleven {
    public static void main(String[] args){
        int[] Datastuff = {1, 2, 3, 4, 5, 6, 7 , 8, 9, 10,};
        Maximum(Datastuff);
        System.out.println(Mean(Datastuff));
    }

    public static void Maximum(int[] Numbers) {
        int max = Numbers[0];
        for (int i = 1; i < Numbers.length; i++) {
            if (Numbers[i] > max) {
                max = Numbers[i];
            }
        }
        System.out.println(max);
    }

    public static double Mean(int[] array) {
        double x = 0.0;
        for (int Val: array) {
            x += Val;
        }
        double y = x / array.length;
        return y;
    }
}