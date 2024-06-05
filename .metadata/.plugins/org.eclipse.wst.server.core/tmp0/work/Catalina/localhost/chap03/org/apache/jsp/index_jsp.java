/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.24
 * Generated at: 2024-06-05 07:27:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>Request Parameter</h1>\r\n");
      out.write("\r\n");
      out.write("	<h3>GET 방식 요청</h3>\r\n");
      out.write("	<h4>form 태그를 이용한 get 방식 요청</h4>\r\n");
      out.write("	<form action=\"querystring\" method=\"get\">\r\n");
      out.write("		<label>이름: </label><input type=\"text\" name=\"name\"><br>\r\n");
      out.write("		<label>나이: </label><input type=\"number\" name=\"age\"><br> \r\n");
      out.write("		<label>생일: </label><input type=\"date\" name=\"birthday\"><br> \r\n");
      out.write("		<label>성별: </label> \r\n");
      out.write("			<input type=\"radio\" name=\"gender\" id=\"male\" value=\"M\"><label for=\"male\">남자</label>\r\n");
      out.write("			<input type=\"radio\" name=\"gender\" id=\"female\" value=\"F\"><label for=\"female\">여자</label>\r\n");
      out.write("		<br> \r\n");
      out.write("		<label>국적: </label> \r\n");
      out.write("			<select name=\"national\">\r\n");
      out.write("			<option value=\"ko\">한국</option>\r\n");
      out.write("			<option value=\"ch\">중국</option>\r\n");
      out.write("			<option value=\"jp\">일본</option>\r\n");
      out.write("			<option value=\"etc\">기타</option>\r\n");
      out.write("		</select><br> \r\n");
      out.write("		<label>취미: </label> \r\n");
      out.write("		<input type=\"checkbox\" name=\"hobbies\" id=\"movie\" value=\"movie\"> <label for=\"movie\">영화</label> \r\n");
      out.write("		<input type=\"checkbox\" name=\"hobbies\" id=\"music\" value=\"music\"> <label for=\"music\">음악감상</label> \r\n");
      out.write("		<input type=\"checkbox\" name=\"hobbies\" id=\"sleep\" value=\"sleep\"> <label for=\"sleep\">취침</label> \r\n");
      out.write("		<br>\r\n");
      out.write("		<input type=\"submit\" value=\"GET 요청\">\r\n");
      out.write("		\r\n");
      out.write("	</form>\r\n");
      out.write("	\r\n");
      out.write("		<h4>a 태그의 href 속성을 이용한 get 방식 요청</h4>\r\n");
      out.write("	<a href=\"querystring?name=ㅇㄷㄷ&age=12&birthday=2024-06-15&gender=F&national=ko&hobbies=movie&hobbies=music&hobbies=sleep\">쿼리스트링을 이용한 값 전달</a>\r\n");
      out.write("	\r\n");
      out.write("	<h3>POST 방식 요청(form 태그 이용)</h3>\r\n");
      out.write("	<form action=\"formdata\" method=\"post\">\r\n");
      out.write("		<label>이름 :</label><input type=\"text\" name=\"name\"><br> \r\n");
      out.write("		<label>나이 :</label><input type=\"number\" name=\"age\"><br>\r\n");
      out.write("		<label>생일 :</label><input type=\"date\" name=\"birthday\"><br>\r\n");
      out.write("		<label>성별 :</label>\r\n");
      out.write("		<!--label for 글자를 눌러도 선택이 되는 속성 뒤에 오는 건 아이디값  -->\r\n");
      out.write("			<input type=\"radio\" name=\"gender\" id=\"male2\" value=\"M\"><label for=\"male2\">남자</label>\r\n");
      out.write("			<input type=\"radio\" name=\"gender\" id=\"female2\" value=\"F\"><label for=\"female2\">여자</label>\r\n");
      out.write("		<br>\r\n");
      out.write("		<label>국적 :</label>\r\n");
      out.write("		<select name=\"national\">\r\n");
      out.write("			<option value=\"ko\">한국</option>\r\n");
      out.write("			<option value=\"ch\">중국</option>\r\n");
      out.write("			<option value=\"jp\">일본</option>\r\n");
      out.write("			<option value=\"etc\">기타</option>\r\n");
      out.write("		</select><br>\r\n");
      out.write("		<label>취미: </label> \r\n");
      out.write("		<input type=\"checkbox\" name=\"hobbies\" id=\"movie2\" value=\"movie\"><label for=\"movie2\">영화</label>\r\n");
      out.write("		<input type=\"checkbox\" name=\"hobbies\" id=\"music2\" value=\"music\"><label for=\"music2\">음악감상</label>\r\n");
      out.write("		<input type=\"checkbox\" name=\"hobbies\" id=\"sleep2\" value=\"sleep\"><label for=\"sleep2\">취침</label>\r\n");
      out.write("		<br>\r\n");
      out.write("		<input type=\"submit\" value=\"POST 요청\">\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
