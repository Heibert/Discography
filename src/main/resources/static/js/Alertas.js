function alertaBorrar(e,id,cont){
	e.preventDefault();
	console.log(cont);
    Swal.fire({
        title: '¿Realmente quiere eliminarlo?',
        text: "Es una accion permanente",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'BORRAR',
        cancelButtonText: "Cancelar",
	}).then((result) => {
        if (result.isConfirmed){
			ruta=cont+"?accion=eliminar&id="+id;
			console.log(ruta);
			window.setTimeout(function(){window.location.href = ruta},1500);
			Swal.fire({
                position: 'top-end',
                icon: 'success',
                title: 'El registro ha sido borrado',
                showConfirmButton: false,
                timer: 1500
			})
            } 
        else {Swal.fire(
					'Cancelado', 
					'Cancelaste la eliminacion',
					'error');}
	});
};