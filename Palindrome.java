public class Palindrome{
    // ensure number is of length 7
    public boolean validate(int value){
        return (Integer.toString(value).length() == 7);
    }

    public boolean isPalindrome(int value){
        int arrValue[] = new int[7];

        // split the int
        // countdown so as to not reverse the original order
        for(int i=6; i>=0; i--){
            arrValue[i] = value % 10;
            value /= 10;
        }

        return ((arrValue[0] == arrValue[6]) && (arrValue[1] == arrValue[5] && (arrValue[2] == arrValue[4])));
    }
}
