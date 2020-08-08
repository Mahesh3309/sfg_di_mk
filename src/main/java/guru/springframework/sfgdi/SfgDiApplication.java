package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);
		System.out.println();
		I18nController i18nController=(I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController=(MyController)ctx.getBean(MyController.class);
		System.out.println();
		System.out.println("------------MK404 Primary Based Injection-------------");

		System.out.println(myController.sayHello());
		System.out.println();
		System.out.println("------------MK404 Property Based Injection-------------");

		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreetings());
		System.out.println();
		System.out.println("------------MK404 Setter Based Injection-------------");

		SetterInjectedController setterInjectedController=(SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreetings());
		System.out.println();
		System.out.println("------------MK404 Constructor Based Injection-------------");

		ConstructorInjectedController constructorInjectedController= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreetings());

	}

}
