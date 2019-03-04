package predicateExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        List<Apple> apples = Arrays.asList(new Apple("green", 120.0), new Apple("red", 110.0),
                new Apple("brown", 150.0), new Apple("green", 160.0), new Apple("red", 122.0));

        System.out.println("Predicate");
        ApplePredicates.filterApples(apples,ApplePredicates.isWeightHigherThank150()).forEach(System.out::println);


        //and predicate
        Predicate<Apple> andPredicate = ApplePredicates.isColorGreen().and(ApplePredicates.isWeightHigherThank150());
        System.out.println("And Predicate");
        apples.stream().filter(andPredicate).forEach(System.out::println);

        //negate
        Predicate<Apple> negateExample = ApplePredicates.isColorGreen().negate();
        System.out.println("Negate");
        apples.stream().filter(negateExample).forEach(System.out::println);
    }



}
