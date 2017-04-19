/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.bo;

import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;

/**
 *
 * @author mmahad.bese14seecs
 */
public class CloBo {

    public void addClo(Clo clo) {
        CloDao dao = new CloDao();
        dao.addClo(clo);
    }

    public void updateClo(Clo clo) {
        CloDao dao = new CloDao();
        dao.updateClo(clo);
    }
}
