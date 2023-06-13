package com.event.dao;

import java.util.List;

import com.event.dto.EventDto;

import com.event.dto.PersonDto;

public interface EventDao {

	public PersonDto validatePerson(PersonDto person);

	public boolean savePerson(PersonDto person);

	public List<EventDto> updateEvent(EventDto event, PersonDto person);

	public boolean registerEvent(EventDto event, PersonDto person);

	public List<EventDto> listAllEvents();

	public List<EventDto> showUserEvents(PersonDto person);

	public PersonDto getPersonDetails(PersonDto person);

}
