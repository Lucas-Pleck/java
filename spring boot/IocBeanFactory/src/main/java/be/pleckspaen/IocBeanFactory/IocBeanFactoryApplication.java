package be.pleckspaen.IocBeanFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IocBeanFactoryApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(IocBeanFactoryApplication.class);

		app.run(args);

	}


	@Autowired
	private BookShelf bookShelf;

	@Override
	public void run(String... args) throws Exception {
		bookShelf.importAndRead();
	}
}
