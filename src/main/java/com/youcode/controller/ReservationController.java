package com.youcode.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.youcode.entity.Reservation;
import com.youcode.entity.User;
import com.youcode.service.ReservationService;

@Controller
@ComponentScan(basePackages = {"com.youcode"})
public class ReservationController {

	
//	@Autowired
//	private ReservationService reservationService;
//	
	@RequestMapping(value = "/saveReservation", method = RequestMethod.POST)
	public String saveRservation(@ModelAttribute("reservation") Reservation theReserv)  
	{ 
		theReserv.setUser((User) UserController.user2);
		reservationService.saveReservation(theReserv);
	    return "redirect:/student-reservation"; 

	
	}
//	
//	@RequestMapping(value = "/list-reservation", method = RequestMethod.GET)
//	public String listReservation(Model theModel) {
//		
//		// get customers from the service
//		List theReservations = (List) reservationService.getAllReservation();
//				
//		// add the customers to the model
//		theModel.addAttribute("reservations", theReservations);
//		
//		return "list-reservation";
//	}
	
	
	
	@RequestMapping(value = "/student-reservation", method = RequestMethod.GET)
	public String listReservation(Model theModel) {
		
		// get customers from the service
		List theReservations = (List) reservationService.getReservationByConfirmation();
				
		// add the customers to the model
		theModel.addAttribute("reservations", theReservations);
		
		return "student-reservation";
	}
	

	
	@Autowired
    private ReservationService reservationService;
	
	@RequestMapping(value = "/admin-reservation", method = RequestMethod.GET )
	   public ModelAndView listReservation(ModelAndView theModel) throws IOException {
		List<Reservation> listReservation = reservationService.getAllReservation();
		theModel.addObject("listReservation", listReservation);
		theModel.setViewName("admin-reservation");
        return theModel;

	}


//	  @RequestMapping(value = "/reservform", method = RequestMethod.GET)
//       public ModelAndView createReservation(ModelAndView theModel) {
//           Reservation reservation = new Reservation();
//            theModel.addObject("reservation", reservation);
//           theModel.setViewName("reservform");
//           return theModel;
//       }
	   
	  @RequestMapping(value = "/reservform", method = RequestMethod.GET)
      public ModelAndView createReservation(ModelAndView theModel,HttpServletRequest req) {
           Reservation reservation = new Reservation();
           theModel.addObject("reservation", reservation);
           theModel.setViewName("reservform");
           return theModel;
      }



       @RequestMapping(value = "deleteReservation", method = RequestMethod.POST)
       public String deleteReservation(HttpServletRequest request){
	        Long id = Long.valueOf(request.getParameter("id"));
            reservationService.dropReservation(id);
	        return "redirect:/admin-reservation";
       }


    @RequestMapping(value = "AccpterReservation", method = RequestMethod.POST)
    public String accepterReservation(HttpServletRequest request){
        Long id = Long.valueOf(request.getParameter("id"));
        Reservation reservation =reservationService.getReservationById(id);
        reservation.setConfirmation(true);
        reservationService.updateReservation(reservation);
        return "redirect:/admin-reservation";
    }


}
