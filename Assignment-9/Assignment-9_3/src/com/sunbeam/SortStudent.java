//package com.sunbeam;
//import java.util.Comparator;

package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    private int roll;
    private String name;
    private String city;
    private double marks;

    public Student(int roll, String name, String city, double marks) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class SortStudent {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student(10, "Kunal", "Bhilai", 90);
        arr[1] = new Student(20, "Vijay", "Bhilai", 50);
        arr[2] = new Student(25, "Somesh", "Raipur", 90);
        arr[3] = new Student(26, "Aman", "Balod", 80);
        arr[4] = new Student(30, "Rahul", "Raipur", 70);

        class StdComparator implements Comparator<Student> {
            public int compare(Student s1, Student s2) {
                int diff = s1.getCity().compareTo(s2.getCity());
                if (diff == 0)
                    diff = Double.compare(s1.getMarks(), s2.getMarks());

                if (diff == 0)
                    diff = Integer.compare(s1.getRoll(), s2.getRoll());

                return diff;
            }
        }

        StdComparator comp = new StdComparator();
        Arrays.sort(arr, comp);
        System.out.println("After sort:");
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}
