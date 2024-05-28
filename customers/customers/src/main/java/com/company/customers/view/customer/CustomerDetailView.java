package com.company.customers.view.customer;

import com.company.customers.entity.Customer;

import io.jmix.flowui.view.DefaultMainViewParent;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "customers/:id", layout = DefaultMainViewParent.class)
@ViewController("cst_Customer.detail")
@ViewDescriptor("customer-detail-view.xml")
@EditedEntityContainer("customerDc")
public class CustomerDetailView extends StandardDetailView<Customer> {
}