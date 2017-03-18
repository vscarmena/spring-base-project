$( document ).ready(function() {
	// Extends data-href link to the row
	$(".clickable-row").click(function() {
        window.location = $(this).data("href");
    });
});