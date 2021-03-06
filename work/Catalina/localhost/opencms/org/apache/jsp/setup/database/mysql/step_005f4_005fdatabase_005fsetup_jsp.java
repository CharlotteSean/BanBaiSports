/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2015-01-20 02:55:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.setup.database.mysql;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.opencms.setup.*;
import java.util.*;

public final class step_005f4_005fdatabase_005fsetup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
	String nextPage = "../../step_4a_database_validation.jsp";		
	// previous page
	String prevPage = "../../step_2_check_components.jsp";
	
    boolean isFormSubmitted = Bean.setDbParamaters(request, CmsSetupBean.MYSQL_PROVIDER);


      out.write('\n');
      out.print( Bean.getHtmlPart("C_HTML_START") );
      out.write("\n");
      out.write("Alkacon OpenCms Setup Wizard\n");
      out.print( Bean.getHtmlPart("C_HEAD_START") );
      out.write('\n');
      out.print( Bean.getHtmlPart("C_STYLES") );
      out.write('\n');
      out.print( Bean.getHtmlPart("C_STYLES_SETUP") );
      out.write('\n');
      out.print( Bean.getHtmlPart("C_SCRIPT_HELP") );
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("<!--\n");
      out.write("\tfunction checkSubmit()\t{\n");
      out.write("\t\tif(document.forms[0].dbCreateConStr.value == \"\")\t{\n");
      out.write("\t\t\talert(\"Please insert the Connection String\");\n");
      out.write("\t\t\tdocument.forms[0].dbCreateConStr.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\telse if (document.forms[0].db.value == \"\")\t{\n");
      out.write("\t\t\talert(\"Please insert a Database name\");\n");
      out.write("\t\t\tdocument.forms[0].db.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t} else if (!isValidDbName(document.forms[0].db.value)) {\n");
      out.write("\t\t    alert(\"Invalid database name\");\n");
      out.write("\t\t\tdocument.forms[0].db.focus();\n");
      out.write("\t\t    return false; \n");
      out.write("\t\t}\n");
      out.write("\t\telse\t{\n");
      out.write("\t\t\treturn true;\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t");

		if(isFormSubmitted)	{
			out.println("location.href='"+nextPage+"';");
		}
	
      out.write("\n");
      out.write("//-->\n");
      out.write("</script>\n");
      out.print( Bean.getHtmlPart("C_HEAD_END") );
      out.write('\n');
      out.write('\n');
 if (Bean.isInitialized()) { 
      out.write("\n");
      out.write("Alkacon OpenCms Setup Wizard - ");
      out.print( Bean.getDatabaseName(Bean.getDatabase()) );
      out.write(" database setup\n");
      out.print( Bean.getHtmlPart("C_CONTENT_SETUP_START") );
      out.write("\n");
      out.write("<form method=\"post\" onSubmit=\"return checkSubmit()\" class=\"nomargin\" autocomplete=\"off\">\n");
      out.write("\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width: 100%; height: 100%;\">\n");
      out.write("<tr><td style=\"vertical-align: top;\">\n");
      out.write("\n");
      out.print( Bean.getHtmlPart("C_BLOCK_START", "Database") );
      out.write("\n");
      out.write("<table border=\"0\" cellpadding=\"2\" cellspacing=\"0\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>Select Database</td>\n");
      out.write("\t\t<td>");
      out.print( Bean.getHtmlForDbSelection() );
      out.write("</td>\n");
      out.write("\t\t<td>");
      out.print( Bean.getHtmlHelpIcon("6", "../../") );
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.print( Bean.getHtmlPart("C_BLOCK_END") );
      out.write("\n");
      out.write("\n");
      out.write("</td></tr>\n");
      out.write("<tr><td style=\"vertical-align: middle;\">\n");
      out.write("\n");
      out.write("<div class=\"dialogspacer\" unselectable=\"on\">&nbsp;</div>\n");
      out.write("<iframe src=\"database_information.html\" name=\"dbinfo\" style=\"width: 100%; height: 82px; margin: 0; padding: 0; border-style: none;\" frameborder=\"0\" scrolling=\"no\"></iframe>\n");
      out.write("<div class=\"dialogspacer\" unselectable=\"on\">&nbsp;</div>\n");
      out.write("\n");
      out.write("</td></tr>\n");
      out.write("<tr><td style=\"vertical-align: bottom;\">\n");
      out.write("\n");
      out.print( Bean.getHtmlPart("C_BLOCK_START", "Database specific settings") );
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"0\" cellpadding=\"2\" cellspacing=\"0\">\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>&nbsp;</td>\n");
      out.write("\t\t<td>User</td>\n");
      out.write("\t\t<td>Password</td>\n");
      out.write("\t\t<td>&nbsp;</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>Setup Connection</td>\n");
      out.write("\t\t<td><input type=\"text\" name=\"dbCreateUser\" size=\"8\" style=\"width:150px;\" value='");
      out.print( Bean.getDbCreateUser() );
      out.write("'></td>\n");
      out.write("\t\t<td style=\"text-align: right;\"><input type=\"text\" name=\"dbCreatePwd\" size=\"8\" style=\"width:150px;\" value='");
      out.print( Bean.getDbCreatePwd() );
      out.write("'></td>\n");
      out.write("\t\t<td>");
      out.print( Bean.getHtmlHelpIcon("1", "../../") );
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>OpenCms Connection</td>\n");
      out.write("\t\t<td><input type=\"text\" name=\"dbWorkUser\" size=\"8\" style=\"width:150px;\" value='");
      out.print( Bean.getDbWorkUser() );
      out.write("'></td>\n");
      out.write("\t\t<td style=\"text-align: right;\"><input type=\"text\" name=\"dbWorkPwd\" size=\"8\" style=\"width:150px;\" value='");
      out.print( Bean.getDbWorkPwd() );
      out.write("'></td>\n");
      out.write("\t\t<td>");
      out.print( Bean.getHtmlHelpIcon("2", "../../") );
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>Connection String</td>\n");
      out.write("\t\t<td colspan=\"2\"><input type=\"text\" name=\"dbCreateConStr\" size=\"22\" style=\"width:315px;\" value='");
      out.print( Bean.getDbCreateConStr() );
      out.write("'></td>\n");
      out.write("\t\t<td>");
      out.print( Bean.getHtmlHelpIcon("3", "../../") );
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>Database</td>\n");
      out.write("\t\t<td colspan=\"2\"><input type=\"text\" name=\"db\" size=\"22\" style=\"width:315px;\" value='");
      out.print( Bean.getDb() );
      out.write("'></td>\n");
      out.write("\t\t<td>");
      out.print( Bean.getHtmlHelpIcon("4", "../../") );
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>&nbsp;</td>\n");
      out.write("\t\t<td colspan=\"2\"><input type=\"checkbox\" name=\"createDb\" value=\"true\" checked> Create database and tables \n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td>");
      out.print( Bean.getHtmlHelpIcon("5", "../../") );
      out.write("</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.print( Bean.getHtmlPart("C_BLOCK_END") );
      out.write("\n");
      out.write("</td></tr>\n");
      out.write("</table>\n");
      out.print( Bean.getHtmlPart("C_CONTENT_END") );
      out.write('\n');
      out.write('\n');
      out.print( Bean.getHtmlPart("C_BUTTONS_START") );
      out.write("\n");
      out.write("<input name=\"back\" type=\"button\" value=\"&#060;&#060; Back\" class=\"dialogbutton\" onclick=\"location.href='");
      out.print( prevPage );
      out.write("';\">\n");
      out.write("<input name=\"submit\" type=\"submit\" value=\"Continue &#062;&#062;\" class=\"dialogbutton\">\n");
      out.write("<input name=\"cancel\" type=\"button\" value=\"Cancel\" class=\"dialogbutton\" onclick=\"location.href='../../index.jsp';\" style=\"margin-left: 50px;\">\n");
      out.write("</form>\n");
      out.print( Bean.getHtmlPart("C_BUTTONS_END") );
      out.write('\n');
      out.write('\n');
      out.print( Bean.getHtmlPart("C_HELP_START", "1") );
      out.write("\n");
      out.write("The <b>Setup Connection</b> is used <i>only</i> during this setup process.<br>&nbsp;<br>\n");
      out.write("The specified user must have database administration permissions in order to create the database and tables.\n");
      out.write("This user information is not stored after the setup is finished.\n");
      out.print( Bean.getHtmlPart("C_HELP_END") );
      out.write('\n');
      out.write('\n');
      out.print( Bean.getHtmlPart("C_HELP_START", "2") );
      out.write("\n");
      out.write("The <b>OpenCms Connection</b> is used when running Alkacon OpenCms after the installation.<br>&nbsp;<br>\n");
      out.write("For security reasons, the specified user should <i>not</i> have database administration permissions.\n");
      out.write("This user information is stored in the <code>opencms.properties</code> file after the setup.\n");
      out.print( Bean.getHtmlPart("C_HELP_END") );
      out.write('\n');
      out.write('\n');
      out.print( Bean.getHtmlPart("C_HELP_START", "3") );
      out.write("\n");
      out.write("Enter the JDBC <b>Connection String</b> to your database.\n");
      out.print( Bean.getHtmlPart("C_HELP_END") );
      out.write('\n');
      out.write('\n');
      out.print( Bean.getHtmlPart("C_HELP_START", "4") );
      out.write("\n");
      out.write("Enter the name of the MySQL <b>Database</b> which should be used by Alkacon OpenCms.\n");
      out.print( Bean.getHtmlPart("C_HELP_END") );
      out.write('\n');
      out.write('\n');
      out.print( Bean.getHtmlPart("C_HELP_START", "5") );
      out.write("\n");
      out.write("The setup wizard <b>creates</b> the MySQL database and the tables for Alkacon OpenCms.<br>&nbsp;<br>\n");
      out.write("<b>Attention</b>: Existing databases will be overwritten!<br>&nbsp;<br>\n");
      out.write("Uncheck this option if an already existing database should be used.\n");
      out.print( Bean.getHtmlPart("C_HELP_END") );
      out.write('\n');
      out.write('\n');
      out.print( Bean.getHtmlPart("C_HELP_START", "6") );
      out.write("\n");
      out.write("<b>MySQL 4.1 configuration notes:</b><br>&nbsp;<br>\n");
      out.write("MySQL limits the size of packets which can be stored in the database. \n");
      out.write("In order to increase the maximum file size for Alkacon OpenCms, \n");
      out.write("you have to adjust this setting for MySQL.<br>&nbsp;<br>\n");
      out.write("Locate the file <code>mysql.ini</code> (Windows systems) respectively <code>mysql.conf</code> (Unix systems) and add the line<br>\n");
      out.write("<code>set-variable=<br>max_allowed_packet=16M</code><br>\n");
      out.write("to increase the size e.g. to 16 MB.<br><br>\n");
      out.write("This driver uses the <code>MYISAM</code> engine for all tables since \n");
      out.write("all transactions are autocommit anyway.<br><br>\n");
      out.write("All tables are created using the <code>utf8</code> charset.\n");
      out.print( Bean.getHtmlPart("C_HELP_END") );
      out.write('\n');
      out.write('\n');
 } else	{ 
      out.write("\n");
      out.write("Alkacon OpenCms Setup Wizard - Database setup\n");
      out.print( Bean.getHtmlPart("C_CONTENT_SETUP_START") );
      out.write('\n');
      out.print( Bean.displayError("../../"));
      out.write('\n');
      out.print( Bean.getHtmlPart("C_CONTENT_END") );
      out.write('\n');
 } 
      out.write('\n');
      out.print( Bean.getHtmlPart("C_HTML_END") );
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
