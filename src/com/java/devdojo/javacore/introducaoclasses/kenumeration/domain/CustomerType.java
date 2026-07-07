package com.java.devdojo.javacore.introducaoclasses.kenumeration.domain;

// this is a special case where it's defined a class with attributes of the class' type, in this case, enumeration
public enum CustomerType {
    // inside an enumeration, everything is "final" and everything is constant
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    STARTUP(3, "Startup");

    public int dbValue;
    public String reportValue;

    CustomerType(int dbValue, String reportValue){ // it's private
        this.dbValue = dbValue;
        this.reportValue = reportValue;
    }

    public static CustomerType getByReportValue(String reportValue){
        for (CustomerType customerType : values()) {
            if(customerType.getReportValue().equalsIgnoreCase(reportValue)){
                return customerType;
            }
        }
        return null;
    }

    public int getDbValue() {
        return dbValue;
    }

    public String getReportValue() {
        return reportValue;
    }
}
