package steam.inputstream;

import java.io.IOException;

public class SystemInTest1 {
    public static void main(String[] args){
        System.out.println("알파벳 하나를 쓰고 Enter를 누르세요");

        int i;
        try{
            i = System.in.read();// read() 메서드로 한 바이트 읽음
            System.out.println(i);
            System.out.println((char)i); // char로 변환하여 출력
        } catch (IOException e) {
            e.printStackTrace(); // 에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.

        }
    }
}
