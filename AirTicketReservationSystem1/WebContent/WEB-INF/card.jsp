<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body
{
	background-image:url("background.jpg");
        background-size:100% 100%;
		align-items: center;

}
fieldset { 
    display: block;
    margin-left: 2px;
    margin-right: 2px;
    padding-top: 0.35em;
    padding-bottom: 0.625em;
    padding-left: 0.75em;
    padding-right: 0.75em;
    border: 2px groove (internal value);
    
}
#r1
{
background-color:red;
color:white;


}
#s1
{
background-color:green;
color:white;

}
a
{
color:white;
text-decoration:none;
}
#f1
{
background-color:blue;
}
#q1
{
font-family:impact;
font-size:30px;
}
span
{
font-family:merienda;
}

</style>
</head>
<body>

<script>
    function payment()
    {
        alert("Payment Succesfull");
        window.location.href = "ticket.jsp";
    }
</script>
</head>
<body>


<fieldset style=" background:white;position:absolute; ">

<legend id="q1"> CARD DETAILS</legend>
<img src="images/cardlogo.jpeg" width="300px">
<form align:center;>
<span>CARD NUMBER</span> <br> <input type="number" placeholder="XXXX XXXX XXXX XXXX" required="required"> <input type="radio">DEBIT CARD  <input type="radio" required="required"> CREDIT CARD<br>
<span>NAME ON CARD</span> <br> <input type="text" placeholder="enter name" pattern="[A-Za-z]{2,12}"  required="required" ><br>
<span>EXPIRY DATE </span> <br>MONTH <select value="month" required="required"> MONTH 
<option> 1</option>
<option> 2</option>
<option> 3</option>
<option> 4</option>
<option> 5</option>
<option> 6</option>
<option> 7</option>
<option> 8</option>
<option> 9</option>
<option> 10</option>
<option> 11</option>
<option> 12</option>
</select>
<span>YEAR </span><select value="YEAR">
<option> 2018</option>
<option> 2019</option>
<option> 2020</option>
<option> 2021</option>
<option> 2022</option>
<option> 2023</option>
<option> 2024</option>
<option> 2025</option>
<option> 2026</option>
<option> 2027</option>
<option> 2028</option>
<option> 2029</option>
<option> 2030</option>
</select>
<br><span>CVV</span>
<br> <input type="password" name="cvv" maxlength="3" placeholder="3 digit secure pin" required="required"> <i>* CVV or CVC is the card security code, unique three digits number on the back of your card separate from its number</i><br><BR>
<button id="r1" href="card.jsp" value="Reset" required="required">RESET</button>
<button id="s1" value="Submit" onclick="payment()" required="required"> SUBMIT</button>

  </form>
</fieldset>




</body>
</html>