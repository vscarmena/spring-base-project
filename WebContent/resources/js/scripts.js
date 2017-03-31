
function scroll_to_class(chosen_class) {
	var nav_height = $('nav').outerHeight();
	var scroll_to = $(chosen_class).offset().top - nav_height;

	if($(window).scrollTop() != scroll_to) {
		$('html, body').stop().animate({scrollTop: scroll_to}, 1000);
	}
}


jQuery(document).ready(function() {

	/*
	    Fullscreen background
	*/
	$.backstretch("assets/img/backgrounds/1.jpg");

	/*
	    Multi Step Form
	*/
	$('.msf-form form fieldset:first').fadeIn('slow');
	
	// next step
	$('.msf-form form .btn-next').on('click', function() {
		$(this).parents('fieldset').fadeOut(400, function() {
	    	$(this).next().fadeIn();
			scroll_to_class('.msf-form');
	    });
	});
	
	// previous step
	$('.msf-form form .btn-previous').on('click', function() {
		$(this).parents('fieldset').fadeOut(400, function() {
			$(this).prev().fadeIn();
			scroll_to_class('.msf-form');
		});
	});
	
	$('#row_dim').hide(); 
    $('#whoTrans').change(function(){
        if(($('#whoTrans').val() == 'myParking') || ($('#whoTrans').val() == 'serviceTrans')){
            $('#row_dim').show(); 
        } else {
            $('#row_dim').hide(); 
        } 
    });
    //animacion 5.8 hide/show
    $("#r1").click(function() {
		$("#d1").show();

	});
	$("#r2").click(function() {

		$("#d1").hide();
	});
	//efectos del colorbox
	$(".iframe").colorbox({iframe:true, width:"80%", height:"80%"});
	$(".inline").colorbox({inline:true, width:"50%"});
	
	 $("button[name='addDom']").click(function() {
	        var domElement = $('<br><div class="module_holder"><label>fecha inicio</label><input type="date"><label>fecha final</label><input type="date"></div><br>');
	        $(this).before(domElement);
	    });
	
});
