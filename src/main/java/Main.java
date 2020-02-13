import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.intro.config.AppConfig;
import spring.intro.model.User;
import spring.intro.service.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        userService.add(new User("Jennifer", "Aniston"));
        userService.add(new User("Cortney", "Cocks"));
        userService.add(new User("Rene", "Zelveger"));

        userService.listUsers().stream().forEach(System.out::println);
    }
}
