import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student hong = new Student("홍길동", 20);
        Student kim = new Student("김철수", 22);
        Student choi = new Student("최치김", 35);
        Student lee = new Student("이문복", 28);
        Student jung = new Student("정순하", 50);

        // 리스트에 학생 객체들 저장.
        Student[] list = new Student[5];
        list[0] = hong;
        list[1] = jung;
        list[2] = choi;
        list[3] = lee;
        list[4] = kim;

        // 정렬 전
        System.out.println(Arrays.toString(list));

        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.age > o2.age)
                    return 1;
                else if (o1.age == o2.age)
                    return 0;
                else
                    return -1;
            }
        };

        // 정렬
        Arrays.sort(list, comp);

        // 정렬 후
        System.out.println(Arrays.toString(list));
    }
}


class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}