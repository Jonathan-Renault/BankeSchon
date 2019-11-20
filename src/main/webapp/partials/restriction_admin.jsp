<%--
  Created by IntelliJ IDEA.
  User: 17339
  Date: 05/11/2019
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.Objects" %>
<!--------------------------------------------------- Restriction ----------------------------------------------------->
<% HttpSession checkSession = request.getSession(false);
    if (checkSession.getAttribute("role") == null) {
        response.sendRedirect(request.getContextPath() + "/403.jsp");
    } else {
        if (!Objects.equals(checkSession.getAttribute("role"), 2)) {
            response.sendRedirect(request.getContextPath() + "/403.jsp");
        }
    }
%>