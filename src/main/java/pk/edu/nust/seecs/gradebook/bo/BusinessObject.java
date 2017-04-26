/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.bo;

/**
 *
 * @author mmahad.bese14seecs
 */
public class BusinessObject {

//    CLO Methods
    public void addClo(Clo clo) {
        CloDao dao = new CloDao();
        dao.addClo(clo);
    }

    public void updateClo(Clo clo) {
        CloDao dao = new CloDao();
        dao.updateClo(clo);
    }

//  Grade methods    
    public void addGrade(Grade grade) {
        GradeDao dao = new GradeDao();
        dao.addGrade(grade);
    }

    public void updateGrade(Grade grade) {
        GradeDao dao = new GradeDao();
        dao.updateGrade(grade);
    }

//  Content methods   

    public void addContent(Content content) {
        ContentDao dao = new ContentDao();
        dao.addContent(content);
    }

    public void updateCourse(Content content) {
        ContentDao dao = new ContentDao();
        dao.updateContent(content);
    }

//    Course 
    public void addCourse(Course course) {
        CourseDao dao = new CourseDao();
        dao.addCourse(course);
    }

    public void updateCourse(Course course) {
        CourseDao dao = new CourseDao();
        dao.updateCourse(course);
    }

//    Student
    public void addStudent(Student student) {
        StudentDao dao = new StudentDao();
        dao.addStudent(student);
    }

    public void updateStudent(Student student) {
        StudentDao dao = new StudentDao();
        dao.updateStudent(student);
    }
//    Teacher

    public void addTeacher(Teacher teacher) {
        TeacherDao dao = new TeacherDao();
        dao.addTeacher(teacher);
    }

    public void updateTeacher(Teacher teacher) {
        TeacherDao dao = new TeacherDao();
        dao.updateTeacher(teacher);
    }
}
