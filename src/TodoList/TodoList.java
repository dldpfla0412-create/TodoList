package TodoList;

public class TodoList {

	public static void main(String[] args) {
		String title = "오늘의 할일(To-do)";
		String[] todos = {"자바코드 작성하기", "MYSQL 테이블 만들기"," 깃허브 업로드하기"};
		
		System.out.println("=== " + title + " ===");
		for (int i = 0; i < todos.length; i++) {
			if (i == 0) {
				System.out.println((i + 1) + ". [중요] " + todos[i]);
			} else {
				System.out.println((i + 1) + ". [일반] " + todos[i]);
			}
		}

	}

}
