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
        <form id="formsearch" name="formsearch" method="post" action="searchtreatment.jsp ">
          <span>

    <input name="editbox_search" class="editbox_search" id="editbox_search" maxlength="80" value="" type="text" />
 
          </span>
          <input name="button_search" src="images/search.gif" class="button_search" type="image" />
        </form>
      </div>
      <div class="logo">
       <h1><a href="index.html">Pharmacy<span>SAS</span> <small>Company Slogan Here</small></a></h1>
      </div>
      <div class="clr"></div>
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="index.jsp"><span>Home Page</span></a></li>
          <li><a href=""><span>Search</span></a></li>
        
          
        </ul>
      </div>
      <div class="clr"></div>
      <div class="slider">
        <div id="coin-slider"> <a href="#"><img src="images/pharmacy-tech-certification.jpg" width="920" height="360" alt="" /><span> (this term is more common in the United States) or a chemist's (which is more common in Great Britain). </br>
          In the United States and Canada, drugstores commonly sell drugs, </br>
          as well as miscellaneous items such as confectionery, cosmetics,</br>
          office supplies, and magazines and occasionally refreshments and groceries<br />
                </span></a> <a href="#"><img src="images/friendly.jpg" width="920" height="360" alt="" /><span>
                      (this term is more common in the United States) or a chemist's (which is more common in Great Britain). </br>
          In the United States and Canada, drugstores commonly sell drugs, </br>
          as well as miscellaneous items such as confectionery, cosmetics.
                    <br />
          </span></a> <a href="#"><img src="images/slide3.jpg" width="920" height="360" alt="" /><span>
                   In the United States and Canada, drugstores commonly sell drugs, </br>
          as well as miscellaneous items such as confectionery, cosmetics.
                  <br />
         .</span></a> </div>
        <div class="clr"></div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
          <h2><span>ABOUT US :</span> </h2>
          
          <div class="clr"></div>
          <div class="img"><img src="images/friendly.jpg" width="198" height="188" alt="" class="fl" /></div>
          <div class="post_content">
          
              <br>
                  Pharmacy is the science and technique of preparing and dispensing drugs. </br>
              It is a health profession that links health sciences with chemical </br>
                  sciences and aims to ensure the safe and effective use of pharmaceutical drugs.</br>
                   The scope of pharmacy practice includes more traditional roles such as</br> 
            compounding and dispensing medications,and it also includes more modern</br>
            services related to health care, including clinical services , reviewing </br>
            medications for safety and efficacy, and providing drug information.
            
          
          </div>
          <div class="clr"></div>
        </div>
        <div class="article">
          <h2><span>FOR</span>YOU : </h2>
         
          <div class="clr"></div>
          <div class="img"><img src="images/images.jpg" width="198" height="188" alt="" class="fl" /></div>
          <div class="post_content">
      <br>
          An establishment in which pharmacy (in the first sense) is practiced is called a pharmacy </br>
              (this term is more common in the United States) or a chemist's (which is more common in Great Britain). </br>
          In the United States and Canada, drugstores commonly sell drugs, </br>
          as well as miscellaneous items such as confectionery, cosmetics,</br>
          office supplies, and magazines and occasionally refreshments and groceries.</br>
          
          
          
          
          </div>
          <div class="clr"></div>
        </div>
        <p class="pages"><small>Page 1 of 1</small> <span>1</span>  <a href="#">&raquo;</a></p>
      </div>
      <div class="sidebar">
        <div class="gadget">
          <h2 class="star"><span>Sidebar</span> OUR NEWS</h2>
          <div class="clr"></div>
          <ul class="sb_menu">
              
          >> We have many  offers in our pharmacy 
            <br>
                >> Pharmacy is the science and technique.
          </ul>
        </div>
        <div class="gadget">
          <h2 class="star"><span>Login Here </span></h2>
          <div class="clr"></div>
       
          
          
               <form action="login" method="POST" name="myForm" onsubmit="return(validate());"    >
              
              <table border="0" width="50" cellspacing="10" bgcolor="#0000">
            

            <tr><td> username:-</td><td><input type='text'  name='username'  id='name'    /><br></td>
                <td><label id='errorname'/>         </td></tr>
            <tr><td>  password:-</td><td><input type='password' name='password'id='password'
                                                /><br></td>
                <td><label id='errorpassword'/> </td></tr>
            <tr><td></td><td> <input type='submit'   id="submit1"   value='login'/></td><td></td></tr>
     
              
              </table>
                   
                               <%
            String message=request.getParameter("message");
            if(message!=null){
            out.println("<font color='red'/>"+ message +"</font> ");

            }

            %>     
                   
       
    </from>     
   </body>

            
            

   <script type="text/javascript">
   
      // Form validation code will come here.
      function validate()
      {
      
         if( document.myForm.name.value == "" )
         {
            alert( "Please provide your name!" );
            document.myForm.name.focus() ;
            return false;
         }
         
        
          if( document.myForm.password.value == "" ||  document.myForm.pass.value.length <6)
         {
            alert( "Please provide your Pass must be 6-12" );
            document.myForm.password.focus() ;
            return false;
                       
            
         }
        
      }
   
   
   </script>

            
            
            
            
            
            
            
            
            
          
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="fbg">
    <div class="fbg_resize">
      
      
       
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
