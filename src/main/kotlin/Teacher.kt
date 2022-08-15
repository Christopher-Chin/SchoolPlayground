public class Teacher(val id:String, val name:String) {

    fun showTeacherMenu() {
        println( """
         Student Menu
         1 - Add Teacher
         2 - Remove Teacher
         3 - Search Teacher
   """.trimIndent())
    }
}
