

<%@page import="com.Lucas.webJabalibro.model.entities.Libro"%>
<%@page import="java.util.ArrayList"%>




<%
    ArrayList<Libro> libros = (ArrayList<Libro>) request.getAttribute("listalibros");


%>





<!DOCTYPE html>
<html>
<head>


 
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/miestilo.css">
    


    <title></title>




<div id="carouselExampleControls" style="max-width: 40%" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">


    <div class="carousel-item active">
      <div class="card mb-3" style="max-width: 540px;">
  <div class="row no-gutters">
    <div class="col-md-4">
      <a href="libro1.html"><img src="https://images-na.ssl-images-amazon.com/images/I/41W9Y+FWvAL._SX346_BO1,204,203,200_.jpg" class="card-img" alt="..." ></a>
    </div>
    
    <div class="col-md-8">
      <div class="card-body" >
        <h5 class="card-title">Card title</h5>
        <p class="card-text" style="max-height: 5px">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
        consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
        cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
        consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
        cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
        proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
        
      </div>
    </div>
  </div>
</div>
    </div>

<%
                        for (Libro libro : libros) {


                    %>
    <div class="carousel-item" style="max-height: 30%">
      <div class="card mb-3" style="max-width: 540px;">
  <div class="row no-gutters">
    <div class="col-md-4">
      <img src="<%= libro.getPortada() %>" class="card-img" alt="...">
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title"><%= libro.getTitulo() %></h5>
        <p class="card-text" style="max-height: 30%"><%= libro.getSinopsis() %></p>
        
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




         <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
         <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
         <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>


<script type="text/javascript" src="js/MiJava.js" ></script>


</body>
</html>












</html>