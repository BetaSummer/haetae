/*
 * betahouse.us
 * CopyRight (c) 2012 - 2019
 */
package us.haetae.certificate.dal.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import us.betahouse.util.common.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author guofan.cp
 * @version : BaseDO.java 2019/03/30 9:47 guofan.cp
 */
@MappedSuperclass
public abstract class BaseDO extends ToString {


    @Id
    @GeneratedValue
    private Long id;

    /**
     * 创建时间
     */
    @CreatedDate
    @Column(name = "gmt_create",nullable = false)
    private Date gmtCreate;

    /**
     *修改时间
     */
    @LastModifiedDate
    @Column(name = "gmt_modified",nullable = false)
    private  Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
