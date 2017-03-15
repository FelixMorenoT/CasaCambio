var seen = {};
jQuery('.something').children().each(function() {
    var txt = jQuery(this).attr('value');
    if (seen[txt]) {
        jQuery(this).remove();
    } else {
        seen[txt] = true;
    }
});