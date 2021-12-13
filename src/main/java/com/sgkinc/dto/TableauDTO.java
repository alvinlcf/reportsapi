package com.sgkinc.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tableau_dto")
public class TableauDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;

	private String username;
	private String target_site;
	private String trustedTicket;

	public String getTrustedTicket() {
		return trustedTicket;
	}

	public void setTrustedTicket(String trustedTicket) {
		this.trustedTicket = trustedTicket;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTarget_site() {
		return target_site;
	}

	public void setTarget_site(String target_site) {
		this.target_site = target_site;
	}

}
