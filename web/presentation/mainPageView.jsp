<%-- 
    Document   : mainPageView
    Created on : 23/04/2021, 07:35:53 PM
    Author     : David
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang = "es">
    <head>
        <title>Cursos Libres JSP</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="/Proyecto1/CSS/styles-Homepage.css">
    </head>
    <body>
        <div>
            <div class="BarraPricipal">
                <img id="logo" src="/Proyecto1/Img/logoCL.jpg" alt="logo de la pagina">
             </div>
            <div class="BarraPricipal">
                <div class="flexsearch">
                    <div class="flexsearch--wrapper">
                            <form class="flexsearch--form" action="#" method="post">
                                    <div class="flexsearch--input-wrapper">
                                            <input class="flexsearch--input" type="search" placeholder="search">
                                    </div>
                                    <input class="flexsearch--submit" type="submit" value="&#10140;"/>
                            </form>
                    </div>
                </div>
            </div>
        </div>
        <div class="BarraPricipal">
            <a  href=""><img id="logo" src="/Proyecto1/Img/carritoDeCompras.png" alt="carrito de compras"></a>
        </div>
        <div class="BarraPricipal"> 
            <a class="button" href="">Iniciar sesion!!!</a>
        </div>
        <div class="BarraPricipal">
            <a  class="button" href="/Proyecto1/register">Registrarse</a>
        </div>
    </body>
</html>