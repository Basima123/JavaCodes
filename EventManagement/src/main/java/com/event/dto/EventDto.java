package com.event.dto;

import java.util.Date;

public class EventDto {
	private int eventId;
	private String eventName;
	private Date eventdate;
	private int eventTime;
	private String venue;
	private String status;
	private String[] eventList;
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Date getEventdate() {
		return eventdate;
	}
	public void setEventdate(Date eventdate) {
		this.eventdate = eventdate;
	}
	public int getEventTime() {
		return eventTime;
	}
	public void setEventTime(int eventTime) {
		this.eventTime = eventTime;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String[] getEventList() {
		return eventList;
	}
	public void setEventList(String[] eventList) {
		this.eventList = eventList;
	}
	
	
}
