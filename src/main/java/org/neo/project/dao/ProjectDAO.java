package org.neo.project.dao;

import org.apache.ibatis.annotations.Mapper;
import org.neo.project.model.ProjectDO;

import java.util.List;

/**
 * @program: springmvc01
 * @author: neo
 * @create: 2024-11-16 19:23
 **/
@Mapper
public interface ProjectDAO {
    List<ProjectDO> listAllProjects();

    ProjectDO getProjectById(Integer projectId);

    void saveProject(ProjectDO projectDO);

    void modifyProject(ProjectDO projectDO);

    void deleteProject(Integer projectId);
}
