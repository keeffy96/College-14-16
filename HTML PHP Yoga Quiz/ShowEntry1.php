<html>
<head>
<style>
input[type=submit] {
    font-family: Berlin Sans FB;
    color: black;
    font-weight: bold; 
    text-align: center;  
    height: 30px;
    width: 500px; 
    background:#ccc; 
    border:0 none;
    cursor:pointer;
    border-radius: 5px; 
}

div
{
padding:60px 25px;
background-image: url('https://cdn.cloudpix.co/images/tumblr-yoga/woman-doing-yoga-wallpaper-849d5545bc01d8928c693da5f68fd54c-large-1169549.jpg');
height: 100%;
}

table
{
border-collapse: collapse;
border-color: white;
table-layout: fixed;
text-align: center;
width:100%;
}

table th
{
padding: 15px;
overflow: hidden;
text-align: center;
color: black;
border-color: black;
background-color: white;
}

table td
{
color: black;
border-color: black;
background-color: white;
text-align: center;
vertical-align: top;
}

</style>
</head>
<body>
<div>
<?php
$con = mysql_connect("localhost","se215088","password");
if(!$con){
die("Can not connect: ". mysql_error());
}

mysql_select_db("Quiz",$con);
$sql = "SELECT * FROM Quiz1";
$myData = mysql_query($sql,$con);
echo "<table border=1 width=100%
<tr>
<th>Attempt</th>
<th>Q1</th>
<th>Q2</th>
<th>Q3</th>
<th>Q4</th>
<th>Q5</th>
<th>Q6</th>
<th>Q7</th>
<th>Q8</th>
<th>Q9</th>
<th>Q10</th>
</tr>";

while($record = mysql_fetch_array($myData)){
echo "<tr> ";
echo "<td>" . $record['Attempt'] . "</td>";
echo "<td>" . $record['answerOne'] . "</td>";
echo "<td>" . $record['answerTwo'] . "</td>";
echo "<td>" . $record['answerThree'] . "</td>";
echo "<td>" . $record['answerFour'] . "</td>";
echo "<td>" . $record['answerFive'] . "</td>";
echo "<td>" . $record['answerSix'] . "</td>";
echo "<td>" . $record['answerSeven'] . "</td>";
echo "<td>" . $record['answerEight'] . "</td>";
echo "<td>" . $record['answerNine'] . "</td>";
echo "<td>" . $record['answerTen'] . "</td>";
echo "</tr>";
}
echo "</table>";

mysql_close($con);

?>
<form action="Quiz1.php" method="post">
     <br>
    <center><input type="submit" value="Reattempt Quiz">
</form></center>

<form action="Enter.php" method="post">
     <br>
    <center><input type="submit" value="Return to Main Menu">
</form></center>


</div>
</body>
</html>
