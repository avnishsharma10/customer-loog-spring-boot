package com.customerLog.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="logmodel")
public class LogModel {

		@Id
		@GeneratedValue
		@Column(name="id")
		private String id;
		
		
		@Column(name="name")
		private String name;
		
		@Column(name="logType")
		private String logType;
		
		@Column(name="date")
		private String date;
		
		@Column(name="time")
		private String time;

//		public String getId() {
//			return name+time;
//		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLogType() {
			return logType;
		}

		public void setLogType(String logType) {
			this.logType = logType;
		}

		public String getDate() {
		 	LocalDate today = LocalDate.now();
		 	setDate(today.toString());
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getTime() {
			LocalTime time = LocalTime.now();
			setTime(time.toString());
			return name+time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public LogModel( String name, String logType, String date, String time) {
			super();
			
			this.name = name;
			this.logType = logType;
			this.date = date;
			this.time = time;
		}
		public LogModel()
		{}
		
}
