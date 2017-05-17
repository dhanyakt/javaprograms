import java.io.*;


public class Cat implements Serializable {
	private int height;
	private int size;
	
	/*public Cat(int height, int size){
		this.height = height;
		this.size = size;
		System.out.println(this.height + " " + this.size);
	}*/
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "Cat [height=" + height + ", size=" + size + "]"; 
	}

	public static void main(String[] args){
		Cat c = new Cat();
		c.setHeight(15);
		c.setSize(20);
		
		try {
				FileOutputStream  fs = new FileOutputStream("testSer.ser");
				ObjectOutputStream os = new ObjectOutputStream(fs);
				os.writeObject(c);
				os.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			FileInputStream fIn = new FileInputStream("testSer.ser");
			ObjectInputStream oin = new ObjectInputStream(fIn);
			System.out.println(oin.readObject());
			oin.close();
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}


}

	
		
		