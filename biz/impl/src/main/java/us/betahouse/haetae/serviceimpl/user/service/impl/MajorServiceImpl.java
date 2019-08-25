/*
  betahouse.us
  CopyRight (c) 2012 - 2019
 */
package us.betahouse.haetae.serviceimpl.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import us.betahouse.haetae.serviceimpl.user.service.MajorService;
import us.betahouse.haetae.user.dal.repo.UserInfoDORepo;
import us.betahouse.haetae.user.dal.service.UserInfoRepoService;
import us.betahouse.haetae.user.manager.MajorManager;
import us.betahouse.haetae.user.model.basic.MajorBO;
import us.betahouse.haetae.user.model.basic.UserInfoBO;

import java.util.List;

/**
 * @author MessiahJK
 * @version : MajorServiceImpl.java 2019/04/21 16:40 MessiahJK
 */
@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    private MajorManager majorManager;

    @Autowired
    private UserInfoRepoService userInfoRepoService;

    @Override
    public List<MajorBO> getAllMajor() {
        return majorManager.getAllMajor();
    }

    @Override
    public List<UserInfoBO> queryAllMajorAndGrade() {
        return userInfoRepoService.queryAllMajorAndGrade();
    }
}
