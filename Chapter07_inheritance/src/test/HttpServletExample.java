package test;

abstract class HttpServlet{
	public abstract void service();
}


class LoginServlet extends HttpServlet{
	@Override
	public void service() {
		System.out.println("�α����մϴ�.");
		System.out.println();
	}
}
class  FileDownloadServlet extends HttpServlet{
	@Override
	public void service() {
		System.out.println("���� �ٿ�ε� �մϴ�.");
		System.out.println();
	}
}



public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());//��ü�ν��Ͻ��� �������� method �̴�.
		method(new FileDownloadServlet());
		

		
	}

	public static void method(HttpServlet servlet ) {
		servlet.service();
	}
}



