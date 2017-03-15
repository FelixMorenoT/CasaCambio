$(function(){
	$("#regU").on("click", function(){
		$("#FormularioUser").validate({
			rules:{
				Correo:{required:true,minlength:3,maxlength:50},
				Nombre:{required:true,minlength:3,maxlength:40},
				User:{required:true,minlength:5},
				Clave:{required:true,minlength:5,maxlength:15}
			},
			messages:{
				Correo:{required:"Campo Obligatorio",minlength:"Minimo 3 Caracteres",maxlength:"Maximo 50 Caracteres"},
				Nombre:{required:"Campo Obligatorio",minlength:"Minimo 3 Caracteres",maxlength:"Maximo 40 Caracteres"},
				User:{required:"Campo Obligatorio",minlength:"Minimo 5 Caracteres"},
				Clave:{required:"Campo Obligatorio",minlength:"Minimo 5 Caracteres",maxlength:"Maximo 10 Caracteres"}
			}
		});
	});
});

$(function(){
	$("#regU").on("click", function(){
		$("#formaConv").validate({
			rules:{
				MontoConvertir:{required:true},
			},
			messages:{
				MontoConvertir:{required:"Campo Obligatorio"},
			}
		});
	});
});