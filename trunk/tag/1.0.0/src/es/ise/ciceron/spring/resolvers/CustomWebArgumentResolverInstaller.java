package es.ise.ciceron.spring.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;

@Component
public class CustomWebArgumentResolverInstaller
{
	@Autowired
	public CustomWebArgumentResolverInstaller(AnnotationMethodHandlerAdapter controllerInvoker, List<WebArgumentResolver> resolvers)
	{
		controllerInvoker.setCustomArgumentResolvers(resolvers.toArray(new WebArgumentResolver[]{}));
	}
}