package com.example.covid19;

public class getdata {

    private String update_date_time;
    private String local_new_cases;
    private String local_total_cases;
    private String local_total_number_of_individuals_in_hospitals;
    private String local_deaths;
    private String local_recovered;
    private String local_active_cases;

    public getdata(String update_date_time, String local_new_cases, String local_total_cases, String local_total_number_of_individuals_in_hospitals, String local_deaths, String local_recovered, String local_active_cases) {
        this.update_date_time = update_date_time;
        this.local_new_cases = local_new_cases;
        this.local_total_cases = local_total_cases;
        this.local_total_number_of_individuals_in_hospitals = local_total_number_of_individuals_in_hospitals;
        this.local_deaths = local_deaths;
        this.local_recovered = local_recovered;
        this.local_active_cases = local_active_cases;
    }
    public String getUpdate_date_time() {
        return update_date_time;
    }

    public String getLocal_new_cases() {
        return local_new_cases;
    }

    public String getLocal_total_cases() {
        return local_total_cases;
    }

    public String getLocal_total_number_of_individuals_in_hospitals() {
        return local_total_number_of_individuals_in_hospitals;
    }

    public String getLocal_deaths() {
        return local_deaths;
    }

    public String getLocal_recovered() {
        return local_recovered;
    }

    public String getLocal_active_cases() {
        return local_active_cases;
    }



}
