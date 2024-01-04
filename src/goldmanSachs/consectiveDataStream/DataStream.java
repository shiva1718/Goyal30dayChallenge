package goldmanSachs.consectiveDataStream;

class DataStream {

    int v;
    int k;
    int count;

    public DataStream(int value, int k) {
        this.v = value;
        this.k = k;
        count = k;
    }

    public boolean consec(int num) {
        if (num == v) {
            if (--count == 0) {
                count = 1;
                return true;
            }
        } else {
            count = k;
        }
        return false;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */