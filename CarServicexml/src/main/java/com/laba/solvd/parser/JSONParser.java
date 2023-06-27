package com.laba.solvd.parser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.laba.solvd.model.Customer;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class JSONParser {
    public static void main(String[] args) throws Exception {
        String jsonFile = "src/main/resources/CarService.json";

        ObjectMapper mapper = new ObjectMapper();
        Customer[] customers = mapper.readValue(new File(jsonFile), Customer[].class);

        List<Customer> customerList = Arrays.asList(customers);

        System.out.println("Parsed Customers: " + customerList);
    }
}