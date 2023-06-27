package com.laba.solvd.parser;
import com.laba.solvd.model.Customer;
import javax.xml.bind.*;
import java.io.File;

public class XMLParser {
        public static void main(String[] args) {
            String xmlFile = "src/main/resources/CarService.xml";

            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
                Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

                File file = new File(xmlFile);
                Customer customer = (Customer) unmarshaller.unmarshal(file);

                System.out.println(Customer.getFirstName());

            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
    }

