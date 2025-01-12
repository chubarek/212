import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getCatName());

        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1.getCatName());

        System.out.println(bean.equals(bean1));
        System.out.println(beanCat.equals(beanCat1));
    }
}