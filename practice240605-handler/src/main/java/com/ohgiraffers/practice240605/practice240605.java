package com.ohgiraffers.practice240605;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/practice240605")
public class practice240605 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String flavor = request.getParameter("flavor");
		String count = (String) request.getParameter("count");

		System.out.println("베스킨라빈스 맛 선택 : ");

		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

//		if (count > 6) {
//			response.sendError(404, "error !_!");
//		} else {
//			out.print("<h2> 주문완료 되었습니다 :) </h2><br>" + "<h3> 🍦 선택 : " + flavor + "<br> 🎀 수량 : " + count + "</h3>");
//			out.close();
//		}

	}

}
