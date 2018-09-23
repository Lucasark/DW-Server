function submeterDados() {
	var peso = document.getElementById("peso");
	var altura = document.getElementById("altura");
	var imc = peso.value / (altura.value * altura.value);
	alert("IMC >>>>>>>>" + imc);
}