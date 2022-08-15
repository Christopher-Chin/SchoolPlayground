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
            print( "ID: ${i.id}\nName: ${i.name}\nYear Level: ${i.yearLevel}\n\n")
        }
    }

    fun removeStudent(compare:String){
        for(i in studentList){
            if(compare == i.name){
                studentList.remove(i)
            }
        }
    }
}

