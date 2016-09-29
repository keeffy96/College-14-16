<html>
<head>
<style>
label:hover, input[type=radio]:checked + label{
  background: #098636; /* #c91e0a; */
  color: #fbfbfb;
}

label{
  background-color: white; 
  cursor: pointer;
  display: inline-block;
  z-index: 99;
}
label {
  height: 31px; 
  font-size: 13px;  
  line-height: 2.55em;  /* Added */
  margin: 0 30px 0 0;
  max-width: 476px;
  min-width: 476px;
  padding: 2px 0 4px 16px;
  width: 476px;
}

body
{
background-image: url('https://cdn.cloudpix.co/images/tumblr-yoga/woman-doing-yoga-wallpaper-849d5545bc01d8928c693da5f68fd54c-large-1169549.jpg');
width:100%;
}

#wrapper {
width:750px;
height:auto;
padding: 50px;
margin-right:100px;
margin-left:px;
margin-top:100px;
margin-bottom:100px;
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
<body>
<div id="wrapper">
<center><font face="Berlin Sans FB" size="6"><u><b>Yoga Position Quiz</b></u></font></center>
<br>
<br>
<form action="Grade1.php" method='post'>
<ol>

<li>
<h3>What position does the image represent (English Name)</h3>
<center><img src="Images/Headstand.png"></center>
<div>
<label for="answerOneA"> <input id="answerOneA" type="radio" name="answerOne" value="A">A) Half Moon Pose</label>
</div>
<div>
<label for="answerOneB"> <input id="answerOneB" type="radio" name="answerOne" value="B">B) Yogic Sleep Pose</label>
</div>
<div>
<label for="answerOneC"> <input id="answerOneC" type="radio" name="answerOne" value="C" >C) Headstand</label>

</div>
</li>
<li>
<h3>What position does the image represent (Sanskrit Name)</h3>
<center><img src="Images/Extended Leg Headstand.png"></center>
<div>
<label for="answerTwoA"> <input id="answerTwoA" type="radio" name="answerTwo" value="A"> A) Utthita Pada Sirsasana </label>
</div>
<div>
<label for="answerTwoB"> <input id="answerTwoB" type="radio" name="answerTwo" value="B">B) Sirsasana</label>
</div>
<div>
<label for="answerTwoC"> <input id="answerTwoC" type="radio" name="answerTwo" value="C">C) Fjuina Numas</label>
</div>
</li>

<li>
<h3>What position does the image represent (English Name)</h3>
<center><img src="Images/Half Moon Pose.png"></center>
<div>
<label for="answerThreeA"> <input id="answerThreeA"type="radio" name="answerThree" value="A"> A) Lunge Pose </label>
</div>
<div>
<label for="answerThreeB"> <input id="answerThreeB" type="radio" name="answerThree" value="B">B) Downward Facing Tree</label>
</div>
<div>
<label for="answerThreeC"> <input id="answerThreeC" type="radio" name="answerThree" value="C">C) Half Moon Pose</label>
</div>
</li>

<li>
<h3>What position does the image represent (Sanskrit Name)</h3>
<center><img src="Images/Yogic Sleep Pose.png"></center>
<div>
<label for="answerFourA"> <input id="answerFourA" type="radio" name="answerFour" value="A">A) Parsva Ustrasana</label>
</div>
<div>
<label for="answerFourB"> <input id="answerFourB" type="radio" name="answerFour" value="B">B) Yoganidrasana</label>
</div>
<div>
<label for="answerFourC"> <input id="answerFourC" type="radio" name="answerFour" value="C">C) Astangasana</label>
</div>
</li>
<li>
<h3>What position does the image represent (English Name)</h3>
<center><img src="Images/Downward Facing Pigeon Pose.png"></center>
<div>
<label for="answerFiveA"><input id="answerFiveA" type="radio" name="answerFive" value="A">A) Downward Facing Pigeon Pose</label>
</div>
<div>
<label for="answerFiveB"><input id="answerFiveB" type="radio" name="answerFive" value="B">B) Downward Facing Tree</label>
</div>
<div>
<label for="answerFiveC"><input id="answerFiveC" type="radio" name="answerFive" value="C">C) Fish Pose</label>
</div>
</li>

<li>
<h3>What position does the image represent (Sanskrit Name)</h3>
<center><img src="Images/Side Crane Pose.png"></center>
<div>
<label for="answerSixA"> <input id="answerSixA" type="radio" name="answerSix" value="A">A) Parsva Bakasana</label>
</div>
<div>
<label for="answerSixB"> <input id="answerSixB" type="radio" name="answerSix" value="B">B) Urdha Virabhadrasana</label>
</div>
<div>
<label for="answerSixC"> <input id="answerSixC" type="radio" name="answerSix" value="C">C) Parivrtta Anjaneyasana</label>
</div>
</li>

<li>
<h3>What position does the image represent (English Name)</h3>
<center><img src="Images/Revolved Lunge Pose.png"></center>
<div>
<label for="answerSevenA"> <input id="answerSevenA" type="radio" name="answerSeven" value="A">A) Revolved Lunge Pose</label>
</div>
<div>
<label for="answerSevenB"> <input id="answerSevenB" type="radio" name="answerSeven" value="B">B) Yogic Sleep Pose</label>
</div>
<div>
<label for="answerSevenC"> <input id="answerSevenC" type="radio" name="answerSeven" value="C">C) Lotus in Cobra Pose</label>
</div>
</li>

<li>
<h3>What position does the image represent (Sanskrit Name)</h3>
<center><img src="Images/Named After A Sage.png"></center>
<div>
<label for="answerEightA"> <input id="answerEightA" type="radio" name="answerEight" value="A">A) Yoganidrasana</label>
</div>
<div>
<label for="answerEightB"> <input id="answerEightB" type="radio" name="answerEight" value="B">B) Koundinyasana</label>
</div>
<div>
<label for="answerEightC"> <input id="answerEightC" type="radio" name="answerEight" value="C">C) Parsva Ustrasana</label>
</div>
</li>

<li>
<h3>What position does the image represent (English Name)</h3>
<center><img src="Images/Pigeon Pose.png"></center>
<div>
<label for="answerNineA"> <input id="answerNineA" type="radio" name="answerNine" value="A">A) Headstand</label>
</div>
<div>
<label for="answerNineB"> <input id="answerNineB" type="radio" name="answerNine" value="B">B) Named After A Sage</label>
</div>
<div>
<label for="answerNineC"> <input id="answerNineC" type="radio" name="answerNine" value="C">C) Pigeon Pose</label>
</div>
</li>

<li>
<h3>What position does the image represent (Sanskrit Name)</h3>
<center><img src="Images/Monkey King Pose.png"></center>
<div>
<label for="answerTenA"> <input id="answerTenA" type="radio" name="answerTen" value="A">A) Hanumanasana</label>
</div>
<div>
<label for="answerTenB"> <input id="answerTenB" type="radio" name="answerTen" value="B">B) Krounchasana</label>
</div>
<div>
<label for="answerTenC"> <input id="answerTenC" type="radio" name="answerTen" value="C">C) Sirasana</label>
</div>
</li>
</ol>
<center><input type="submit" value="Submit Quiz"></center>
</form>
</div>
</body>
</html>
