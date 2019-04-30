package com.osf.web.vo;

import lombok.Data;

@Data
public class CustomerInfo {
	private Integer ci_num;
	private String ci_id;
	private String ci_pwd;
	private String ci_name;
	private String ci_age;
	private String ci_email;
	private String ci_zip;
	private String ci_addr1;
	private String ci_addr2;
	private String ci_phone;
}
