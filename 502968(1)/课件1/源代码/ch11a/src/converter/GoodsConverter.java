package converter;

import org.springframework.core.convert.converter.Converter;
import pojo.GoodsModel;

public class GoodsConverter implements Converter<String, GoodsModel> {
    @Override
    public GoodsModel convert(String source) {
        //����һ��Goodsʵ��
        GoodsModel goods = new GoodsModel();
        //�ԡ�,���ָ���
        String stringValues[] = source.split(",");
        if (stringValues != null &&
                stringValues.length == 3) {
            //ΪGoodsʵ����ֵ
            goods.setGoodsname(stringValues[0]);
            goods.setGoodsprice(Double.parseDouble(stringValues[1]));
            goods.setGoodsnumber(Integer.parseInt(stringValues[2]));
            return goods;
        } else {
            throw new IllegalArgumentException(String.format("����ת��ʧ�ܣ���Ҫ��ʽ��apple,10.58,200��������ʽ��[%s]", source));
        }
    }
}
