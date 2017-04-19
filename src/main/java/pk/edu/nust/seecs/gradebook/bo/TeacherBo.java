/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.bo;

import pk.edu.nust.seecs.gradebook.dao.TeacherDao;
import pk.edu.nust.seecs.gradebook.entity.Teacher;

/**
 *
 * @author mmahad.bese14seecs
 */
public class TeacherBo {

    public void addTeacher(Teacher teacher) {
        TeacherDao dao = new TeacherDao();
        dao.addTeacher(teacher);
    }

    public void updateTeacher(Teacher teacher) {
        TeacherDao dao = new TeacherDao();
        dao.updateTeacher(teacher);
    }
}
