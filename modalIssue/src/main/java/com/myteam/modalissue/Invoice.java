package com.myteam.modalissue;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Invoice implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Date")
	private java.util.Date date;
	@org.kie.api.definition.type.Label(value = "Client")
	private java.lang.String client;
	@org.kie.api.definition.type.Label(value = "Lines")
	private java.util.List<com.myteam.modalissue.Line> lines;
	@org.kie.api.definition.type.Label(value = "Total")
	private java.lang.Double total;

	public Invoice() {
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public java.lang.String getClient() {
		return this.client;
	}

	public void setClient(java.lang.String client) {
		this.client = client;
	}

	public java.util.List<com.myteam.modalissue.Line> getLines() {
		return this.lines;
	}

	public void setLines(java.util.List<com.myteam.modalissue.Line> lines) {
		this.lines = lines;
	}

	public java.lang.Double getTotal() {
		return this.total;
	}

	public void setTotal(java.lang.Double total) {
		this.total = total;
	}

	public Invoice(java.util.Date date, java.lang.String client,
			java.util.List<com.myteam.modalissue.Line> lines,
			java.lang.Double total) {
		this.date = date;
		this.client = client;
		this.lines = lines;
		this.total = total;
	}

}