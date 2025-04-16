package bai1.repository;

import bai1.entity.Student;

public interface IStudentRepository {
    Student[] findAll();
    void add(Student student);
    Student findById(int id);
    void update(int id, Student student);

}
