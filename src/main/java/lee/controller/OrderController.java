package lee.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lee.dto.OrderParam;
import lee.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：lyj
 * @email: : iclyj@iclyj.cn
 * @date ：2019/7/31 18:48
 */
@Controller
@Api(tags = "orderController", description = "订单管理")
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ApiOperation("根据购物车信息生成订单")
    @RequestMapping(value = "/generateOrder", method = RequestMethod.POST)
    @ResponseBody
    public Object generateOrder(@RequestBody OrderParam orderParam){
        return orderService.generateOrder(orderParam);
    }

}
