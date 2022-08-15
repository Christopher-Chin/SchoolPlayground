public class Student(val id:String, val name:String, var yearLevel:Int) {

    fun showStudentMenu(){
        println( """
         Student Menu
         1 - Add Student
         2 - Remove Student
         3 - Search Student
         4 - Display Students
   """.trimIndent())
    }


}