package com.money.payment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payments")
public class PaymentEntity {
	@Id
	private int id;
	private String paymentMode;
	private double amount;
	private String receiver;
	private String date;
	private String time;
	/**
	 * 
	 */
	public PaymentEntity() {
		super();
	}
	/**
	 * @param id
	 * @param paymentmode
	 * @param amount
	 * @param receiver
	 * @param date
	 * @param time
	 */
	public PaymentEntity(int id, String paymentMode, double amount, String receiver, String date, String time) {
		super();
		this.id = id;
		this.paymentMode = paymentMode;
		this.amount = amount;
		this.receiver = receiver;
		this.date = date;
		this.time = time;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the paymentmode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}
	/**
	 * @param paymentmode the paymentmode to set
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the receiver
	 */
	public String getReceiver() {
		return receiver;
	}
	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "PaymentEntity [id=" + id + ", paymentMode=" + paymentMode + ", amount=" + amount + ", receiver="
				+ receiver + ", date=" + date + ", time=" + time + "]";
	}
	
}
