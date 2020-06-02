package pro;
import java.util.*;
public class hashMap_nc {	
	public static void main(String[] args) {
		String[] movie= {"spy","ray","spy","room","once","ray","spy","once"};
		HashMap<String, Integer> map = new HashMap<>();	//HashMap ����
		
		for(int i=0; i<movie.length; i++) {	//map�� key�� value�� �ֱ�
			String smovie=movie[i];
			int count=1;
			
			if(map.containsKey(smovie)) {	//key���� ���� ������ value++
				int temp = map.get(smovie);
				temp++;
				map.put(smovie, temp);
			}else {							//key���� ������ key�� value �ֱ�
				map.put(smovie, count);
			}
		}
		
		ArrayList<String> keyList = new ArrayList<>(map.keySet());//keyList�� key���� �ֱ�
		System.out.println(keyList);
		
		Collections.sort(keyList, new Comparator<String>() {	//Value�� ���� ����
			@Override
			public int compare(String o1, String o2) {	//o1,o2�� keyList�� ����
//				System.out.println(o1+" "+o2);
				return map.get(o2).compareTo(map.get(o1));//value���� �ҷ��ͼ� ��������
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
