-----------------해시를 사용하지않은 다른 사람 풀이법---------------------

//for문이 1개이다(복잡도 좋음), 배열안에 값이 String이라서 정렬을 하면 사전순으로 나오기 때문에 자신과 그 다음 원소끼리만 비교하면된다. 근데 크기비교는 왜 해야하는걸까

import java.util.Arrays;

class Solution {

    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length-1; i++) {

            if (phone_book[i].length() < phone_book[i+1].length()) {

                if (phone_book[i].equals(phone_book[i+1].substring(0, phone_book[i].length()))) return false;

            } else {

                if (phone_book[i+1].equals(phone_book[i].substring(0, phone_book[i+1].length()))) return false;

            }

        }

        return true;

    }

}


