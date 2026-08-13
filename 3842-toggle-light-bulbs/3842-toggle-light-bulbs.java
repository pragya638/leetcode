import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

       
        for (int i : bulbs) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                list.add(entry.getKey());
            }
        }

       
        Collections.sort(list);

        return list;
    }
}