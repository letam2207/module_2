package bai1.repository;

import bai1.entity.Student;

import java.util.Scanner;

public class StudentRepository implements IStudentRepository {

    private static Student[] students = new Student[4];

    static {
        students[0] = new Student(4, "hải", 1);
        students[1] = new Student(2, "chánh", 1);
    }

    @Override
    public Student[] findAll() {
        return students;
    }

    @Override
    public void add(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Student student) {

    }
}
