<%-- 
    Document   : Adminindex
    Created on : Dec 12, 2015, 1:59:53 AM
    Author     :  houdavic
--%>

<%@page import="com.model.DB"%>
<%@page import="com.model.person"%>
<%@ page import="java.sql.*" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Pharmacy</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <link href="css/style.css" rel="stylesheet" type="text/css" />
        <link rel="stylesheet" type="text/css" href="css/coin-slider.css" />
        <link rel="stylesheet" href="1css.css"  type="text/css" />
        <script type="text/javascript" src="js/cufon-yui.js"></script>
        <script type="text/javascript" src="js/cufon-times.js"></script>
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
        <script type="text/javascript" src="js/script.js"></script>
        <script type="text/javascript" src="js/coin-slider.min.js"></script>
    </head>
    <body>
        <div class="main">
            <div class="header">
                <div class="header_resize">
                    <div class="searchform">
                        <form id="formsearch" name="formsearch" method="post" action="search">
                            </form>
                    </div>
                    <div class="logo">
                        <h1><a href="index.html">Pharmacy</span> <small>For better life</small></a></h1>
                    </div>
                    <div class="clr"></div>
                    <div class="menu_nav">
                        <ul>
                            <li class="active"><a href="index.jsp"><span>Home Page</span></a></li>
                       
                        </ul>
                    </div>
                    <div class="clr"></div>
                    <div class="slider">
                        <div id="coin-slider"> <a href="#"><img src="images/slide1.jpg" width="920" height="360" alt="" /><span><big>Sed condimentum justo sit amet urna ornare euismod.</big><br />
                                    Tusce nec iaculis risus hasellus nec sem sed tellus malesuada porttitor. Mauris scelerisque feugiat ante in vulputate. Nam sit amet ullamcorper tortor. Phasellus posuere facilisis cursus. Nunc est lorem, dictum at scelerisque sit amet, faucibus et est. Proin mattis ipsum quis arcu aliquam molestie.</span></a> <a href="#"><img src="images/slide2.jpg" width="920" height="360" alt="" /><span><big>Amet urna ornare euismodSed condimentum.</big><br />
                                    Tusce nec iaculis risus hasellus nec sem sed tellus malesuada porttitor. Mauris scelerisque feugiat ante in vulputate. Nam sit amet ullamcorper tortor. Phasellus posuere facilisis cursus. Nunc est lorem, dictum at scelerisque sit amet, faucibus et est. Proin mattis ipsum quis arcu aliquam molestie.</span></a> <a href="#"><img src="images/slide3.jpg" width="920" height="360" alt="" /><span><big>Sed condimentum justo sit amet urna ornare euismod.</big><br />
                                    Tusce nec iaculis risus hasellus nec sem sed tellus malesuada porttitor. Mauris scelerisque feugiat ante in vulputate. Nam sit amet ullamcorper tortor. Phasellus posuere facilisis cursus. Nunc est lorem, dictum at scelerisque sit amet, faucibus et est. Proin mattis ipsum quis arcu aliquam molestie.</span></a> </div>
                        <div class="clr"></div>
                    </div>
                    <div class="clr"></div>
                </div>
            </div>
            <div class="content">
                <div class="content_resize">
                    <div class="mainbar">
                        <div class="article">
                            <h2><span>Update Worker </span> </h2>

                            <div class="clr"></div>
                            <div class="post_content">

  <%    
              
    
    int userID = 0;
    userID=Integer.parseInt(request.getParameter("id"));     
   
   DB db=new DB();
    db.open_Connection();
   
   if( userID !=0 ){
   
   person person = new person();
   
   
   ResultSet rs = db.select_one_person(userID);

  
    while(rs.next())
        {
            person.setId(rs.getInt("id"));
            person.setSsn(rs.getInt("ssn"));
            person.setFname(rs.getString("fname"));
            person.setLname(rs.getString("lname"));
            person.setUsername(rs.getString("username"));
            person.setPassword(rs.getString("password"));
            person.setEmail(rs.getString("email"));
            person.setSalary(rs.getFloat("salary"));
            person.setWorkhour(rs.getInt("workhour"));
        }
        
  out.println("<form method='post' action='updateperson'   name='myForm' onsubmit=return(validate());  >");
            out.println("<table border=1 bgcolor=#0000>");
            
            out.println("<input type='hidden' name='id' value='"+person.getId()+"'>");
            
            out.println("<tr><td>"+ "SSN: </td><td><input type='text' name='ssn' value='"+person.getSsn()+"'></td></tr>");
            
            out.println("<tr><td>"+ "First Name: </td><td><input type='text' name='fname' value='"+person.getFname()+"'></td></tr>");
            
            out.println("<tr><td>"+ "Last Name : </td><td><input type='text' name='lname' value='"+person.getLname()+"'></td></tr>");
            
            out.println("<tr><td>"+ "UserName: </td><td><input type='text' name='username'  value='"+person.getUsername()+"'    ></td></tr>");
          
            out.println("<tr><td>" + "Password: </td><td><input type='Password' name='password'  value='"+ person.getPassword()+"'></td></tr>");
          
            out.println("<tr><td>"+"Email: </td><td><input type='email' name='email'  value='"+person.getEmail()+"' ></td></tr>");
            
            out.println("<tr><td>"+ "Salary: </td><td><input type='number' name='salary'  value='"+person.getSalary()+"'></td></tr>");
          
            out.println("<tr><td>"+ "Work hour: </td><td><input type='text' name='workhour'  value='"+person.getWorkhour()+"'></td></tr>");
          
          
            out.println("<tr><td colspan=2><center><input type='submit'  id='submit1' value='Update'></center></td></tr>");
            out.println("</table>");
            out.println("</form>");       
  
  
            out.println("</form>");
  
  }
   
         %>   
              
         </body>


                            </div>
                            <div class="clr"></div>
                        </div>

                        <p class="pages"><small>Page 1 of 1</small> <span>1</span>  <a href="#">&raquo;</a></p>
                    </div>
                    <div class="sidebar">
                                         <div class="gadget">
                                             <h2 class="star"> Admin Pannel : </h2>
                                             <div class="clr"></div>

