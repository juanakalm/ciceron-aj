package es.ise.ciceron.spring.resolvers;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

import es.ise.ciceron.spring.annotations.SessionParam;

@Component
public class SessionParamArgumentResolver implements WebArgumentResolver
{

	public Object resolveArgument(MethodParameter param, NativeWebRequest request) throws Exception
	{
		for(Annotation annotation: param.getParameterAnnotations())
		{
			if(SessionParam.class.isInstance(annotation))
			{
				SessionParam sessionParam = (SessionParam)annotation;
				String paramName = sessionParam.value().equals("") ? param.getParameterName() : sessionParam.value();
				HttpSession session = ((HttpServletRequest)request.getNativeRequest()).getSession();
				Object result = session.getAttribute(paramName);
				
				return result;
			}
		}
		return UNRESOLVED;
	}
}