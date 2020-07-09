package design.patters.creational;

public class Builderpattern {
	private String name;
	private String id;
	private String city;
	
	 public Builderpattern(Builder builder) 
	 {
	    this.id = builder.id; 
	    this.name = builder.name; 
	    this.city = builder.city;
	 }
	static class Builder
	{
		private String name;
		private String id;
		private String city;
		private Builder()
		{}
		public Builder getInstance()
		{
			return new Builder();
		}
		public Builder  setName(String name) {
			this.name = name;
			return this ;
		}
		public Builder  setId(String id) {
			this.id = id;
			return this ;
		}
		public Builder setCity(String city) {
			this.city = city;
			return this ;
		}
		public Builderpattern build() 
        { 
            return new Builderpattern(this); 
        }
	}
}
