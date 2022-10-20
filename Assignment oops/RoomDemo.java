class Room {
    int h, w, b;

    Room(int p, int q, int r) {
        h = p;
        w = q;
        b = r;
    }

    int volume() {
        return h * w * b;
    }
}

class RoomDemo {
    public static void main(String[] args) {
        Room r = new Room(1, 2, 3);
        System.out.println("Volume : "+ r.volume());
    }
}