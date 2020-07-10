package assemble;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComplexUser {
    private String uname;
    private List<String> hobbyList;
    private Map<String, String> residenceMap;
    private Set<String> aliasSet;
    private String[] array;

    /*
     * ʹ�ù��췽��ע�룬��Ҫ�ṩ�������Ĺ��췽��
     */
    public ComplexUser(String uname, List<String> hobbyList, Map<String, String> residenceMap, Set<String> aliasSet,
                       String[] array) {
        super();
        this.uname = uname;
        this.hobbyList = hobbyList;
        this.residenceMap = residenceMap;
        this.aliasSet = aliasSet;
        this.array = array;
    }

    /**
     * ʹ��setter����ע�룬�ṩĬ���޲����Ĺ��췽������Ϊע��������ṩsetter����
     */
    public ComplexUser() {
        super();
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public void setResidenceMap(Map<String, String> residenceMap) {
        this.residenceMap = residenceMap;
    }

    public void setAliasSet(Set<String> aliasSet) {
        this.aliasSet = aliasSet;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "uname=" + uname + ";hobbyList=" + hobbyList + ";residenceMap="
                + residenceMap + ";aliasSet=" + aliasSet + ";array=" + array;
    }
}
