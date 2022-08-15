fun main(args: Array<String>) {

    println("School Program\n")

    val mainMenu = ("""
        Choose Your Selection to perform
        1 - for Student Menu
        2 - for Teacher Menu
        """).trimIndent()

    var studentMenu = Student("s1", "Menu", 1)
    var teacherMenu = Teacher("t1", "Bob")
    var school = School("High School", "8 Street", "Mehraj")

    // prints main menu

    fun mainMenu(){
        println(mainMenu + "\n")

        val numberInput = readLine()!!.toInt()
        println()

        when (numberInput) {
            1 -> {
                println("You've entered: $numberInput")


                when (numberInput) {
                    1 -> {
                        // Start of student menu
                        println(studentMenu.showStudentMenu())

                        val studentMenuInput = readLine()!!.toInt()
                        println()

                        when (studentMenuInput) {
                            1 -> {
                                // Start of student menu
                                println("***** ADD STUDENT DETAILS ***** \n")
                                println("Student Id: ")
                                val studentID = readLine()!!.toString()

                                println("Student Name: ")
                                val studentName = readLine()!!.toString()

                                println("Student Year Level: ")
                                val studentYearLevel = readLine()!!.toInt()
                                school.addStudent(Student(studentID, studentName, studentYearLevel))
                                school.showStudentList()

                                println("Successfully added Student")
                                println()
                                mainMenu()
                            }

                            2 -> {
                                // Start of student menu
                                println("***** REMOVE STUDENT *****\n")
                                println("Type student name to remove")
                                var studentSearch = readLine()!!.toString()
                                school.removeStudent(studentSearch)


                                mainMenu()
                            }
                            3 -> {
                                println("***** SEARCH STUDENT *****\n")
                                mainMenu()
                            }

                            4 -> {
                                println("***** ALL STUDENTS *****")
                                println(school.showStudentList())
                                mainMenu()
                                println()
                            }

                        }
                    }
                }
            }


//        2 -> {

//            println("You've entered: $numberInput")
//            println(teacherMenu.showTeacherMenu())

        }

        return
    }

    mainMenu()
}


