
public class TimeTeste {
	public static void main(String[] args) {
		Time t = new Time();
		t.setTime(8, 2, 5);
		
		System.out.println(t.exibirHoraUniversal());
		
		t.setTime(22, 5, 48);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
		
		System.out.println();
	}

}
