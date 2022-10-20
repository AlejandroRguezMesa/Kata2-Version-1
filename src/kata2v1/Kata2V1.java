
package kata2v1;

import java.util.HashMap;
import java.util.Map;

public class Kata2V1 {

    public static void main(String[] args) {
        int [] data = {1,6,2,8,3,8,2,7,3,4,2,9,0,6};
    
    Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
    
    for (int i=0; i<data.length; i++){
    if (histogram.containsKey(data[i])){
        histogram.put(data[i], histogram.get(data[i])+1);
    }
    else {
        histogram.put(data[i], 1);
    }
}
    for (Map.Entry<Integer, Integer> entry: histogram.entrySet()){
        System.out.println(entry.getKey() + "==>" + entry.getValue());
    }


}
}    
