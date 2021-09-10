package test;

abstract class HttpServlet{
	public abstract void service();
}


class LoginServlet extends HttpServlet{
	@Override
	public void service() {
		System.out.println("로그인합니다.");
		System.out.println();
	}
}
class  FileDownloadServlet extends HttpServlet{
	@Override
	public void service() {
		System.out.println("파일 다운로드 합니다.");
		System.out.println();
	}
}



public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());//객체인스턴스의 참조값이 method 이다.
		method(new FileDownloadServlet());
		

		
	}

	public static void method(HttpServlet servlet ) {
		servlet.service();
	}
}



