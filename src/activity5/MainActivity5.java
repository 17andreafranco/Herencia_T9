package activity5;

import activity2.Show;

public class MainActivity5 {

	public static void main(String[] args) {
		
		Estudent est[]=  new Estudent[40];	
		Teacher te = new Teacher("Nat", 24, 'F', true, "math");
			
		
		for (int i = 0; i < 30; i++) {
		
		if(i<10) {
			est[i] = new Estudent("Stiven",15,'M',false, 6);

			
		}else if(i > 10 && i < 20 ){
				est[i] = new Estudent("Laura",15,'F',false, 4);	
			}else if (i > 20){
				est[i] = new Estudent("Leia",16,'F',true, 8);

			}
			
		}

		Classroom cr = new Classroom(1,est,te, 40, "math");
		
		cr.classAvailable();
		cr.passTheSubject();
		
		
	}

}
