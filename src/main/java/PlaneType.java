public enum PlaneType {

    AIRBUSA320(10, 100),
    AIRBUSA330(20, 200),
    AIRBUSA340(30, 300),
    BOEING737(10, 100),
    BOEING747(20, 200),
    BOEING777(30, 300);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }

}
