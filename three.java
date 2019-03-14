package lab_programs;
interface TourPlan
{
	public abstract void chennaiToHyd(String mode,double fare);
	public abstract void hydToIndore(String mode,double fare);
	public abstract void indoreToDelhi(String mode,double fare);
}

class TravelAgent implements TourPlan
{
	double totalFare=0;
	public void chennaiToHyd(String mode,double fare)
	{
	System.out.println("Travel Chennai to Hyderabad by "+mode+"Travel Fare is "+fare);
		totalFare+=fare;
	}
	public void hydToIndore(String mode,double fare)
	{
	System.out.println("Travel Hyderabad to Indore by "+mode+"Travel Fare is "+fare);
		totalFare+=fare;
	}
public void indoreToDelhi(String mode,double fare)
	{
System.out.println("Travel Indore to Delhi by "+mode+"Travel Fare is "+fare);
		totalFare+=fare;
	}

void totalTravelExpenditure(){
System.out.println("Total Travell Expenditure to reach from chennai to Delhi is "+totalFare);
	}
}

public class three {
	public static void main(String args[])
	{
		TravelAgent ta = new TravelAgent();
		ta.chennaiToHyd("Plane",10000);
		ta.hydToIndore("Plane",7000);
		ta.indoreToDelhi("Plane",6000);
		ta.totalTravelExpenditure();
	}
}
