package com.IQMhackathon.IQMhackathon.City;


import com.IQMhackathon.IQMhackathon.City.Student;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StudentService {
//
//    @Autowired
//    private StudentRepository studentRepository;

    List<Student> studentList = new ArrayList<>();

    StudentService(){
//        studentList.add(new Student("S1","1","P1"));
//        studentList.add(new Student("S2","2","P2"));
//        studentList.add(new Student("S3","3","P3"));
    }

    public List<Student> getAllStudent(){
        return studentList;
    }

    public void addStudent(Student student){
        studentList.add(student);
//        studentRepository.save(student);
    }

    public void deleteStudent(String id){

        int index = -1;
        for(int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getContactNo().equals(id)) {
                index = i;
                break;
            }
        }

        studentList.remove(index);
//        studentRepository.deleteById(id);
    }


}
