package racetrack

class FooterTagLib {
	
	def thisYear = {
		out << new Date().format("YYYY")
	}
	
	def copyright = {attrs, body->
		out << "&copy;" + attrs.startYear + " - "
		out << thisYear() + " " + body()
	}

}
