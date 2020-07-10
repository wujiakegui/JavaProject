import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        // ����Java��֧�ֵ����Ժ͹��ҵ�����
        Locale locales[] = Locale.getAvailableLocales();
        // ��������Ԫ�أ����λ�ȡ��֧�ֵĹ��Һ�����
        for (int i = 0; i < locales.length; i++) {
            // ��ӡ����֧�ֵĹ��Һ�����
            System.out.println(locales[i].getDisplayCountry() + "="
                    + locales[i].getCountry() + " "
                    + locales[i].getDisplayLanguage() + "="
                    + locales[i].getLanguage());
        }
    }
}
