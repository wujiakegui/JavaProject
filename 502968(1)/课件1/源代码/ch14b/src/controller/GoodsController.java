package controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.Goods;
import service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    // �õ�һ��������¼��־�Ķ���������ӡ��Ϣ��ʱ���ܹ���Ǵ�ӡ�����Ǹ������Ϣ
    private static final Log logger = LogFactory.getLog(GoodsController.class);
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/input")
    public String input(Model model) {
        // ���model��û��goods���ԣ�addGoods.jsp���׳��쳣����Ϊ����ǩ�޷��ҵ�modelAttribute����ָ����form
        // backing object
        model.addAttribute("goods", new Goods());
        return "addGoods";
    }

    @RequestMapping("/save")
    public String save(@Valid @ModelAttribute Goods goods, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addGoods";
        }
        goodsService.save(goods);
        logger.info("��ӳɹ�");
        model.addAttribute("goodsList", goodsService.getGoods());
        return "goodsList";
    }

}
