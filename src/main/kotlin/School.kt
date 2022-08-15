class School(val name:String, val address:String, val principal:String) {

    var studentList = ArrayList<Student>()
    var teacherList = ArrayList<Teacher>()

    fun showSchoolName() {
        println("School name: $name")
    }

    fun addStudent(student: Student){
        studentList.add(student)
    }

    fun showStudentList(){
        for(i in studentList){
            println( "ID: ${i.id}\nName: ${i.name}\nYear Level: ${i.yearLevel}\n\n")
        }
    }

    fun removeStudent(compare:String){
        var student:Student? = null

        for(i in studentList){
            if(compare.equals(i.name)){
                student = i
            }
        }

        if(student != null){
            studentList.remove(student)
        }
    }
}

