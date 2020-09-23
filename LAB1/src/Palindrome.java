public class Palindrome {
    public static void main(String[] args){
        String ll = "java Palindrome madam racecar apple kayak song noon\n";
        System.out.println(isPalindrome(ll));
    }


//    создание обратной строки
    public static String reverseString(String stroke){
        String buff = "";
        for (int i = stroke.length()-1; i >= 0; i--){
            char sym = stroke.charAt(i);
            buff += sym;
        }
        return buff;
    }

//    проверка перевернутой с траки с оригинальной
    public static boolean isPalindrome(String stroke){
        String reverseStroke = reverseString(stroke);
        return reverseStroke.equals(stroke);
    }
}

