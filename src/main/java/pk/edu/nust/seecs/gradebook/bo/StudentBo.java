/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.bo;

import pk.edu.nust.seecs.gradebook.dao.StudentDao;
import pk.edu.nust.seecs.gradebook.entity.Student;

/**
 *
 * @author mmahad.bese14seecs
 */
public class StudentBo {
    public void addStudent(Student student){
        StudentDao dao = new StudentDao();
        dao.addStudent(student);
    }
    public void updateStudent(Student student){
        StudentDao dao = new StudentDao();
        dao.updateStudent(student);
    }
}
