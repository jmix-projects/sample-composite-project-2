package com.company.autoconfigure.customers;

import com.company.customers.CustConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({CustConfiguration.class})
public class CustAutoConfiguration {
}

