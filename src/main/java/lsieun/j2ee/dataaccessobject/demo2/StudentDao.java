package lsieun.j2ee.dataaccessobject.demo2;

import java.util.List;

interface StudentDao {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
