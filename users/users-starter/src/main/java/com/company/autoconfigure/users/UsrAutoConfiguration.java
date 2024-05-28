package com.company.autoconfigure.users;

import com.company.users.UsrConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({UsrConfiguration.class})
public class UsrAutoConfiguration {
}

