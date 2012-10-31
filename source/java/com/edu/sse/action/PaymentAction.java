package com.edu.sse.action;

import java.util.ArrayList;
import java.util.List;

import com.edu.sse.common.Medium;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Medium> mediumList;
	
	private List<String> classList;
	
	private List<String> studentList;

	private String medium;
	
	private String selectedClass;
	
	public List<String> getClassList() {
		return classList;
	}

	
	public List<String> getStudentList() {
		return studentList;
	}

	public String getSelectedClass() {
		return selectedClass;
	}


	public void setSelectedClass(String selectedClass) {
		this.selectedClass = selectedClass;
	}


	public List<Medium> getMediumList() {
		
		mediumList = new ArrayList<Medium>();
		
		Medium medium = new Medium();
		medium.setCode("EM");
		medium.setDescription("English");
		mediumList.add(medium);
		medium = new Medium();
		medium.setCode("TM");
		medium.setDescription("Telugu");
		mediumList.add(medium);
		
		return  mediumList;
	}


	public String execute(){
		return INPUT;
	}
	
    public String getJSON(){
        return populateClass();
    }

	public String getMedium() {
		return medium;
	}

	public void setMedium(String medium) {
		this.medium = medium;
	}

	public String populateClass(){

		classList = new ArrayList<String>();
		if(medium != null && medium.equalsIgnoreCase("EM")){
		classList.add("I");
		} else if(medium != null && medium.equalsIgnoreCase("TM")) {
			classList.add("VIII");	
		}
		
		studentList = new ArrayList<String>();
		if(selectedClass != null&& selectedClass.equals("I")){
			studentList.add("Shaik");
		}
		
		if(selectedClass != null&& selectedClass.equals("VIII")){
			studentList.add("Sarpa");
		}
		
		return SUCCESS;
	}
	
}
