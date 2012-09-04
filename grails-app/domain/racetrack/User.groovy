package racetrack

class User {
	String login
	String password
	String role = "user"

    static constraints = {
		login(blank:false, nullable:false, unique:true)
		password(blank:false, password:true)
		role(inList:["admin", "user"])
    }
	
	static transients = ['admin']
	
	boolean isAdmin(){
		return role == "admin"
	}
	
	def beforeInsert = {
		password = password.encodeAsSHA1()
	}
	
	String toString(){
		login
	}
}
