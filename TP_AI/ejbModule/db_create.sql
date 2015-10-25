-- borrar db si ya existe y crearla despues

use master 
if exists (select name from master.dbo.sysdatabases where name = 'TPAI')
begin
	alter database TPAI set single_user with rollback immediate
	drop database TPAI
end
create database TPAI

go

-- crear usuario

use TPAI

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