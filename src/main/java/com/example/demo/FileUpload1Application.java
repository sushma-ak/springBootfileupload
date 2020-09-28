package com.example.demo;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.example.demo","com.example.demo.controller"})
public class FileUpload1Application {

	public static void main(String[] args) {
		new File(com.example.demo.controller.FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(FileUpload1Application.class, args);
	}

}
