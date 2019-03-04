package predicateExample;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ApplePredicates {

    protected static Predicate<Apple> isWeightHigherThank150(){
        return apple -> apple.getWeight() >= 150;
    }


    public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) {
        return apples.stream().filter(predicate).collect(Collectors.toList());
    }

    public static Predicate<Apple> isColorGreen() {
        return apple -> apple.getColor().equals("green");
    }

}
