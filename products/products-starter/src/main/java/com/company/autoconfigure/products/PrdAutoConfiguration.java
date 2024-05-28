package com.company.autoconfigure.products;

import com.company.products.PrdConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({PrdConfiguration.class})
public class PrdAutoConfiguration {
}

