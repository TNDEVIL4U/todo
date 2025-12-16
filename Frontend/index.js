let task = [];
let addbtn = document.getElementById("create");
let deletebtn = document.getElementById("delete");
let display = document.getElementById("display");
addbtn.addEventListener("click",e=>{

    e.preventDefault();

    let inputTask= document.getElementById("task").value.trim();

    if(inputTask == "")
    {
        alert("Task can't be empty");
        return;
    }
    let i = task.indexOf(inputTask);
    if(i == -1) {
        task.push(inputTask);
        let childNode = document.createElement("li");
        childNode.textContent = inputTask;
        display.appendChild(childNode);
        alert(`Task ${inputTask} Added successfully`);
    }
    else
    {
        alert("Task already exist");
    }
    document.getElementById("task").value = "";
})

deletebtn.addEventListener("click",(e)=>{

    e.preventDefault();
    let inputTask = document.getElementById("task").value.trim();

    if(inputTask == "")
    {
        alert("Task can't be empty");
        return;
    }

    let i = task.indexOf(inputTask);
    if(i != -1)
    {
        task.splice(i,1);
        let items = document.getElementsByTagName("li");
        for(let item of items)
        {
            if(item.textContent === inputTask)
            {
                display.removeChild(item);
                break;
            }
        }
        alert(`Task ${inputTask} deleted successfully`);
    }
    else{
        alert("No such task exists");
    }

    document.getElementById("task").value="";
})
