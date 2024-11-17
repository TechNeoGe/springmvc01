package org.neo.project.model;

/**
 * @program: springmvc01
 * @author: neo
 * @create: 2024-11-17 16:36
 **/
public class ProjectDO {

    private static final long serialVersionUID = 1L;

    private static final String TABLE_NAME = "t_project";

    private Long projectId;         // 项目ID
    private String projectName;     // 项目名称
    private String projectDesc;     // 项目描述
    private String createTime;      // 创建时间
    private String createUser;      // 创建用户
    private String modifyTime;      // 修改时间
    private String modifyUser;      // 修改用户

    // Getter 和 Setter 方法
    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    @Override
    public String toString() {
        return "ProjectDO{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectDesc='" + projectDesc + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createUser='" + createUser + '\'' +
                ", modifyTime='" + modifyTime + '\'' +
                ", modifyUser='" + modifyUser + '\'' +
                '}';
    }
}
