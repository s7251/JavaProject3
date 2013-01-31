/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kulkry.gromac.jee.jsf.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author wnuk
 */
@WebFilter(filterName = "AthorizationFilter", urlPatterns = {"/*"})
public class AthorizationFilter implements Filter {
    
 
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        
        if (session.getAttribute("authenticated") != null || req.getRequestURI().endsWith("login.xhtml")) { // h:commandLink jest blokowane tutaj dlatego w formularzu logowania                                                                           // konieczne jest użycie commandButton            
            chain.doFilter(request, response);
        } else {
            HttpServletResponse res = (HttpServletResponse) response;
            res.sendRedirect(req.getContextPath() + "/faces/login.xhtml");
        }
    }


    public void destroy() {        
    }


    public void init(FilterConfig filterConfig) {        
       
    }

   
}
