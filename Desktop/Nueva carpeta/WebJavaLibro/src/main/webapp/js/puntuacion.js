
let btn_uno = document.getElementById("fav_1");
let btn_dos = document.getElementById("fav_2");
let btn_tres = document.getElementById("fav_3");
let btn_cuatro = document.getElementById("fav_4");
let btn_cinco = document.getElementById("fav_5");

btn_uno.addEventListener('click',favoritos);
btn_dos.addEventListener('click',favoritos);
btn_tres.addEventListener('click',favoritos);
btn_cuatro.addEventListener('click',favoritos);
btn_cinco.addEventListener('click',favoritos);




function favoritos( )   {

         

    //let parametro = (new URL(document.location)).searchParams;
    
   // let id = parametro.get("id_algo");
    
    
    
    var id_punt = this.value;
    
    
    
    let params   = (new URL(document.location)).searchParams;
    let id = params.get("ID");
    
    
     alert("gracias por votar");
    fetch('unlibro?accion='+id_punt+'&id_libro='+id, {
        
                              method : 'post',
                               headers: new Headers()
                                }
            

            
            );



}





