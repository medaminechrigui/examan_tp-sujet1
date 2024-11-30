public class EvtException extends Exception {
    private  String msg;
    public EvtException(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
}
