package bai1.service;

import bai1.entity.Student;

public interface IStudentService {
    Student[] findAll();
    void add(Student student);
}
