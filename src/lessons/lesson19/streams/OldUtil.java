package lessons.lesson19.streams;

import java.util.ArrayList;
import java.util.List;


public class OldUtil {
    public static List<Cat> filterByBreed(List<Cat> cats, Breed breed) {
        List<Cat> resultList = new ArrayList<>();
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getBreed().equals(breed)) {
                resultList.add(cats.get(i));
            }
        }
        return resultList;
    }
}
