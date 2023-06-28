package com.laba.solvd.parser;
import com.laba.solvd.model.Appointment;
import com.laba.solvd.model.Car;
import com.laba.solvd.model.Customer;
import com.laba.solvd.model.Invoice;
import jdk.internal.org.xml.sax.SAXException;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XMLHandler extends DefaultHandler {
    private StringBuilder data;
    private String currentElement;
    private List<Customer> customerList;
    private Customer customer;
    private List<Appointment> appointmentList;
    private Appointment appointment;
    private List<Car> carList;
    private Car car;
    private List<Invoice> invoiceList;
    private Invoice invoice;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentElement = qName;
        data = new StringBuilder();

        switch (qName) {
            case "customers":
                customerList = new ArrayList<>();
                break;
            case "customer":
                customer = new Customer();
                break;
            case "appointments":
                appointmentList = new ArrayList<>();
                break;
            case "appointment":
                appointment = new Appointment();
                break;
            case "cars":
                carList = new ArrayList<>();
                break;
            case "car":
                car = new Car();
                break;
            case "invoices":
                invoiceList = new ArrayList<>();
                break;
            case "invoice":
                invoice = new Invoice();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "id":
                Integer id = Integer.valueOf(data.toString().trim());
                if (customer != null) {
                    customer.setId(id);
                } else if (appointment != null) {
                    appointment.setId(id);
                } else if (car != null) {
                    car.setId(id);
                } else if (invoice != null) {
                    invoice.setId(id);
                }
                break;

            case "firstName":
                String firstName = data.toString().trim();
                if (customer != null) {
                    customer.setFirstName(firstName);
                }
                break;
            case "lastName":
                String lastName = data.toString().trim();
                if (customer != null) {
                    customer.setLastName(lastName);
                }
                break;
            case "phoneNumber":
                String phoneNumber = data.toString().trim();
                if (customer != null) {
                    customer.setPhoneNumber(phoneNumber);
                }
                break;
            case "address":
                String address = data.toString().trim();
                if (customer != null) {
                    customer.setAddress(address);
                }
                break;
            case "appointmentDate":
                String appointmentDateStr = data.toString().trim();
                if (appointment != null) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        Date appointmentDate = dateFormat.parse(appointmentDateStr);
                        appointment.setAppointmentDate(appointmentDate);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case "serviceType":
                String serviceType = data.toString().trim();
                if (appointment != null) {
                    appointment.setServiceType(serviceType);
                }
                break;
            case "licensePlate":
                String licensePlate = data.toString().trim();
                if (car != null) {
                    car.setLicensePlate(licensePlate);
                }
                break;
            case "make":
                String make = data.toString().trim();
                if (car != null) {
                    car.setMake(make);
                }
                break;
            case "year":
                String yearStr = data.toString().trim();
                if (car != null) {
                    int year = Integer.parseInt(yearStr);
                    car.setYear(year);
                }
                break;
            case "totalAmount":
                String totalAmountStr = data.toString().trim();
                if (invoice != null) {
                    double totalAmount = Double.parseDouble(totalAmountStr);
                    invoice.setTotalAmount(totalAmount);
                }
                break;
            case "date":
                String dateSt = data.toString().trim();
                if (invoice != null) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        Date date = dateFormat.parse(dateSt);
                        invoice.setDate(date);
                    } catch (ParseException e) {
                        e.printStackTrace();

                    }


                }
        }
    }
}