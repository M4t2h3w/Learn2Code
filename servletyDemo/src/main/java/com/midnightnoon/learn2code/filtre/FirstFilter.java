package com.midnightnoon.learn2code.filtre;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// nastavenie Filtru cez anotaciu
@WebFilter(urlPatterns = {"/asdf"}, // vsetky adresy pojdu cez tento filter ("/*")
        filterName = "FirstFilter name",
        initParams = {@WebInitParam(name = "meno", value = "Jarko beno")}) // pole webInit parametrov
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("som vo filtry");
        System.out.println(filterConfig.getFilterName());
        System.out.println(filterConfig.getInitParameter("meno"));
        filterConfig.getServletContext().setAttribute("filter", "Firts filter context upraveny");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //nizsie zobrazeny kod upozorni pouzivatela, ze je stranka nedostupna
        PrintWriter out = servletResponse.getWriter();
//        out.println("Stranka nefunguje");

//        filterChain.doFilter(servletRequest, servletResponse);
//        //vykona sa dalsi filter ak je nastaveny inac pokracuje dalej do servletu
//        servletRequest.setAttribute("filterAttribute", "presiel som cez first filter");

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        req.getSession().setAttribute("filterAttribute", "presiel som cez first filter");
//        filterChain.doFilter(req, servletResponse);

        //presmerovanie
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
//        resp.sendRedirect("");

        //presmerujem request a servletResponse na index stranku ("")
        //url adresa ostane spravna ak pojdem na simpleservlet ale zobrazi sa obsah indexu
//        req.getRequestDispatcher("").forward(req, servletResponse);

        out.println("Ahoj z filtru");
        req.getRequestDispatcher("").include(req, resp);
        out.println("Dovidenia z filtru.");

    }

    @Override
    public void destroy() {

    }
}
