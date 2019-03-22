
<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
<g:form class="form-horizontal" method="post" controller="funds" action="transferFunds">

    <fieldset>

        <!-- Form Name -->
        <legend>Send Money</legend>

        <!-- Text input-->
        <div class="form-group">
        <label class="col-md-4 control-label" for="toAddress">Send to address</label>
        <div class="col-md-4">
            <g:textArea id="toAddress" name="toAddress" type="text" placeholder="0xc349bbe4d2033bf3390d2081cff01baccfcdffbb" class="form-control input-md" required=""/>
            <span class="help-block">Send to address</span>
        </div>

            <label class="col-md-4 control-label" for="weiAmount">Wei Amount</label>
            <div class="col-md-4">
                <g:textField id="weiAmount" name="weiAmount" type="text" placeholder="1" class="form-control input-md" required=""/>
                <span class="help-block">Enter amount in Wei</span>
            </div>
        </div>
        <g:submitButton type="submit" name="Submit" value="Submit"/>

    </fieldset>
</g:form>
</body>
</html>