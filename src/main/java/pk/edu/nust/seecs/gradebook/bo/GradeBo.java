/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.bo;

import pk.edu.nust.seecs.gradebook.dao.GradeDao;
import pk.edu.nust.seecs.gradebook.entity.Grade;

/**
 *
 * @author mmahad.bese14seecs
 */
public class GradeBo {
    
    public void addGrade(Grade grade) {
        GradeDao dao = new GradeDao();
        dao.addGrade(grade);
    }

    public void updateGrade(Grade grade) {
        GradeDao dao = new GradeDao();
        dao.updateGrade(grade);
    }
}
