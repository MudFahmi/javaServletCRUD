package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.model.DB;
import com.model.treatment;
import java.sql.ResultSet;

public final class viewtreatment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Pharmacy</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/coin-slider.css\" />\n");
      out.write("      <link rel=\"stylesheet\" href=\"1css.css\"  type=\"text/css\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/cufon-times.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/coin-slider.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"main\">\n");
      out.write("  <div class=\"header\">\n");
      out.write("    <div class=\"header_resize\">\n");
      out.write("      <div class=\"searchform\">\n");
      out.write("        <form id=\"formsearch\" name=\"formsearch\" method=\"post\" action=\"search\">\n");
      out.write("          <span>\n");
      out.write("      \n");
      out.write("              \n");
      out.write("              \n");
      out.write("          \n");
      out.write("          </span>\n");
      out.write("          \n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"logo\">\n");
      out.write("        <h1><a href=\"index.jsp\">Magic<span>box</span> <small>Company Slogan Here</small></a></h1>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"menu_nav\">\n");
      out.write("        <ul>\n");
      out.write("          <li class=\"active\"><a href=\"index.html\"><span>Home Page</span></a></li>\n");
      out.write("          <li><a href=\"support.html\"><span>Search</span></a></li>\n");
      out.write("        \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("      <div class=\"slider\">\n");
      out.write("        <div id=\"coin-slider\"> <a href=\"#\"><img src=\"images/slide1.jpg\" width=\"920\" height=\"360\" alt=\"\" /><span><big>Sed condimentum justo sit amet urna ornare euismod.</big><br />\n");
      out.write("          Tusce nec iaculis risus hasellus nec sem sed tellus malesuada porttitor. Mauris scelerisque feugiat ante in vulputate. Nam sit amet ullamcorper tortor. Phasellus posuere facilisis cursus. Nunc est lorem, dictum at scelerisque sit amet, faucibus et est. Proin mattis ipsum quis arcu aliquam molestie.</span></a> <a href=\"#\"><img src=\"images/slide2.jpg\" width=\"920\" height=\"360\" alt=\"\" /><span><big>Amet urna ornare euismodSed condimentum.</big><br />\n");
      out.write("          Tusce nec iaculis risus hasellus nec sem sed tellus malesuada porttitor. Mauris scelerisque feugiat ante in vulputate. Nam sit amet ullamcorper tortor. Phasellus posuere facilisis cursus. Nunc est lorem, dictum at scelerisque sit amet, faucibus et est. Proin mattis ipsum quis arcu aliquam molestie.</span></a> <a href=\"#\"><img src=\"images/slide3.jpg\" width=\"920\" height=\"360\" alt=\"\" /><span><big>Sed condimentum justo sit amet urna ornare euismod.</big><br />\n");
      out.write("          Tusce nec iaculis risus hasellus nec sem sed tellus malesuada porttitor. Mauris scelerisque feugiat ante in vulputate. Nam sit amet ullamcorper tortor. Phasellus posuere facilisis cursus. Nunc est lorem, dictum at scelerisque sit amet, faucibus et est. Proin mattis ipsum quis arcu aliquam molestie.</span></a> </div>\n");
      out.write("        <div class=\"clr\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"content\">\n");
      out.write("    <div class=\"content_resize\">\n");
      out.write("      <div class=\"mainbar\">\n");
      out.write("        <div class=\"article\">\n");
      out.write("          <h2><span>ADD Treatment  </span> </h2>\n");
      out.write("          \n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("          ");

   
          DB db = new DB();
           db.open_Connection();
          ResultSet rs = db.select_treatment();
          
                
            out.println("<table border=1 width=200   bgcolor=#0000>  ");
             out.println("<tr>"+"<td>" + "<center>"+"ID"+"</center>"+"</td>"
                        +"<td>"+ "<center>"+"Name"+"</center>"+"</td>"+"<td>"+"<center>"+ "price" +"</center>"+"</td>"+"<td>"+"<center>"+ "quantity"+"</center></td>"
                        +"<td>"+ "<center>"+"Product date"+"</center>"+"</td>"+"<td>"+"<center>"+ "Expire date" +"</center>"+"</td>"
                        +"<td>"+"<center>"+   "Options"+"</center></td>" +"</tr>");
              
            
           while(rs.next()){
             
                   
                out.println("<tr>"+"<td>" +  " <input type='text' name='id' value='"+rs.getInt("id")+"'>"+"</td>"                             
                        +"<td>"+  " <input type='text' name='t_name' value='"+rs.getString("name")+"'>"+"</td>"+
                        "<td>" +" <input type='text' name='t_price' value='"+ Float.parseFloat(rs.getString("price"))+"'>"+
                        "</td>"+"<td>"+" <input type='text' name='t_quantity' value='"+ rs.getInt("quantity")+"'>"+
                        "<td>"+  " <input type='text' name='t_name' value='"+rs.getString("productdate")+"'>"+"</td>"+
                        "<td>"+  " <input type='text' name='t_name' value='"+rs.getString("expiredate")+"'>"+"</td>"
                          +"<td>"+" <a href='deleteperson?id="+rs.getInt("id")+"'>Delete</a>"+"</td>"
          
                          +"<td>"+" <a href='updatetreatment.jsp?id="+rs.getInt("id")+"'>Update</a>"+"</td>"+
                      
                        "</td>"+
                        
                        "</tr>");
              
            
          
           }
          
     out.println("</table>");
          

      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"clr\"></div>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <p class=\"pages\"><small>Page 1 of 1</small> <span>1</span>  <a href=\"#\">&raquo;</a></p>\n");
      out.write("      </div>\n");
      out.write("                                                              <div class=\"sidebar\">\n");
      out.write("                                                            <div class=\"gadget\">\n");
      out.write("                                                                <h2 class=\"star\"> Worker pannel: </h2>\n");
      out.write("                                                                <div class=\"clr\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                          <table border=\"0\" width=\"50\" cellspacing=\"10\" bgcolor=\"#0000\">\n");
      out.write("                                                                    <thead>\n");
      out.write("\n");
      out.write("                                                                    </thead>\n");
      out.write("                                                                    <tbody>\n");
      out.write("                                                                        <tr><td></td>\n");
      out.write("                                                                          <td><form action=\" addtreatment.jsp\" ><input type=\"submit\" value=\"Add Treatment\" name=\"Addt\" id=\"submit1\" /></form></td>\n");
      out.write("\n");
      out.write("                                                                          </tr>\n");
      out.write("\n");
      out.write("                                                                             <tr><td></td>   <td><form action=\" viewtreatment.jsp\" ><input type=\"submit\" value=\"View Treatment\" name=\"Addt\" id=\"submit1\" /></form></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                        <tr><td></td>\n");
      out.write("                                                                            <td><form action=\"logout\" ><input type=\"submit\" value=\"Logout\" name=\"Logout\" id=\"submit1\" /></form></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                        </tr> \n");
      out.write("\n");
      out.write("                                                                    </tbody>\n");
      out.write("                                                                </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("  <div class=\"fbg\">\n");
      out.write("    <div class=\"fbg_resize\">\n");
      out.write("      <div class=\"col c1\">\n");
      out.write("        <h2><span>Image</span> Gallery</h2>\n");
      out.write("        <a href=\"#\"><img src=\"images/gal1.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal2.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal3.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal4.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal5.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> <a href=\"#\"><img src=\"images/gal6.jpg\" width=\"75\" height=\"75\" alt=\"\" class=\"gal\" /></a> </div>\n");
      out.write("      <div class=\"col c2\">\n");
      out.write("        <h2><span>Services</span> Overview</h2>\n");
      out.write("        <p>Curabitur sed urna id nunc pulvinar semper. Nunc sit amet tortor sit amet lacus sagittis posuere cursus vitae nunc.Etiam venenatis, turpis at eleifend porta, nisl nulla bibendum justo.</p>\n");
      out.write("        <ul class=\"fbg_ul\">\n");
      out.write("          <li><a href=\"#\">Lorem ipsum dolor labore et dolore.</a></li>\n");
      out.write("          <li><a href=\"#\">Excepteur officia deserunt.</a></li>\n");
      out.write("          <li><a href=\"#\">Integer tellus ipsum tempor sed.</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col c3\">\n");
      out.write("        <h2><span>Contact</span> Us</h2>\n");
      out.write("        <p>Nullam quam lorem, tristique non vestibulum nec, consectetur in risus. Aliquam a quam vel leo gravida gravida eu porttitor dui.</p>\n");
      out.write("        <p class=\"contact_info\"> <span>Address:</span> 1458 TemplateAccess, USA<br />\n");
      out.write("          <span>Telephone:</span> +123-1234-5678<br />\n");
      out.write("          <span>FAX:</span> +458-4578<br />\n");
      out.write("          <span>Others:</span> +301 - 0125 - 01258<br />\n");
      out.write("          <span>E-mail:</span> <a href=\"#\">mail@yoursitename.com</a> </p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clr\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"footer\">\n");
      out.write("    <div class=\"footer_resize\">\n");
      out.write("      <p class=\"lf\">&copy; Copyright <a href=\"#\">MyWebSite</a>.</p>\n");
      out.write("    <div style=\"clear:both;\"></div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div></div></body>\n");
      out.write("</html>\n");
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
