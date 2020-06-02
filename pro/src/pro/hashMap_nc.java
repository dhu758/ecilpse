package pro;
import java.util.*;
public class hashMap_nc {	
	public static void main(String[] args) {
		String[] movie= {"spy","ray","spy","room","once","ray","spy","once"};
		HashMap<String, Integer> map = new HashMap<>();	//HashMap 선언
		
		for(int i=0; i<movie.length; i++) {	//map에 key와 value를 넣기
			String smovie=movie[i];
			int count=1;
			
			if(map.containsKey(smovie)) {	//key값이 원래 있으면 value++
				int temp = map.get(smovie);
				temp++;
				map.put(smovie, temp);
			}else {							//key값이 없으면 key와 value 넣기
				map.put(smovie, count);
			}
		}
		
		ArrayList<String> keyList = new ArrayList<>(map.keySet());//keyList에 key값만 넣기
		System.out.println(keyList);
		
		Collections.sort(keyList, new Comparator<String>() {	//Value에 의한 정렬
			@Override
			public int compare(String o1, String o2) {	//o1,o2에 keyList가 들어옴
//				System.out.println(o1+" "+o2);
				return map.get(o2).compareTo(map.get(o1));//value값을 불러와서 내림차순
			}
		});
		
		String[] ans = new String[keyList.size()];
		for(int i=0; i<keyList.size(); i++) {
			ans[i]=keyList.get(i);
		}
		System.out.println(keyList);
//		System.out.println(map);
//		for(int i=0; i<ans.length; i++ ) {
//			System.out.println(ans[i]);
//		}

	}
}
