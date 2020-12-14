package com.midnightnoon.learn2code.servlety;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

//cez anotáciu @WebServlet namapujem kde bude lokalizovaný daný servlet
//dá sa to aj cez web.xml
@WebServlet(urlPatterns = {"/simpleservlet", "/daco"})
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//        resp.setContentType("text/html");
//
//        out.println("<!DOCTYPE html> <html><body>");
//        //nastavenie typu výstupu/kódovania
//        out.println("<h1>Som v SimpleServlet</h1>");
//
//        String meno = req.getParameter("meno");
//        String priezvisko = req.getParameter("priezvisko");
//
//        out.println("<br>");
//        out.printf("meno: %s", meno);
//        out.println("<br>");
//        out.printf("priezvisko: %s", priezvisko);
//
////        HttpSession session = req.getSession();
////        if(meno!=null && !meno.isEmpty()){
////            session.setAttribute("ulozeneMeno", meno);
////        }
////        out.println("<br>");
////        out.printf("ulozene meno: %s", session.getAttribute("ulozeneMeno"));
//        HttpSession session = req.getSession();
//        ServletContext context = req.getServletContext();
//        if(meno!=null && !meno.isEmpty()){
//            session.setAttribute("ulozeneMeno", meno);
//            context.setAttribute("kontextUlozeneMeno", meno);
//        }
//        out.println("<br>");
//        out.printf("ulozene meno: %s", session.getAttribute("ulozeneMeno"));
//        out.println("<br>");
//        out.printf("kontextUlozeneMeno: %s", context.getAttribute("kontextUlozeneMeno"));
//
//        String filterAttribute = (String) req.getSession().getAttribute("filterAttribute");
//        out.println("<br>");
//        out.printf("filterAttribute: %s", filterAttribute);
//
//        String kontextAttribute = (String) req.getServletContext().getAttribute("filter");
//        out.println("<br>");
//        out.printf("kontextAttribute: %s", kontextAttribute);
//
//        out.println("</body> </html>");

        PrintWriter out = resp.getWriter();
//        out.println("<!DOCTYPE html> <html><body>");
//        out.print("<h1>Som v SimpleServlet</h1>");
        
        out.print("<h1>Som v SimpleServletoch - mäkčené</h1>");


        String meno = req.getParameter("meno");
        String priezvisko = req.getParameter("priezvisko");

        out.println("<br>");
        out.printf("Meno: %s", meno);
        out.println("<br>");
        out.printf("Priezvisko: %s", priezvisko);

        out.println("</body> </html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //vytiahnem data z formulara cez req.get parameter
        String meno = req.getParameter("meno");
        String stranka = req.getParameter("stranka");

        // 1. metoda: poslem ich do simpleservlet ako url
        //resp.sendRedirect(String.format("simpleservlet?meno=%s&priezvisko=%s", meno, priezvisko));

        // 2. metoda: zobrazim html stranku ako v pripade vyssie
        PrintWriter out = resp.getWriter();
        //resp.setContentType("text/html");

        out.println("<!DOCTYPE html> <html><body>");
        //nastavenie typu výstupu/kódovania
        out.println("<h1>Som v SimpleServlet</h1>");

        out.println("<br>");
        out.printf("meno: %s", meno);
        out.println("<br>");
        out.printf("stranka: %s", stranka);

        String priezvisko = req.getParameter("priezvisko");
        out.println("<br>");
        out.printf("priezvisko: %s", priezvisko);

        String pohlavie = req.getParameter("pohlavie");
        out.println("<br>");
        out.printf("pohlavie: %s", pohlavie);

        String[] stat = req.getParameterValues("stat");
        for(int i = 0; i < stat.length; i++) {
            out.println("<br>");
            out.printf("stat: %s", stat[i]);
        }

        out.println("</body> </html>");

    }
}
