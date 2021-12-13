package com.sgkinc.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Listing Properties Object.
 * 
 */
public class ListProp implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final long DEFAULT_START_END_INDEX = -2;

	private long startIndex = DEFAULT_START_END_INDEX;
	private long endIndex = DEFAULT_START_END_INDEX;
	private long totalRecords = -1;
	private long page;
	private long pageSize;
	private String sortProperty = null;
	private boolean sortAscending = true;
	private boolean ignoreSortCase = true;

	public long getPageSize() {
		return pageSize;
	}

	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}

	/**
	 * @return the startIndex
	 */
	public long getStartIndex() {
		return startIndex;
	}

	/**
	 * @param startIndex the startIndex to set
	 */
	public void setStartIndex(long startIndex) {
		this.startIndex = startIndex;
	}

	/**
	 * @return the endIndex
	 */
	public long getEndIndex() {
		return endIndex;
	}

	/**
	 * @param endIndex the endIndex to set
	 */
	public void setEndIndex(long endIndex) {
		this.endIndex = endIndex;
	}

	/**
	 * @return the totalRecords
	 */
	public long getTotalRecords() {
		return totalRecords;
	}

	/**
	 * @param totalRecords the totalRecords to set
	 */
	public void setTotalRecords(long totalRecords) {
		this.totalRecords = totalRecords;
	}

	/**
	 * @return the page
	 */
	public long getPage() {
		return page;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(long page) {
		this.page = page;
	}

	/**
	 * @return the sortProperty
	 */
	public String getSortProperty() {
		return sortProperty;
	}

	/**
	 * @param sortProperty the sortProperty to set
	 */
	public void setSortProperty(String sortProperty) {
		this.sortProperty = ((sortProperty == null || sortProperty.trim().length() == 0) ? null : sortProperty);
	}

	/**
	 * @return the sortAscending
	 */
	public boolean isSortAscending() {
		return sortAscending;
	}

	/**
	 * @param sortAscending the sortAscending to set
	 */
	public void setSortAscending(boolean sortAscending) {
		this.sortAscending = sortAscending;
	}

	/**
	 * @return the ignoreSortCase
	 */
	@XmlTransient
	@JsonIgnore
	public boolean isIgnoreSortCase() {
		return ignoreSortCase;
	}

	/**
	 * @param ignoreSortCase the ignoreSortCase to set
	 */
	public void setIgnoreSortCase(boolean ignoreSortCase) {
		this.ignoreSortCase = ignoreSortCase;
	}
}
