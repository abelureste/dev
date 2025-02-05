
print("( Gradebook Program | Software Engineering )")

class student:
    def __init__(self, studentName: str, studentGrade: float):
        self.studentName = studentName
        self.studentGrade = studentGrade

    def averageGrade(self):
        return


studentNames = []

studentNumber = int(input("Enter the number of students: "))

for i in range(studentNumber):
    index = input("Enter the student names: ")
    studentNames.append(index)

print(studentNames)
