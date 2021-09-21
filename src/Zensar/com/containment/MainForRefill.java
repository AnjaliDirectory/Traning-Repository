package Zensar.com.containment;

public class MainForRefill {

	public static void main(String[] args) {
		
		Pen pen=new Pen();
		Refill refill =new Refill();
		Nib nib=new Nib();
		
		System.out.println("-----pen info----");
		pen.setBrand("cello");
		pen.setCapLength(2);
		System.out.println("Pen Brand:" + pen.getBrand());
		System.out.println("cap Length: " + pen.getCapLength());
		
		pen.refill=new Refill();
		pen.refill.setInkcolor("blue");
		pen.refill.setLenght(8);
		System.out.println("---refill info---");
		System.out.println("ink color :"+pen.refill.getInkcolor());
		System.out.println("refill length: " +pen.refill.getLenght());
		
		
		refill.nib=new Nib();
		refill.nib.setMaterialType("plastic");
		refill.nib.setWidth(2);
		System.out.println("---nib info---");
		System.out.println("material :" +refill.nib.getMaterialType());
		System.out.println("width:"+refill.nib.getWidth());

	}

}
