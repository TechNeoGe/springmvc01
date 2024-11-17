package org.neo.project.service;

import org.neo.project.model.ProjectDO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springmvc01
 * @author: neo
 * @create: 2024-11-16 19:24
 **/
public interface ProjectService {
    List<ProjectDO> listAllProjects();

    ProjectDO getProjectById(Integer projectId);

    void saveProject(ProjectDO projectDO);

    void modifyProject(ProjectDO projectDO);

    void deleteProject(Integer projectId);
}
