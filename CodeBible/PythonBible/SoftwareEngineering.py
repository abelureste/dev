print("----------- Gradebook Program | Software Engineering -----------")

class Student:
    def __init__(self, studentName: str):       #Takes student name as input
        self.studentName = studentName          #Assigns studentName as itself
        self.studentGrades = []                 #Creates a list of the grades for the respective student

    def addGrade(self, grade: float):           #Function addGrade adds each grade inputted by the user to the studentGrades list
        self.studentGrades.append(grade)

    def averageGrade(self):                     #Function averageGrade adds up all grades and then divides the total by the amount of grades
        if len(self.studentGrades) > 0:         #Requires there to be grades, else prints "No grades entered"
            return sum(self.studentGrades) / len(self.studentGrades)
        else:
            return "No grades entered"
    
    def letterAverageGrade(self):               #Compares the average grade value and returns the equivalent letter grade in the form of a string
        avg = self.averageGrade()
        if avg >= 90:
            return "A"
        elif avg >= 80:
            return "B"
        elif avg >= 70:
            return "C"
        elif avg >= 60:
            return "D"
        else:
            return "F"

    def getGrade(self):                         #Returns student grades list
        return self.studentGrades   

students = []                                   #Initializes list for all student names

studentNumber = int(input("Enter the number of students: "))            #Asks for the total number of students

for i in range(studentNumber):                  #Asks for the student names depending on the total amount of students
    name = input("Enter the student names: ")   #Variable name takes in the name of the student
    students.append(Student(name))              #Adds the name of the student to the student class

numberOfGrades = int(input("How many grades do you want to enter per student?: "))      #Asks user numerical value for amount of grades being entered

for student in students:                #Enter information for each student index in the students list
    print(f"\nEntering grades for {student.studentName}")   #Prints who the user is entering the grades for, prints value stored in index from the studentName list
    count = 0                           #Starts counting to display what number grade the user is entering
    for j in range(numberOfGrades):     #For loop iterating equal to the value of numberOfGrades
        count += 1                      #Add 1 to the count variable storing what number grade is being inputted
        grade = float(input(f"Enter grade #{count} for {student.studentName}: " ))          #Prints the # of grade being asked for and what student
        student.addGrade(grade)         #Adds the grade to the grade list

gb = "Gradebook"                        #Assi
print("\n")
print(gb.center(50, '-'))
print("Student name: ", *[student.studentName for student in students], sep="\t")

for i in range(numberOfGrades):
    print(f"Grade #{i + 1}:", end="\t")
    for student in students:
        print(student.getGrade()[i], end="\t")
    print()

print("\nGrade Averages:")
for student in students:
    print(f"Average grade for {student.studentName}: {student.averageGrade():.2f}, letter grade: {student.letterAverageGrade()}")