package com.example;

import hu.szit.resclient.ResClient;
import hu.szit.resclient.ResConvert;

public class App {
    public static void main(String[] args) {
        String url = "http://localhost:8000/api/employees";
        ResClient client = new ResClient();
        Employee emp = new Employee("Réteg Ferenc", "Pécs", 398, 1);
        String json = ResConvert.toJson(Employee.class);
        // String json = "{\"name\":\"Lapos Árpás\"}";
        client.post(url, json);
    }
}
