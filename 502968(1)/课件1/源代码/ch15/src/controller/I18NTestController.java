package controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class I18NTestController {
    @RequestMapping("/i18nTest")
    /**
     * locale�����������localeֵ�����洢��session��
     */
    public String first(Locale locale) {
        return "first";
    }
}
