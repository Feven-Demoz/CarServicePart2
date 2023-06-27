package com.laba.solvd.validator;

import jdk.internal.org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XMLValidator {


    public static boolean validateXML(String xmlFilePath, String xsdFilePath) {
        try {

            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdFilePath));


            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlFilePath)));

            return true;
        } catch (SAXException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());

        }
        return false;

    }
}




