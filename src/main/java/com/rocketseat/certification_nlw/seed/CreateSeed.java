package com.rocketseat.certification_nlw.seed;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class CreateSeed {

    private final JdbcTemplate jdbcTemplate;

    public CreateSeed(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5434/pg_nlw?characterEncoding=UTF-8");
        dataSource.setUsername("postgres");
        dataSource.setPassword("admin");

        CreateSeed createSeed = new CreateSeed(dataSource);
        createSeed.run(args);
    }
    public void truncateTables() {
        try {
            jdbcTemplate.execute("DELETE FROM alternatives");
            jdbcTemplate.execute("DELETE FROM questions");
            System.out.println("All data deleted from tables: questions and alternatives");
        } catch (Exception e) {
            System.err.println("Error deleting data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void run(String... args) {
        truncateTables();
        executeSqlFile("src/main/resources/createQuestion.sql");
        executeSqlFile("src/main/resources/createAlternative.sql");
    }

    private void executeSqlFile(String filePath) {
        try {
            String sqlScript = new String(Files.readAllBytes(Paths.get(filePath)));

            jdbcTemplate.execute(sqlScript);

            System.out.println("Seed realizado com sucesso");
        } catch (IOException e) {
            System.err.println("Erro ao executar arquivo " + e.getMessage());
        }
    }
}