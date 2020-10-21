package class3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ps1697 {
 static int N;
 static int K;
 static int[] check = new int [100001];
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  N = sc.nextInt();

  K = sc.nextInt();

  int answer;

  if(N==K) {

   answer=0;

  }

  else{

   answer = bfs(N);

  }

  System.out.println(answer);

 }

 private static int bfs(int N) {

  Queue<Integer> queue = new LinkedList<>();

  queue.add(N);

  check[N] = 0;

  

  while(!queue.isEmpty()) {

   int location = queue.poll();

   int nextLocation;

   for(int i=0; i<3; i++) {

    if(i==0) {

     nextLocation = location-1;

    }

    else if(i==1) {

     nextLocation = location+1;

    }

    else {

     nextLocation = 2*location;

    }

    if(nextLocation>=0&&nextLocation<=100000&&check[nextLocation]==0) {

     check[nextLocation] = check[location]+1;

     queue.add(nextLocation);

     if(nextLocation==K) {

      return check[nextLocation];

     }

    }

   }

  }

  

  return N;

 }

}


