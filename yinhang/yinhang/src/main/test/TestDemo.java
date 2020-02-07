import com.itdr.controller.IndexController;
import com.itdr.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Users u = (Users) ac.getBean("users");
        System.out.println(u);

        u.setAge(20);

        Users u2 = (Users) ac.getBean("users");
        System.out.println(u2);
    }

    @Test
    public void test3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        IndexController in = ac.getBean(IndexController.class);
        String zz = in.zz("zy", "zy2", 10);

//        in.zz2("zy", "zy2", 10);

//        System.out.println(zz);
    }
}
