
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

//sual 4
        Calculator topla = (a, b) -> a + b;
        Calculator cixma = (a, b) -> a - b;
        Calculator vur = (a, b) -> a * b;

        Calculator bol = (a, b) -> a / b;
        double x = 5;
        double y = 5;
        System.out.println(topla.calculate(x, y));
        System.out.println(cixma.calculate(x, y));


//.sual 7
//        List<Integer> ededler = Arrays.asList(10,258,45);
//
//        Function<Integer, Integer> function= number -> {
//            return number.toString().length();
//        };
//        List<Integer> list = ededler.stream()
//                .map(function).toList();
//
//        System.out.println(list);

        //sual8
//        String soz = "bugun";
//        Function<String, String> ilkherfb = str -> {
//            char birinciherf = Character.toUpperCase(str.charAt(0));
//            String sozundigerhissesi = str.substring(1);
//            return birinciherf + sozundigerhissesi;
//        };
//
//
//        String netice = ilkherfb.apply(soz);
//        System.out.println(netice);


//sual 9
//        List<String> names = Arrays.asList("Ali", "Nihat", "Aslan");
//
//        Predicate<String> predicate = name -> name.startsWith("A");
//
//        List<String> list = names.stream()
//                .filter(predicate).toList();
//        System.out.println(list);


        //sual10
//                List<String> name = Arrays.asList("nihat","samir","adil");
//
//                Supplier<String> stringSupplier = () -> {
//                    Random r = new Random();
//                    int random = r.nextInt(name.size());
//                    return name.get(random);
//                };
//                System.out.println(stringSupplier.get());


    }}