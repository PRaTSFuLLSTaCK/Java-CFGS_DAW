package Vector3d;

public class Vector3D {
	private int x;
	private int y;
	private int z;
	
	public Vector3D() {
		this(0,0,0);
	}

	public Vector3D(int i, int j, int k) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3D(Vector3D otro) {
		this(otro.x, otro.y, otro.z);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public String toString() {
		return "Vector3D [x=" + x + ", y=" + y + ", z=" + z + "]";
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vector3D other = (Vector3D) obj;
		return this.x == other.x && this.y == other.y && this.z == other.z;
	}
	
	public void trasladar (int x) {
		setX(x);
	}
	public void trasladar (int x, int y) {
		setX(x);
		setY(y);
	}
	public void trasladar (int x, int y, int z) {
		setX(x);
		setY(y);
		setZ(z);
		
	}
	
	
}
