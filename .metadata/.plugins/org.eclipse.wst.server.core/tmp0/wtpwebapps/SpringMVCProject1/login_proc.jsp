<%@page import="com.multicampus.biz.user.impl.UserDAO"%>
<%@page import="com.multicampus.biz.user.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 1. ����� �Է����� (id, password) ����
	String id = request.getParameter("id");
	String password = request.getParameter("password");

	// 2. DB ����
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPassword(password);
	
	UserDAO userDAO = new UserDAO();
	UserVO user = userDAO.getUser(vo);
	
	// 3. ȭ�� �׺�Խü�
	if(user != null) {
		// login success.
		response.sendRedirect("getBoardList.jsp");
	} else {
		//  login failed.
		response.sendRedirect("login.jsp");
	}
%>