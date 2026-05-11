package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<User> userList = List.of(new User(1, "A", "A_City"),
                                      new User(2, "B", "B_City"),
                                      new User(3, "C", "C_City"),
                                      new User(4, "D", "D_City"));

        // populate a map such that each entry of map is <user_object, "user.id_user.name_user.city">.
        Map<User, String> mappedUSers = userList.stream()
                                                .collect(Collectors.toMap(user -> user,
                                                                          user -> user.getId() + "_" + user.getName() + "_" + user.getCity()));
        System.out.println("Mapped Users: " + mappedUSers);

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //Given a list of Integers return only the even numbers as a new list.
        List<Integer> evenNumbers = integerList.stream()
                .filter(x -> x % 2 ==0)
                .toList();
        System.out.println("Even Numbers: " + evenNumbers);

        List<String> stringList = List.of("apple", "banana", "kiwi", "fig");
        // Given the list of strings, return the list of their lengths
        List<Integer> lengthList = stringList.stream()
                .map(String::length)
                .toList();
        System.out.println("Length of words: " + lengthList);

        // Given a list of strings return them sorted by length in ascending order
        List<String> sortedStringList = stringList.stream()
                .sorted(Comparator.comparingInt(String::length))
                        .toList();

        System.out.println("Sorted String List: " + sortedStringList);


        // Given a list of Integers, find the product of all the elements using reduce
        int product = integerList.stream()
                .reduce((x, y) -> x * y)
                .get();

        System.out.println("Product: " + product);

        List<String> sentences = List.of("Hello World", "Java Streams");
        //Given a list of sentences, return the list of all individual words.
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .toList();

        System.out.println("Words: " + words);

        Map<String, List<User>> userListOnCity = userList.stream()
                .collect(Collectors.groupingBy(User::getCity));

        System.out.println("User based on city: " + userListOnCity);

        List<Integer> unsortedIntegers = List.of(8,4,35,135,38,68,135,135,3848,613,684,3,1,32,13,51,321,3);
        // Given a list of integers with duplicates return a sorted list of unique elements.
        List<Integer> sortedIntegers = unsortedIntegers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Sorted Integers: " + sortedIntegers);

        // Given a list of user objects, partition them into two groups based on users from A_City and not from A_City
        Map<Boolean, List<User>> partitionedUsers = userList
                .stream()
                .collect(Collectors.partitioningBy(user -> "A_City".equalsIgnoreCase(user.getCity())));

        System.out.println("Partitioning on City: " + partitionedUsers);

        // Given a list of integers find the second-highest number using streams(without using sorting)
        int secondHighest = integerList.stream()
                .distinct()
                .reduce((a, b) -> a > b ? a : b)
                .flatMap(max ->
                        integerList.stream()
                                .filter(n -> n < max)
                                .max(Integer::compare)
                ).get();
        System.out.println("Second Highest: " + secondHighest);

        Integer min = integerList.stream().min(Comparator.naturalOrder()).get();
        Integer max = integerList.stream().max(Comparator.naturalOrder()).get();

        System.out.println("MIn: " + min + ", Max: " + max);
    }
}
