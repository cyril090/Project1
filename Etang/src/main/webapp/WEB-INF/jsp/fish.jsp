
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Etang</title>
    </head>
    <body>
        <h1>Poissons</h1>
        <p>
        <form method="post" action="/fishes/carp.html"><!-- TODO action is the url to use FishController.java -->
        	<fieldset>
        		<legend>Carpes</legend>
       			<label for="age">Age</label> : <input type="text" name="age" id="age" />
        		<label for="lengthInCms">Length</label> : <input type="text" name="lengthInCms" id="lengthInCms" />
        		<label for="weightInKilo">Weight</label> : <input type="text" name="weightInKilo" id="weightInKilo" />
       		</fieldset>
       		<input type="submit" value="Envoyer" />
        </form>
            <!-- To check that some data is sent upon submit, use Chrome, type "Ctrl + Shift + i" and
            open the "Network" tab to see requests being submitted -->
       
        <p>
     <table>
        <tr>
        	<th>Age</th>
        	<th>Length</th>
        	<th>Weight</th>
        </tr>
        <c:forEach items="${carps}" var="carp">
            <tr>
                <td>${carp.age}</td>
                <td>${carp.lengthInCms}</td>
                <td>${carp.weightInKilo}</td>
            </tr>
        </c:forEach>
    </table>
    </body>
</html>
