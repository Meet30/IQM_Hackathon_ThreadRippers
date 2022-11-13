package com.IQMhackathon.IQMhackathon.City;

import com.IQMhackathon.IQMhackathon.City.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository <Student,String> {
}
