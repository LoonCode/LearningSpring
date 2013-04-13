package com.loon.domain.entity;

import org.joda.time.DateTime;
import org.springframework.data.domain.Auditable;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractAuditableEntity extends AbstractPersistable<Integer> implements Auditable<String, Integer> {

    private DateTime lastUpdated;
    private String lastUpdateUser;
    private DateTime created;
    private String createUser;

    /**
     * Gets created by audit user.
     */
    @Override
    public String getCreatedBy() {
        return createUser;
    }

    /**
     * Sets created by audit user.
     */
    @Override
    public void setCreatedBy(String createdBy) {
        this.createUser = createdBy;
    }

    /**
     * Gets create audit date.
     */
    @Override
    public DateTime getCreatedDate() {
        return created;
    }

    /**
     * Sets create audit date.
     */
    @Override
    public void setCreatedDate(DateTime creationDate) {
        this.created = creationDate;
    }

    /**
     * Gets last modified by audit user.
     */
    @Override
    public String getLastModifiedBy() {
        return lastUpdateUser;
    }

    /**
     * Sets last modified by audit user.
     */
    @Override
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastUpdateUser = lastModifiedBy;
    }

    /**
     * Gets last modified audit date.
     */
    @Override
    public DateTime getLastModifiedDate() {
        return lastUpdated;
    }

    /**
     * Sets last modified audit date.
     */
    @Override
    public void setLastModifiedDate(DateTime lastModifiedDate) {
        this.lastUpdated = lastModifiedDate;
    }
}
