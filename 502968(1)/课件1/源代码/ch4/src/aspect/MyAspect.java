package aspect;

/**
 * �����࣬���Զ�����֪ͨ������ǿ����ķ���
 */
public class MyAspect {
    public void check() {
        System.out.println("ģ��Ȩ�޿���");
    }

    public void except() {
        System.out.println("ģ���쳣����");
    }

    public void log() {
        System.out.println("ģ����־��¼");
    }

    public void monitor() {
        System.out.println("���ܼ��");
    }
}
