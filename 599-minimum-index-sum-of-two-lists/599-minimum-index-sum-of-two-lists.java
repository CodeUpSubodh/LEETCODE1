class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
	HashMap<String, Integer> hm = new HashMap<>();
	int idxSum = 2000, i = 0;;
	ArrayList<String> resp = new ArrayList<>();
	while ( i < list1.length ) hm.put(list1[i], i++);
	i = -1;
	while ( ++i < list2.length ) {
		int sum1 = i + hm.getOrDefault(list2[i], -1);
		if ( sum1 >= i && sum1 <= idxSum ) {
			if ( sum1 != idxSum ) resp.clear();
			idxSum = sum1;
			resp.add(list2[i]);
		}
	}
	return resp.toArray(new String[resp.size()]);
}
        
    }
