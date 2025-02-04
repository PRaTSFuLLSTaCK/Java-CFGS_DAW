package Vector3d;

public class PrincipehVector3d {

	public static void main(String[] args) {
		
		Vector3D v1 = new Vector3D();
		System.out.println(v1);
		Vector3D v2 = new Vector3D(5, 4, 3);
		System.out.println(v2);
		Vector3D v3 = new Vector3D(v2);
		
		System.out.println(v3);
		System.out.println(v1.equals(v2));
		System.out.println(v2.equals(v3));
		
		v2.trasladar(9);
		System.out.println(v2);
		v2.trasladar(10, 11);
		System.out.println(v2);
		v2.trasladar(12, 13, 14);
		System.out.println(v2);

	}

}
