import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MyLibrary {

    public static List<List<Integer>> partition (List<Integer> list, int taille) throws Exception{
        if (list == null) {
            throw new Exception("Params list is null");
        }

        if (taille < 1) {
            throw new Exception("Params taille should be >= 1");
        }

        List<List<Integer>> result = new ArrayList<>();

        if (list.size() <= taille) {
            result.add(list);
            return result;
        }

        ListIterator<Integer> iterator = list.listIterator();

        while (iterator.hasNext()) {
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i  < taille; i++) {
                if (iterator.hasNext()) {
                    subList.add(iterator.next());
                }
                else break;
            }
            result.add(subList);

        }
        return result;
    }
}
