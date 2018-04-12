public class Computer {
	
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	
	public Computer(String man, String processor, int ram, int disk) {
	    manufacturer = man;
	    this.processor = processor;
	    ramSize = ram;
	    diskSize = disk;
	}

	public int getRamSize() {
	    return ramSize;
    }

	public int getDiskSize() {
	    return diskSize;
	}
	  
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}

	public String toString() {
		
		String result = "Manufacturer: " + manufacturer +
		        "\nCPU: " + processor +
		        "\nRAM: " + ramSize + " megabytes" +
		        "\nDisk: " + diskSize + " gigabytes";
		return result;
	}
}


public class Laptop extends Computer {
	private static final String DEFAULT_LT_MAN = "MyBrand";
	private double screenSize;
	private double weight;

	public Laptop(String man, String processor, int ram, int disk, double screen, double wei) {
		super(man, processor, ram, disk);
		screenSize = screen;
		weight = wei;
	}
	
	public Laptop(String processor, int ram, int disk, double screen, double wei) {
		// method overriding
		this(DEFAULT_LT_MAN, processor, ram, disk, screen, wei);
	}
	
	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public static String getDefaultLtMan() {
		return DEFAULT_LT_MAN;
	}

	public String toString() {
		String result = super.toString()
				+ "\nScreen size: " + screenSize + " inches"
				+ "\nWeight: " + weight + " pounds";
		return result;
	}
}



public class Test {

	public static void main(String[] args) {
		Computer myComputer = new Computer("Acme", "Intel P4 2.4", 512, 60);
		Laptop yourComputer = new Laptop("DellGate", "AMD Athlon 2000", 256, 40, 15.0, 7.5);
		System.out.println("My computer is :\n" + myComputer.toString());
		System.out.println("\nYour computer is :\n" + yourComputer.toString());
	}
}

