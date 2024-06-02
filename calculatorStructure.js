var display = document.getElementById("display");

function add(param) {
    display.value += param;
}

function clearDisplay() {
    display.value = "";
}

function calculate() {
    try {
        display.value = eval(display.value);
    }
    catch (err) {
        alert("Invalid: " + err.message)
        display.value = "Error";
    }
}
