import models.Students;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Students a = new Students(
                "Carlo",
                Collections.singletonList(1)
        );

        Students b = new Students(
                "Francesco",
                Collections.singletonList(2)
        );

        a.addGrade(10);
        a.addGrade(20);
        a.addGrade(30);
        a.addGrade(30);
        b.addGrade(18);
        b.addGrade(22);
        b.addGrade(16);
        b.addGrade(28);

        System.out.print("La media di Carlo è ");
        System.out.println(a.getAverageGrades());
        System.out.print("La media di Francesco è ");
        System.out.println(b.getAverageGrades());


        if(a.getAverageGrades()>b.getAverageGrades()){
            System.out.print("La media di Carlo è la migliore ");
        }else{
            System.out.print("La media di Francesco è la migliore ");
        }
    }
}