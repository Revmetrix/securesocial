package securesocial.core

object Role extends Enumeration {
	type Role = Value
	val SUPER_ADMIN = Value("SUPER_ADMIN")
	val ADMIN = Value("ADMIN")
	val USER = Value("USER")
}