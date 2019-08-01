package lee.dto;

import lombok.Data;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2019/7/31 17:46
 *
 * 生成订单时传入的参数
 */
@Data
public class OrderParam {

    //收货地址id
    private Long memberReceiveAddressId;
    //优惠券id
    private Long couponId;
    //使用的积分数
    private Integer useIntegration;
    //支付方式
    private Integer payType;

}
