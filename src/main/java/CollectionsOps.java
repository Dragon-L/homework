import java.util.ArrayList;
import java.util.List;

class CollectionsOps {

    public static List<Integer> odd(List<Integer> numbers) {
        List<Integer> temp = new ArrayList<Integer>();
        for(Integer x:numbers){
            if (x % 2 != 0) {
                temp.add(x);
            }
        }
        return temp;
    }

    public static List<Integer> doubleEvens(List<Integer> numbers) {
        List<Integer> temp = new ArrayList<Integer>();
        for(Integer x:numbers){
            if(x%2==0){
                temp.add(x*2);
            }
            else {
                temp.add(x);
            }
        }
        return temp;
    }

    public static String tryFind(Integer toFind, List<Integer> numbers) {
        for(Integer x:numbers){
            if(x.equals(toFind)){
                return "Hello, "+x;
            }
        }
        return "Not Found";
    }
}
