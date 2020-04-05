package com.example.covid19.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Feed {

    @SerializedName("success")
    @Expose
    private String success;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "success='" + success + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    @SerializedName("message")
    @Expose
    private String message;


    @SerializedName("data")
    @Expose
    private Data data;

}
