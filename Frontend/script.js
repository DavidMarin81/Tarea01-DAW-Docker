const apiUrl = 'http://localhost:8080/calculadora';

function fetchResult(endpoint, sum1, sum2) {
    return fetch(`${apiUrl}/${endpoint}?sum1=${sum1}&sum2=${sum2}`, {
        method: 'POST',
    })
    .then(response => {
        if (!response.ok) throw new Error('Network response was not ok');
        return response.text(); // Leer la respuesta como texto
    })
    .then(result => parseFloat(result)) // Convertir el texto en número flotante
    .catch(error => console.error('Error:', error));
}

function mostrarResultado(result) {
    document.getElementById('resultado').textContent = result;
}

function sumar() {
    const sum1 = parseFloat(document.getElementById('sum1').value);
    const sum2 = parseFloat(document.getElementById('sum2').value);
    fetchResult('sumar', sum1, sum2).then(result => mostrarResultado(result));
}

function restar() {
    const sum1 = parseFloat(document.getElementById('sum1').value);
    const sum2 = parseFloat(document.getElementById('sum2').value);
    fetchResult('restar', sum1, sum2).then(result => mostrarResultado(result));
}

function multiplicar() {
    const sum1 = parseFloat(document.getElementById('sum1').value);
    const sum2 = parseFloat(document.getElementById('sum2').value);
    fetchResult('multiplicar', sum1, sum2).then(result => mostrarResultado(result));
}

function dividir() {
    const sum1 = parseFloat(document.getElementById('sum1').value);
    const sum2 = parseFloat(document.getElementById('sum2').value);

    // Verificar si sum2 es 0 para evitar la división por cero
    if (sum2 === 0) {
        alert("No se puede dividir por 0");
        return; // Detiene la ejecución si sum2 es 0
    }

    // Si la validación pasa, realiza la solicitud
    fetchResult('dividir', sum1, sum2).then(result => mostrarResultado(result));
}
