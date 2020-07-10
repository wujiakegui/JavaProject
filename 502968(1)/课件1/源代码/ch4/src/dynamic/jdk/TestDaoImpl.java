package dynamic.jdk;

import org.springframework.stereotype.Repository;

@Repository("testDao")
public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        //int n = 100/0;
        System.out.println("����");
    }

    @Override
    public void modify() {
        System.out.println("�޸�");
    }

    @Override
    public void delete() {
        System.out.println("ɾ��");
    }
}
