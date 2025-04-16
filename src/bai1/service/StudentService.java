package bai1.service;

import bai1.entity.Student;
import bai1.repository.IStudentRepository;
import bai1.repository.StudentRepository;


public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();

    @Override
    public Student[] findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }
}
