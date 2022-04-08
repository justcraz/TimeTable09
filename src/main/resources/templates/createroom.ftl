<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>

<center>
    <h3>Create new room</h3>
    <fieldset>
        <form name="room" action="" method="POST">
            field 1 :
            <br>
            <input  placeholder="Name" <@spring.formInput "form.name" "" "Text"/>
            <br>
            <input  placeholder="Capacity" <@spring.formInput "form.capacity" "" "Text"/>
            <br>
            <input type="submit" value="Create" />
        </form>
        <fieldset>
</center>

</body>
</html>
