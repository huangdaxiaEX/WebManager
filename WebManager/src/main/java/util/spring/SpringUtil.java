package util.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class SpringUtil implements BeanFactoryAware{
	private BeanFactory beanFactory	= null;
	private static SpringUtil springUtil = null;
	
	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	private SpringUtil(){
		
	}
	
	public static SpringUtil getInstance(){
		if (springUtil == null) {	
			springUtil = new SpringUtil();
		}
		return springUtil;
	}
	
	public Object getBeanByName(String beanName){
		return beanFactory.getBean(beanName);
	}
	
}
