 public class WatsApprunner{
	public static void main (String[]args){

        WhatsApp w1 = new WhatsApp("1234567890", "kavana", "Available");
        WhatsApp w2 = new WhatsApp("9876543210", "sindhu", "Busy");
        WhatsApp w3 = new WhatsApp("1122334455", "kavya", "At work");
        WhatsApp w4 = new WhatsApp("2233445566", "nand", "Offline");
        WhatsApp w5 = new WhatsApp("5566778899", "darshan", "At home");
		
		System.out.println(w1.phoneNumber + ", " + w1.username + ", " + w1.status);
        System.out.println(w2.phoneNumber + ", " + w2.username + ", " + w2.status);
        System.out.println(w3.phoneNumber + ", " + w3.username + ", " + w3.status);
        System.out.println(w4.phoneNumber + ", " + w4.username + ", " + w4.status);
        System.out.println(w5.phoneNumber + ", " + w5.username + ", " + w5.status);
	}
}
