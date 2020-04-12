class Student {
	String index;
	String firstName;
	String lastName;

        ArrayList<int> labPonits = new ArrayList<int>(); 
  
        // Initialize an ArrayList with add() 
        labPonits.add("5"); 
        labPonits.add("7"); 
        labPonits.add("5"); 

	//TODO constructor
	Student(){}
	Student ( string index, string firstName, string lastName){
		this->index(index);
		this->firstName(firstName);
		this->lastName(lastName);
	}
	//TODO seters & getters
	string getIndex(){return Index; }
	string getFirstName () {return firstName;}
	string getLastName () {return lastName; }	

	public double getAverage() {
		//TODO
	}

	public boolean hasSignature() {
		//TODO
		for(int i=0; i<=labPoints.lenght(); i++)
		{
			if(labPoints[i]>8)
			{
				return true;
			}
			else { return false; }
		}
	}
}
