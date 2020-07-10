import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestFormat {
    public static void main(String[] args) {
        //ȡ��ϵͳĬ�ϵĹ������Ի���
        Locale lc = Locale.getDefault();
        //���ݹ������Ի���������Դ�ļ�
        ResourceBundle rb = ResourceBundle.getBundle("messageResource", lc);
        //����Դ�ļ���ȡ�õ���Ϣ
        String msg = rb.getString("welcome");
        //�滻��Ϣ�ı��е�ռλ������Ϣ�ı��е�����ռλ�������ղ�����˳��
        //(�ӵڶ���������ʼ)�����滻�������ҡ��滻{0}����5���滻{1}
        String msgFor = MessageFormat.format(msg, "��", "5");
        System.out.println(msgFor);
    }
}
