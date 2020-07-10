package annotation.dao;

import org.springframework.stereotype.Repository;

@Repository("testDao")
/**�൱��@Repository���������service��ʹ��@Resource(name="testDao")�Ļ���testDao����ʡ�ԡ�**/
public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("testDao save");
    }
}
