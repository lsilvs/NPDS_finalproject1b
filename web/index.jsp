

<!DOCTYPE html>
<html>
  <head>
    <title>Kamarad Mobile Operator</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    
    <!-- Custom styles for this template -->
    <link rel="stylesheet" type="text/css" href="assets/css/jumbotron-narrow.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
  </head>
    <body>
        <div class="container">
            <div class="header">
              <ul class="nav nav-pills pull-right">
                <li class="active"><a href="/">Home</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Contact</a></li>
              </ul>
              <h3 class="text-muted">Kamarad Mobile Operator</h3>
            </div>
            <div class="jumbotron" id="home-box" style="display: ">
                <h3>What's your number?</h3>
                <div class="input-group input-group-lg">
                    <input type="text" class="form-control" id="input_number" name="number" value="" />
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button" id="number_search">Go!</button>
                    </span>
                </div>
            </div>
            <div id="menu-box" class="navbar-collapse" style="display: none">
                <ul class="nav navbar-nav">
                    <li ><a href="#topup" class="topup">TopUp</a></li>
                  <li ><a href="#transfer" class="transfer">Transfer</a></li>
                  <li ><a href="#buyextra" class="buyextra">Buy Extra</a></li>
                </ul>
                <ul class="nav navbar-nav" style="float:right;" >
                    <li id="info-box" ><a href="#">The balance for number <b class="_number"></b> is <b class="_balance"></b></a></li>
                </ul>
            </div>
            
            <div class="jumbotron" id="data-box" style="display: none">
                
            </div>
            
            <div class="jumbotron" id="topup-box" style="display: none">
                <h3>TopUp</h3>
                <div class="input-group input-group-lg">
                    <input type="text" class="form-control" id="input_amount" name="amount" value="" />
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button" id="topup-submit">Go!</button>
                    </span>
                </div>
            </div>
            
            <div class="jumbotron" id="transfer-box" style="display: none">
                <h3>Transfer</h3>
                <div class="input-group input-group-lg">
                    <span class="input-group-addon">#</span>
                    <input type="text" class="form-control" id="input_numberDest" name="numberDest" value="" />
                    <span class="input-group-addon">$</span>
                    <input type="text" class="form-control" id="input_amount" name="amount" value="" />
                    <span class="input-group-btn">
                      <button class="btn btn-default" type="button" id="transfer-submit">Go!</button>
                    </span>
                </div>
            </div>
            
            <div class="jumbotron" id="buyextra-box" style="display: none">
                <!-- Small button group -->
                <div class="btn-group">
                    <button class="btn btn-default btn-sm dropdown-toggle" style="width: 490px;" type="button" data-toggle="dropdown">
                    Buy Extra Options <span class="caret"></span>
                  </button>
                  <ul class="dropdown-menu" role="menu" style="width: 490px; text-align: left;" >
                    <li><a href="#" id="extraOpt1">Kamarad talk Kamarad 100 ($2)</a></li>
                    <li><a href="#" id="extraOpt2">Kamarad talk Kamarad 500 ($8)</a></li>
                    <li><a href="#" id="extraOpt3">Kamarad talk Everyone 100 ($5)</a></li>
                    <li><a href="#" id="extraOpt4">Kamarad talk Everyone 500 ($20)</a></li>
                    <li><a href="#" id="extraOpt5">Kamarad Internet 1GB ($10)</a></li>
                    <li><a href="#" id="extraOpt6">Kamarad Text 300 ($1)</a></li>
                    <li><a href="#" id="extraOpt7">Kamarad International 100 ($10)</a></li>
                  </ul>
                </div>
            </div>
            
            <div class="jumbotron" id="extraOption-box" style="display: none">
                <!-- Small button group -->
                <div class="btn-group">
                  <ul style="width: 490px; text-align: left;" >
                    <li><a href="#" id="extra1">Kamarad talk Kamarad 100 = <b class="extra_amount"></b></a></li>
                    <li><a href="#" id="extra2">Kamarad talk Kamarad 500 = <b class="extra_amount"></b></a></li>
                    <li><a href="#" id="extra3">Kamarad talk Everyone 100 = <b class="extra_amount"></b></a></li>
                    <li><a href="#" id="extra4">Kamarad talk Everyone 500 = <b class="extra_amount"></b></a></li>
                    <li><a href="#" id="extra5">Kamarad Internet 1GB = <b class="extra_amount"></b></a></li>
                    <li><a href="#" id="extra6">Kamarad Text 300 = <b class="extra_amount"></b></a></li>
                    <li><a href="#" id="extra7">Kamarad International 100 = <b class="extra_amount"></b></a></li>
                  </ul>
                </div>
            </div>

        </div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="https://code.jquery.com/jquery.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/main.js"></script>
    </body>
</html>
