package principal;

public class CalculosNotas {

	public static void main(String[] args) {
		//partimos de un array con las notas de los alumnos
		double[] notas= {7.9,2.3,4,5.6,7,8.2,6.4};
		//calcular la nota media
		double media=0;
		for(int i=0;i<notas.length;i++) {
			media+=notas[i];
		}
		media=media/notas.length;
		System.out.println("La nota media es "+media);
		//calcular el número de aprobados
		int aprobados=0;
		for(int i=0;i<notas.length;i++) {
			if(notas[i]>=5) {
				//aprobados=aprobados+1;
				aprobados++;
			}
		}
		System.out.println("Hay "+aprobados+" aprobados");
		
		//calcular la nota más alta
		double notaAlta=notas[0];//inicializo la variable con la primera nota
		for(int i=0;i<notas.length;i++) {
			if(notas[i]>notaAlta) {
				notaAlta=notas[i];
			}
		}
		System.out.println("La nota más alta es: "+notaAlta);
		
	}

}
