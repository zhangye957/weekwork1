import com.itdr.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class TestDemo {

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Users u =(Users) ac.getBean("users");
        System.out.println(u);
    }

    @Test
    public void test2(){
//        DriverManagerDataSource dm = new DriverManagerDataSource();
//        dm.setDriverClassName("com.mysql.jdbc.Driver");
//        dm.setUrl("jdbc:mysql://localhost:3306/project");
//        dm.setUsername("root");
//        dm.setPassword("123456");

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdt = ac.getBean(JdbcTemplate.class);
        String sql = "select * from user";

        List<Map<String,Object>> maps = jdt.queryForList(sql);
        for(Map<String,Object> map : maps){
            for(String s : map.keySet()){
                System.out.println(map.get(s));
            }
        }
    }
}