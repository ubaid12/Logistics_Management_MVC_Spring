package com.mkyong.model;

import java.awt.print.Book;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Order {
	@Entity
	@Table(name="Order")
	public class order
	{
		private long ID;
		private long Order_ID;
		private long Cust_ID;
		private String destination;
		private String Origin;
		private String pakg_type;
		private String weight;
		private String Cost;
		private Date Accept_Date;
		private Date Delievry_Date;
		private String priority;
		private String Order_type;
		private long Branch_ID;
		
		
		@Id
		@Column(name = "Order_ID")
		@GeneratedValue
		
		
		public long getID() {
			return ID;
		}

		public void setID(long iD) {
			ID = iD;
		}

		public long getOrder_ID() {
			return Order_ID;
		}

		public void setOrder_ID(long order_ID) {
			Order_ID = order_ID;
		}

		

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getOrigin() {
			return Origin;
		}

		public void setOrigin(String origin) {
			Origin = origin;
		}

		public String getPakg_type() {
			return pakg_type;
		}

		public void setPakg_type(String pakg_type) {
			this.pakg_type = pakg_type;
		}

		public String getWeight() {
			return weight;
		}

		public void setWeight(String weight) {
			this.weight = weight;
		}

		public String getCost() {
			return Cost;
		}

		public void setCost(String cost) {
			Cost = cost;
		}

		public Date getAccept_Date() {
			return Accept_Date;
		}
		@Temporal(TemporalType.DATE)
		@Column(name= "AcceptDate")

		public void setAccept_Date(Date accept_Date) {
			Accept_Date = accept_Date;
		}

		public Date getDelievry_Date() {
			return Delievry_Date;
		}
		@Temporal(TemporalType.DATE)
		@Column(name="DelievryDate")
		
		public void setDelievry_Date(Date delievry_Date) {
			Delievry_Date = delievry_Date;
		}

		public String getPriority() {
			return priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public String getOrder_type() {
			return Order_type;
		}

		public void setOrder_type(String order_type) {
			Order_type = order_type;
		}

		public order()
		{
			
		}
		@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name ="Customer_ID")
		
		public long getCust_ID() {
			return Cust_ID;
		}
		
		public void setCust_ID(long cust_ID) {
			Cust_ID = cust_ID;
		}
		
		
		
		
		
	}
	

}
