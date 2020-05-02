package com.inn.myapp.base.abstracts.entity;


import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class AbstractEntity<P> {

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name="id", updatable = false, nullable = false)
        private P id;

        @Basic
        @Column(name="createdon")
        private Date createdOn;

        @Basic
        @Column(name="lastmodifiedon")
        private Date lastModifiedOn;

        @Basic
        @Column(name="active")
        private boolean isActive=true;

		public P getId() {
			return id;
		}

		public void setId(P id) {
			this.id = id;
		}

		public Date getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}

		public Date getLastModifiedOn() {
			return lastModifiedOn;
		}

		public void setLastModifiedOn(Date lastModifiedOn) {
			this.lastModifiedOn = lastModifiedOn;
		}

		public boolean isActive() {
			return isActive;
		}

		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}
        
}
