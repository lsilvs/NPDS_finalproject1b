jQuery(document).ready(function($){
    $( "#number_search" ).click(function() {
        $.ajax({
            type: "GET",
            dataType: 'json',
            url: "/webresources/controlsAccount/returnAccount",
            data: { number: $("#input_number").val() }
        })
        .done(function( data ) {
            // Creating the JSON object from string
            var account = data.Account;
            
            $( "#info-box ._number" ).html( account._number );
            $( "#info-box ._balance" ).html( account._balance );
            
            
            $( "#home-box" ).css("display", "none");
            $( "#menu-box" ).css("display", "");
            $( "#data-box" ).css("display", "");
        });
    });
    
    $( "#menu-box .topup" ).click(function() {
        $( "#data-box" ).css("display", "none");
        $( "#topup-box" ).css("display", "");
        $( "#transfer-box" ).css("display", "none");
        $( "#buyextra-box" ).css("display", "none");
        $( "#extraOption-box" ).css("display", "none");
    });
    
    $( "#menu-box .transfer" ).click(function() {
        $( "#data-box" ).css("display", "none");
        $( "#topup-box" ).css("display", "none");
        $( "#transfer-box" ).css("display", "");
        $( "#buyextra-box" ).css("display", "none");
        $( "#extraOption-box" ).css("display", "none");
    });
    
    $( "#menu-box .buyextra" ).click(function() {
        $.ajax({
            type: "GET",
            dataType: 'json',
            url: "/webresources/controlsAccount/returnAccount",
            data: { number: $("#input_number").val() }
        })
        .done(function( data ) {
            // Creating the JSON object from string
            var account = data.Account;
            
            $( "#info-box ._number" ).html( account._number );
            $( "#info-box ._balance" ).html( account._balance );
            
            $( "#extraOption-box #extra1 .extra_amount" ).html( account.kamaradTalkKamarad100 );
            $( "#extraOption-box #extra2 .extra_amount" ).html( account.kamaradTalkKamarad500 );
            $( "#extraOption-box #extra3 .extra_amount" ).html( account.kamaradTalkEveryone100 );
            $( "#extraOption-box #extra4 .extra_amount" ).html( account.kamaradTalkEveryone500 );
            $( "#extraOption-box #extra5 .extra_amount" ).html( account.kamaradInternet1GB );
            $( "#extraOption-box #extra6 .extra_amount" ).html( account.kamardText300 );
            $( "#extraOption-box #extra7 .extra_amount" ).html( account.kamaradInternational100 );
        });
        
        $( "#data-box" ).css("display", "none");
        $( "#topup-box" ).css("display", "none");
        $( "#transfer-box" ).css("display", "none");
        $( "#buyextra-box" ).css("display", "");
        $( "#extraOption-box" ).css("display", "");
    });
    
    
    $( "#topup-submit" ).click(function() {
        $.ajax({
            type: "GET",
            dataType: 'json',
            url: "/webresources/controlsAccount/topUp",
            data: { 
                number: $("#info-box ._number").html(),
                amount: $("#topup-box #input_amount").val()
            },
            error: function(XMLHttpRequest, textStatus, errorThrown) { 
                $( "#data-box" ).html( "<h1>Error!</h1>" );
                $( "#data-box" ).css("display", "");
                $( "#topup-box" ).css("display", "none");
                $( "#transfer-box" ).css("display", "none");
                $( "#buyextra-box" ).css("display", "none");
                $( "#extraOption-box" ).css("display", "none");
            }
        })
        .done(function( data ) {
            // Creating the JSON object from string
            var account = data.Account;
            
            $( "#info-box ._number" ).html( account._number );
            $( "#info-box ._balance" ).html( account._balance );
            $( "#data-box" ).html( "<h1>Success!</h1>" );
            
            $( "#data-box" ).css("display", "");
            $( "#topup-box" ).css("display", "none");
            $( "#transfer-box" ).css("display", "none");
            $( "#buyextra-box" ).css("display", "none");
            $( "#extraOption-box" ).css("display", "none");
        });
    });
    
    
    $( "#transfer-submit" ).click(function() {
        $.ajax({
            type: "GET",
            dataType: 'json',
            url: "webresources/controlsAccount/transfer",
            data: { 
                numberOrig: $("#info-box ._number").html(),
                numberDest: $("#transfer-box #input_numberDest").val(),
                amount: $("#transfer-box #input_amount").val()
            },
            error: function(XMLHttpRequest, textStatus, errorThrown) { 
                $( "#data-box" ).html( "<h1>Error!</h1>" );
                $( "#data-box" ).css("display", "");
                $( "#topup-box" ).css("display", "none");
                $( "#transfer-box" ).css("display", "none");
                $( "#buyextra-box" ).css("display", "none");
                $( "#extraOption-box" ).css("display", "none");
            }
        })
        .done(function( data ) {
            // Creating the JSON object from string
            var account = data.Account;
            
            $( "#info-box ._number" ).html( account._number );
            $( "#info-box ._balance" ).html( account._balance );
            $( "#data-box" ).html( "<h1>Success!</h1>" );
            
            $( "#data-box" ).css("display", "");
            $( "#topup-box" ).css("display", "none");
            $( "#transfer-box" ).css("display", "none");
            $( "#buyextra-box" ).css("display", "none");
            $( "#extraOption-box" ).css("display", "none");
        });
    });
    
    
    $( "#buyextra-box .dropdown-menu li a" ).click(function(item) {
        var extraOption = $(this).attr('id').slice(-1);;
        
        console.log("extra option", extraOption)
        $.ajax({
            type: "GET",
            dataType: 'json',
            url: "/webresources/controlsAccount/buyExtraOprion",
            data: { 
                number: $("#info-box ._number").html(),
                option: extraOption
            },
            error: function(XMLHttpRequest, textStatus, errorThrown) { 
                $( "#data-box" ).html( "<h1>Error!</h1>" );
                $( "#data-box" ).css("display", "");
                $( "#topup-box" ).css("display", "none");
                $( "#transfer-box" ).css("display", "none");
                $( "#buyextra-box" ).css("display", "none");
                $( "#extraOption-box" ).css("display", "");
            }
        })
        .done(function( data ) {
            // Creating the JSON object from string
            var account = data.Account;
            
            $( "#info-box ._number" ).html( account._number );
            $( "#info-box ._balance" ).html( account._balance );
            $( "#data-box" ).html( "<h1>Success!</h1>" );
            
            $( "#data-box" ).css("display", "");
            $( "#topup-box" ).css("display", "none");
            $( "#transfer-box" ).css("display", "none");
            $( "#buyextra-box" ).css("display", "none");
            $( "#extraOption-box" ).css("display", "");
            
            $( "#extraOption-box #extra1 .extra_amount" ).html( account.kamaradTalkKamarad100 );
            $( "#extraOption-box #extra2 .extra_amount" ).html( account.kamaradTalkKamarad500 );
            $( "#extraOption-box #extra3 .extra_amount" ).html( account.kamaradTalkEveryone100 );
            $( "#extraOption-box #extra4 .extra_amount" ).html( account.kamaradTalkEveryone500 );
            $( "#extraOption-box #extra5 .extra_amount" ).html( account.kamaradInternet1GB );
            $( "#extraOption-box #extra6 .extra_amount" ).html( account.kamardText300 );
            $( "#extraOption-box #extra7 .extra_amount" ).html( account.kamaradInternational100 );
        });
    });
    

});