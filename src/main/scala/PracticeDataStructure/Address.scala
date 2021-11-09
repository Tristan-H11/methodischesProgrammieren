package PracticeDataStructure

sealed abstract class Address(zipCode: String, city: String) {
    def toString: String
    def validAddress: Boolean
    
    def validZipCode: Boolean = {
        zipCode.matches("\\d{5}")
    }
    
    def validCity: Boolean = {
        !city.isBlank
    }
}

case class StreetAddress(street: String,
                         number: String,
                         zipCode: String,
                         city: String) extends Address(zipCode, city) {
    
    override def toString: String = {
        f"($street, $number, $zipCode, $city)"
    }
    def validAddress: Boolean = {
        validZipCode && !street.isBlank && !number.isBlank && validCity
    }
}

case class PoBoxAddress(PoBox: String,
                        zipCode: String,
                        city: String) extends Address(zipCode, city) {
    def validPoBox: Boolean = {true}
    
    override def toString: String = {
        f"($PoBox, $zipCode, $city)"
    }
    override def validAddress: Boolean = {
        validZipCode && validCity && validPoBox
    }
}
