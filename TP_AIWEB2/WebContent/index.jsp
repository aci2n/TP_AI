<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Modulo Logística y Monitoreo</title>

 <!-- Bootstrap Core CSS -->
 <link href="css/bootstrap.min.css" rel="stylesheet">

 <!-- Custom CSS -->
 <link href="css/simple-sidebar.css" rel="stylesheet">

<!-- Icons Bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">


</head>
<body>

	<!-- Header -->
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#"> Logística y Monitoreo </a>
			</div>
			<div class="navbar-form navbar-left">
				<button id="menu-toggle" class="btn btn-default">Menú</button>
			</div>
		</div>
	</nav>
	<!-- /Header -->

	<div id="wrapper">

		<!-- Sidebar -->
		<div id="sidebar-wrapper">
			<ul class="sidebar-nav">
				<li class="sidebar-brand"><a><i class="glyphicon glyphicon-dashboard"></i> Dashboard </a></li>
				<li><a href="#"><i class="glyphicon glyphicon-briefcase"></i> Asignación de Despacho</a></li>
				<li><a href="#"><i class="glyphicon glyphicon-signal"></i> Ranking Best Sellers</a></li>
				<li><a href="#"><i class="glyphicon glyphicon-list"></i> Listado de Ventas</a></li>
				<li><a href="#"><i class="glyphicon glyphicon-stats"></i> Reportes</a></li>
				<li><a href="#"><i class="glyphicon glyphicon-envelope"></i> Listado de Informes</a></li>
				 
			</ul>
		</div>
		<!-- /Sidebar -->

		<!-- Contenido -->
		<div id="page-content-wrapper" >
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<div id="contenido" class="">
							
							 <a href="#"><strong><i class="glyphicon glyphicon-briefcase"></i> Asignaciòn de Despacho</strong></a>
           					 <hr>
								
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- /Contenido -->	
	</div>

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap  -->
    <script src="js/bootstrap.min.js"></script>

    
    <script>

    <!-- Menu Toggle Script -->
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });

    $("#menu_principal").click(function() {
		$("#myTable").empty();
	});
   
    </script>

</body>

</html>
