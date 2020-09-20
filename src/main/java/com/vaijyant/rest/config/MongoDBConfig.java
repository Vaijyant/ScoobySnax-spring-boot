package com.vaijyant.rest.config;

import com.vaijyant.rest.document.User;
import com.vaijyant.rest.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                userRepository.save(new User(1, "Victor Tomas", "FlowRiders", 120000L));
                userRepository.save(new User(2, "Sam Potter", "Operations", 100000L));
            }
        };
    }
}
