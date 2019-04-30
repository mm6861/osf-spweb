package com.osf.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j // 애가 알아서 넣어준대 
public class Exam {
	/*
	 * Log4j level 순서
	 * 1. TRACE : 상세한정보 - 모든 로거 다나옴
	 * 2. DEBUG	: 개발 할때 필요한 정보 - TRACE 제외 로거 나옴
	 * 3. INFO : 정보.. 몇초만에 켜졌다 어떤 프로젝트가 돌아가고 있다. 당연히 보여져야할 정보 
	 * 			- TRACE, DEBUG 제외 로거 /보통 이걸로 많이 한대 
	 * 4. WARN : 동작은 하지만 위험하다. 
	 * 5. ERROR : 실제 에러 500에러..
	 * 6. FATAL : 진짜 치명적인 에러 서버급중단 등등.. 
	 * */
	public static void main(String[] args) {
		String str = "홍길동";
		//한라인에 두개 찍고 싶음 일케 
		if(str.equals("홍길동")) {
			log.info("이름은 홍길이 맞습니다.");
		}else {
			log.debug("나도 나오려나....");
			log.info("이름은 홍길이 아닙니다.");
		}
		log.warn("프로그램 비정상 종료, 그치만 문제는 없음 ");
	}
}
