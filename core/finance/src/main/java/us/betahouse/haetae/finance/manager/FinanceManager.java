/*
  betahouse.us
  CopyRight (c) 2012 - 2019
 */
package us.betahouse.haetae.finance.manager;

import org.springframework.stereotype.Service;
import us.betahouse.haetae.finance.model.basic.FinanceMessageBO;
import us.betahouse.haetae.finance.model.basic.FinanceTotalBO;
import us.betahouse.haetae.finance.model.common.PageList;
import us.betahouse.haetae.finance.request.FinanceRequest;

/**
 * @author MessiahJK
 * @version : FinanceManager.java 2019/02/22 0:39 MessiahJK
 */
@Service
public interface FinanceManager {

    /**
     * 查询信息 分页
     *
     * @param request
     * @return
     */
    PageList<FinanceMessageBO> findMessage(FinanceRequest request);


    /**
     * 获取总金额
     *
     * @param request
     * @return
     */
    FinanceTotalBO getTotalMoney(FinanceRequest request);


    /**
     * 创建财务信息 预算
     *
     * @param financeMessageBO
     * @return
     */
    FinanceMessageBO createFinanceMessageByBudget(FinanceMessageBO financeMessageBO);

    /**
     * 创建财务信息 记账
     *
     * @param financeMessageBO
     * @return
     */
    FinanceMessageBO createFinanceMessageByTally(FinanceMessageBO financeMessageBO);

    /**
     * 初始化财务统计
     *
     * @param financeTotalBO
     * @return
     */
    void initTotalMoney(FinanceTotalBO financeTotalBO);
}
