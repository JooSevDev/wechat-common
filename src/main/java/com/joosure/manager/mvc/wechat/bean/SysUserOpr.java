package com.joosure.manager.mvc.wechat.bean;

import java.io.Serializable;
import java.util.Date;

public class SysUserOpr implements Serializable {
    /**
     * sys_user_opr.id (主键，记录id)
     * @ibatorgenerated 2016-08-16 10:07:15
     */
    private Long id;

    /**
     * sys_user_opr.userid (理员管id)
     * @ibatorgenerated 2016-08-16 10:07:15
     */
    private Integer userid;

    /**
     * sys_user_opr.oprurl (请求地址)
     * @ibatorgenerated 2016-08-16 10:07:15
     */
    private String oprurl;

    /**
     * sys_user_opr.oprtime (请求时间)
     * @ibatorgenerated 2016-08-16 10:07:15
     */
    private Date oprtime;

    /**
     * sys_user_opr.oprparam (请求参数)
     * @ibatorgenerated 2016-08-16 10:07:15
     */
    private String oprparam;

    /**
     * sys_user_opr.oprflag (请求标识：增、删、改、查。。。)
     * @ibatorgenerated 2016-08-16 10:07:15
     */
    private Integer oprflag;

    /**
     * sys_user_opr.memo (备注)
     * @ibatorgenerated 2016-08-16 10:07:15
     */
    private String memo;

    /**
     * sys_user_opr.retflag (回返标识：成功、失败)
     * @ibatorgenerated 2016-08-16 10:07:15
     */
    private Integer retflag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOprurl() {
        return oprurl;
    }

    public void setOprurl(String oprurl) {
        this.oprurl = oprurl;
    }

    public Date getOprtime() {
        return oprtime;
    }

    public void setOprtime(Date oprtime) {
        this.oprtime = oprtime;
    }

    public String getOprparam() {
        return oprparam;
    }

    public void setOprparam(String oprparam) {
        this.oprparam = oprparam;
    }

    public Integer getOprflag() {
        return oprflag;
    }

    public void setOprflag(Integer oprflag) {
        this.oprflag = oprflag;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getRetflag() {
        return retflag;
    }

    public void setRetflag(Integer retflag) {
        this.retflag = retflag;
    }
}