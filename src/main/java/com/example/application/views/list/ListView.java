package com.example.application.views.list;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin.Horizontal;

import aj.org.objectweb.asm.Label;

@PageTitle("list")
@Route(value = "")
public class ListView extends VerticalLayout {

    public ListView() {
        add(new H2("Initial text"));

        Button button = new Button("Click me");
        TextField name = new TextField("name");

        HorizontalLayout h1 = new HorizontalLayout(name, button);
        h1.setDefaultVerticalComponentAlignment(Alignment.BASELINE);

        button.addClickListener(click-> Notification.show("Hello, " + name.getValue()));

        add(h1);

    }

}
