-- borrar db si ya existe y crearla despues

use master 
if exists (select name from master.dbo.sysdatabases where name = 'TPAI')
begin
	alter database TPAI set single_user with rollback immediate
	drop database TPAI
end
create database TPAI

go

-- crear tablas

use TPAI	

create table Articulos (
	id int primary key identity not null,
	nombre varchar(100),
	codigo int,
	descripcion varchar(200),
	marca varchar(100),
	precio float,
	pathFoto varchar(200),
	origen varchar(100)
)

create table Despachos (
	id int primary key identity not null,
	latitud float,
	longitud float,
	activo bit
)

create table OrdenesDespacho (
	id int primary key identity not null,
	id_despacho int,
	estado varchar(100),
	
	constraint fk_ordenesdespacho_despachos foreign key(id_despacho) references Despachos
)

create table Detalles (
	id int primary key identity not null,
	id_articulo int,
	titulo varchar(100),
	descripcion varchar(500),
	
	constraint fk_detalles_articulos foreign key (id_articulo) references Articulos
)

create table Usuarios (
	id int primary key identity not null,
	nombre varchar(100),
	latitud float,
	longitud float
)

create table Ventas (
	id int primary key identity not null,
	fecha datetime,
	portal varchar(100),
	total float,
	longitud float,
	latitud float,
	id_usuario int,
	id_orden_despacho int,

	constraint fk_ventas_usuarios foreign key(id_usuario) references Usuarios,
	constraint fk_ventas_ordenesdespacho foreign key(id_orden_despacho) references OrdenesDespacho
)

create table ItemsArticulo (
	id int primary key identity not null,
	id_articulo int,
	id_venta int,
	cantidad int,
	
	constraint fk_itemsarticulo_ventas foreign key(id_venta) references Ventas,
	constraint fk_itemsarticulo_articulos foreign key(id_articulo) references Articulos
)


-- crear usuario

if exists (select name from master.sys.server_principals where name = 'AIuser')
begin
	drop login AIuser
end
create login AIuser with password = 'AIpassword', check_policy = off
create user AIuser for login AIuser
exec sp_addrolemember 'db_owner', 'AIuser'

go

-- sp auxiliares

create procedure tpai_seleccionartodo as
begin
	declare @nombreTabla varchar(200)
	declare cursorTablas cursor fast_forward
	for select name as nombreTabla from tpai.sys.objects where type = 'U'
	open cursorTablas
	fetch next from cursorTablas into @nombreTabla
	while (@@FETCH_STATUS <> -1)
	begin
		execute ('select ''' + @nombreTabla + ''' as nombre_tabla, * from ' +  @nombretabla)
		fetch next from cursorTablas into @nombretabla
	end
	close cursorTablas
	deallocate cursorTablas
end

go