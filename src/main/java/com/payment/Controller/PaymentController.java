package com.payment.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {

	@GetMapping("/payment")
	public String payment() {
		return "payment"; // payment.html dosyasını döndür
	}

	@GetMapping("/dash_board")
	public String dashBoard() {
		return "dash_board"; // dash_board.html dosyasını döndür
	}
}
