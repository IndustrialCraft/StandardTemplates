package §%{package};

public enum §%{className} {
    ;
    public final int id;
    §%{className}(int id) {
        this.id = id;
    }
    public static §%{className} byId(int id){
        for(§%{className} value : values()){
            if(value.id == id)
                return value;
        }
        return null;
    }
    public static int toId(§%{className} value){
        if(value == null)
            return -1;
        return value.id;
    }
}
