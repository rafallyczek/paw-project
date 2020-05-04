//Wyświetl okno z danymi dnia
function modal(i){
    var modal = document.getElementById("modal"+i);

    modal.style.display = "block";

    window.onclick = function () {
        if(event.target == modal){
            modal.style.display = "none";
        }
    }
}
//Schowaj info i wyświetl dodawanie
function showAddForm(i){
    var info = document.getElementById("info"+i);
    var addForm = document.getElementById("addForm"+i)

    info.style.display = "none";
    addForm.style.display = "block";
}
//Schowaj dodawanie i wyświetl info
function showInfo(i){
    var info = document.getElementById("info"+i);
    var addForm = document.getElementById("addForm"+i)

    addForm.style.display = "none";
    info.style.display = "block";
}