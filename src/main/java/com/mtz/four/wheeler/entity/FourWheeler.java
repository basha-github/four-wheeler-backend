package com.mtz.four.wheeler.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FourWheeler {
	
	@Id
	private String vName;
	private String mYear;
	private String vUrl;
	
	public FourWheeler() {
	
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getmYear() {
		return mYear;
	}

	public void setmYear(String mYear) {
		this.mYear = mYear;
	}

	public String getvUrl() {
		return vUrl;
	}

	public void setvUrl(String vUrl) {
		this.vUrl = vUrl;
	}

	@Override
	public String toString() {
		return "FourWheeler [vName=" + vName + ", mYear=" + mYear + ", vUrl=" + vUrl + "]";
	}
	
	
	
	
	
	
	
	

}
