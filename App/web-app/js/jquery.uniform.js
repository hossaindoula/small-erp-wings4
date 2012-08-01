(function(a){a.uniform={options:{selectClass:"selector",radioClass:"radio",checkboxClass:"checker",fileClass:"uploader",filenameClass:"filename",fileBtnClass:"action",fileDefaultText:"No file selected",fileBtnText:"Choose File",checkedClass:"checked",focusClass:"focus",disabledClass:"disabled",activeClass:"active",hoverClass:"hover",useID:true,idPrefix:"uniform",resetSelector:false},elements:[]};if(a.browser.msie&&a.browser.version<7){a.support.selectOpacity=false}else{a.support.selectOpacity=true}a.fn.uniform=function(c){c=a.extend(a.uniform.options,c);var e=this;if(c.resetSelector!=false){a(c.resetSelector).mouseup(function(){function i(){a.uniform.update(e)}setTimeout(i,10)})}function b(j){var k=a("<div />"),i=a("<span />");k.addClass(c.selectClass);if(c.useID){k.attr("id",c.idPrefix+"-"+j.attr("id"))}i.html(j.find(":selected").text());j.css("opacity",0);j.wrap(k);j.before(i);k=j.parent("div");i=j.siblings("span");j.change(function(){i.text(j.find(":selected").text());k.removeClass(c.activeClass)}).focus(function(){k.addClass(c.focusClass)}).blur(function(){k.removeClass(c.focusClass);k.removeClass(c.activeClass)}).mousedown(function(){k.addClass(c.activeClass)}).mouseup(function(){k.removeClass(c.activeClass)}).click(function(){k.removeClass(c.activeClass)}).hover(function(){k.addClass(c.hoverClass)},function(){k.removeClass(c.hoverClass)}).keyup(function(){i.text(j.find(":selected").text())});if(a(j).attr("disabled")){k.addClass(c.disabledClass)}a.uniform.noSelect(i);h(j)}function d(j){var k=a("<div />"),i=a("<span />");k.addClass(c.checkboxClass);if(c.useID){k.attr("id",c.idPrefix+"-"+j.attr("id"))}a(j).wrap(k);a(j).wrap(i);i=j.parent();k=i.parent();a(j).css("opacity",0).focus(function(){k.addClass(c.focusClass)}).blur(function(){k.removeClass(c.focusClass)}).click(function(){if(!a(j).attr("checked")){i.removeClass(c.checkedClass)}else{i.addClass(c.checkedClass)}}).mousedown(function(){k.addClass(c.activeClass)}).mouseup(function(){k.removeClass(c.activeClass)}).hover(function(){k.addClass(c.hoverClass)},function(){k.removeClass(c.hoverClass)});if(a(j).attr("checked")){i.addClass(c.checkedClass)}if(a(j).attr("disabled")){k.addClass(c.disabledClass)}h(j)}function f(j){var k=a("<div />"),i=a("<span />");k.addClass(c.radioClass);if(c.useID){k.attr("id",c.idPrefix+"-"+j.attr("id"))}a(j).wrap(k);a(j).wrap(i);i=j.parent();k=i.parent();a(j).css("opacity",0).focus(function(){k.addClass(c.focusClass)}).blur(function(){k.removeClass(c.focusClass)}).click(function(){if(!a(j).attr("checked")){i.removeClass(c.checkedClass)}else{a("."+c.radioClass+" span."+c.checkedClass+":has([name='"+a(j).attr("name")+"'])").removeClass(c.checkedClass);i.addClass(c.checkedClass)}}).mousedown(function(){if(!a(j).is(":disabled")){k.addClass(c.activeClass)}}).mouseup(function(){k.removeClass(c.activeClass)}).hover(function(){k.addClass(c.hoverClass)},function(){k.removeClass(c.hoverClass)});if(a(j).attr("checked")){i.addClass(c.checkedClass)}if(a(j).attr("disabled")){k.addClass(c.disabledClass)}h(j)}function g(l){$el=a(l);var m=a("<div />"),k=a("<span>"+c.fileDefaultText+"</span>"),j=a("<span>"+c.fileBtnText+"</span>");m.addClass(c.fileClass);k.addClass(c.filenameClass);j.addClass(c.fileBtnClass);if(c.useID){m.attr("id",c.idPrefix+"-"+$el.attr("id"))}$el.wrap(m);$el.after(j);$el.after(k);m=$el.closest("div");k=$el.siblings("."+c.filenameClass);j=$el.siblings("."+c.fileBtnClass);if(!$el.attr("size")){var i=m.width();$el.attr("size",i/10)}$el.css("opacity",0).focus(function(){m.addClass(c.focusClass)}).blur(function(){m.removeClass(c.focusClass)}).change(function(){var n=a(this).val();n=n.split(/[\/\\]+/);n=n[(n.length-1)];k.text(n)}).mousedown(function(){if(!a(l).is(":disabled")){m.addClass(c.activeClass)}}).mouseup(function(){m.removeClass(c.activeClass)}).hover(function(){m.addClass(c.hoverClass)},function(){m.removeClass(c.hoverClass)});if($el.attr("disabled")){m.addClass(c.disabledClass)}a.uniform.noSelect(k);a.uniform.noSelect(j);h(l)}function h(i){i=a(i).get();if(i.length>1){a.each(i,function(j,k){a.uniform.elements.push(k)})}else{a.uniform.elements.push(i)}}a.uniform.noSelect=function(i){function j(){return false}a(i).each(function(){this.onselectstart=this.ondragstart=j;a(this).mousedown(j).css({MozUserSelect:"none"})})};a.uniform.update=function(i){if(i==undefined){i=a(a.uniform.elements)}i=a(i);i.each(function(){$e=a(this);if($e.is("select")){spanTag=$e.siblings("span");divTag=$e.parent("div");divTag.removeClass(c.hoverClass+" "+c.focusClass+" "+c.activeClass);spanTag.html($e.find(":selected").text());if($e.is(":disabled")){divTag.addClass(c.disabledClass)}else{divTag.removeClass(c.disabledClass)}}else{if($e.is(":checkbox")){spanTag=$e.closest("span");divTag=$e.closest("div");divTag.removeClass(c.hoverClass+" "+c.focusClass+" "+c.activeClass);spanTag.removeClass(c.checkedClass);if($e.is(":checked")){spanTag.addClass(c.checkedClass)}if($e.is(":disabled")){divTag.addClass(c.disabledClass)}else{divTag.removeClass(c.disabledClass)}}else{if($e.is(":radio")){spanTag=$e.closest("span");divTag=$e.closest("div");divTag.removeClass(c.hoverClass+" "+c.focusClass+" "+c.activeClass);spanTag.removeClass(c.checkedClass);if($e.is(":checked")){spanTag.addClass(c.checkedClass)}if($e.is(":disabled")){divTag.addClass(c.disabledClass)}else{divTag.removeClass(c.disabledClass)}}else{if($e.is(":file")){divTag=$e.parent("div");filenameTag=$e.siblings(c.filenameClass);btnTag=$e.siblings(c.fileBtnClass);divTag.removeClass(c.hoverClass+" "+c.focusClass+" "+c.activeClass);filenameTag.text($e.val());if($e.is(":disabled")){divTag.addClass(c.disabledClass)}else{divTag.removeClass(c.disabledClass)}}}}}})};return this.each(function(){if(a.support.selectOpacity){var i=a(this);if(i.is("select")){if(i.attr("multiple")!=true){b(i)}}else{if(i.is(":checkbox")){d(i)}else{if(i.is(":radio")){f(i)}else{if(i.is(":file")){g(i)}}}}}})}})(jQuery);