/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.bo;

import pk.edu.nust.seecs.gradebook.dao.CourseDao;

import pk.edu.nust.seecs.gradebook.entity.Course;

/**
 *
 * @author mmahad.bese14seecs
 */
public class CourseBo {

    public void addCourse(Course course) {
        CourseDao dao = new CourseDao();
        dao.addCourse(course);
    }

    public void updateCourse(Course course) {
        CourseDao dao = new CourseDao();
        dao.updateCourse(course);
    }
}
