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

$(function(){
	$("#regU").on("click", function(){
		$("#FormularioUser").validate({
			rules:{
				Correo:{required:true},
                                Nombre:{required:true},
                                User:{required:true},
                                Clave:{required:true}
			},
			messages:{
				Correo:{required:"Campo Obligatorio"},
                                Nombre:{required:"Campo Obligatorio"},
                                User:{required:"Campo Obligatorio"},
                                Clave:{required:"Campo Obligatorio"},

			}
		});
	});
});

$(function(){
	$("#regU").on("click", function(){
		$("#formuRegistro").validate({
			rules:{
				User:{required:true},
                                Clave:{required:true},

			},
			messages:{
				User:{required:"Campo Obligatorio"},
                                Clave:{required:"Campo Obligatorio"}

			}
		});
	});
});


