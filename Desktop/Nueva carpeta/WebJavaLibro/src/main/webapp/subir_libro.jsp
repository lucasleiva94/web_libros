
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>


<%@page import="com.Lucas.webJabalibro.model.entities.Libro"%>
<%@page import="com.Lucas.webJabalibro.model.entities.Genero"%>
<%@page import="java.util.ArrayList"%>






<%

ArrayList<Genero> generos = (ArrayList<Genero>) request.getAttribute("listagenero");



  ArrayList<Libro> libros = (ArrayList<Libro>) request.getAttribute("listalibros");
  

    
     String user = (String)request.getAttribute("user");

%>






<!DOCTYPE html>
<html>
<head>
    
   
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  
    <link rel="stylesheet" type="text/css" href="css/miestilo.css">

    <link rel="stylesheet" type="text/css" href="css/ihover.css">
        
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous"> 
        <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">

        
	<title></title>
        
 </head>       
        
<body>



    <header>  <%@include file="header.jsp" %> </header>

    <article >

        
        <% if (user!=null) {
                
            
        %>
        
      <div class="container-fluid mb-5 mt-5">
<h1 style="color:#237DD9" class="mt-3 text-center">Subi un libro!</h1>
</div>  
        
        
        
<div class="container-fluid mt-5 ">
  <div class="row">
    <div class="col-md-12">
      <div class="row">
        <div class="col-md-2">
        </div>
        <div class="col-md-10">











            <form method="post">
  <div class="form-group row">
    <label for="Titulo" class="col-4 col-form-label">Titulo</label> 
    <div class="col-8">
      <input id="Titulo" name="Titulo" placeholder="Titulo del libro" type="text" required="required" class="form-control">
    </div>
  </div>
                
  <div class="form-group row">
    <label for="Fecha" class="col-4 col-form-label">Fecha</label> 
    <div class="col-8">
      <input style="width: 300px" id="Fecha" name="Fecha" placeholder="dd/mm/aaaa" type="date" class="form-control" required="required">
    </div>
  </div>
                
  <div class="form-group row">
    <label for="portada" class="col-4 col-form-label">Portada</label> 
    <div class="col-8">
      <input id="portada" name="portada" placeholder="Ingrese URL de portada" type="text" required="required" class="form-control">
    </div>
  </div>
  <div class="form-group row">
    <label for="sinopsis" class="col-4 col-form-label">Sinopsis</label> 
    <div class="col-8">
      <textarea id="sinopsis" name="sinopsis" cols="40" rows="5" aria-describedby="sinopsisHelpBlock" required="required" class="form-control"></textarea> 
      <span id="sinopsisHelpBlock" class="form-text text-muted">Aca podes ingresar la sinopsis del libro</span>
    </div>
  </div>
                
                
                
                
                
                
  <div class="form-group row">
    <label class="col-4">Generos</label> 
    <div class="col-4">

        <% for (int i = 0; i < generos.size()/2; i++) {
                
        %>
        <dl>
        <dt>
        
      <div class="custom-control custom-checkbox custom-control-inline">
          
          <input name="generos" id="<%= generos.get(i).getGenero_id() %>" type="checkbox"  class="custom-control-input" value="<%= generos.get(i).getGenero_id() %>" aria-describedby="generosHelpBlock"> 
          
        <label for="<%= generos.get(i).getGenero_id() %>" class="custom-control-label"><%= generos.get(i).getNombre_genero() %></label>
        
      </div>
         </dt>
         
         
         </dl>
        <% 
                
            }
        %>
        

  

      <span id="generosHelpBlock" class="form-text text-muted">Marca el/los géneros del libro</span>
    </div>
        
       
        
        
        <div class="col-4">
        
        
        
        

        
        <% for (int i = generos.size()/2; i < generos.size(); i++) {
                
        %>
        <dl>
        <dt>
        
      <div class="custom-control custom-checkbox custom-control-inline">
          
          <input name="generos" id="<%= generos.get(i).getGenero_id() %>" type="checkbox"  class="custom-control-input" value="<%= generos.get(i).getGenero_id() %>" aria-describedby="generosHelpBlock"> 
          
        <label for="<%= generos.get(i).getGenero_id() %>" class="custom-control-label"><%= generos.get(i).getNombre_genero() %></label>
        
      </div>
         </dt>
         
         
         </dl>
        <% 
                
            }
        %>
        
        
        
        
        
        </div>
        
        
        
        
  </div>

        
        



 <!-- inicio Autor-->

  <div class="form-group row">
    <label for="autor" class="col-4 col-form-label">Autor</label> 
    <div class="col-8">
      <input id="autor" name="autor" placeholder="Ingrese el autor del libro" type="text" class="form-control" required="required">
    </div>
  </div> 
        <!-- fin Autor-->
 
 
 
 
 
       <!-- inicio url de descarga-->
          <div class="form-group row">
    <label for="autor" class="col-4 col-form-label">URL de descarga</label> 
    <div class="col-8">
      <input id="descarga" name="descarga" placeholder="ingrese el url de descarga" type="text" class="form-control" required="required">
    </div>
  </div> 
        
       <!-- fin url de descarga-->  
        
        
        
        
  <div class="form-group row">
    <div class="offset-4 col-8">
      <button  name="submit" type="submit" class="btn btn-primary">Subir libro!</button>
    </div>
  </div>
        
      
        
        
        
</form>
<%
 }   else {


                
        
 %>       
        
        
    <div class="alert alert-danger alert-dismissable">
  <button type="button" class="close" data-dismiss="alert">&times;</button>
  <strong>¡Tenes que logearte!</strong> Para poder subir un libro primero tenes que logearte.
</div>
 
 
 <%
 


            }    
        
 %>  
 
 
 
</article>

        <footer>


<%@include file="footer.jsp" %>


</footer>



        </div>
      </div>
    </div>
  </div>
</div>































 	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>           
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>   
      
        <script type="text/javascript" src="ja/mijava.js" ></script>
        <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
        <script>AOS.init();</script>
</body>
</html>





















  