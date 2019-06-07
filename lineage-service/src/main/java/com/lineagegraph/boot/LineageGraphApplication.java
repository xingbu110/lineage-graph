package com.lineagegraph.boot;


import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.io.File;

@SpringBootApplication
@Configuration
public class LineageGraphApplication {

    @Autowired
    private Environment environment;
    @Autowired
    private GraphDatabaseService graphDb;

    public static void main(String[] args) {
        SpringApplication.run(LineageGraphApplication.class, args);
    }

    @Bean
    public GraphDatabaseService getGraphDb() {
        File databaseDirectory = new File("target/graph.db");
        return new GraphDatabaseFactory().newEmbeddedDatabase(databaseDirectory);
    }

}
