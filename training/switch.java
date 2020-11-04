public class switchtrainng{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

	String mes = scanner.next();

	switch (mes){
	case "Gener":
	case "Març":
	case "Maig":
	case "Juliol":
	case "Agost":
	case "Octubre":
	case "Desembre":
		System.out.println("31 dies");
		break;
		}
	}
}
