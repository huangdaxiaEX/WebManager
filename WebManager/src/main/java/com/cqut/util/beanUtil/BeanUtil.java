package com.cqut.util.beanUtil;

import java.lang.reflect.Field;

/**
 * bean工具类，定义bean常用的工具方法
 * 
 * @author huangkai
 * 
 */
public class BeanUtil {

	public BeanUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 修改一个bean类中的属性值，该属性值从目标bean获取
	 * 
	 * @param dest 目标bean，其属性将被复制到源bean中
	 * @param src  需要被修改属性的源bean
	 * @param filtNullProps 源bean的null属性是否覆盖目标的属性
	 * 				 true : 源bean中只有为null的属性才会被覆盖
	 * 				 false: 不管源bean的属性是否为null，均覆盖
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static void copyBean(Object dest, Object src, boolean filtNullProps) throws IllegalArgumentException, IllegalAccessException {
		if (dest.getClass() == src.getClass()) {
			// 目标bean的所有字段
			Field[] destField = dest.getClass().getDeclaredFields();
			// 源bean的所有字段
			Field[] srcField = src.getClass().getDeclaredFields();
			for (int i = 0; i < destField.length; i++) {
				String destFieldName = destField[i].getName();
				String destFieldType = destField[i].getGenericType().toString();
				for (int n = 0; n < srcField.length; n++) {
					String srcFieldName = srcField[n].getName();
					String srcFieldType = srcField[n].getGenericType()
							.toString();
					// String srcTypeName =
					// srcField[n].getType().getSimpleName();
					if (destFieldName.equals(srcFieldName)
							&& destFieldType.equals(srcFieldType)) {
						destField[i].setAccessible(true);
						srcField[n].setAccessible(true);
						Object srcValue = srcField[n].get(src);
						Object destValue = destField[i].get(dest);
						if (filtNullProps) {
							// 源bean中的属性已经非空，则不覆盖
							if (srcValue == null) {
								srcField[n].set(src, destValue);
							}
						} else {
							srcField[n].set(dest, srcValue);
						}
					}
				}
			}
		}
	}

	/**
	 * 根据属性字段的值获取该属性字段的名字
	 * 
	 * @param obj 目标对象
	 * @param fieldName 属性字段名
	 * @return
	 */
	public static Field getFieldByFieldName(Object obj, String fieldName) {
		for (Class<?> superClass = obj.getClass(); superClass != Object.class; superClass = superClass
				.getSuperclass()) {
			try {
				return superClass.getDeclaredField(fieldName);
			} catch (NoSuchFieldException e) {
			}
		}
		return null;
	}

	/**
	 * 获取对象某一字段的值
	 * 
	 * @param obj
	 * @param fieldName
	 * @return
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static Object getValueByFieldName(Object obj, String fieldName) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Field field = getFieldByFieldName(obj, fieldName);
		Object value = null;
		if (field != null) {
			if (field.isAccessible()) {
				value = field.get(obj);
			} else {
				field.setAccessible(true);
				value = field.get(obj);
				field.setAccessible(false);
			}
		}
		return value;
	}

	/**
	 * 向对象的某一字段上设置值
	 * 
	 * @param obj
	 * @param fieldName
	 * @param value
	 * @throws SecurityException
	 * @throws NoSuchFieldException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static void setValueByFieldName(Object obj, String fieldName, Object value) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		Field field = obj.getClass().getDeclaredField(fieldName);
		if (field.isAccessible()) {
			field.set(obj, value);
		} else {
			field.setAccessible(true);
			field.set(obj, value);
			field.setAccessible(false);
		}
	}
}
