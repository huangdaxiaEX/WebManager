;(function($){
	/**
	 * 获取序列化对象
	 * @Author fm
	 * @param flag 是否自动去除字符串两边的空格，默认删除
	 *
	 */
	$.fn.getObject = function(flag){
		var list = $(this).serializeArray(),
		tmp = {},f = true;
		
		if(false === flag){
			f = false;
		}
		
		$.each(list,function(i,c){
			if(!f || 'string' != $.type(c.value)){
				tmp[c.name] = c.value;				
			}else{
				if('string' === $.type(c.value)){
					tmp[c.name] = $.trim(c.value);
				}
			}
		});
		
		return list && list.length > 0 ? tmp : null;
	}
	
})(jQuery);