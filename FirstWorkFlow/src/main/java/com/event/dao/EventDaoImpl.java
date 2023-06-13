package com.event.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.
SQLException;

public class EventDaoImpl {
	public PersonDto validatePerson(PersonDto person) {
		try {
			Connection con=JDBCConnection.getConnection();
			ResultSet rs = null;
			PreparedStatement pst = null;
			pst =con.prepareStatement("select person_id,person_name from Person where person_name=? and password=?");
			pst.setString(1, person.getName());
			pst.setString(2, person.getPassword());
			
			rs = pst.executeQuery();
			while(rs.next()) {
				person.setPersonId(Integer.parseInt(rs.getString("person_id")));
				person.setPersonName(rs.getString("person_name"));
			}
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		}
		return person;
	}

}
