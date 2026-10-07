package JAVA_COLLECTION_FRAMEWORK_3;

import java.util.*;

public class Comparator_Interface {
    static void main(String[] args) {

        List<Students> students1 = new ArrayList<>();

        students1.add(new Students(21, "Luckey", 99));
        students1.add(new Students(27, "Inzamam", 15));
        students1.add(new Students(14, "mota", 199));
        students1.add(new Students(31, "Rahul", 85));
        students1.add(new Students(12, "Aman", 65));
        students1.add(new Students(13, "Zaid", 95));
        students1.add(new Students(14, "Karan", 72));


        System.out.println(students1);
//        Collections.sort(students1, new Comparator<Students>() {
//            @Override
//            public int compare(Students o1, Students o2) {
//                return o1.weight - o2.weight;
//
//            }
//        });

//        Collections.sort(students1,new WeightComparator()  );
//        System.out.println(students1);


        Collections.sort(students1,((o1, o2) -> o1.weight-o2.weight));
        System.out.println(students1);



    }
}
