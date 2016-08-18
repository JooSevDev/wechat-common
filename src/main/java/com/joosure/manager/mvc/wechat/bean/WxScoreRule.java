package com.joosure.manager.mvc.wechat.bean;

import java.io.Serializable;
import java.util.Date;

public class WxScoreRule implements Serializable {
    /**
     * wx_score_rule.ruleId (规则id)
     * @ibatorgenerated 2016-08-17 23:52:12
     */
    private Integer ruleid;

    /**
     * wx_score_rule.ruleName (规则名)
     * @ibatorgenerated 2016-08-17 23:52:12
     */
    private String rulename;

    /**
     * wx_score_rule.ruleKey (则规键)
     * @ibatorgenerated 2016-08-17 23:52:12
     */
    private String rulekey;

    /**
     * wx_score_rule.ruleScore (则规对应分数)
     * @ibatorgenerated 2016-08-17 23:52:12
     */
    private Integer rulescore;

    /**
     * wx_score_rule.addTime (添加时间)
     * @ibatorgenerated 2016-08-17 23:52:12
     */
    private Date addtime;

    /**
     * wx_score_rule.modifyTime (更新时间)
     * @ibatorgenerated 2016-08-17 23:52:12
     */
    private Date modifytime;

    /**
     * wx_score_rule.status (状态)
     * @ibatorgenerated 2016-08-17 23:52:12
     */
    private Integer status;

    public Integer getRuleid() {
        return ruleid;
    }

    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    public String getRulename() {
        return rulename;
    }

    public void setRulename(String rulename) {
        this.rulename = rulename;
    }

    public String getRulekey() {
        return rulekey;
    }

    public void setRulekey(String rulekey) {
        this.rulekey = rulekey;
    }

    public Integer getRulescore() {
        return rulescore;
    }

    public void setRulescore(Integer rulescore) {
        this.rulescore = rulescore;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}