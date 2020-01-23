fun bodyMassIndex(height:Int, weight: Int): String {
    val heightValue = height.toDouble() / 100
    val index = weight.toDouble() / (heightValue * heightValue)
    return when (index){
        in 0.0..16.0 -> "Выраженный дефицит массы тела"
        in 16.0..18.5 -> "Недостаточная (дефицит) масса тела"
        in 18.5..24.99 -> "Норма"
        in 25.0..30.0 -> "Избыточная масса тела (предожирение)"
        in 30.0..35.0 -> "Ожирение"
        in 35.0..40.0 -> "Ожирение резкое"
        else -> {
            "Очень резкое ожирение"
        }
    }
}


fun main() {
    println(bodyMassIndex(195,65))
}