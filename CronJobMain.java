package com.spring.cron.scheduler.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootConfiguration
@EnableScheduling
@ComponentScan("com.spring.cron")
public class CronJobMain {

	public static void main(String[] args) {
		SpringApplication.run(CronJobMain.class, args);
	}

}
