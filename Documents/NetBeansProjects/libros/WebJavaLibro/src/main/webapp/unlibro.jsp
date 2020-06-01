

<%@page import="com.Lucas.webJabalibro.model.entities.Puntuacion"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Lucas.webJabalibro.model.entities.Autores"%>
<%@page import="com.Lucas.webJabalibro.model.entities.Genero"%>
<%@page import="com.Lucas.webJabalibro.model.entities.Libro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>






<%
    
     Libro unlibro = (Libro) request.getAttribute("libro2");
     
     String user = (String)request.getAttribute("user");
     
     
    String puntuacion = (String) request.getAttribute("puntuacion");
    


   
    %>


<!DOCTYPE html>
<html>
<head>
  <title>
    
    
  </title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	
<link rel="stylesheet" type="text/css" href="css/miestilo.css">
<link rel="stylesheet" type="text/css" href="css/ihover.css">
<link rel="stylesheet" type="text/css" href="css/estrella.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">


</head>


<body class="fondo">




<header>
  
  <%@include file="header.jsp" %>

</header>



<article>

    

    
    
    
    
    
    
    
    <div data-aos="zoom-in-up">
    
<div class="container-fluid mt-5 ">
  <h1 class="ml-2"> <%= unlibro.getTitulo()  %>   </h1>
  <h4 class="ml-2" style="color: #237DD9;"> puntuacion de libro: <%= puntuacion  %>/5 </h4>
  <div class="row">
    <div class="col-6 border bg-light">
<p >
      <img class="m-3" style="width: 300px; height: 400px;" align="left" src="<%= unlibro.getPortada() %>" class="card-img" >

     <h5>
        
           <%=  unlibro.getSinopsis()    %>

     </h5> 

</p>

 


<% if (user != null) {
        
    
%>








<!--inicio valoracion-->


          
<div class="container-fluid"  ">
   <h3 style="color:#237DD9"> Vota el libro</h3>
  <div class="row">
    <div class="col-md-12">
      <div class="btn-group" role="group">

         <div class="valoracion">

        <button value="5" id="fav_1" class="btn btn-secondary" type="button">
           <i class="fas fa-star"></i>
        </button> 

        <button value="4" id="fav_2" class="btn btn-secondary" type="button">
           <i class="fas fa-star"></i>
        </button> 

        <button value="3" id="fav_3" class="btn btn-secondary" type="button">
           <i class="fas fa-star"></i>
        </button> 

        <button value="2" id="fav_4" class="btn btn-secondary" type="button">
           <i class="fas fa-star"></i>
        </button>

        <button value="1" id="fav_5" class="btn btn-secondary" type="button">
           <i class="fas fa-star"></i>
        </button>


       </div>
      </div>
    </div>
  </div>
</div>



<!--fin valoracion-->








<!--inicio valoracion sin registro valoracion-->
<% 
        
    }else{



          
%>

<div  class="container-fluid"  ">
    <h3 style="color:#237DD9"> vota el libro</h3>
  <div class="row">
    <div class="col-md-12">
      <div   class="btn-group" role="group">

         <div class="valoracion">

        <button value="5" id="1" class="btn btn-secondary" type="button">
           <i class="fas fa-star"></i>
        </button> 

        <button value="4" id="2" class="btn btn-secondary" type="button">
           <i class="fas fa-star"></i>
        </button> 

        <button value="3" id="3" class="btn btn-secondary" type="button">
           <i class="fas fa-star"></i>
        </button> 

        <button value="2" id="4" class="btn btn-secondary" type="button">
           <i class="fas fa-star"></i>
        </button>

        <button value="1" id="5" class="btn btn-secondary" type="button">
           <i class="fas fa-star"></i>
        </button>


       </div>
      </div>
    </div>
  </div>
</div>


<% 
        
    



          }
%>

<!--fin valoracion sin registro valoracion-->












<!--tabla-->

<div data-aos="zoom-in-up">

<div ><br>
<table class="table table-responsive table-dark">
    
    <tbody>
        <tr>
            <td><h3 > titulo     </h3></td>
            <td><h3 > <%= unlibro.getTitulo() %>     </h3></td>
            
        </tr>
        <tr >
            <td><h3 > autor </h3></td>
            
            
            
            <td>
                
                
                                <% 
                
                for (Autores autores : unlibro.getAutores()) {
                

                %>
                
                <h3>
                    
               <%= autores.getAutor() %>     
                
           
                
                </h3>
            <%
                }
                
                %>
 
            
            </td>
            
        </tr>
        <tr>
            <td><h3> categoria </h3></td>
            <td>
                <% 
                
                for (Genero genero : unlibro.getGeneros()) {
                

                %>
                
                <h3>
                    
               <%= genero.getNombre_genero() %>     
                
           
                
                </h3>
            <%}
                
                
                %>
            
            
            </td>
            
        </tr>

          <tr>
            <td><h3> fecha de publicacion </h3></td>
            <td><h3> <%= unlibro.getFecha() %>   </h3></td>
            
        </tr>
        
    </tbody>
</table>


</div>




<% if (user != null) {
        
    
%>


<button type="button" class="btn btn-primary mb-3">
<a href="<%= unlibro.getDescarga() %>" style="text-decoration:none;color:white;">descargar</a>


<% }else { %>


<button id="6" type="button" class="btn btn-primary mb-3">
<a href="#" style="text-decoration:none;color:white;">debes iniciar sesion para descargar</a>

<% }  %>


</button>



    </div>
</div>


  </div>




</div>

  </div>


</article>




<footer>
  
    
    
    
<!--parte de abajo-->
<%@include file="footer.jsp" %>




</footer>





        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>           
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>   
        <script type="text/javascript" src="js/puntuacion.js" ></script>
        <script type="text/javascript" src="js/nouser.js" ></script>
        <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
        <script>AOS.init();</script>

        
        


</body>
</html>