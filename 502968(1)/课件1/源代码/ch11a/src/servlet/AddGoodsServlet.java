package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Goods;

public class AddGoodsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //���ñ��룬��ֹ����
        request.setCharacterEncoding("utf-8");
        //��ȡ����ֵ
        String goodsname = request.getParameter("goodsname");
        String goodsprice = request.getParameter("goodsprice");
        String goodsnumber = request.getParameter("goodsnumber");
        //�����������ת��
        double newgoodsprice = Double.parseDouble(goodsprice);
        int newgoodsnumber = Integer.parseInt(goodsnumber);
        //��ת��������ݷ�װ��goodsֵ����
        Goods goods = new Goods(goodsname, newgoodsprice, newgoodsnumber);
        //��goodsֵ���󴫵ݸ����ݷ��ʲ㣬������Ӳ���������ʡ��

    }
}
