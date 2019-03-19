package com.example.demo.interceptor;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class WelcomeInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// test interceptor Order
		System.out.println("INTERCEPTOR PREHANDLE");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		String messageRole = "This is a message from Intercepter!...";
		Principal principal = request.getUserPrincipal();
		if (principal != null) {
			if (request.isUserInRole("ROLE_ADMIN"))
				messageRole = "YOU HAVE FULL PERMIT!!!";
			else
				messageRole = "YOU CAN ONLY SEE THE REPORT!!!";
		}

//		System.out.println("Calling postHandle");
		modelAndView.getModelMap().addAttribute("messageRole", messageRole);
		return;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
//		System.out.println("Calling afterCompletion");
		return;
	}

}
