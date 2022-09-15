package com.wonderrobot.sfhanbaizaikokanrishisutemu.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix="source")
@PropertySource(value="classpath:Spring_System.properties")
public class ConfigEntity {
 	private String log4j_path;
 	private String sifglog_path;
 	private String export_file_path;
 	private String print_file_path;
 	private String print_template_file_path;
 	private String upload_file_path;
 	private String user_tableid;
 	private String user_table_userid_fieldid;
 	private String user_table_password_fieldid;
 	private String user_table_user_fieldid;
 	private String user_table_eff_status_fieldid;
 	private String user_table_group_fieldid;
 	private String BUSINESS_ERROR_LOG_SUFFIX;
 
 	public String getLog4j_path() {
		return log4j_path;
	}

 	public void setLog4j_path(String log4j_path) {
		this.log4j_path = log4j_path;
	}

	public String getSifglog_path() {
		return sifglog_path;
	}

	public void setSifglog_path(String sifglog_path) {
		this.sifglog_path = sifglog_path;
	}

	public String getExport_file_path() {
		return export_file_path;
	}

	public void setExport_file_path(String export_file_path) {
		this.export_file_path = export_file_path;
	}

	public String getPrint_file_path() {
		return print_file_path;
	}

	public void setPrint_file_path(String print_file_path) {
		this.print_file_path = print_file_path;
	}

	public String getPrint_template_file_path() {
		return print_template_file_path;
	}

	public void setPrint_template_file_path(String print_template_file_path) {
		this.print_template_file_path = print_template_file_path;
	}

	public String getUpload_file_path() {
		return upload_file_path;
	}

	public void setUpload_file_path(String upload_file_path) {
		this.upload_file_path = upload_file_path;
	}

	public String getUser_tableid() {
		return user_tableid;
	}

	public void setUser_tableid(String user_tableid) {
		this.user_tableid = user_tableid;
	}

	public String getUser_table_userid_fieldid() {
		return user_table_userid_fieldid;
	}

	public void setUser_table_userid_fieldid(String user_table_userid_fieldid) {
		this.user_table_userid_fieldid = user_table_userid_fieldid;
	}

	public String getUser_table_password_fieldid() {
		return user_table_password_fieldid;
	}

	public void setUser_table_password_fieldid(String user_table_password_fieldid) {
		this.user_table_password_fieldid = user_table_password_fieldid;
	}
 
	public String getUser_table_user_fieldid() {
		return user_table_user_fieldid;
	}

	public void setUser_table_user_fieldid(String user_table_user_fieldid) {
		this.user_table_user_fieldid = user_table_user_fieldid;
	}

	public String getUser_table_eff_status_fieldid() {
		return user_table_eff_status_fieldid;
	}

	public void setUser_table_eff_status_fieldid(
			String user_table_eff_status_fieldid) {
		this.user_table_eff_status_fieldid = user_table_eff_status_fieldid;
	}

	public String getUser_table_group_fieldid() {
		return user_table_group_fieldid;
	}

	public void setUser_table_group_fieldid(String user_table_group_fieldid) {
		this.user_table_group_fieldid = user_table_group_fieldid;
	}

	public String getBUSINESS_ERROR_LOG_SUFFIX() {
		return BUSINESS_ERROR_LOG_SUFFIX;
	}

	public void setBUSINESS_ERROR_LOG_SUFFIX(String bUSINESS_ERROR_LOG_SUFFIX) {
		this.BUSINESS_ERROR_LOG_SUFFIX = bUSINESS_ERROR_LOG_SUFFIX;
	}
}
