const baseURL = 'http://localhost:8080';

async function createTeam() {
    const data = {
        name: $('#teamName').val(),
    }
    const responseJson = await fetch(
        baseURL + `/api/team/create`,
        {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(data)
        });
    const response = await responseJson.json();
    $("#createTeamDialog").hide()
}


function openDialog() {
    $("#createTeamDialog").show()
}


function closeDialog() {
    $("#createTeamDialog").hide()
}