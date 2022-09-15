package com.wonderrobot.sfhanbaizaikokanrishisutemu.init;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

/**
 * initialize Application
 * 
 * @author WFC
 * Copyright (C)
 * @description
 */
@Component
public class CommandLineStartupRunner implements CommandLineRunner {
	
    @Autowired
    private DataSource dataSource;
    
    @Value("${init.database.enabled}")
    private boolean databaseEnabled;

    @Override
    public void run(String... args) throws Exception {
    	
    	// initialize database and data with DDL DML
    	if (databaseEnabled) {
    		Resource resources = new ClassPathResource("init.sql");
    		ResourceDatabasePopulator resourceDatabasePopulator = new ResourceDatabasePopulator();
    		resourceDatabasePopulator.addScripts(resources);
    		resourceDatabasePopulator.execute(dataSource);
    	}
    }
}