package edu.mum.cs.inventorymanager.model;

import java.io.File;
import java.util.List;

public class Report implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String description;
	private String functionUrl;
	private int reportTypeId;
	private String functionCode;
	//private int imageId;
	private List<ReportParameter> reportParameters;
	private File file;
	private String fileContentType;
	private String fileFileName; 
	private String fileCaption;
		
	public List<ReportParameter> getReportParameters() {
		return this.reportParameters;
	}
	public void setReportParameters(List<ReportParameter> reportParameters) {
		this.reportParameters = reportParameters;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFunctionUrl() {
		return this.functionUrl;
	}
	public void setFunctionUrl(String functionUrl) {
		this.functionUrl = functionUrl;
	}
	public int getReportTypeId() {
		return this.reportTypeId;
	}
	public void setReportTypeId(int reportTypeId) {
		this.reportTypeId = reportTypeId;
	}
	public String getFunctionCode() {
		return this.functionCode;
	}
	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public File getFile() {
		return this.file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileContentType() {
		return this.fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
	public String getFileFileName() {
		return this.fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public String getFileCaption() {
		return this.fileCaption;
	}
	public void setFileCaption(String fileCaption) {
		this.fileCaption = fileCaption;
	}	
	
}
