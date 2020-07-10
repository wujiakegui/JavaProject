import java.util.Locale;
import java.util.ResourceBundle;

public class TestI18N {
    public static void main(String[] args) {
        //ȡ��ϵͳĬ�ϵĹ������Ի���
        Locale lc = Locale.getDefault();
        //���ݹ������Ի���������Դ�ļ�
        ResourceBundle rb = ResourceBundle.getBundle("messageResource", lc);
        //��ӡ������Դ�ļ���ȡ�õ���Ϣ
        System.out.println(rb.getString("hello"));
    }
}
