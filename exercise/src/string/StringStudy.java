package string;

import java.util.Arrays;

public class StringStudy {
    /*
    * String 관련 메소드
    * char charAt(int index): 문자열에서 해당 위치에 있는 문자를 반환
    * int length(): 문자열의 길이를 반환
    * String substring(int from, int to): 문자열에서 해당 범위에 있는 문자열을 반환
    * boolean equals(String str): 문자열의 내용이 같은지 확인
    * char[] toCharArray(): 문자열을 문자 배열(char[])로 변환해서 반환
    * */

    public static void main(String[] args) {
        String str = "01234";

        //charAt
        System.out.println(str.charAt(1));

        //length
        System.out.println(str.length());

        // substring
        System.out.println(str.substring(1,4));

        // equals
        System.out.println(str.equals("01234"));

        //toCharArray
        System.out.println(Arrays.toString(str.toCharArray()));
    }
}
