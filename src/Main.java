import java.util.Random;
import java.util.Scanner;
public class Main {
	public static void showCalendar(GrandPrix gps[]) {
		System.out.print("\n");
		System.out.print(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"2021 FIM MXGP CALENDAR"+ConsoleColors.RESET+ConsoleColors.RESET+"\n\n");
		for(int i=0;i<gps.length;i++) {
			System.out.println(gps[i].toString()+"\n");
		}
		System.out.print("\n\n\n");
	}
	public static void showRiders(Rider mx[]) {
		System.out.print("\n");
		System.out.print(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"ENTRY LIST"+ConsoleColors.RESET+ConsoleColors.RESET+"\n\n");
		for(int i=0;i<mx.length;i++) {
			System.out.println(mx[i].toString());
		}
		System.out.print("\n\n\n");
	}
	public static void showRidersFocus(Rider mx[]) {
		System.out.print("\n");
		System.out.print(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"RIDERS DATA"+ConsoleColors.RESET+ConsoleColors.RESET+"\n\n");
		for(int i=0;i<mx.length;i++) {
			System.out.print(ConsoleColors.BLUE_BOLD+mx[i].toString()+"\n"+ConsoleColors.RESET+mx[i].toStringData()+"\n\n");
		}
		System.out.print("\n\n\n");
	}
	public static void showGpResult(Rider mx[],GrandPrix gps[],int j) {
		System.out.print("\n");
		System.out.print(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"GP RESULTS OF "+mx[j].toString()+ConsoleColors.RESET+ConsoleColors.RESET+"\n\n");
		for(int i=0;i<gps.length;i++) {
			System.out.println(gps[i].halfToString()+"\tPOINTS: "+mx[j].getGpResult(i));
		}
		System.out.print("\n\n\n");
	}
	public static void Ranking(Rider mx[]) {
		Rider temp;
		for(int i=0;i<mx.length;i++) {
			for(int j=0;j<(mx.length-1);j++) {
				if(mx[j].getPoints()<mx[j+1].getPoints()) {
					temp=mx[j];
					mx[j]=mx[j+1];
					mx[j+1]=temp;
				}
			}
		}
		showRanking(mx);
	}
	public static void showRanking(Rider mx[]) {
		System.out.print("\n");
		System.out.print(ConsoleColors.WHITE_BACKGROUND_BRIGHT+ConsoleColors.BLACK_BOLD+"RANKING"+ConsoleColors.RESET+ConsoleColors.RESET+"\n\n");
		for(int i=0;i<mx.length;i++) {
			if(i==0)
				System.out.println((i+1)+"°- "+mx[i].getPoints()+"\t\t\t"+ConsoleColors.RED+mx[i].toString()+ConsoleColors.RESET);
			else
				if(i>=9)
					System.out.println((i+1)+"°- "+mx[i].getPoints()+"\t\t"+mx[i].toString());
				else
					System.out.println((i+1)+"°- "+mx[i].getPoints()+"\t\t\t"+mx[i].toString());
		}
		System.out.print(ConsoleColors.YELLOW_BOLD+ConsoleColors.YELLOW_ITALIC+mx[0].toString()+" IS THE 2021 WORLD CHAMPION OF HIS CLASS"+ConsoleColors.RESET+ConsoleColors.RESET+"\n\n\n");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rider mxgp[]=new Rider[15];
		Rider mx2[]=new Rider[15];
		GrandPrix gps[]=new GrandPrix[18];
		//declaration of the Calendar
		String gpLocations[]= {"Orlyonok","Matterley Basin","Maggiora","Oss","Loket","Lommel","Kegums","Afyonkarahisar","Afyonkarahisar","Riola Sardo","Teutschenthal","Lacapelle Marival","Intu Xanadu'","Pietramurata","Pietramurata","Pietramurata","Mantova","Mantova"};
		String gpCountries[]= {"MFR","GBR","ITA","NED","CZR","BEL","LAT","TUR","TUR","ITA","GER","FRA","ESP","ITA","ITA","ITA","ITA","ITA"};
		//declaration on names,surnames,numbers and nationalities of mxgp and mx2 classes
		String mxgpSurnames[]= {"Febvre","Gajser","Herlings","Prado","Seewer","Cairoli","Coldenhoff","Jonass","Lupino","Olsen","Watson","Bogers","Vlaanderen","Van Horebeek","Jacobi"};
		String mxgpNames[]= {"Romain","Tim","Jeffrey","Jorge","Jeremy","Antonio","Glenn","Pauls","Alessandro","Thomas","Ben","Brian","Calvin","Jeremy","Henry"};
		String mxgpNationalities[]= {"FRA","SLO","NED","ESP","SUI","ITA","NED","LAT","ITA","DEN","GBR","NED","NED","BEL","GER"};
		String mxgpTeams[]= {"Monster Energy Kawasaki","Team HRC","Red Bull KTM","Red Bull KTM","Monster Energy Yamaha","Red Bull KTM","Monster Energy Yamaha","Standing Construct GasGas","MRT Racing Team","Rockstar Energy Husqvarna","Monster Energy Yamaha","Standing Construct GasGas","Team Gebben Van Venrooy","SDM Corse","JWR Honda Racing"};
		int mxgpNumbers[]= {3,243,84,61,91,222,259,41,77,19,919,189,10,89,29};
		String mx2Surnames[]= {"Renaux","Vialle","Geerts","Guadagnini","Beaton","Hofer","Benistant","De Wolf","Fernandez","Laengenfelder","Todd","Haarup","Gifting","Boisrame","Adamo"};
		String mx2Names[]= {"Maxime","Tom","Jago","Mattia","Jed","Rene","Thibault","Kay","Ruben","Simon","Wilson","Mikkel","Isak","Mathias","Andrea"};
		int mx2Numbers[]= {959,28,193,101,14,711,198,74,70,516,20,11,517,172,80};
		String mx2Nationalities[]= {"FRA","FRA","BEL","ITA","AUS","AUT","FRA","NED","ESP","GER","AUS","DEN","SWE","FRA","ITA"};
		String mx2Teams[]= {"Monster Energy Yamaha","Red Bull KTM","Monster Energy Yamaha","Red Bull KTM","Rockstar Energy Husqvarna","Red Bull KTM","Hutten Metals Yamaha","Rockstar Energy Husqvarna","Team HRC","DIGA Procross GasGas","Bike IT Kawasaki","F&H Racing Team","DIGA Procross GasGas","F&H Racing Team","SM Action"};
		//istantiation of the Calendar
		for(int i=0;i<gps.length;i++) {
			gps[i]=new GrandPrix(gpLocations[i],gpCountries[i]);
			//System.out.print(gps[i].toString()+"\n\n");
		}
		//istantiation of all the riders,bikes and teams
		for(int i=0;i<mxgp.length;i++) {
			mxgp[i]=new Rider(mxgpNames[i],mxgpSurnames[i],mxgpNationalities[i],mxgpNumbers[i],new Team(mxgpTeams[i]));
			mx2[i]=new Rider(mx2Names[i],mx2Surnames[i],mx2Nationalities[i],mx2Numbers[i],new Team(mx2Teams[i]));
		}
		for(int i=0;i<mxgp.length;i++) {
			for(int j=0;j<gps.length;j++) {
				//with this if i increase te possibility that best riders reach higher points
				if(i<6) {
					mxgp[i].setGpResult(j,new Random().nextInt(25)+(new Random().nextInt(25)));
					mxgp[i].setPoints(mxgp[i].getPoints()+mxgp[i].getGpResult(j));
					mx2[i].setGpResult(j,new Random().nextInt(25)+(new Random().nextInt(25)));
					mx2[i].setPoints(mx2[i].getPoints()+mx2[i].getGpResult(j));
				}
				else {
					mxgp[i].setGpResult(j,new Random().nextInt(25));
					mxgp[i].setPoints(mxgp[i].getPoints()+mxgp[i].getGpResult(j));
					mx2[i].setGpResult(j,new Random().nextInt(25));
					mx2[i].setPoints(mx2[i].getPoints()+mx2[i].getGpResult(j));
				}
			}
		}
		//the body of the program
		System.out.println(ConsoleColors.RED_BACKGROUND_BRIGHT+"WELCOME TO THE FIM MOTOCROSS WORLD CHAMPIONSHIP FANAPP"+ConsoleColors.RESET+"\n");
		System.out.println(ConsoleColors.WHITE_BOLD+"The following part explains all the things that allow you to keep up with the MXGP world series"+ConsoleColors.RESET);
		System.out.println("- By typing"+ConsoleColors.CYAN_ITALIC+" CALENDAR "+ConsoleColors.RESET+"you will be able to see GPs calendar with the MXGP and MX2 winners");
		System.out.println("- By typing"+ConsoleColors.CYAN_ITALIC+" ENTRY LIST "+ConsoleColors.RESET+"you will be able to see MXGP and MX2 riders");
		System.out.println("- By typing"+ConsoleColors.CYAN_ITALIC+" FOCUS "+ConsoleColors.RESET+"you will be able to see all the info about MXGP riders");
		System.out.println("- By typing"+ConsoleColors.CYAN_ITALIC+" RESULTS "+ConsoleColors.RESET+"you will be able to see all the results of a specific MXGP rider");
		System.out.println("- By typing"+ConsoleColors.CYAN_ITALIC+" RANKING "+ConsoleColors.RESET+"you will be able to see the MXGP ranking");
		System.out.println("- By typing"+ConsoleColors.CYAN_ITALIC+" EXIT "+ConsoleColors.RESET+"you will be able to close the app");
		System.out.print("\n\nType what you want to see: ");
		String category="";
		String rider="";
		String choice=scan.nextLine();
		int index=0;
		while(!(choice.equals("EXIT"))) {
			switch(choice) {
			case "CALENDAR":
				showCalendar(gps);//da completare con vincitori mxgp e mx2
				break;
			case "ENTRY LIST":
				System.out.print("\tType the class(MXGP or MX2): ");
				category=scan.nextLine();
				if(category.equals("MXGP"))
					showRiders(mxgp);
				else
					showRiders(mx2);
				break;
			case "FOCUS":
				System.out.print("\tType the class(MXGP or MX2): ");
				category=scan.nextLine();
				if(category.equals("MXGP"))
					showRidersFocus(mxgp);
				else
					showRidersFocus(mx2);
				break;
			case "RESULTS":
				System.out.print("\tType the class(MXGP or MX2): ");
				category=scan.nextLine();
				if(category.equals("MXGP")) {
					System.out.print("\tType the surname of the MXGP rider: ");
					rider=scan.nextLine();
					for(int j=0;j<mxgp.length;j++) {
						if(rider.equals(mxgp[j].getSurname())) {
							index=j;
							break;
						}
							
					}
					showGpResult(mxgp,gps,index);
				}	
				else
					System.out.print("\tType the surname of the MXGP rider: ");
					rider=scan.nextLine();
					for(int j=0;j<mx2.length;j++) {
						if(rider.equals(mx2[j].getSurname())) {
							index=j;
							break;
						}
					}
					showGpResult(mx2,gps,index);
				break;
			case "RANKING":
				System.out.print("\tType the class(MXGP or MX2): ");
				category=scan.nextLine();
				if(category.equals("MXGP"))
					Ranking(mxgp);
				else
					Ranking(mx2);
				break;
			}
			System.out.print("Type what you want to see: ");
			choice=scan.nextLine();
		}
	}

}
