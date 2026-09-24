import java.util.ArrayList;
class ProductOfNumbers {
  private ArrayList<Integer> l=new ArrayList<>();
  private int size=0;
    public ProductOfNumbers() {
       this.l.add(1);
       this.size=0;
    }
    
    public void add(int num) {
        if(num==0){
            this.l=new ArrayList<Integer>();
            this.l.add(1);
            this.size=0;
        }else{
        this.l.add(this.l.get(size)*num);
        this.size++;
        }
        
    }
    
    public int getProduct(int k) {
        if(k>this.size) return 0;
        return this.l.get(this.size)/this.l.get(this.size-k);
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */