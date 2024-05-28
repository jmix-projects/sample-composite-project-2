package com.company.sales.view.order;

import com.company.sales.entity.Order;

import com.company.sales.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "orders/:id", layout = MainView.class)
@ViewController("Order_.detail")
@ViewDescriptor("order-detail-view.xml")
@EditedEntityContainer("orderDc")
public class OrderDetailView extends StandardDetailView<Order> {
}