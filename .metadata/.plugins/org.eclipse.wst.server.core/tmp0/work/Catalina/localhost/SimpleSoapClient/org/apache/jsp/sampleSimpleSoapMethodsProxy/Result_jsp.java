package org.apache.jsp.sampleSimpleSoapMethodsProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Result</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>Result</H1>\r\n");
      out.write("\r\n");
      DefaultNamespace.SimpleSoapMethodsProxy sampleSimpleSoapMethodsProxyid = null;
      synchronized (session) {
        sampleSimpleSoapMethodsProxyid = (DefaultNamespace.SimpleSoapMethodsProxy) _jspx_page_context.getAttribute("sampleSimpleSoapMethodsProxyid", PageContext.SESSION_SCOPE);
        if (sampleSimpleSoapMethodsProxyid == null){
          sampleSimpleSoapMethodsProxyid = new DefaultNamespace.SimpleSoapMethodsProxy();
          _jspx_page_context.setAttribute("sampleSimpleSoapMethodsProxyid", sampleSimpleSoapMethodsProxyid, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSimpleSoapMethodsProxyid.setEndpoint(request.getParameter("endpoint"));

      out.write("\r\n");
      out.write("\r\n");

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

      out.write('\r');
      out.write('\n');
      out.print(getEndpoint2mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp3 );
      out.write("\r\n");
      out.write("        ");

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

      out.write('\r');
      out.write('\n');
      out.print(getSimpleSoapMethods10mtemp );
      out.write('\r');
      out.write('\n');

}else{
        if(getSimpleSoapMethods10mtemp!= null){
        String tempreturnp11 = getSimpleSoapMethods10mtemp.toString();
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempreturnp11);
      out.write("\r\n");
      out.write("        ");

        }}
break;
case 13:
        gotMethod = true;
        java.lang.String date13mtemp = sampleSimpleSoapMethodsProxyid.date();
if(date13mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(date13mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(date13mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp14 );
      out.write("\r\n");
      out.write("        ");

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

      out.write('\r');
      out.write('\n');
      out.print(sayHello16mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp17 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayHello16mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp17 );
      out.write("\r\n");
      out.write("        ");

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
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp22 );
      out.write("\r\n");
      out.write("        ");

break;
}
} catch (Exception e) { 

      out.write("\r\n");
      out.write("Exception: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) );
      out.write("\r\n");
      out.write("Message: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) );
      out.write('\r');
      out.write('\n');

return;
}
if(!gotMethod){

      out.write("\r\n");
      out.write("result: N/A\r\n");

}

      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
