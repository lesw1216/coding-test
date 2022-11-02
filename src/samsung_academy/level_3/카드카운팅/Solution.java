package samsung_academy.level_3.카드카운팅;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/*
    한덱의 카드가 필요 : 스페이드, 다이아, 하트, 클로버 무늬별로 1 ~ 13개 총 52장의 카드
    이미 몇장의 카드를 소유, 게임을 하기 위해서 몇 장의 카드가 더 필요한가.
    소유한 카드들이 겹치는게 있다면 오류 출력

    입력
    테스트 케이스
    각 줄에 가지고 있는 카드 정보 s[1...1000] 문자열
    s는 `TXY` 꼴로 하나의 카드가 표현, 해당 꼴로 이어붙인 문자열
    T는 카드무늬 S, D, H, C XY는 카드의 숫자(01 ~ 13)
 */
public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/samsung_academy/level_3/카드카운팅/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        HashMap<Character, HashMap<String, Boolean>> card = new HashMap<>();

        for (int tc = 1; tc <= T; tc++) {
            boolean errorCheck = false;
            card.put('S', new HashMap<>());
            card.put('D', new HashMap<>());
            card.put('H', new HashMap<>());
            card.put('C', new HashMap<>());

            String line = sc.next();
            for (int i = 0; i < line.length(); i += 3) {
                String num = line.substring(i + 1, i + 3);

                HashMap<String, Boolean> numMap = card.get(line.charAt(i));

                // 중복 체크
                if (numMap.containsKey(num)) {
                    System.out.println("#" + tc + " ERROR");
                    errorCheck = true;
                    break;
                }

                numMap.put(num, true);
                card.put(line.charAt(i), numMap);

            }

            if (!errorCheck) {
                HashMap<String, Boolean> sMap = card.get('S');
                HashMap<String, Boolean> dMap = card.get('D');
                HashMap<String, Boolean> hMap = card.get('H');
                HashMap<String, Boolean> cMap = card.get('C');

                System.out.println("#" + tc + " " + (13 - sMap.size()) + " " + (13 - dMap.size())
                        + " " + (13 - hMap.size()) + " " + (13 - cMap.size()));
            }
        }
    }
}
