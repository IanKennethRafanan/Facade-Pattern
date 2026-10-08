public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void checkIn(String plateNumber, int numberOfCarts) {
        System.out.println("=== Check-in ===");
        cart.requestCart(numberOfCarts);
    }

    public void checkOut(String plateNumber, int roomNumber, int numberOfCarts) {
        System.out.println("=== Check-out ===");
        cart.requestCart(numberOfCarts);
        valet.pickUpVehicle(plateNumber);
        houseKeeping.cleanRoom(roomNumber);
    }
    public void requestVehicle(String plateNumber) { valet.pickUpVehicle(plateNumber); }
    public void requestCleaning(int roomNumber) { houseKeeping.cleanRoom(roomNumber); }
    public void requestLuggageCarts(int count) { cart.requestCart(count); }
}

    