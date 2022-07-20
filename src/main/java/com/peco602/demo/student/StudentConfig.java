package com.peco602.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student giovanni = new Student(
                    "Giovanni",
                    "giovanni1.pecoraro@protonmail.com",
                    LocalDate.of(1990, Month.JANUARY, 4)
            );

            Student massimo = new Student(
                    "Massimo",
                    "massimo1.pecoraro@protonmail.com",
                    LocalDate.of(2022, Month.JUNE, 11)
            );

            studentRepository.saveAll(
                    List.of(
                            giovanni,
                            massimo
                    )
            );
        };
    }
}
