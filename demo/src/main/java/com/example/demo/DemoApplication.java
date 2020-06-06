package com.example.demo;

import com.example.demo.splash.DemoSplash;
import com.example.demo.view.DemoView;
import com.example.demo.view.LoginView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication  extends AbstractJavaFxApplicationSupport  {

	public static void main(String[] args) {
		launch(DemoApplication.class, LoginView.class,new DemoSplash(), args);
	}
	@Override
	public void beforeInitialView(Stage stage, ConfigurableApplicationContext ctx) {
		stage.setTitle("MD5转化工具");
		stage.setWidth(500);
		stage.setHeight(500);
	}

}
