import java.util.*;

public class ListsandHowtouse {
    public static void main(String[] args) {
        //Arraylist kullanımı ornek
        /*
        List<String> list = new ArrayList<>();
        list.add("Daniel");
        list.add(0, "Marko");   //index 1 i günceller
        list.add("Jhon");     // list.add bir sonraki indexe girilen indexi yazar
        list.remove(1); //index 1 deki değeri siler bu işlem sonucunda 1den sonraki index değerleri aşağıya kayar (dinamik olarak küçülür)
        System.out.println(list.size());    //list.size listin boyutunu yazar
        for(int i=0;i<10;i++)
            System.out.println(list.get(i));
        */
        //Linkedlist kullanımı ornek
        /*
        LinkedList<String> list = new LinkedList<>();
        list.addLast("Daniel");   //sona ekler
        list.addFirst("Marko");   //başa ekler
        list.push("John");
        //list.removeFirst();
        //list.removeLast();
        System.out.println(list.size());
        for(int i=0;i<10;i++)
            System.out.println(list.get(i));
        */
        //HashMap kullanmı ornek
        /*
        Map<String, String> map = new HashMap<>();
        map.put("123456", "Daniel");   //özel keyleri bulunur bu sayede fazla değer bulunan sistemlerde aynı hızda istenilen değere ulaşılabilir
        map.put("654321", "Marko");
        map.remove("654321");
        System.out.println(map.get("123456"));
        */
        HashSet<String> set = new HashSet<>();
        set.add("Elma");
        set.add("Muz");
        set.add("Kiraz");
        set.add("Elma");   //Hashset aynı öğreyi birden fazla kez eklemeye izin vermez yanlızca benzersiz öğeleri saklar bu nedenle bu satırın yazılması sonucunda "elma" sadece 1 kez gösterilecektir
        System.out.println(set.size());
        System.out.println(set);

    }
}
