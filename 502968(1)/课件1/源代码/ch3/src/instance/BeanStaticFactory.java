package instance;

public class BeanStaticFactory {
    private static BeanClass beanInstance = new BeanClass("���þ�̬��������ʵ����Bean");

    public static BeanClass createInstance() {
        return beanInstance;
    }
}
