/*
	Johan Marulanda
	
	CONSIDERACIONES:
	Se supone que laas tablas ya están creadasd
	Existe un método llamado DATEADD cual me añade la cantidad de dias que le pase a la fecha si le indico que lo añada en el dia
	DATENAME(DW, @fecha_pago) el cual me retorna el nombre del dia de la fecha que le entrego
*/	

CREATE PROCEDURE spCalcularFechaHabil @fecha_dada date output, @dia_habil int
AS

	DECLARE
	@dias_habiles int = @dia_habil,
	@fecha_pago date =  @fecha_dada
	/* @nombre_dia = DATENAME(weekday, @fecha_pago) */

	SET Language 'Spanish';

	FOR i REVERSE 1..dia_habil
	LOOP
		
		set @fecha_pago = DATEADD(DAY,IFF((DATENAME(weekday, @fecha_pago) = (SELECT descripcion
					FROM  dParametrosContabilidad.tbDiasNohabilesPagos
					WHERE Numero_Dia = 6)) OR (DATENAME(weekday, @fecha_pago) = (SELECT descripcion
					FROM  dParametrosContabilidad.tbDiasNohabilesPagos
					WHERE Numero_Dia = 7)) 1, 0), @fecha_pago);			
		
		
	END LOOP

	select @fecha_dada = @fecha_pago


GO;
