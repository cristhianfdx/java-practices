document.addEventListener('DOMContentLoaded', ()=>{
    getStudents();
});



document.getElementById("frm_students").addEventListener('submit', async function(evt){
    
    evt.preventDefault();
    
    let student = {
        name: document.getElementById('name').value,
        lastname: document.getElementById('lastname').value,
        document_number: document.getElementById('document_number').value,
        password: document.getElementById('password').value,
    }

    try {
        const response = await fetch('./students', {
            method: 'POST',
            body: JSON.stringify(student),
            headers: {
                'Content-Type': 'application/json'
            }
        });

        const data = await response.json();
        console.log(data);
        
        clearForm();
        getStudents();

    } catch (error) {
        console.error(error);
    }

    
});

async function getStudents(){
    let template = "";

    const response = await fetch('./students');
    const data = await response.json();

    data.forEach(student=> {
        template += `
            <tr id_student="${student.idStudent}">
                <td>${student.nameStudent}</td>
                <td>${student.lastnameStudent}</td>
                <td>${student.documentNumberStudent}</td>
            </tr>
        `;
     });

    document.querySelector("#students_data").innerHTML = template;

}

function clearForm(){
    document.getElementById("frm_students").reset();
}
