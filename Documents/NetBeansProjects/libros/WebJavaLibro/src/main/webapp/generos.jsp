


<!-- empieza genero -->

</head>
<body>
    
    
<div id="cont-catalogo" class="container-fluid hidden">
	<div class="row">
		<div class="col-md-12">


<div class="row">
    
    
    
    <!--barra de navegacion izquierda generos-->
    <div class="col-sm-3">
    
    
        
        
        
        <div id="global" class="ml-3">
            
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
        
        <!--fin barra de navegacion izquierda generos-->
        
        
        
        
    
    
    </div>
    
    
    

     <div class="col-sm-4">
        
<%

for (int i =0; i < (generos.size() / 2 ); i++){
      
     
       %>
                    

<!-- empieza card -->
    
 

    <!-- normal -->
    <div class="ih-item square effect7"><a href="librogenero?ID=<%= generos.get(i).getGenero_id() %>" >
        <div class="img"><img style="height: 200px;width: 300px" src="<%=  generos.get(i).getImagen_genero() %> " alt="img"></div>
        <div class="info">
          <h3><%=  generos.get(i).getNombre_genero() %></h3>
          
        </div></a></div>
    <!-- end normal -->

       <%

                        }

                    %>


 
 
                    </div>

<!-- termina card -->


     <div class="col-sm-4">
         
    <%
                       for (int i = generos.size() / 2 ; i < generos.size() ; i++){ 


                    %>
                    

<!-- empieza card -->
    
 
 
    <!-- normal -->
    <div class="ih-item square effect7"><a href="librogenero?ID=<%= generos.get(i).getGenero_id() %>">
            <div class="img"><img style="height: 200px;width: 300px" src="<%=  generos.get(i).getImagen_genero()  %> " alt="img"></div>
        
        
        <div class="info">
            
          <h3> <%=  generos.get(i).getNombre_genero()   %>   </h3>
          
          
          
        </div></a></div>
    <!-- end normal -->
	

       <%

                        }

                    %>


 
  </div>

 <!-- termina card -->




</div>


		</div>
	</div>
</div>




<!-- termina -->


