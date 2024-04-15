package realinterviewprogram;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDupArrayList {
    public static void main(String[] args) {


        Employeee e1 = new Employeee(1, "pallavi");
        Employeee e6 = new Employeee(1, "sachin");
        Employeee e2 = new Employeee(3, "sanvi");
        Employeee e3 = new Employeee(3, "sanal");
        Employeee e4 = new Employeee(5, "pallavi");
        Employeee e5 = new Employeee(6, "pallavi");

        List<Employeee> EmpList = new ArrayList<>();
        EmpList.add(e1);
        EmpList.add(e2);
        EmpList.add(e3);
        EmpList.add(e4);
        EmpList.add(e5);
        EmpList.add(e6);

        Set<Employeee> set = new LinkedHashSet<>();
        for (Employeee e : EmpList) {
            set.add(e);
        }
        System.out.println(set);
         //using java 8
        List<Employeee> unique = EmpList.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
    }
}
