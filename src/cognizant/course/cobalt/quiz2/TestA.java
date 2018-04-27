package cognizant.course.cobalt.quiz2;

interface TestA {
	String toString();
	}
	public class InterfaceAndSysoutMagic3 {
		public static void main(String[] args){
			System.out.println(new TestA {
				public String toString(){return "test"; }
			});
}
