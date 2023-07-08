package lessons.lesson19.streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = StreamUtil.getCats();

        List<Cat> filteredCatsByBreed = OldUtil.filterByBreed(cats, Breed.BENGAL);
        StreamUtil.printCats(filteredCatsByBreed);

        List<Cat> filteredCatsByBreed1 = StreamUtil.filterByBreed(cats, Breed.BENGAL);
        StreamUtil.printCats(filteredCatsByBreed1);
        StreamUtil.printCats(StreamUtil.sortedByAge(cats));
        System.out.println(StreamUtil.minByAge(cats));
        System.out.println(StreamUtil.groupByBreed(cats));
        System.out.println(StreamUtil.existByBreed(cats, Breed.PERSIAN));
    }
}
