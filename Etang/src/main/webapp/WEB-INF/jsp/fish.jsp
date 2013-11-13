<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Etang</title>
    </head>
    <body>
        <h1>Poissons</h1>
        <p>
        <form method ="post" action = "FishController.java">
        	<fieldset>
        		<legend>Carpes</legend>
       			<label for="age">Age</label> : <input type="text" name="age" id="age" />
        		<label for="lengthInCms">Length</label> : <input type="text" name="lengthInCms" id="lengthInCms" />
        		<label for="weightInKilo">Weight</label> : <input type="text" name="weightInKilo" id="weightInKilo" />
       		</fieldset>
        </form>
        <input type="submit" value="Envoyer" />
        <p>
     <table>
        <tr>
        	<th>Age</th>
        	<th>Length</th>
        	<th>Weight</th>
        </tr>
       	<tr>
       		<td>3</td>
       		<td>30</td>
       		<td>0.6</td>
       	</tr>
       	<tr>
       		<td>12</td>
       		<td>45</td>
       		<td>6</td>
       	</tr>
       	<tr>
       		<td>9</td>
       		<td>39</td>
       		<td>4</td>
       	</tr>
    </table>
    </body>
</html>
