/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2015-01-20 04:38:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.online.system.modules.com_alkacon_opencms_documentation.elements;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/opencms.tld", Long.valueOf(1414568902000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcms_005fimg_0026_005fwidth_005fsrc_005fscaleColor_005fid_005fcssclass_005falt_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcms_005fimg_0026_005fwidth_005fsrc_005fscaleColor_005fid_005fcssclass_005falt_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcms_005fimg_0026_005fwidth_005fsrc_005fscaleColor_005fid_005fcssclass_005falt_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 0, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<footer>\n");
      out.write("\t<!--=== Copyright ===-->\n");
      out.write("\t<div class=\"copyright\">\n");
      out.write("\t\t<div class=\"container-fluid container-main\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-sm-9\">\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\tBuild with <a href=\"http://www.opencms.org\">OpenCms - The Open Source CMS</a> from <a href=\"http://www.alkacon.com\">Alkacon Software - The OpenCms Experts</a><br>\n");
      out.write("\t\t\t\t\tAlkacon and the OpenCms logo are registered trademarks owned by Alkacon Software.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t<a href=\"http://www.alkacon.com\">\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_cms_005fimg_005f0(_jspx_page_context))
        return;
      out.write("</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!--=== End Copyright ===-->\n");
      out.write("</footer>");
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

  private boolean _jspx_meth_cms_005fimg_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  cms:img
    org.opencms.jsp.CmsJspTagImage _jspx_th_cms_005fimg_005f0 = (org.opencms.jsp.CmsJspTagImage) _005fjspx_005ftagPool_005fcms_005fimg_0026_005fwidth_005fsrc_005fscaleColor_005fid_005fcssclass_005falt_005fnobody.get(org.opencms.jsp.CmsJspTagImage.class);
    _jspx_th_cms_005fimg_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cms_005fimg_005f0.setParent(null);
    // /WEB-INF/jsp/online/system/modules/com.alkacon.opencms.documentation/elements/footer.jsp(17,5) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fimg_005f0.setId("logo-footer");
    // /WEB-INF/jsp/online/system/modules/com.alkacon.opencms.documentation/elements/footer.jsp(17,5) name = src type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fimg_005f0.setSrc("/system/modules/com.alkacon.opencms.documentation/images/OpenCms_Logo_800_transparent_24bit.png");
    // /WEB-INF/jsp/online/system/modules/com.alkacon.opencms.documentation/elements/footer.jsp(17,5) name = scaleColor type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fimg_005f0.setScaleColor("transparent");
    // /WEB-INF/jsp/online/system/modules/com.alkacon.opencms.documentation/elements/footer.jsp(17,5) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fimg_005f0.setWidth("120");
    // /WEB-INF/jsp/online/system/modules/com.alkacon.opencms.documentation/elements/footer.jsp(17,5) name = cssclass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fimg_005f0.setCssclass("pull-right");
    // /WEB-INF/jsp/online/system/modules/com.alkacon.opencms.documentation/elements/footer.jsp(17,5) name = alt type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cms_005fimg_005f0.setAlt("Alkacon Software GmbH");
    int _jspx_eval_cms_005fimg_005f0 = _jspx_th_cms_005fimg_005f0.doStartTag();
    if (_jspx_th_cms_005fimg_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcms_005fimg_0026_005fwidth_005fsrc_005fscaleColor_005fid_005fcssclass_005falt_005fnobody.reuse(_jspx_th_cms_005fimg_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcms_005fimg_0026_005fwidth_005fsrc_005fscaleColor_005fid_005fcssclass_005falt_005fnobody.reuse(_jspx_th_cms_005fimg_005f0);
    return false;
  }
}