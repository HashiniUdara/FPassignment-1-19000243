object books extends App{
	val percentage : Double = 0.4
	val coverpirce : Double = 24.95
	val noofbooks : Int = 60

	def discount(percentage  : Double,coverpirce : Double):Double={
		coverpirce * percentage 
	}

	def  calc(percentage  : Double,coverpirce : Double,noofbooks : Int):Double={
		noofbooks * discount(percentage,coverpirce) + 50*3 + (noofbooks - 50) * 0.75
	}

	println("Discount = " + discount(percentage,coverpirce))
	print("wholesale cost = " + calc(percentage,coverpirce,noofbooks))
}