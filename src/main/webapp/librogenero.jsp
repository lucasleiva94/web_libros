
<%@page import="com.Lucas.webJabalibro.model.entities.Genero"%>
<%@page import="com.Lucas.webJabalibro.model.entities.Libro"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    ArrayList<Libro> librobygenero = (ArrayList<Libro>) request.getAttribute("librobygenero");

    ArrayList<Genero> generos = (ArrayList<Genero>) request.getAttribute("listagenero");

    
   String id = request.getParameter("ID");
   int id_genero = Integer.parseInt(id) ;
   
     String user = (String)request.getAttribute("user");

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





</head>
<body>

 
    <header>
        
        <%@include file="header.jsp" %>
        
        
    </header>              

        
        <article>   
                    

    
       
<div class="container-fluid " style="margin-top:10%;margin-left: 25%; margin-bottom: 10%">
	
            
               <%
                        for (Genero genero : generos) {


                    %>
                    
                          <% if ( genero.getGenero_id() == id_genero  ) {
      

        %>
        
        
                 <h3 style="color:#237DD9;">Nuestro catalogo segun el genero de: <%= genero.getNombre_genero() %></h3>
        


<%
    }  
      %>
            
            
     <%
    }  
      %>      

</div>



<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<div class="row">
				<div class="col-md-3">

                                    
                                    
                                    
                                    
  <!--barra de navegacion izquierda generos-->
                                  
           <div data-aos="zoom-in">                         
<div id="global" class="ml-4">
  <div id="mensajes">
      
      
   <%
                        for (Genero genero : generos) {


                    %>
      
                    <a  href="librogenero?ID=<%= genero.getGenero_id() %>">
                        
    <div class="texto">  <%=   genero.getNombre_genero()  %>  </div>

                       
    </a>
    
      <%

                        }

                    %>
    
  </div>
</div>
                    
   </div>                 
  <!--termina barra de navegacion izquierda generos-->





</div>
<!--cards de libros-->


				
                    
				<div class="col-md-9">
                                    
					<div class="row">

                                            <div class="col-md-4" >

                                                    
                                                    
<%

for (int i =0; i < (librobygenero.size() / 2 ); i++){
      
     
       %>
<div data-aos="zoom-in">
<div class="card mb-3" style="width: 18rem;">
    <img class="card-img-top" style="width:288px; height:330px" src="<%=   librobygenero.get(i).getPortada()  %>" alt="Card image cap">
  <div class="card-body">
      <h5 class="card-title"><%=   librobygenero.get(i).getTitulo()  %></h5>
      <p class="card-text" style="width:80%;height:200px;overflow:hidden;text-overflow: ellipsis; "><%=   librobygenero.get(i).getSinopsis()  %></p>
    <a href="unlibro?ID=<%=librobygenero.get(i).getId()%>" class="btn btn-primary">saber mas</a>
  </div>
</div>

  </div>
      <%

                        }

                    %>

						</div>


                    
                    
                    
                    

						<div class="col-md-4">

    <%
                       for (int i = librobygenero.size() / 2 ; i < librobygenero.size() ; i++){ 


                    %>
<div data-aos="zoom-in">
<div class="card mb-3" style="width: 18rem;">
    <img class="card-img-top"style="width:288px; height:330px" src="<%=   librobygenero.get(i).getPortada()  %>" alt="Card image cap">
  <div class="card-body">
      <h5 class="card-title"><%=   librobygenero.get(i).getTitulo()  %></h5>
      <p class="card-text" style="width:80%;height:200px;overflow:hidden;text-overflow: ellipsis; "><%=   librobygenero.get(i).getSinopsis()  %></p>
    <a href="unlibro?ID=<%=librobygenero.get(i).getId()%>" class="btn btn-primary">saber mas</a>
  </div>
</div>

      <%

                        }

                    %>

</div>
						</div>



	
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<!--termina cards de libros-->



</article>
      
                    
                    
<footer>
                        
                        <%@include file="footer.jsp" %>
                        
</footer>                    


 		<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>           
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>   
      
        <script type="text/javascript" src="ja/mijava.js" ></script>
         <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
        <script>AOS.init();</script>

</body>
</html>





















  