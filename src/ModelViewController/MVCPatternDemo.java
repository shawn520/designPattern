package ModelViewController;

public class MVCPatternDemo {

	public static void main(String[] args) {
		
		//从数据库获取学生信息
		Student stu = retriveStudentFromDatabase();
		
		//创建一个视图，
		StudentView view = new StudentView();
		StudentController stuController = new StudentController(stu,view);
		
		//把数据库中学生详细信息输出到控制台
		stuController.updateView();
		
		//更新学生信息
		stuController.setStudentName("张三");
		stuController.setStudentRollNo("SA517225");
		
		//更新视图
		stuController.updateView();
		
		////更新学生信息
		stuController.setStudentName("李四");
		stuController.setStudentRollNo("SA17225225");
		
		////更新视图
		stuController.updateView();
		
	}
	
	public static Student retriveStudentFromDatabase(){
		Student student = new Student();
		student.setName("默默");
		student.setRollNo("SA17225001");
		return student;
	}
}
