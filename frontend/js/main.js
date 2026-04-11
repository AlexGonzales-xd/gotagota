// EVENTOS EN JAVASCRIPT (CLICK, CARGAR, KEY,)
document.addEventListener("DOMContentLoaded", () => {
    fetch('http://localhost:8080/api/clientes')
        .then(response => response.json())
        .then(data => {
            const elemento = document.getElementById("table-cliente")

            for (let i = 0; i < data.length; i++) {
                const cliente = data[i]
                const row = document.createElement("tr")
                row.innerHTML = `
                    <td>${cliente.id}</td>
                    <td>${cliente.nombre}</td>
                    <td>${cliente.apellido}</td>
                    <td>${cliente.dni}</td>
                    <td>${cliente.telefono}</td>
                    <td>${cliente.direccion}</td>
                    <td>
                    <button class="btn btn-outline-primary">
                    <i class="fas fa-edit"></i> Editar
                    </button>

                    <button class="btn btn-outline-danger">
                        <i class="fas fa-trash-alt"></i> Eliminar
                    </button> 
                </td>
                `
                elemento.appendChild(row)
            }



        })
});
