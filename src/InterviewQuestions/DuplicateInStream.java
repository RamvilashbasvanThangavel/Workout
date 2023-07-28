package InterviewQuestions;

public class DuplicateInStream {
	public static void main(String[] args) {
		String name = "RamvilashBasvan";
		name.chars().mapToObj(c -> (char)c).distinct().toList().forEach(System.out::print);
	}

}
