package com.skp.spring.react.azure.demo.repository.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class DatabaseDocumentImpl implements DatabaseDocument {

    @Id
    public String id;
    private long cts = new Date().getTime();;
    private long uts = new Date().getTime();;

    public DatabaseDocumentImpl() {
    }

    public DatabaseDocumentImpl(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public long getCts() {
        return cts;
    }

    public void setCts(long cts) {
        this.cts = cts;
    }

    @Override
    public long getUts() {
        return uts;
    }

    public void setUts(long uts) {
        this.uts = uts;
    }
}