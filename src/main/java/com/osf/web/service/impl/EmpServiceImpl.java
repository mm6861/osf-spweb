package com.osf.web.service.impl;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.osf.web.dao.EmpDAO;
import com.osf.web.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDAO edao;

	@Override
	public boolean loginEmp(Map<String, String> emp,HttpSession hs) {
		Map<String,String>dbEmp = edao.selectEmpById(emp);
		if(dbEmp==null || !dbEmp.get("PWD").equals(emp.get("pwd"))) {
			return false;
		}
		// 여기까지 온건 로그인 성공하였다는거 
		// 최고 관리자 인지 확인 (최고관리자 LVL-2)
		if("2".equals(dbEmp.get("LVL"))) {
			emp.put("lvl", "1");
			hs.setAttribute("empList", edao.selectEmpList(emp));
		}
		hs.setAttribute("emp", dbEmp);
		return true;		
	}

}