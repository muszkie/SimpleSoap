<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSimpleSoapMethodsProxyid" scope="session" class="DefaultNamespace.SimpleSoapMethodsProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSimpleSoapMethodsProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleSimpleSoapMethodsProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleSimpleSoapMethodsProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        DefaultNamespace.SimpleSoapMethods getSimpleSoapMethods10mtemp = sampleSimpleSoapMethodsProxyid.getSimpleSoapMethods();
if(getSimpleSoapMethods10mtemp == null){
%>
<%=getSimpleSoapMethods10mtemp %>
<%
}else{
        if(getSimpleSoapMethods10mtemp!= null){
        String tempreturnp11 = getSimpleSoapMethods10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        java.lang.String date13mtemp = sampleSimpleSoapMethodsProxyid.date();
if(date13mtemp == null){
%>
<%=date13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(date13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 16:
        gotMethod = true;
        String name_1id=  request.getParameter("name19");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        java.lang.String sayHello16mtemp = sampleSimpleSoapMethodsProxyid.sayHello(name_1idTemp);
if(sayHello16mtemp == null){
%>
<%=sayHello16mtemp %>
<%
}else{
        String tempResultreturnp17 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayHello16mtemp));
        %>
        <%= tempResultreturnp17 %>
        <%
}
break;
case 21:
        gotMethod = true;
        String num1_2id=  request.getParameter("num124");
        int num1_2idTemp  = Integer.parseInt(num1_2id);
        String num2_3id=  request.getParameter("num226");
        int num2_3idTemp  = Integer.parseInt(num2_3id);
        int calcAdd21mtemp = sampleSimpleSoapMethodsProxyid.calcAdd(num1_2idTemp,num2_3idTemp);
        String tempResultreturnp22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(calcAdd21mtemp));
        %>
        <%= tempResultreturnp22 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>