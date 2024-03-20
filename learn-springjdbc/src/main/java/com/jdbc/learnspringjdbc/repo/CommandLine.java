package com.jdbc.learnspringjdbc.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CommandLine implements CommandLineRunner{
	@Autowired
	courserepo crepo;
	@Override
	public void run(String... args) throws Exception {
	}

}
