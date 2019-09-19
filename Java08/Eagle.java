public class Eagle extends Bird implements Fly {
	private boolean fly;
	private int meters;

	public Eagle(String name) {
		super(name);
		this.fly = false;
		this.meters = 0;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public int getMeters() {
		return meters;
	}

	public void setMeters(int meters) {
		this.meters = meters;
	}



	@Override
	public void takeOff() {
		System.out.println(this.getName() + " takes off in the sky");
		this.fly = true;
	}

	@Override
	public void glide() {
		System.out.println("It glides into the air.");
	}

	@Override
	public void land() {
		if(this.fly && this.meters == 1 ) {
			System.out.printf("%s lands on the ground.%n", this.getName());
		} else {
			System.out.printf("%s is too high, it can't lands.%n", this.getName());
		}
		
	}

	@Override
    	public int ascend(int meters) {
        if (this.fly) {
            this.meters = Math.max(this.meters + meters , meters);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.meters);
        }
        return this.meters;
    }
	
	@Override
    	public int descend(int meters) {
        if (this.fly) {
            this.meters = Math.min(this.meters - meters , meters);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.meters);	
        }
        return this.meters;
    }


}
