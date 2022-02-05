package com.skp.spring.react.azure.demo.repository.model;

import java.util.Date;

/**
 * Representation of database document
 */
public interface DatabaseDocument {

    /**
     * Document id
     *
     * @return id
     */
    String getId();

    /**
     * Created time stamp in milliseconds
     *
     * @return value
     */
    default long getCts() {
        return new Date().getTime();
    }
    /**
     * Updated time stamp in milliseconds
     *
     * @return value
     */
    default long getUts() {
        return new Date().getTime();
    }
}