<table border="0" width="50" cellspacing="10" bgcolor="#0000">
                                                                    <thead>

                                                                    </thead>
                                                                    <tbody>
                                                                        <tr><td></td>
                                                                            <td><form action="addperson.jsp" ><input type="submit" value="Add Worker " name="Show_order"  id="submit1"/></form></td>
                                                                          </tr>

                                                                        <tr><td></td>
                                                                            <td><form action="viewperson.jsp" ><input type="submit" value="View Worker " name="Show_order"  id="submit1"/></form></td>
                                                                          </tr>

                                                                         <tr><td></td>
                                                                            <td><form action="addtreatment_admin.jsp" ><input type="submit" value="Add Treatment " name="Show_order"  id="submit1"/></form></td>
                                                                          </tr>

                                                                        <tr><td></td>
                                                                            <td><form action="viewtreatment_admin.jsp" ><input type="submit" value="View Treament " name="Show_order"  id="submit1"/></form></td>
                                                                          </tr>

                                                                        
                                                                        <tr><td></td>
                                                                            <td><form action="logout" ><input type="submit" value="Logout" name="Logout" id="submit1" /></form></td>




                                                                        </tr> 

                                                                    </tbody>
                                                                </table>

                                                            </div>

                                                        </div>
                                                        
                    <div class="fbg">
                        <div class="fbg_resize">
                            <div class="col c1">
                                <h2><span>Image</span> Gallery</h2>
                                <a href="#"><img src="images/gal1.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal2.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal3.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal4.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal5.jpg" width="75" height="75" alt="" class="gal" /></a> <a href="#"><img src="images/gal6.jpg" width="75" height="75" alt="" class="gal" /></a> </div>
                            <div class="col c2">
                                <h2><span>Services</span> Overview</h2>
                                <p>Curabitur sed urna id nunc pulvinar semper. Nunc sit amet tortor sit amet lacus sagittis posuere cursus vitae nunc.Etiam venenatis, turpis at eleifend porta, nisl nulla bibendum justo.</p>
                                <ul class="fbg_ul">
                                    <li><a href="#">Lorem ipsum dolor labore et dolore.</a></li>
                                    <li><a href="#">Excepteur officia deserunt.</a></li>
                                    <li><a href="#">Integer tellus ipsum tempor sed.</a></li>
                                </ul>
                            </div>
                            <div class="col c3">
                                <h2><span>Contact</span> Us</h2>
                                <p>Nullam quam lorem, tristique non vestibulum nec, consectetur in risus. Aliquam a quam vel leo gravida gravida eu porttitor dui.</p>
                                <p class="contact_info"> <span>Address:</span> 1458 TemplateAccess, USA<br />
                                    <span>Telephone:</span> +123-1234-5678<br />
                                    <span>FAX:</span> +458-4578<br />
                                    <span>Others:</span> +301 - 0125 - 01258<br />
                                    <span>E-mail:</span> <a href="#">mail@yoursitename.com</a> </p>
                            </div>
                            <div class="clr"></div>
                        </div>
                    </div>
                    <div class="footer">
                        <div class="footer_resize">
                            <p class="lf">&copy; Copyright <a href="#">MyWebSite</a>.</p>
                            <div style="clear:both;"></div>
                        </div>
                    </div>
                </div></div></body>
</html>
