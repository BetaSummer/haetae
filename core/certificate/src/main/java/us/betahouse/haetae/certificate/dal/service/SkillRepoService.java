/*
 * betahouse.us
 * CopyRight (c) 2012 - 2019
 */
package us.betahouse.haetae.certificate.dal.service;

import us.betahouse.haetae.certificate.model.basic.CertificateBO;

import java.util.List;

/**
 * 技能证书仓储
 *
 * @author guofan.cp
 * @version : SkillRepoService.java 2019/04/05 12:42 guofan.cp
 */
public interface SkillRepoService {
    /**
     * 创建技能证书
     *
     * @param certificateBO
     * @return
     */
    CertificateBO create(CertificateBO certificateBO);

    /**
     * 删除技能证书
     *
     * @param certificateId
     * @return
     */
    void delete(String certificateId);

    /**
     * 修改技能证书
     *
     * @param certificateBO
     * @return
     */
    CertificateBO modify(CertificateBO certificateBO);

    /**
     * 通过证书id获取技能证书详细信息
     *
     * @param certificateId
     * @return
     */
    CertificateBO queryByCertificateId(String certificateId);

    /**
     * 查询证书 通过用户id
     *
     * @param userId
     * @return
     */
    List<CertificateBO> queryByUserId(String userId);

    /**
     * 查找证书 通过证书名字
     *
     * @param certificateName
     * @return
     */
    List<CertificateBO> queryByCertificateName(String certificateName);
}
