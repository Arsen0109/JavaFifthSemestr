package lab4java;

import java.util.Comparator;

public class byNumberInGroup implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o2.numberInGroupList - o1.numberInGroupList;
    }
}

