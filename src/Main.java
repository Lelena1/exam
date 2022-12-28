import java.util.*;

public class Main {
    public static void main(String[] args) {

//- Задача на лайв-кодинг
//Дан массив строк, необходимо удалить из него все дубли,
// оставшиеся строки объединить в одну в порядке следования в массиве.
//
//- Задача на лайв-кодинг
//Дан List <String> names. Удалите первую букву из каждого имени и верните отсортированный список.

        String[] sArr = {"10", "2", "5", "10", "10", "2", "3", "8", "1"};
        Set<String> sSet = new LinkedHashSet<>(Arrays.asList(sArr));
        System.out.println(sSet);
        String result = String.join("", sSet);
        System.out.println(result);

        List<String> names = new ArrayList<>();
        names.add("Катя");
        names.add("Света");
        names.add("Игорь");
        names.add("Таня");
        names.add("Олег");
        System.out.println(names);
        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).substring(1));
        }
        Collections.sort(names);
        System.out.println(names);

    }

}




