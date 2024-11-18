package org.neo.project.service.impl;

import org.neo.project.dao.ProjectDAO;
import org.neo.project.model.ProjectDO;
import org.neo.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springmvc01
 * @author: neo
 * @create: 2024-11-16 19:24
 **/
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDAO projectDAO;

    @Override
    public List<ProjectDO> listAllProjects() {
        return projectDAO.listAllProjects();
//        return null;
    }

    @Override
    public ProjectDO getProjectById(Integer projectId) {
//        return projectDAO.getProjectById(projectId);
        return null;
    }

    @Override
    public void saveProject(ProjectDO projectDO) {
//        projectDAO.saveProject(projectDO);
    }

    @Override
    public void modifyProject(ProjectDO projectDO) {
//        projectDao.modifyProject(projectDO);
    }

    @Override
    public void deleteProject(Integer projectId) {
//        projectDao.deleteProject(projectId);
    }
}
