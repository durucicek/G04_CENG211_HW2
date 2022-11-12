package access;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import vechicles.*;


public class File_IO {

	public static SalesRecord readFile(String filename) throws IOException{
		
		ArrayList<Object> vehicles = new ArrayList<Object>();
		StringTokenizer st = null;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String strLine;
			while ((strLine = reader.readLine()) != null) {
				st = new StringTokenizer(strLine, ","); 
				String[] tempList = new String[7];
				int count = 0;
				while(st.hasMoreTokens())
				 {
					tempList[count] = st.nextToken();
					count++;
				 }
				
				switch(tempList[0].charAt(0)) {
					case 'B':
						vehicles.add(new Bicycle(tempList[0], tempList[1],tempList[2],Integer.parseInt(tempList[3]),
								tempList[4],tempList[5],Integer.parseInt(tempList[6])));
						break;
						
					case 'P':
						vehicles.add(new PickupTruck(tempList[0], tempList[1],tempList[2],Integer.parseInt(tempList[3]),
								tempList[4],tempList[5],Integer.parseInt(tempList[6])));
						break;

						
					case 'H':
						vehicles.add(new Hatchback(tempList[0], tempList[1],tempList[2],Integer.parseInt(tempList[3]),
								tempList[4],Double.parseDouble(tempList[5]),Integer.parseInt(tempList[6])));
						break;

						
					case 'M':
						vehicles.add(new Minivan(tempList[0], tempList[1],tempList[2],Integer.parseInt(tempList[3]),
								Integer.parseInt(tempList[4]),Double.parseDouble(tempList[5]),Integer.parseInt(tempList[6])));
						break;

						
					case 'S':
						vehicles.add(new Sedan(tempList[0], tempList[1],tempList[2],Integer.parseInt(tempList[3]),
								tempList[4],Double.parseDouble(tempList[5]),Integer.parseInt(tempList[6])));
						break;

				}
	}
		
			reader.close();

		} 
		
		catch (FileNotFoundException exception) {
			System.out.println("File not found"); 
		}
		
		
		
		return new SalesRecord(vehicles);
		
	}
}
