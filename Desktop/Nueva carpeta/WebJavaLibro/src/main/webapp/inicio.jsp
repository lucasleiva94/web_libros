<%@page import="com.Lucas.webJabalibro.model.entities.Genero"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Lucas.webJabalibro.model.entities.Libro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    
    
    
    
    ArrayList<Libro> libros = (ArrayList<Libro>) request.getAttribute("listalibros");
    
    ArrayList<Libro> librospunt = (ArrayList<Libro>) request.getAttribute("librospunt");

    ArrayList<Genero> generos = (ArrayList<Genero>) request.getAttribute("listagenero");
    
    String user = (String)request.getAttribute("user");
    
    String error = (String)request.getAttribute("error");

    
 
%>



<!DOCTYPE html>

<html lang="es">
<head>
	<title> pagina de libros </title>

       
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	
<link rel="stylesheet" type="text/css" href="css/ihover.css">

<link rel="stylesheet" type="text/css" href="css/miestilo.css">

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">

</head>

<body class="fondo">



    <%@include file="header.jsp" %>
<header>
</header>




    <% if (error != null) {
            
    
    
    
        
    %>
    
    <div class="alert alert-warning alert-dismissable">
  <button type="button" class="close" data-dismiss="alert">&times;</button>
  <strong>¡Error al intentar iniciar sesion!</strong> Es probable que hayas escrito mal el nick o la contraseña.   Si no tenes cuenta, podes crearte una.
</div>
    

    
    

    </div>
    
      <% 
            
    
    
    
        }
    %>
    
    
    
    
    
    
    
    
    
    
<div class="container-fluid mb-5 mt-5">
<h1 class="mt-3 text-center">los mejor valorados</h1>
</div>



    
    
    



<!-- empieza el carrusel -->

<div data-aos="fade-right">
<div class="container-fluid">
<div id="carouselExampleControls" style="max-width: 40%" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">


    <div class="carousel-item active">
      <div class="card mb-3" style="max-width: 540px;">
  <div class="row no-gutters">
    <div class="col-md-4">
        <a href="unlibro?ID=<%= librospunt.get(0).getId() %>">
          
          <img class="card-img imagen"  style="height: 300px;width: 180px" src="<%= librospunt.get(0).getPortada() %>"  alt="..." >
      
      </a>
    </div>
    
    <div class="col-md-8">
      <div class="card-body" >
        <h5 class="card-title"><%= librospunt.get(0).getTitulo() %></h5>
        <p class="card-text" style="width:80%;height:200px;overflow:hidden;text-overflow: ellipsis; " > <%= libros.get(4).getSinopsis() %> </p>
        
      </div>
    </div>
  </div>
</div>
    </div>
        
        

        
        <%
                      for (int i = 1; i < librospunt.size(); i++) {
                              
                          
 


                    %>
                    

    <div class="carousel-item" style="max-height: 40%">
      <div class="card mb-3" style="max-width: 540px;">
  <div class="row no-gutters">
    <div class="col-md-4">
        
        <a  href="unlibro?ID=<%=librospunt.get(i).getId()%>"   >
            
            <img   src="<%= librospunt.get(i).getPortada() %>" class="card-img" alt="..." style="height: 300px;width: 180px" >
        </a>
    </div>
    <div class="col-md-8">
      <div class="card-body">
          <h5 class="card-title"><%= librospunt.get(i).getTitulo() %></h5>
          <p class="card-text" style="width:80%;height:200px;overflow:hidden;text-overflow: ellipsis; "><%= librospunt.get(i).getSinopsis() %></p>
        
      </div>
    </div>
  </div>
</div>
    </div>

   <%

                        }

                    %>

  </div>

 <a class="carousel-control-prev" href="#carouselExampleControls" role="button"  data-slide="prev">
    <span class="carousel-control-prev-icon" style="background-color: grey" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" style="background-color: grey" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
                    
</div>
                    </div>

<!--aca termina el carrusel-->










