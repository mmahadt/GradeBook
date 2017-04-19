/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.bo;

import pk.edu.nust.seecs.gradebook.dao.ContentDao;
import pk.edu.nust.seecs.gradebook.entity.Content;

/**
 *
 * @author mmahad.bese14seecs
 */
public class ContentBo {

    public void addContent(Content content) {
        ContentDao dao = new ContentDao();
        dao.addContent(content);
    }

    public void updateCourse(Content content) {
        ContentDao dao = new ContentDao();
        dao.updateContent(content);
    }
}
