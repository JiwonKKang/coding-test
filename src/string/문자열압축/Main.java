package string.문자열압축;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        
        StringBuilder answer = new StringBuilder();
        char prevChar = str.charAt(0);
        int cnt = 1;
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == prevChar) {
                cnt++;
            } else {
                answer.append(prevChar);
                if (cnt > 1) {
                    answer.append(cnt);
                }
                prevChar = str.charAt(i);
                cnt = 1;
            }
        }
        
        // 마지막 문자 처리
        answer.append(prevChar);
        if (cnt > 1) {
            answer.append(cnt);
        }
        
        return answer.toString();
    }

    public static void main(String[] args) {
        try (Scanner kb = new Scanner(System.in)) {
            String str = kb.next();
            System.out.println(new Main().solution(str));
        } catch (Exception e) {
            System.out.println("오류가 발생했습니다: " + e.getMessage());
        }
    }
}
