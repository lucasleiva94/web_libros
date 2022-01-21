






  <img style="height: 300px" src="https://i.ibb.co/vkdmtyw/imagen1.jpg" class="card-img" alt="...">



<!--nav-->
<div class="container-fluid negro  p-2">
  <div class="row">
    <div class="col-md-12">
      <ul class="nav">
        <li class="nav-item">


   <!-- inicio Modal -->       
   
   <% if (user == null) {
         
       
       
       %>

   <!-- Modal inicio de sesion -->
 <!-- Button trigger modal -->
<button type="button" class="btn btn-primary mr-3" data-toggle="modal" data-target="#exampleModal">
  iniciar sesión
</button>


<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">complete los campos</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        

<!-- formulario inicio sesion -->

<form  action="Login" method="get" >
  <div class="form-group row">
    <label for="mail_modal" class="col-4 col-form-label">Nick</label> 
    <div class="col-8">
      <input  id="mail" name="mail_modal" placeholder="Ingrese su nick" type="text" required="required" class="form-control">
    </div>
  </div>
  <div class="form-group row">
    <label for="contraseña_modal" class="col-4 col-form-label">Contraseña</label> 
    <div class="col-8">
      <input style="width:130px" id="contra_modal" name="contra_modal" placeholder="ingrese su contraseña" type="password" required="required" class="form-control">
    </div>
  </div> 
  <div class="form-group row">
    <div class="offset-4 col-8">
      <button  name="submit_login" type="submit" class="btn btn-primary">iniciar sesion</button>
    </div>
  </div>
</form>

<!-- fin formulario inicio sesion -->



      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        
      </div>
    </div>
  </div>
</div>
       

<!-- fin modal inicio sesion -->

       <%
       }
   %>  
   
        <li class="nav-item">
          



   <% if (user == null) {
         
       
       
       %>
<!-- Modal crear cuenta -->
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#staticBackdrop">
  crear cuenta
</button>

<!-- Modal -->
<div class="modal fade" id="staticBackdrop" data-backdrop="static" tabindex="-1" role="dialog" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="staticBackdropLabel">complete los campos</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">

          
<!-- formulario creacion cuenta-->

<form action="index.html" method="post">
    
  <div class="form-group row">
    <label for="nombre_modal" class="col-4 col-form-label">nombre</label> 
    <div class="col-8">
      <input id="nombre_modal" name="nombre_modal" placeholder="ingrese su nombre" type="text" required="required" class="form-control">
    </div>
  </div>
    
  <div class="form-group row">
    <label for="apellido_modal" class="col-4 col-form-label">apellido</label> 
    <div class="col-8">
      <input id="apellido_modal" name="apellido_modal" placeholder="ingrese su apellido" type="text" required="required" class="form-control">
    </div>
  </div>
    
  <div class="form-group row">
    <label for="mail_modal" class="col-4 col-form-label">mail</label> 
    <div class="col-8">
      <input style="width:200px" id="mail_modal" name="mail_modal" placeholder="usuario@ejemplo.com" type="email" class="form-control" required="required">
    </div>
  </div>
    

  <div class="form-group row">
    <label for="nick_modal" class="col-4 col-form-label">nick</label> 
    <div class="col-8">
      <input id="nick_modal" name="nick_modal" placeholder="ingrese su nick" type="text" required="required" class="form-control">
    </div>
  </div> 
    
      <div class="form-group row">
    <label for="contra_modal" class="col-4 col-form-label">contraseña</label> 
    <div class="col-8">
      <input id="contra_modal" name="contra_modal" placeholder="ingrese su contraseña" type="text" required="required" class="form-control">
    </div>
  </div>  
    
    
  <div class="form-group row">
    <div class="offset-4 col-8">
      <button name="submit" type="submit" class="btn btn-primary">crear cuenta</button>
    </div>
  </div>
    
</form>

<!-- formulario creacion cuenta-->



        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        
      </div>
    </div>
  </div>
</div>
       <%
       }
   %>  

   


        </li>
        

        <li >
 
          <div >
              
 <a href="index.html" style="text-decoration:none;color:white; ">
     
      <button  class="btn btn-primary ml-5" action="inicio">
          
         
          <i class="fas fa-home"></i>
       volver
      
      
      
      </button>
      
  
      
</a> 
          </div> 

            </li>

        
        
        
        
        
        
        
        
        
        
        
        
     
   <% if (user != null) {
         
       
       
       %>
  

        <li>
          <div >
              
           
              
              
              
   
      <form class="d-flex ml-5 " action="busqueda" method="get" class="form-inline my-2 my-lg-0">
                
      <input class="ml-3" name="nombre" class="form-control mr-sm-2" type="text" placeholder="Buscar..." aria-label="Search">
      
      
      
      <button  class="btn btn-info my-2 my-sm-0 ml-3" type="submit">
          
          <i class="fas fa-search"></i>
          Buscar
      
      
      
      </button>
      
            </form>
          </div> 
            
            
            
            
            
 

        </li>
              <%
       }else {


%>


        <li>
            <div  >
              
             
   
      <form class="d-flex" action="busqueda" method="get" class="form-inline my-2 my-lg-0">
                
      <input class=" ml-3 " name="nombre" class="form-control mr-sm-2" type="text" placeholder="Buscar..." aria-label="Search">
      
      <button  class="btn btn-info my-2 my-sm-0 ml-3" type="submit">
          
          
          <i class="fas fa-search"></i>
          Buscar
      
      
      
      </button>
      
            </form>
          </div> 
            
 

        </li>

<%
}
   %>  

        
   
   
   
   
   
   
   
   
   
   
 

            
            
        
        
        
        
        
        
        
        <% if (user != null) {
         
       
       
       %>   

       
       
       
        <li class="nav-item dropdown ml-md-auto">
           <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown">cuenta</a>
          <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
             <a class="dropdown-item" href="index.html">Ir al inicio</a>
             
             <a class="dropdown-item" href="subir">subir un libro</a>
            <div class="dropdown-divider">
                
            </div> 
             
              
              
             <a  class="dropdown-item" href="logout">Salir</a>
            
          </div>
        </li>
        
             <%
       }
   %>  
 
        
        
      </ul>
    </div>
  </div>
</div>