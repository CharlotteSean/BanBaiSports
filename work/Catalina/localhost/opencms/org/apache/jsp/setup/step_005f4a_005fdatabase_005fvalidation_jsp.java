/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2015-01-20 02:56:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.setup;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.opencms.setup.*;
import java.util.*;

public final class step_005f4a_005fdatabase_005fvalidation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      org.opencms.setup.CmsSetupBean Bean = null;
      synchronized (session) {
        Bean = (org.opencms.setup.CmsSetupBean) _jspx_page_context.getAttribute("Bean", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (Bean == null){
          Bean = new org.opencms.setup.CmsSetupBean();
          _jspx_page_context.setAttribute("Bean", Bean, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("Bean"), request);


	// next page 
	String nextPage = "step_5_database_creation.jsp";	
	// previous page 
	String prevPage = "step_3_database_selection.jsp";

	CmsSetupDb db = null;
	boolean enableContinue = false;
	String chkVars = null;
	List conErrors = null;

	if (Bean.isInitialized()) {
		db = new CmsSetupDb(Bean.getWebAppRfsPath());
		// try to connect as the runtime user
		db.setConnection(Bean.getDbDriver(), Bean.getDbWorkConStr(), Bean.getDbConStrParams(), Bean.getDbWorkUser(),Bean.getDbWorkPwd());
		if (!db.noErrors()) {
		    // try to connect as the setup user
		    db.closeConnection();
			db.clearErrors();
			db.setConnection(Bean.getDbDriver(), Bean.getDbCreateConStr(), Bean.getDbConStrParams(), Bean.getDbCreateUser(), Bean.getDbCreatePwd());
		}
		conErrors = new ArrayList(db.getErrors());
		db.clearErrors();
		enableContinue = conErrors.isEmpty();
		chkVars = db.checkVariables(Bean.getDatabase());
		db.closeConnection();
		if (enableContinue && db.noErrors() && chkVars == null && Bean.validateJdbc()) {
			response.sendRedirect(nextPage);
			return;
		}
	}

      out.print( Bean.getHtmlPart("C_HTML_START") );
      out.write("\n");
      out.write("Alkacon OpenCms Setup Wizard\n");
      out.print( Bean.getHtmlPart("C_HEAD_START") );
      out.write('\n');
      out.print( Bean.getHtmlPart("C_STYLES") );
      out.write('\n');
      out.print( Bean.getHtmlPart("C_STYLES_SETUP") );
      out.write('\n');
      out.print( Bean.getHtmlPart("C_HEAD_END") );
      out.write("\n");
      out.write("Alkacon OpenCms Setup Wizard - Validate database connection\n");
      out.print( Bean.getHtmlPart("C_CONTENT_SETUP_START") );
      out.write('\n');
 if (Bean.isInitialized())	{ 
      out.write("\n");
      out.write("<form action=\"");
      out.print( nextPage );
      out.write("\" method=\"post\" class=\"nomargin\">\n");
      out.write("<table border=\"0\" cellpadding=\"5\" cellspacing=\"0\" style=\"width: 100%; height: 350px;\">\n");
      out.write("<tr>\n");
      out.write("\t<td style=\"vertical-align: middle;\">\n");
      out.write("\t\t\t\t");

					if (!enableContinue) {
						
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      out.print( Bean.getHtmlPart("C_BLOCK_START", "Creating Database Connection") );
      out.write("\n");
      out.write("\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td><img src=\"resources/error.png\" border=\"0\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>&nbsp;&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>It was not possible to create a database connection with the given parameters.<br>\n");
      out.write("\t\t\t\t\t\t\t\t\tPlease check the Exception below. There can be two reasons for this error:\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <li><b>Your database is down</b>, or</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t  <li><b>Your database is not accessible with the given connection parameters.</b></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\tBe also aware that Alkacon recommends to use the\n");
      out.write("\t\t\t\t\t\t\t\t\tfollowing JDBC drivers for ");
      out.print(Bean.getDatabaseName(Bean.getDatabase()));
      out.write(":<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t<code>");
      out.print(Bean.getDatabaseLibs(Bean.getDatabase()).toString());
      out.write("</code><p>\n");
      out.write("\t\t\t\t\t\t\t\t\tCheck that the Jdbc drivers are included in your class path.\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td colspan='2'>&nbsp;&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td style=\"width: 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div style=\"width: 100%; height:200px; overflow: auto;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									for (int i = 0; i < conErrors.size(); i++)	{
										out.println(conErrors.get(i) + "<br>");
										out.println("-------------------------------------------" + "<br>");
									}
							 		
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t");
      out.print( Bean.getHtmlPart("C_BLOCK_END") );
      out.write("\n");
      out.write("\t\t\t\t\t\t");

					} else {
						if (!Bean.validateJdbc()) {
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( Bean.getHtmlPart("C_BLOCK_START", "Validating Jdbc Drivers") );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><img src=\"resources/warning.png\" border=\"0\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>&nbsp;&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Be aware that Alkacon recommends to use the\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfollowing JDBC drivers for ");
      out.print(Bean.getDatabaseName(Bean.getDatabase()));
      out.write(":<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<code>");
      out.print(Bean.getDatabaseLibs(Bean.getDatabase()).toString());
      out.write("</code><p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<b>But these drivers are not located in folder <code>");
      out.print(Bean.getLibFolder());
      out.write("</code></b><p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i>If you are using a different driver or if you added the driver in another way \n");
      out.write("\t\t\t\t\t\t\t\t\t\t   to the classpath, you may continue to try it out. If <b>not</b>, be sure to get the \n");
      out.write("\t\t\t\t\t\t\t\t\t\t   drivers and restart your servlet container before you continue.</i>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( Bean.getHtmlPart("C_BLOCK_END") );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

						}					
						if (!db.noErrors() || chkVars != null)	{ 
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( Bean.getHtmlPart("C_BLOCK_START", "Validating Database Server Configuration") );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">");

						    boolean isError = !db.noErrors();
							enableContinue = enableContinue && !isError;
							if (chkVars != null) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><img src=\"resources/warning.png\" border=\"0\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>&nbsp;&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(chkVars);
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>");

							}
							if (!db.noErrors()) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><img src=\"resources/error.png\" border=\"0\"></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>&nbsp;&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td style=\"width: 100%;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div style=\"width: 100%; height:140px; overflow: auto;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p style=\"margin-bottom: 4px;\">Error while checking the server configuration!</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");

										out.println("-------------------------------------------" + "<br>");
										List<String> errors = db.getErrors();
										Iterator<String> it = errors.iterator();
										while (it.hasNext())	{
											out.println(it.next() + "<br>");
										}
										db.clearErrors();
										
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>");

							}
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t\t");
      out.print( Bean.getHtmlPart("C_BLOCK_END") );
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");

						}
					}
				
      out.write("\n");
      out.write("\n");
      out.write("\t</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.print( Bean.getHtmlPart("C_CONTENT_END") );
      out.write('\n');
      out.write('\n');
      out.print( Bean.getHtmlPart("C_BUTTONS_START") );
      out.write("\n");
      out.write("<input name=\"back\" type=\"button\" value=\"&#060;&#060; Back\" class=\"dialogbutton\" onclick=\"location.href='");
      out.print( prevPage );
      out.write("';\">\n");
      out.write("<input name=\"btcontinue\" type=\"submit\" value=\"Continue &#062;&#062;\" class=\"dialogbutton\" disabled=\"disabled\" id=\"btcontinue\">\n");
      out.write("<input name=\"cancel\" type=\"button\" value=\"Cancel\" class=\"dialogbutton\" onclick=\"location.href='index.jsp';\" style=\"margin-left: 50px;\">\n");
      out.write("</form>\n");
 if (enableContinue)	{
	out.println("<script type=\"text/javascript\">\ndocument.getElementById(\"btcontinue\").disabled = false;\n</script>");
} 
      out.write('\n');
      out.print( Bean.getHtmlPart("C_BUTTONS_END") );
      out.write('\n');
 } else	{ 
      out.write('\n');
      out.print( Bean.displayError(""));
      out.write('\n');
      out.print( Bean.getHtmlPart("C_CONTENT_END") );
      out.write('\n');
 } 
      out.write('\n');
      out.print( Bean.getHtmlPart("C_HTML_END") );
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
