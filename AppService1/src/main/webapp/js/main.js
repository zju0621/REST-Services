function handleConvert(){
  $("#postTemperature").on("click", function(){
		var f = $("#idFahrenheit").val();
		var temp = {
			celsius: "", 
			fahrenheit: f
		};
		tempStr = JSON.stringify(temp);
		
		var param = {
        url: "service/temperature/convert",
        type: "POST",
        data: tempStr,
        contentType: "application/json",
        cache: false,
        dataType: "json",
    };
    $.ajax(param).done(function( respTemp ) {
		    //alert( "Data Saved: " + msg );
		    $("#idCelsius").val(respTemp.celsius);
    });
   }); // function()   
}

function handleGetF2CTable(){
  $("#getTemperatureTable").on("click", function(){
		var param = {
	    url: "service/temperature/f2c",
	    type: "GET",
	    contentType: "application/json",
	    cache: false,
	    dataType: "json",
	};
	$.ajax(param).done(function( data ) {
	   $('#f2c_table').DataTable( {
		    data: data,
		    columns: [
		        { data: 'fahrenheit' },
		        { data: 'celsius' },
		    ]
		} );		   
		   
	   var text = JSON.stringify(data);	
	   $("#f2c_table_div").text(text);
	});
  }); // function()   
}