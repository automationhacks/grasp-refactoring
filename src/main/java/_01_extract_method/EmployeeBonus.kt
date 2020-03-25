package _01_extract_method

/**
 * Example to understand extract method refactoring
 */
class EmployeeBonus {
    fun addBonusToSalaryForEmployee(): ArrayList<Int> {
        println("====== Employee bonus calculator ======")
        println("====== V1.0 ===========================")

        val fakeEmployeeList = listOf(1, 2, 3)

        val bonus = arrayListOf<Int>()
        for (employee in fakeEmployeeList) {
            bonus.add(employee * 1000)
        }

        return bonus
    }

    fun printEmployeeBonus(bonus : ArrayList<Int>) {
        bonus.forEach { println(it) }
    }
}

fun main() {
    val employeeBonus = EmployeeBonus()
    val bonus = employeeBonus.addBonusToSalaryForEmployee()
    employeeBonus.printEmployeeBonus(bonus)
}