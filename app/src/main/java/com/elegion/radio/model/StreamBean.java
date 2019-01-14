package com.elegion.radio.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class StreamBean implements Serializable {

    @SerializedName("stream")
    private String streamResource;

    public String getStreamResource() {
        return streamResource;
    }

    public void setStreamResource(String streamResource) {
        this.streamResource = streamResource;
    }
}
