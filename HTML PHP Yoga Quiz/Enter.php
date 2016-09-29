<html>
<head>
<style>
body
{
background-image: url('https://cdn.cloudpix.co/images/tumblr-yoga/woman-doing-yoga-wallpaper-849d5545bc01d8928c693da5f68fd54c-large-1169549.jpg');
width:100%;
}

input[type=submit] {
    font-family: Berlin Sans FB;
    color: black;
    font-weight: bold; 
    text-align: center;  
    height: 100px;
    width: 220px; 
    background:#ccc; 
    border:0 none;
    cursor:pointer;
    border-radius: 5px; 
}
</style>

<script>

function setCookie(cname,cvalue,exdays) {
    var d = new Date();
    d.setTime(d.getTime() + (exdays*24*60*60*1000));
    var expires = "expires=" + d.toGMTString();
    document.cookie = cname+"="+cvalue+"; "+expires;
}

function getCookie(cname) {
    var name = cname + "=";
    var ca = document.cookie.split(';');
    for(var i=0; i<ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0)==' ') {
            c = c.substring(1);
        }
        if (c.indexOf(name) == 0) {
            return c.substring(name.length, c.length);
        }
    }
    return "";
}

function checkCookie() {
    var user=getCookie("username");
    if (user != "") {
        alert("Welcome again " + user);
    } else {
       user = prompt("Please enter your name:","");
       if (user != "" && user != null) {
           setCookie("username", user, 30);
       }
    }
}

</script>
</head>
<body onload="checkCookie()">
<center><font face="Berlin Sans FB" size="8"'><b>Yoga Position Quiz</b></font></center>
<br><br><br>
<center><font face="Berlin Sans FB" size="4"'><b>Please choose Quiz to take:</b></font></center>



<form action="Quiz1.php" method='post'>
<center><input type="submit" value="Quiz1">
</form></center>

<form action="Quiz2.php" method='post'>
<center><input type="submit" value="Quiz2">
</form></center>

</div>
</body>
</html>
