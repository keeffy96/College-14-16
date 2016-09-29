<html>
<head>
<style>
body
{
background-image: url('http://namooyoga.com/wp-content/uploads/2015/12/yoga-free.jpg');
width:100%;
}

#wrapper {
width:950px;
height:auto;
padding: 13px;
margin-right:auto;
margin-left:auto;
background-color:#fff;
}

input[type=submit] {
    font-family: Berlin Sans FB;
    color: black;
    font-weight: bold; 
    text-align: center;  
    height: 50px;
    width: 800px; 
    background:#ccc; 
    border:0 none;
    cursor:pointer;
    border-radius: 10px; 
}
</style>
</head>
<body bgcolor="#e1e1e1">
<div id="wrapper">
<center><font face="Berlin Sans FB" size="10">Well Done!</font></center>
<br />
<br />
<?php
error_reporting(0);

$con = mysql_connect("localhost","se215088","password");
if(!$con){
die("Can not connect: ". mysql_error());
}

mysql_select_db("Quiz",$con);

$sql = "INSERT INTO Quiz1(answerOne,answerTwo,answerThree,answerFour,answerFive,answerSix,answerSeven,answerEight,answerNine,answerTen) VALUES ('$_POST[answerOne]','$_POST[answerTwo]','$_POST[answerThree]','$_POST[answerFour]','$_POST[answerFive]','$_POST[answerSix]','$_POST[answerSeven]','$_POST[answerEight]','$_POST[answerNine]','$_POST[answerTen]')";

mysql_query($sql,$con);

mysql_close($con);

ini_set('display_errors', 1);
ini_set('error_reporting', E_ERROR);

$answer1= $_POST['answerOne'];
$answer2= $_POST['answerTwo'];
$answer3= $_POST['answerThree'];
$answer4= $_POST['answerFour'];
$answer5= $_POST['answerFive'];
$answer6= $_POST['answerSix'];
$answer7= $_POST['answerSeven'];
$answer8= $_POST['answerEight'];
$answer9= $_POST['answerNine'];
$answer10= $_POST['answerTen'];

$score = 0;
if ($answer1 == "C"){$score++;}
if ($answer2 == "A"){$score++;}
if ($answer3 == "C"){$score++;}
if ($answer4 == "B"){$score++;}
if ($answer5 == "A"){$score++;}
if ($answer6 == "A"){$score++;}
if ($answer7 == "A"){$score++;}
if ($answer8 == "B"){$score++;}
if ($answer9 == "C"){$score++;}
if ($answer10 == "A"){$score++;}

echo "<center><font face='Berlin Sans FB' size='6'>Your Score is <br> $score/10</font></center>";
?>
<form action="Quiz1.php" method="post">
     <br>
    <center><input type="submit" value="Reattempt Quiz">
</form></center>

<form action="Enter.php" method="post">
     <br>
    <center><input type="submit" value="Return to Main Menu">
</form></center>

<form action="ShowEntry1.php" method="post">
     <br>
    <center><input type="submit" value="Show Previous Attempts">
</form>


</div>
</body>
</html>
