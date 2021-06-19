<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Update new room</h1>
<div>
    <fieldset>
        <form name="room" action="" method="POST">
            field 1 :
            <br>
             Name : <@spring.formInput "form.name" "" "text" />
            <br>
            Capacity : <@spring.formInput "form.capacity" "" "number" />
            <br>
            <input type="submit" value="Update" />
        </form>
    </fieldset>
</div>

</body>
</html>