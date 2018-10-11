package com.app.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ReservationController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/reservation")
    public String getReservations(){
        return "reservations";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return "index";
    }
}
