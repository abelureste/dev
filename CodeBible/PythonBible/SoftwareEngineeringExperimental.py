print("----------- Gradebook Program | Software Engineering -----------")

class Student:
    def __init__(self, studentName: str):
        self.studentName = studentName  #BoB
        self.studentGrades = [] #90, 80, 70 

    def addGrade(self, grade: float):
        self.studentGrades.append(grade)

    def averageGrade(self):
        if len(self.studentGrades) > 0:
            return sum(self.studentGrades) / len(self.studentGrades)
        else:
            return "No grades entered"
    
    def letterAverageGrade(self):
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

    def getGrade(self):
        return self.studentGrades

students = []

studentNumber = int(input("Enter the number of students: "))

for i in range(studentNumber):
    name = input("Enter the student names: ")
    students.append(Student(name))

numberOfGrades = int(input("How many grades do you want to enter per student?: "))

for student in students:
    print(f"\nEntering grades for {student.studentName}")
    count = 0
    for j in range(numberOfGrades):
        count += 1
        grade = float(input(f"Enter grade #{count} for {student.studentName}: " ))
        student.addGrade(grade)

with open("gradebook.txt", "w") as file:
    gb = "Gradebook"
    for i in len(studentNumber):
        print("\n")
        print(gb.center(50, '-'))
        print("Student name: ", *[student.studentName for student in students], sep="\t")

print(numberOfGrades)

for i in range(numberOfGrades):
    print(f"Grade #{i + 1}:", end="\t")
    for student in students:
        print(student.getGrade()[i], end="\t")
    print()

print("\nGrade Averages:")
for student in students:
    print(f"Average grade for {student.studentName}: {student.averageGrade():.2f}, letter grade: {student.letterAverageGrade()}")