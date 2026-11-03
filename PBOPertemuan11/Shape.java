package PBOPertemuan11;

public interface Shape {
    int area();
}

// 2. Kelas Rectangle yang mengimplementasikan Shape
class Rectangle implements Shape {
    protected int width;
    protected int height;

    public void setWidth(int w) { 
        this.width = w; 
    }

    public void setHeight(int h) { 
        this.height = h; 
    }

    @Override
    public int area() {
        return width * height;
    }
}

// 3. Kelas Square yang mengimplementasikan Shape secara mandiri
class Square implements Shape {
    private int side;

    public void setSide(int s) {
        this.side = s;
    }

    @Override
    public int area() {
        return side * side;
    }
}
