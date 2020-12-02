package com.example.routingandfilteringbook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// Follows Routing and Filtering tutorial https://spring.io/guides/gs/routing-and-filtering/ but converts to kotlin this is the books repo

@RestController
@SpringBootApplication
class RoutingAndFilteringBookApplication {

	@RequestMapping("/available")
	fun available(): String{
		return "Spring in Action"
	}

	@RequestMapping("/checked-out")
	fun checkedOut(): String{
		return "Sprint Boot in Action"
	}
}

fun main(args: Array<String>) {
	runApplication<RoutingAndFilteringBookApplication>(*args)
}
