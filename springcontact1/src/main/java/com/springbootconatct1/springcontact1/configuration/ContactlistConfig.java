package com.springbootconatct1.springcontact1.configuration;

import com.springbootconatct1.springcontact1.model.ContactlistModel;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.stereotype.Component;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.SQLException;

@Configuration
public class ContactlistConfig {
    @Bean
    public ContactlistModel contactlistModelObj() {
        return new ContactlistModel();
    }


}

