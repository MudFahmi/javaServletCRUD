package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Pharmacy</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"1css.css\"  type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-times.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("  <div class=\"header\">\r\n");
      out.write("    <div class=\"header_resize\">\r\n");
      out.write("      <div class=\"searchform\">\r\n");
      out.write("        <form id=\"formsearch\" name=\"formsearch\" method=\"post\" action=\"searchtreatment.jsp \">\r\n");
      out.write("          <span>\r\n");
      out.write("\r\n");
      out.write("    <input name=\"editbox_search\" class=\"editbox_search\" id=\"editbox_search\" maxlength=\"80\" value=\"\" type=\"text\" />\r\n");
      out.write(" \r\n");
      out.write("          </span>\r\n");
      out.write("          <input name=\"button_search\" src=\"images/search.gif\" class=\"button_search\" type=\"image\" />\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"logo\">\r\n");
      out.write("       <h1><a href=\"index.html\">Pharmacy<span>SAS</span> <small>Company Slogan Here</small></a></h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"menu_nav\">\r\n");
      out.write("        <ul>\r\n");
      out.write("          <li class=\"active\"><a href=\"index.jsp\"><span>Home Page</span></a></li>\r\n");
      out.write("          <li><a href=\"\"><span>Search</span></a></li>\r\n");
      out.write("        \r\n");
      out.write("          \r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("      <div class=\"slider\">\r\n");
      out.write("        <div id=\"coin-slider\"> <a href=\"#\"><img src=\"images/pharmacy-tech-certification.jpg\" width=\"920\" height=\"360\" alt=\"\" /><span> (this term is more common in the United States) or a chemist's (which is more common in Great Britain). </br>\r\n");
      out.write("          In the United States and Canada, drugstores commonly sell drugs, </br>\r\n");
      out.write("          as well as miscellaneous items such as confectionery, cosmetics,</br>\r\n");
      out.write("          office supplies, and magazines and occasionally refreshments and groceries<br />\r\n");
      out.write("                </span></a> <a href=\"#\"><img src=\"images/friendly.jpg\" width=\"920\" height=\"360\" alt=\"\" /><span>\r\n");
      out.write("                      (this term is more common in the United States) or a chemist's (which is more common in Great Britain). </br>\r\n");
      out.write("          In the United States and Canada, drugstores commonly sell drugs, </br>\r\n");
      out.write("          as well as miscellaneous items such as confectionery, cosmetics.\r\n");
      out.write("                    <br />\r\n");
      out.write("          </span></a> <a href=\"#\"><img src=\"images/slide3.jpg\" width=\"920\" height=\"360\" alt=\"\" /><span>\r\n");
      out.write("                   In the United States and Canada, drugstores commonly sell drugs, </br>\r\n");
      out.write("          as well as miscellaneous items such as confectionery, cosmetics.\r\n");
      out.write("                  <br />\r\n");
      out.write("         .</span></a> </div>\r\n");
      out.write("        <div class=\"clr\"></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"content\">\r\n");
      out.write("    <div class=\"content_resize\">\r\n");
      out.write("      <div class=\"mainbar\">\r\n");
      out.write("        <div class=\"article\">\r\n");
      out.write("          <h2><span>ABOUT US :</span> </h2>\r\n");
      out.write("          \r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          <div class=\"img\"><img src=\"images/friendly.jpg\" width=\"198\" height=\"188\" alt=\"\" class=\"fl\" /></div>\r\n");
      out.write("          <div class=\"post_content\">\r\n");
      out.write("          \r\n");
      out.write("              <br>\r\n");
      out.write("                  Pharmacy is the science and technique of preparing and dispensing drugs. </br>\r\n");
      out.write("              It is a health profession that links health sciences with chemical </br>\r\n");
      out.write("                  sciences and aims to ensure the safe and effective use of pharmaceutical drugs.</br>\r\n");
      out.write("                   The scope of pharmacy practice includes more traditional roles such as</br> \r\n");
      out.write("            compounding and dispensing medications,and it also includes more modern</br>\r\n");
      out.write("            services related to health care, including clinical services , reviewing </br>\r\n");
      out.write("            medications for safety and efficacy, and providing drug information.\r\n");
      out.write("            \r\n");
      out.write("          \r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"article\">\r\n");
      out.write("          <h2><span>FOR</span>YOU : </h2>\r\n");
      out.write("         \r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          <div class=\"img\"><img src=\"images/images.jpg\" width=\"198\" height=\"188\" alt=\"\" class=\"fl\" /></div>\r\n");
      out.write("          <div class=\"post_content\">\r\n");
      out.write("      <br>\r\n");
      out.write("          An establishment in which pharmacy (in the first sense) is practiced is called a pharmacy </br>\r\n");
      out.write("              (this term is more common in the United States) or a chemist's (which is more common in Great Britain). </br>\r\n");
      out.write("          In the United States and Canada, drugstores commonly sell drugs, </br>\r\n");
      out.write("          as well as miscellaneous items such as confectionery, cosmetics,</br>\r\n");
      out.write("          office supplies, and magazines and occasionally refreshments and groceries.</br>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <p class=\"pages\"><small>Page 1 of 1</small> <span>1</span>  <a href=\"#\">&raquo;</a></p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"sidebar\">\r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("          <h2 class=\"star\"><span>Sidebar</span> OUR NEWS</h2>\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("          <ul class=\"sb_menu\">\r\n");
      out.write("              \r\n");
      out.write("          >> We have many  offers in our pharmacy \r\n");
      out.write("            <br>\r\n");
      out.write("                >> Pharmacy is the science and technique.\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"gadget\">\r\n");
      out.write("          <h2 class=\"star\"><span>Login Here </span></h2>\r\n");
      out.write("          <div class=\"clr\"></div>\r\n");
      out.write("       \r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("               <form action=\"login\" method=\"POST\" name=\"myForm\" onsubmit=\"return(validate());\"    >\r\n");
      out.write("              \r\n");
      out.write("              <table border=\"0\" width=\"50\" cellspacing=\"10\" bgcolor=\"#0000\">\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            <tr><td> username:-</td><td><input type='text'  name='username'  id='name'    /><br></td>\r\n");
      out.write("                <td><label id='errorname'/>         </td></tr>\r\n");
      out.write("            <tr><td>  password:-</td><td><input type='password' name='password'id='password'\r\n");
      out.write("                                                /><br></td>\r\n");
      out.write("                <td><label id='errorpassword'/> </td></tr>\r\n");
      out.write("            <tr><td></td><td> <input type='submit'   id=\"submit1\"   value='login'/></td><td></td></tr>\r\n");
      out.write("     \r\n");
      out.write("              \r\n");
      out.write("              </table>\r\n");
      out.write("                   \r\n");
      out.write("                               ");

            String message=request.getParameter("message");
            if(message!=null){
            out.println("<font color='red'/>"+ message +"</font> ");

            }

            
      out.write("     \r\n");
      out.write("                   \r\n");
      out.write("       \r\n");
      out.write("    </from>     \r\n");
      out.write("   </body>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("   \r\n");
      out.write("      // Form validation code will come here.\r\n");
      out.write("      function validate()\r\n");
      out.write("      {\r\n");
      out.write("      \r\n");
      out.write("         if( document.myForm.name.value == \"\" )\r\n");
      out.write("         {\r\n");
      out.write("            alert( \"Please provide your name!\" );\r\n");
      out.write("            document.myForm.name.focus() ;\r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("         \r\n");
      out.write("        \r\n");
      out.write("          if( document.myForm.password.value == \"\" ||  document.myForm.pass.value.length <6)\r\n");
      out.write("         {\r\n");
      out.write("            alert( \"Please provide your Pass must be 6-12\" );\r\n");
      out.write("            document.myForm.password.focus() ;\r\n");
      out.write("            return false;\r\n");
      out.write("                       \r\n");
      out.write("            \r\n");
      out.write("         }\r\n");
      out.write("        \r\n");
      out.write("      }\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("   </script>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"fbg\">\r\n");
      out.write("    <div class=\"fbg_resize\">\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("       \r\n");
      out.write("      <div class=\"col c2\">\r\n");
      out.write("        <h2><span>Services</span> Overview</h2>\r\n");
      out.write("        <p>Curabitur sed urna id nunc pulvinar semper. Nunc sit amet tortor sit amet lacus sagittis posuere cursus vitae nunc.Etiam venenatis, turpis at eleifend porta, nisl nulla bibendum justo.</p>\r\n");
      out.write("        <ul class=\"fbg_ul\">\r\n");
      out.write("          <li><a href=\"#\">Lorem ipsum dolor labore et dolore.</a></li>\r\n");
      out.write("          <li><a href=\"#\">Excepteur officia deserunt.</a></li>\r\n");
      out.write("          <li><a href=\"#\">Integer tellus ipsum tempor sed.</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col c3\">\r\n");
      out.write("        <h2><span>Contact</span> Us</h2>\r\n");
      out.write("        <p>Nullam quam lorem, tristique non vestibulum nec, consectetur in risus. Aliquam a quam vel leo gravida gravida eu porttitor dui.</p>\r\n");
      out.write("        <p class=\"contact_info\"> <span>Address:</span> 1458 TemplateAccess, USA<br />\r\n");
      out.write("          <span>Telephone:</span> +123-1234-5678<br />\r\n");
      out.write("          <span>FAX:</span> +458-4578<br />\r\n");
      out.write("          <span>Others:</span> +301 - 0125 - 01258<br />\r\n");
      out.write("          <span>E-mail:</span> <a href=\"#\">mail@yoursitename.com</a> </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"clr\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"footer\">\r\n");
      out.write("    <div class=\"footer_resize\">\r\n");
      out.write("      <p class=\"lf\">&copy; Copyright <a href=\"#\">MyWebSite</a>.</p>\r\n");
      out.write("    <div style=\"clear:both;\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div></div></body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
