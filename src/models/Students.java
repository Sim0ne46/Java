package models;

import java.util.ArrayList;
import java.util.List;

public class Students {
    String name;
    List<Integer> grades = new ArrayList<>();

    public Students(String name, List grades) {
        this.name = name;

    }


    public void addGrade(int grade) {
        grades.add(grade);
    }


    public double getAverageGrades() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }


}
