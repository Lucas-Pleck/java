package be.pleckspaen.Ioc.Bookshelf;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IoCApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(IoCApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
    @Autowired
    private BookShelf bookShelf;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Bean Memory Address in Main : "+ bookShelf);
        bookShelf.importAndRead();
    }
}
