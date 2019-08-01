package lee.service;

import lee.dto.OrderParam;
import lee.util.CommonResult;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2019/7/31 18:35
 *
 * 订单service管理
 */
public interface OrderService {

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);

}
