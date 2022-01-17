package org.apache.ibatis.xinghe.entity;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2022/1/17 - 3:08 下午
 * @see [相关类/方法]
 * @since [版本号]
 */
public class MybatisTest {

    private Long id;
    private Long testId;
    private String data;
    private Integer deleted;
    private Long gmtCreate;
    private Long gmtUpdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Long gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }
}
