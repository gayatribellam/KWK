
public class WebStore extends Store {
	private String internetAddress;

	private String programLanguage; 

	public WebStore(String name, String internetAddress, String pLanguage, String owner, String identifier)

	{ 
	super(name,internetAddress, identifier, owner); 

	this.internetAddress = internetAddress;

	this.programLanguage = pLanguage;

	}

	public String getInternetAddress()

	{

	return internetAddress;

	}

	public String getProgramLanguage()

	{

	return programLanguage;

	}

	public void setInternetAddress(String internetAddress)

	{

	this.internetAddress = internetAddress;

	}

	public void setProgramLanguage(String progLanguage)

	{

	this.programLanguage = progLanguage;

	}

	public String toString() 

	{

	return super.toString()+"\nInternet Address : "+ internetAddress +" \nProgramming Language : "+programLanguage+"\n-----------------------------";

	}

}
