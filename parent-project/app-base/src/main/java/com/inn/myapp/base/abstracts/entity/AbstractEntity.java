package com.inn.myapp.base.abstracts.entity;


import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
 final class AbstractEntity {


        @Basic
        @Column(name="createdon")
        private Date createdOn;

        @Basic
        @Column(name="lastmodifiedon")
        private Date lastModifiedOn;

        @Basic
        @Column(name="active")
        private boolean isActive=true;


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
