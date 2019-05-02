<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>사원등록</title>

    <!-- Bootstrap core CSS -->
    <link href="/resources/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="/resources/signin.css" rel="stylesheet">
  </head>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script> 
  	window.addEventListener('load',function(){
  		
  		 		
  	});    	
  </script>

  <body class="text-center">
    <form class="form-signin" action="/emp/login" method="post">
      <img class="mb-4" src="/resources/bootstrap-solid.svg" alt="" width="72" height="72">
      <h1 class="h3 mb-3 font-weight-normal">사원정보입력</h1>
       <input type="text" id="id" class="form-control" placeholder="ID" 
     	 required name="id">
     
      <input type="password" id="pwd" class="form-control" placeholder="Password" 
      	required name="pwd">
      <input type="date" id="hiredate" class="form-control" 
      	required name="hiredate">
       <select class="form-control" name="searchJob" id="searchJob" >
       <option value="s">직급을 선택해주세요</option>
      	<option value="s">사원</option>
      	<option value="d">대리</option>
      	<option value="g">과장</option>
      	<option value="b">부장</option>
      	<option value="c">차장</option>
      	<option value="s">사장</option>
      </select>
      <input type="text" id="mgr" class="form-control" placeholder="상사" 
      	required name="mgr">
      <input type="text" id="ename" class="form-control" placeholder="이름" 
      	required name="ename">
      <select>
      	<c:forEach items='${deptList }' var='dept'>
      		<option value='${dept.DEPTNO }'>${dept.DNAME }</option>
      	</c:forEach>
      </select>
      	
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me"> Remember me
        </label>
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="button" id="signinBtn">Sign in</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
    </form>
  </body>
</html>
