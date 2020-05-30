
<%@page import="com.Lucas.webJabalibro.model.entities.Libro"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
    
    ArrayList<Libro> librosbynombre = (ArrayList<Libro>) request.getAttribute("librosbynombre");


    
   String nombre = request.getParameter("nombre");
  

    String user = (String)request.getAttribute("user");
   
%>


<!DOCTYPE html>
<html>
<head>
	<title></title>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
	
	<link rel="stylesheet" type="text/css" href="css/miestilo.css">
	<link rel="stylesheet" type="text/css" href="css/ihover.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css" integrity="sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf" crossorigin="anonymous">
        <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">


</head>
<body>


<header>  
    
    
<%@include file="header.jsp" %>


             </header>





<article>   

<div class="containe-fluid mt-5" style="text-align:center;">

<!--titulo-->

<h2 >
	busqueda de libros por titulo: "<%=nombre%>" 
		</h2>


</div>


<!--fin titulo-->



<!--tarjetas de libros-->

















<div class="container-fluid mt-5">
	<div class="row">
		<div class="col-md-12">
			<div class="row">
				<div class="col-md-3">
				</div>



				
				<div class="col-md-9">
					<div class="row">


						<!--card 1 -->
                                            <div class="col-md-4" >
                                                  
   
     <%

if (librosbynombre.size() == 0){
         
%> 
              
<h3 style="margin-bottom: 150px;color:#237DD9">no se encontro ningun libro que contenga en el nombre "<%= nombre %> " <i class="far fa-frown-open"></i></h3>



          <%
    
         }

else if (librosbynombre.size() >1){


                   for (int i =0; i < (librosbynombre.size() / 2 ); i++){;
                   
                   
                          %>                                           
                                                
<div data-aos="zoom-in">
<div class="card mb-3" style="width: 18rem;">
    <img class="card-img-top" style="width:288px; height:330px" src="<%=   librosbynombre.get(i).getPortada()  %>" alt="Card image cap">
  <div class="card-body">
      <h5 class="card-title"><%=   librosbynombre.get(i).getTitulo()  %></h5>
      <p class="card-text" style="width:80%;height:200px;overflow:hidden;text-overflow: ellipsis; "><%=   librosbynombre.get(i).getSinopsis()  %></p>
    <a href="unlibro?ID=<%=librosbynombre.get(i).getId()%>" class="btn btn-primary">saber mas</a>
  </div>
</div>
  </div>
  
      <%
                   }

              }else  
                      // aca poner otro else if
                       {
%>
           
  
  <div data-aos="zoom-in">
  <div class="card mb-3" style="width: 18rem;">
    <img class="card-img-top" style="width:288px; height:330px" src="<%=   librosbynombre.get(0).getPortada()  %>" alt="Card image cap">
  <div class="card-body">
      <h5 class="card-title"><%=   librosbynombre.get(0).getTitulo()  %></h5>
      <p class="card-text" style="width:80%;height:200px;overflow:hidden;text-overflow: ellipsis; "><%=   librosbynombre.get(0).getSinopsis()  %></p>
    <a href="unlibro?ID=<%=librosbynombre.get(0).getId()%>" class="btn btn-primary">saber mas</a>
  </div>
</div>

</div>

      <%

                        }

                    %>

						</div>


			<!--fin card 1 -->



		    <!--card 2 -->
	                                            <div class="col-md-4" >

                                                    
  
 <%
if (librosbynombre.size() >1){



              for (int i = (librosbynombre.size() / 2 ); i < (librosbynombre.size() ); i++){;
     
     %> 
     <div data-aos="zoom-in">
           <div class="card mb-3" style="width: 18rem;">
    <img class="card-img-top" style="width:288px; height:330px" src="<%=   librosbynombre.get(i).getPortada()  %>" alt="Card image cap">
  <div class="card-body">
      <h5 class="card-title"><%=   librosbynombre.get(i).getTitulo()  %></h5>
      <p class="card-text" style="width:80%;height:200px;overflow:hidden;text-overflow: ellipsis; "><%=   librosbynombre.get(i).getSinopsis()  %></p>
    <a href="unlibro?ID=<%=librosbynombre.get(i).getId()%>" class="btn btn-primary">saber mas</a>
  </div>
</div>

     </div> 
     
      <%        
     }

}       
         %>          
                 
                  
                  
                   
    

						</div>

       <!--fin card 2 -->



					</div>
				</div>
			</div>
		</div>
	</div>
</div>









<!--fin tarjetas de libros-->








             </article>

                    
                    

<footer>
	    

<%@include file="footer.jsp" %>


             </footer>


        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>           
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script> 
        <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
        <script>AOS.init();</script>

</body>
</html>