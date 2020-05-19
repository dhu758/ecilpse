package pro;

import java.util.Arrays;

public class pro099 {
	  static int[] m = { 67, 700, 735, 287, 830, 360, 753, 332, 899, 616, 990, 890, 933, 975, 275, 707, 271, 80, 409, 602, 875,
		         813, 208, 949, 183, 504, 721, 494, 159, 549, 95, 818, 85, 444, 703, 961, 928, 193, 846, 660, 433, 253, 547,
		         436, 467, 751, 684, 284, 481, 439, 12, 18, 421, 4, 394, 458, 829, 633, 474, 359, 454, 541, 601, 471, 326,
		         889, 345, 555, 710, 614, 540, 353, 795, 116, 119, 133, 859, 280, 413, 689, 861, 966, 709, 938, 600, 190, 81,
		         544, 406, 692, 765, 179, 32, 629, 437, 804, 911, 42, 836, 770 };

		   public static void change(int a, int b) {
		      int temp = m[a];
		      m[a] = m[b];
		      m[b] = temp;
		   }

		   public static void sort(int left, int right) {
		         
		      int mid = (left+right)/2;
		      int i=left;                  //left 시작
		      int j=right;               //right 시작
		      
		      while(i<j) {
		         while(m[i]<m[mid]) {i++;}   //mid보다 큰 left의 index찾기
		         while(m[j]>m[mid]) {j--;}   //mid보다 작은 right의 index찾기 
		         change(i, j);            //m[i]와 m[j]값 교환
		         sort(left, mid-1);         //mid의 왼쪽부분 재귀Sort
		         sort(mid+1, right);         //mid의 오른쪽부분 재귀Sort
		      }      
		   }
		   public static void main(String[] args) {

		      sort(0, m.length-1);
		      
		      System.out.print(Arrays.toString(m));   //배열 원소들 다 출력

		   }
}
