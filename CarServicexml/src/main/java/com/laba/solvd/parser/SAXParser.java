package com.laba.solvd.parser;

import javax.xml.parsers.SAXParserFactory;
        import java.io.File;

public class SAXParser {
    public void parseXML(String xmlFilePath) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            javax.xml.parsers.SAXParser saxParser = factory.newSAXParser();
            XMLHandler handler = new XMLHandler();
            saxParser.parse(new File(xmlFilePath), handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}