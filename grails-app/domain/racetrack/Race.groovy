package racetrack

class Race {
	
	static constraints = {
		name(blank:false, maxSize:50, notEqual:"Buster", unique:true) //blank:false,
		startDate()
		city()
		state(inList: ["GA", "NC", "SC", "VA"])
		distance(min:0.0) //min:0.0, range:0..10
		cost(min:0.0, max:100.0)
		maxRunners(min:0, max:100000)
		
		startDate(validator: {return (it > new Date())})
	}
	
	String name
	Date startDate
	String city
	String state
	BigDecimal distance
	BigDecimal cost
	Integer maxRunners = 100000
	
	static hasMany = [registrations:Registration]
	
	String toString() {
		return "${name}, ${startDate.format('MM/dd/yyyy')}"
	}
	
	BigDecimal inMiles(){
		return distance * 0.6214
	}

    
}
