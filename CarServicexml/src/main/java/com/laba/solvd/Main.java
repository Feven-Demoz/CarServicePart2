package com.laba.solvd;

import com.laba.solvd.validator.XMLValidator;
import jdk.internal.org.xml.sax.SAXException;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        String xmlFile = "src/main/resources/CarService.xml";
        String xsdFile = "src/main/resources/CarService.xsd";
        String jsonFilePath = "src/main/resources/CarService.json";


        boolean isValid = XMLValidator.validateXML(xmlFile, xsdFile);
        System.out.println("XML validation result: " + isValid);
    }
    }

