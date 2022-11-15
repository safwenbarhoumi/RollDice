package tn.esprit.rolldice
// le classe Dice
class Dice (val a : Int){
    // La fonction roll returne un nombre aléatoire entre 1 et a
    fun roll(): Int{
        return (1..a).random()
    }
}