<article>
    
    
    
    
    
    
    
    
    
    
    
    
    <div class="container-fluid mb-5">
<h1 class="mt-3 text-center">los ultimos agregados</h1>
</div>
    
    
    <!--empieza cards de ultimos agregados-->
    
    
    

<div class="container-fluid">
  <div class="row">
    <div class="col-md-12">
      <div class="row">
          
          
        <div class="col-md-4">

<div data-aos="zoom-in">
      <div class="card mb-3" style="max-width: 540px;">

  <div class="row no-gutters">

    <div class="col-md-4">
        <a href="unlibro?ID=<%= libros.get(libros.size()-1).getId() %>">
          
          <img style="height: 300px;width: 150px" src="<%= libros.get(libros.size()-1).getPortada() %>" class="card-img mr-3" alt="..." >
      
      </a>
    </div>
    
    <div class="col-md-8">
      <div class="card-body" >
        <h5 class="card-title"><%= libros.get(libros.size()-1).getTitulo() %></h5>
        <p class="card-text" style="width:80%;height:200px;overflow:hidden;text-overflow: ellipsis; " >
           <%= libros.get(libros.size()-1).getSinopsis() %>
        
        </p>
        
      </div>
    </div>
  </div>
</div>


</div>




        </div>
        <div class="col-md-4">

<div data-aos="zoom-out">

      <div class="card mb-3" style="max-width: 540px;">

  <div class="row no-gutters">

    <div class="col-md-4">
        <a href="unlibro?ID=<%= libros.get(libros.size()-2).getId() %>">
          
          <img style="height: 300px;width: 150px" src="<%= libros.get(libros.size()-2).getPortada() %>" class="card-img" alt="..." >
      
      </a>
    </div>
    
    <div class="col-md-8">
      <div class="card-body" >
        <h5 class="card-title"><%= libros.get(libros.size()-2).getTitulo() %></h5>
        <p class="card-text" style="width:80%;height:200px;overflow:hidden;text-overflow: ellipsis; " > 
        
        <%= libros.get(libros.size()-2).getSinopsis() %>
        
        </p>
        
      </div>
    </div>
  </div>
</div>
</div>



        </div>



        <div class="col-md-4">


<div data-aos="zoom-in-left">
      <div class="card mb-3" style="max-width: 540px;">

  <div class="row no-gutters">

    <div class="col-md-4">
        <a href="unlibro?ID=<%= libros.get(libros.size()-3).getId() %>">
          
          <img style="height: 300px;width: 150px" src="<%= libros.get(libros.size()-3).getPortada() %>" class="card-img" alt="..." >
      
      </a>
    </div>
    
    <div class="col-md-8">
      <div class="card-body" >
        <h5 class="card-title"><%= libros.get(libros.size()-3).getTitulo() %></h5>
        <p class="card-text" style="width:80%;height:200px;overflow:hidden;text-overflow: ellipsis; " > 
            
            <%= libros.get(libros.size()-3).getSinopsis() %>
        
        
        </p>
        
      </div>
    </div>
  </div>
</div>
</div>



        </div>
      </div>
    </div>
  </div>
</div>
    
    
    
     <!--termina cards de ultimos agregados-->
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  <!--titulo-->
  
  
  <div data-aos="fade-up"
     data-aos-anchor-placement="center-bottom">

<div class="container-fluid mb-5">
  <div class="row">
    <div class="col-md-12">
      <h1 class="text mt-3"  >
        <button id="btn-catalogo" class="btn btn-primary mr-3 btn-block">

        Nuestro catalogo de generos

        </button>
      </h1>
    </div>
  </div>
</div>


</div>
  
  
<!--container de tarjetas1-->


<%@include file="generos.jsp" %>
       




 
  







                    

<!--aca termina el container de tarjetas-->


</article>






<footer>
  

<%@include file="footer.jsp" %>




</footer>





        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>           
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>   

        
        
        
        
        <script type="text/javascript" src="js/MiJava.js" ></script>
         <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
        <script>AOS.init();</script>
        
</body>



</html>