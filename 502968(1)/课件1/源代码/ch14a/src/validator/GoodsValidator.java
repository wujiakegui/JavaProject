package validator;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pojo.Goods;

@Component
public class GoodsValidator implements Validator {
    @Override
    public boolean supports(Class<?> klass) {
        // Ҫ��֤��Model������ֵΪfalse����֤��  
        return Goods.class.isAssignableFrom(klass);
    }

    @Override
    public void validate(Object object, Errors errors) {
        Goods goods = (Goods) object;//objectҪ��֤�Ķ���
        //goods.gname.required�Ǵ�����Ϣ�����ļ��еı���
        ValidationUtils.rejectIfEmpty(errors, "gname", "goods.gname.required");
        ValidationUtils.rejectIfEmpty(errors, "gdescription", "goods.gdescription.required");
        if (goods.getGprice() > 100 || goods.getGprice() < 0) {
            errors.rejectValue("gprice", "gprice.invalid");
        }
        Date goodsDate = goods.getGdate();
        //��ϵͳʱ��֮��
        if (goodsDate != null && goodsDate.after(new Date())) {
            errors.rejectValue("gdate", "gdate.invalid");
        }
    }
}
