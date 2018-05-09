function trimming()
{
    var str = document.URL;
    var res = str.substr(33, str.indexOf('&'));
    console.log(res);
}

function getUserName(input)
{
    return input.split("username=")[1].split("$")[0];
}

function getPassword(input)
{
    return input.split("password=")[1];
}

function functie()
{
    var qwerty = $('#username').val();
    var qwerty2 = $('#password').val();

    console.log("USERNAME: " + qwerty);
    console.log("PASSWORD: " + qwerty2);

    if(qwerty == "doctor" && qwerty2 == "doctor")
    {
        console.log("aici");
        return "http://localhost:8080/doctor";
    }
}

$(document).ready(function()
{
   $(document).on ('click', '.classToClick', function()
       {
           var qwerty = $('#username').val();
           var qwerty2 = $('#password').val();

           console.log("USERNAME: " + qwerty);
           console.log("PASSWORD: " + qwerty2);

           if(qwerty === "doctor" && qwerty2 === "doctor")
           {
               console.log("GOING TO THE DOCTOR");
               //window.location.replace("http://localhost:8080/doctor");
               //$(location).attr('href',"http://localhost:8080/doctor");
               window.location = "http://localhost:8080/doctor";
           }

           if(qwerty === "donator" && qwerty2 === "donator")
           {
               console.log("GOING TO THE PACIENT");

               window.location = "http://localhost:8080/donator";
           }

           if(qwerty === "personal" && qwerty2 === "personal")
           {
               console.log("GOING TO THE ASISTENT");

               window.location = "http://localhost:8080/personal";
           }
       });
});