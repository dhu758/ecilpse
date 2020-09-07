class Solution {

    public int[] solution(int brown, int yellow) {

        int w=0,h=0;    //가로, 세로

        

        if(brown==yellow*2+6){  //노란색 칸이 가로 한줄로 쭉있는 경우

            w=yellow+2;

            h=3;

        }

        else{   //노란색 칸이 직사각형을 이루는 경우

            for(int i=2; i<=yellow/2; i++){ //나뉘는 수에 따라 직사각형 모양이 달라지므로

                if(yellow%i==0){    //i는 노란색 칸의 세로 길이

                    h=i+2;

                    w=yellow/i+2;

                    if(brown==(w-2)*2+(h-2)*2+4){   //brown과의 연산을 통해 이 직사각형이 맞는지 확인

                        break;

                    }

                }

            }

        }

        int[] answer = {w,h};   //밑에서 선언한 이유 중요!

        return answer;

    }

}


