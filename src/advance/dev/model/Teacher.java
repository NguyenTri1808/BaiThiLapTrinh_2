package advance.dev.model;

import advance.dev.dao.IPeople;
	public class Teacher extends People implements IPeople {
	    private String teacherID;

	    public Teacher(String name, int age, String teacherID) {
	        super(name, age);
	        this.teacherID = teacherID;
	    }

		@Override
		public void add() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void prinPeoplet() {
			// TODO Auto-generated method stub
			
		}
}

