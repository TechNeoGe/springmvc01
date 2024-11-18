package org.neo.project.controller;

import org.neo.project.model.ProjectDO;
import org.neo.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: springmvc01
 * @author: neo
 * @create: 2024-11-16 19:22
 **/
@RestController
@RequestMapping("project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @RequestMapping("listAllProjects1")
    public String listAllProjects1(){
        return "projectService.listAllProjects()";
    }

    @RequestMapping("listAllProjects")
    @ResponseBody
    public Object listAllProjects(){
        return projectService.listAllProjects();
    }

//    @RequestMapping("getProjectById")
//    public ProjectDO getProjectById(Integer projectId) {
//        return projectService.getProjectById(projectId);
//    }
//    @RequestMapping("saveProject")
//    public void saveProject(ProjectDO projectDO) {
//        projectService.saveProject(projectDO);mybatis
//    }
//    @RequestMapping("modifyProject")
//    public void modifyProject(ProjectDO projectDO) {
//        projectService.modifyProject(projectDO);
//    }
//    @RequestMapping("deleteProject")
//    public void deleteProject(Integer projectId) {
//        projectService.deleteProject(projectId);
//    }
}
