object spherevolume extends App{
	def vol(radious:Int):Double={
		(4.0/3.0)* (math.Pi) * radious *radious*radious
	}

	print("Volume = " + vol(21))

}