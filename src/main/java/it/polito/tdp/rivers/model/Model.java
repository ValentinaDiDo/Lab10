package it.polito.tdp.rivers.model;

import java.util.List;

import it.polito.tdp.rivers.db.RiversDAO;

public class Model {

	List<River> rivers;
	RiversDAO dao;
	public Model() {
		this.dao = new RiversDAO();
	}
	
	public List<River> getAllRivers(){
		this.rivers = dao.getAllRivers();
		return rivers;
	}
}
