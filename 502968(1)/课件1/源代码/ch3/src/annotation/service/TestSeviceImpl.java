package annotation.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import annotation.dao.TestDao;

@Service("testService")//�൱��@Service
public class TestSeviceImpl implements TestService {
    @Resource(name = "testDao")
    /**�൱��@Autowired��@AutowiredĬ�ϰ���Bean����װ��**/
    private TestDao testDao;

    @Override
    public void save() {
        testDao.save();
        System.out.println("testService save");
    }
}
