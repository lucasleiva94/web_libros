

<%@page contentType="text/html" pageEncoding="UTF-8"%>








<%@page import="com.Lucas.webJabalibro.model.entities.Genero"%>
<%@page import="java.util.ArrayList"%>

<%

ArrayList<Genero> generos = (ArrayList<Genero>) request.getAttribute("listagenero");





%>







<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  
        <link rel="stylesheet" type="text/css" href="css/miestilo.css">
 
	<link rel="stylesheet" type="text/css" href="css/ihover.css">
        
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">

	<title></title>
<body>








<div class="container-fluid">
  <div class="row">
    <div class="col-md-12">
      <div class="row">
        <div class="col-md-2">
        </div>
        <div class="col-md-10">











            <form method="get">
 
                
                
                
                
                
                
                
                
  <div class="form-group row">



    <label class="col-4">Generos</label>
    
    <div class="col-8">
        
        <% for (int i = 0; i < generos.size(); i++) {
                
        %>
        
        
      <div class="custom-control custom-checkbox custom-control-inline">
          <input name="generos" id="<%= generos.get(i).getGenero_id() %>" type="checkbox"  class="custom-control-input" value="<%= generos.get(i).getGenero_id() %>" aria-describedby="generosHelpBlock"> 
        <label for="<%= generos.get(i).getGenero_id() %>" class="custom-control-label"><%= generos.get(i).getNombre_genero() %></label>
      </div>

        <% 
                
            }
        %>
      



        
        
  

      <span id="generosHelpBlock" class="form-text text-muted">Marque los géneros del libro</span>
    </div>
  </div>


        
        
        




  <div class="form-group row">
    <div class="offset-4 col-8">
      <button  name="submit" type="submit" class="btn btn-primary">Submit</button>
    </div>
  </div>
</form>













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

