package qainterviewtasks;

public class HappyNumber {
    public static boolean isHappy(int n) {
        boolean isHappy = false;
        int result = 0;
        int count =0;
        String[] intArray = Integer.toString(n).split("");

            do {
                result = 0;
                for (int j = 0; j < intArray.length; j++) {
                    result = result + (int) Math.pow(Double.parseDouble(intArray[j]), 2);
                }
                intArray = Integer.toString(result).split("");
                count++;
                if(count ==1000){
                    break;
                }
            } while (result != 1);
            if (result == 1) {
                isHappy = true;
            }
        System.out.println("Number is happy: " + isHappy);
        return isHappy;
    }

    public static void main(String[] arg) {
        isHappy(0);

    }
}
