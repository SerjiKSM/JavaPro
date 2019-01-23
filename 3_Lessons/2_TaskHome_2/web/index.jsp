<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Train time table </title>
    <link rel="stylesheet" type="text/css" href="style.css">

    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
        th, td {
            padding: 5px;
        }
    </style>

</head>
<body>
<img src="http://www.htmldog.com/badge1.gif" width="120" height="90" alt="HTML Dog">

<h1>Input timetables trains</h1>

<h2>Exampel:</h2>

<p>
    <label>Train id: 1</label> <br>
    <label>From: Kiev</label> <br>
    <label>To: Lviv</label> <br>
    <label>Date: 19.12.2015</label> <br>
    <label>Time: 15:05</label> <br>
</p>

<form action="/train" method="POST">
    <div class="main">
        <div class="field">
            <%--@declare id="id"--%><label for="id">Train id:</label>
            <input type="text" name="id">
        </div>
        <div class="field">
            <%--@declare id="from"--%><label for="from">From:</label>
            <input type="text" name="from">
        </div>
        <div class="field">
            <%--@declare id="to"--%><label for="to">To:</label>
            <input type="text" name="to">
        </div>
        <div class="field">
            <%--@declare id="date"--%><label for="date">Date:</label>
            <input type="datetime-local" name="date">
        </div>
        <div class="field">
            <%--@declare id="departurefrom"--%><label for="departurefrom">Departure from:</label>
            <input type="text" name="departurefrom">
        </div>
        <div class="field">
            <%--@declare id="departureto"--%><label for="departureto">Departure to:</label>
            <input type="text" name="departureto">
        </div>

        <br>

        <form>
            Departure from:<br>
            <input type="text" name="departurefrom">
            <br>
            Departure to:<br>
            <input type="text" name="departureto">

            <br><br>
            <input type="submit" value="Find">
        </form>

        <br>

        <fieldset>
            <legend>Unload file</legend>
            <label for="unload">File name: </label>
            <input type="file" name="unload" id="unload">
        </fieldset>
        <br>
    </div>



    <div class="timetable" style="width: 100">
        <table style="width:100%">
            <table>
                <tr>
                    <th>Train id</th>
                    <th>From</th>
                    <th>To</th>
                    <th>Date</th>
                    <th>Depature</th>
                </tr>
                <tr>
                    <td>Eve</td>
                    <td>Jackson</td>
                    <td>94</td>
                </tr>
            </table>
    </div>

</form>



</body>
</html>