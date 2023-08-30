package java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConsumerExample {
    public static void main(String []args){
        int [] A ={1,2,3,4,5,6,7};
        List<Integer> list = new ArrayList<>();
        list  = IntStream.of(A).boxed().collect(Collectors.toList());
        Consumer<Integer> cons = (num)-> System.out.println(num);
        list.forEach(cons);
    }
}
