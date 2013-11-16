
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
