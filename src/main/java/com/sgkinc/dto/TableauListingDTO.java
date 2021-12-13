package com.sgkinc.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tableau_listing_dto")
public class TableauListingDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private ListProp listProp;
	private List<TableauDTO> dataList;

	/**
	 * No specific usage except by JAX-B marshaling.
	 */
	public TableauListingDTO() {

	}

	/**
	 * @param listProp
	 * @param dataList
	 */
	public TableauListingDTO(List<TableauDTO> dataList, ListProp listProp) {
		this.dataList = dataList;
		this.listProp = listProp;
	}

	/**
	 * @return the listProp
	 */
	public ListProp getListProp() {
		return listProp;
	}

	/**
	 * @param listProp the listProp to set
	 */
	public void setListProp(ListProp listProp) {
		this.listProp = listProp;
	}

	/**
	 * @return the dataList
	 */
	public List<TableauDTO> getDataList() {
		return dataList;
	}

	/**
	 * @param dataList the dataList to set
	 */
	public void setDataList(List<TableauDTO> dataList) {
		this.dataList = dataList;
	}
}
