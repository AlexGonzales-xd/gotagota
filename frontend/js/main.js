document.addEventListener('DOMContentLoaded', () => {
    alert("Bienvenido a Gotagota");
    fetch('http://localhost:8080/api/clientes')
        .then(response => response.json())
        .then(data => {
            console.log('Data:', data);
            const elemento = document.getElementById("tabla-clientes");
            data.forEach(cliente => {
                const row = document.createElement("tr");
                row.innerHTML = `
                    <td>${cliente.id}</td>
                    <td>${cliente.nombre}</td>
                    <td>${cliente.email}</td>
                `;
                elemento.appendChild(row);
            });
      
            
        });
});